package LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/27 08:40
 * Description:
 *
 * 给定一个字符串 s 和一些#长度相同#的单词 words。找出 s 中恰好可以由 words 中所有单词串联形成的子串的起始位置。
 *
 * 注意子串要与 words 中的单词完全匹配，中间不能有其他字符，但不需要考虑 words 中单词串联的顺序。
 *
 * 示例 1：
 * 输入：
 *   s = "barfoothefoobarman",
 *   words = ["foo","bar"]
 * 输出：[0,9]
 * 解释：
 * 从索引 0 和 9 开始的子串分别是 "barfoo" 和 "foobar" 。
 * 输出的顺序不重要, [9,0] 也是有效答案。
 * 示例 2：
 *
 * 输入：
 *   s = "wordgoodgoodgoodbestword",
 *   words = ["word","good","best","word"]
 * 输出：[]
 *
 * 思路：设置一个hashmap key为words，value为words出现的次数。
 *      然后遍历 s， 遍历的长度是words的总长。 当出现 遍历的字串出现 words时，则对应的 value-1
 *      当value都为0时，说明匹配成功，取到 下标索引。
 *
 *
 */
public class FindSubstring {
    public List<Integer> findSubstring(String s, String[] words) {
        if(s==null || "".equals(s) || words==null || words.length==0) {
            return new ArrayList<>();
        }

        List<Integer> ans = new ArrayList<>();

        //把words 遍历到 hashmap中，重复的 count+1
        Map<String,Integer> word_count = new HashMap<>();
        for (String word:words
             ) {
            if (word_count.containsKey(word)){
                word_count.put(word,word_count.get(word)+1);
            }else{
                word_count.put(word,1);

            }
        }

        int s_length = s.length();
        int one_word_length = words[0].length();
        int all_word_length = words.length * one_word_length;

        for (int i = 0; i < s_length - all_word_length + 1; i++) {
            String wait_s = s.substring(i,i+all_word_length);
            HashMap<String,Integer> dummy = new HashMap<>(word_count);

            for (int j = 0; j < wait_s.length(); j+= one_word_length){
                String key = wait_s.substring(j,j+one_word_length);
                if (dummy.containsKey(key)){
                    dummy.put(key,dummy.get(key)-1);
                    if (dummy.get(key)==0){
                        dummy.remove(key);
                    }
                }else{
                    break;
                }
            }
            if (dummy.size()==0){
                ans.add(i);
            }
        }
        return ans;
    }


    @Test
    public void test(){
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};
        System.out.println(findSubstring(s,words));

    }
}
