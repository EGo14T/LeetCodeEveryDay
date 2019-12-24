package LeetCode;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/24 09:01
 * Description:
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 *
 * 示例 1:
 *
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 *
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 *
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 *
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 *
 */
public class StrStr {
    public int strStr(String haystack, String needle) {
        if (needle.equals("")){
            return 0;
        }

        int l = 0;
        int r = needle.indexOf().length()-1;

        while (r<haystack.length()){
            if (haystack.charAt(l)==needle.charAt(0) && haystack.charAt(r)==needle.charAt(needle.length()-1)){
                return r;
            }else{
                l++;
                r++;
            }

        }

        return r;
    }


    @Test
    public void test(){
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack,needle));
    }
}
