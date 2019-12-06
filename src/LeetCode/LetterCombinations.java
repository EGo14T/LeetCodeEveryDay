package LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/6 9:26
 * Description:
 */
public class LetterCombinations {

    String[] letter_map = {" ","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    List<String> res = new ArrayList<>();


    public List<String> letterCombinations(String digits) {

        if (digits==null || digits.length() ==0){
            return new ArrayList<>();
        }

        iterStr(digits,"",0);

        return res;
    }

    public void iterStr(String str , String letter, int index){
        if (index == str.length()){
            res.add(letter);
            return;
        }

        char c = str.charAt(index);
        String map_string = letter_map[c-'0'];

        for(int i=0;i<map_string.length();i++) {
            iterStr(str, letter+map_string.charAt(i), index+1);
        }

    }


    @Test
    public void test(){
        System.out.println(letterCombinations("23"));
    }
}
