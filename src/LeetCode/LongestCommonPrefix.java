package LeetCode;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/1 15:34
 * Description:
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length==0){
            return "";
        }
        String ans = strs[0];

        for (int i = 1; i< strs.length; i++){
            int j = 0;
            for (;j<strs[i].length() && j<ans.length();j++){
                if (strs[i].charAt(j)!=strs[0].charAt(j)){
                    break;
                }
            }
            ans = ans.substring(0,j);
            if (ans.equals("")){
                return ans;
            }
        }
            return ans;

    }

    @Test
    public void test(){
        String[] strs = {""};
        System.out.println(longestCommonPrefix(strs));

    }
}
