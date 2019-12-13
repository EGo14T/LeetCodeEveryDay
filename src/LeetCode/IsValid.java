package LeetCode;


import org.junit.Test;

import java.util.HashMap;
import java.util.Stack;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/11 08:32
 * Description:
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 */
public class IsValid {
    public boolean isValid(String s) {
        if (s.length()%2!=0){
            return false;
        }
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i<s.length();i++){
            char c = s.charAt(i);
            if(!map.containsKey(c)) {
                stack.add(c);
            }else {
                if(stack.size()==0) {
                    return false;
                }

                Character r = stack.pop();
                if (r.equals(map.get(c))){
                    continue;
                }else {
                    return false;
                }
            }
        }
        return (stack.empty());
    }

    @Test
    public void test() {
        System.out.println(isValid("{{}}()[]"));
    }
}

