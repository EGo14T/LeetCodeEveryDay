package LeetCode;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/26 09:01
 * Description:
 *
 * 给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 说明:
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,  2^31 − 1]。本题中，如果除法结果溢出，则返回 2^31 − 1。
 *
 *
 */


public class Divide {
    /**
     *
     * @param dividend 被除数
     * @param divisor 除数
     * @return 商
     */
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor==-1){
            return Integer.MAX_VALUE;
        }

        //判断结果的正负，异或运算
        boolean isPostive = (dividend ^ divisor) >= 0;

        //因为 MAX_VALUE 比 MIN_VALUE 多一个，所以全部转化为负数运算
        dividend = dividend<0?dividend:-dividend;
        divisor = divisor<0?divisor:-divisor;

        int ans = 0;
        int _divisor = divisor;
        int multiple = 1;

        // -10 -3
        while (dividend<=_divisor){
            if (dividend-divisor<=0){
                ans += multiple; // 1

                dividend -= divisor;
                divisor += divisor;
                //倍数逼近
                multiple += multiple;
            }else {
                divisor = _divisor;
                multiple = 1;
            }
        }

        return isPostive? ans : -ans;

    }

    @Test
    public void test(){
        System.out.println(divide(7,-3));

    }

}
