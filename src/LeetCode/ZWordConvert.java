package LeetCode;

import org.junit.Test;

/**
 * Create By EGo1ST
 * Date ：Created in 2019/9/25 8:28
 * Description：将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 * 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
 *
 * 请你实现这个将字符串进行指定行数变换的函数：
 *
 * string convert(string s, int numRows);
 * 示例 1:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 3
 * 输出: "LCIRETOESIIGEDHN"
 * 示例 2:
 *
 * 输入: s = "LEETCODEISHIRING", numRows = 4
 * 输出: "LDREOEIIECIHNTSG"
 * 解释:
 *
 * L     D     R        L->D (6)  D->R(6)
 * E   O E   I I        E->O (4)  O->E(2)  E->I(4)  I->I(2)
 * E C   I H   N        E->C (2)  C->I(4)  I->H(2)  H->N(4)
 * T     S     G        T->S (6)  S->G(6)
 */
public class ZWordConvert {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;

        int len = Math.min(s.length(), numRows);
        String []rows = new String[len];
        for(int i = 0; i< len; i++) rows[i] = "";
        int loc = 0;
        boolean down = false;

        for(int i=0;i<s.length();i++) {
            rows[loc] += s.substring(i,i+1);
            if(loc == 0 || loc == numRows - 1)
                down = !down;
            //先运算  down ? 1 : -1  再与loc相加
            loc += down ? 1 : -1;
        }

        StringBuilder ans = new StringBuilder();
        for(String row : rows) {
            ans.append(row);
        }
        return ans.toString();
    }

    @Test
    public void test(){
        String s = "XINGEZHENSHUAI";
        //System.out.println(s.substring(0,1));
        System.out.println(convert(s,3));


    }
}
