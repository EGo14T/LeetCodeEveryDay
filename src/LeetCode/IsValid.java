package LeetCode;


import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/11 08:32
 * Description:
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

