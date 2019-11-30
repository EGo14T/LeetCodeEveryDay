package LeetCode;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/11/30 13:01
 * Description:
 *
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *
 * 输入: "III"
 * 输出: 3
 * 示例 2:
 *
 * 输入: "IV"
 * 输出: 4
 * 示例 3:
 *
 * 输入: "IX"
 * 输出: 9
 * 示例 4:
 *
 * 输入: "LVIII"
 * 输出: 58
 * 解释: L = 50, V= 5, III = 3.
 * 示例 5:
 *
 * 输入: "MCMXCIV"
 * 输出: 1994
 * 解释: M = 1000, CM = 900, XC = 90, IV = 4.
 *
 * solution：
 * 首先建立一个HashMap来映射符号和值，
 * 然后对字符串从左到右来，
 * 如果当前字符代表的值不小于其右边，就加上该值；
 * 否则就减去该值。以此类推到最左边的数，最终得到的结果即是答案
 */
public class RomanToInt {
    public int romanToInt(String s) {
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        int sum = 0;
        int per = map.get(String.valueOf(s.charAt(0)));

        for (int i = 1; i<s.length(); i++){
            int num = map.get(String.valueOf(s.charAt(i)));

            if (per<num){
                sum -= per;
            }else{
                sum += per;
            }
            per = num;
        }
        sum += per;

        return sum;

    }

    @Test
    public void test(){
        /**
         *  MCMXCIV--->1994
         */
        System.out.println(romanToInt("MCMXCIV"));
    }
}
