package LeetCode;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/11/29 9:32
 * Description:
 *
 * 暴力法2
 */
public class IntToRoman3 {
    public String intToRoman(int num) {
        String[] thousand = {"","M","MM","MMM"};
        String[] hundred =  {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"};
        String[] ten =      {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
        String[] single =   {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        StringBuilder romanNum = new StringBuilder();

        int athousand = num/1000;
        int ahundred = num/100%10;
        int aten = num/10%10;
        int asingle = num%10;

        return romanNum.append(thousand[athousand]).append(hundred[ahundred]).append(ten[aten]).append(single[asingle]).toString();

    }

    @Test
    public void test(){
        System.out.println(intToRoman(399));

    }

}
