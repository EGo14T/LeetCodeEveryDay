import org.junit.Test;

/**
 * Create By EGo1ST
 * Date ：Created in 2019/9/30 8:18
 * Description：
 *判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 * 示例 1:
 *
 * 输入: 121
 * 输出: true
 * 示例 2:
 *
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 *
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 *
 * 你能不将整数转为字符串来解决这个问题吗？
 *
 */
public class IsPalindrome {
    public boolean isPalindrome(int x) {
        int sign = 0;
        int start = 0;
        int res = 0;
        int m = (int) Math.log10(x);
        if (x<0){
            return false;
        }

        for (int i = 0; i < m+1; i++) {
            //res = res * 10 + ((x/(int)(Math.pow(10,m-i)))%10);
            res = ((x/(int)(Math.pow(10,m-i)))%10)*(int)Math.pow(10,i)+res;
        }
        return res == x;


    }

    @Test
    public void test(){
        System.out.println(isPalindrome(311));
    }
}


/** 数学法的另一种快的实现方法
 * class Solution {
 *     public boolean isPalindrome(int x) {
 *         //边界判断
 *         if (x < 0) return false;
 *         int div = 1;
 *         //
 *         while (x / div >= 10) div *= 10;
 *         while (x > 0) {
 *             int left = x / div;
 *             int right = x % 10;
 *             if (left != right) return false;
 *             x = (x % div) / 10;
 *             div /= 100;
 *         }
 *         return true;
 *     }
 * }
 *
 */
