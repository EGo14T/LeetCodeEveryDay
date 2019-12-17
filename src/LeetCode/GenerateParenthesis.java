package LeetCode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/17 08:27
 * Description:
 *
 * 给出 n 代表生成括号的对数，请你写出一个函数，使其能够生成所有可能的并且有效的括号组合。
 *
 * 例如，给出 n = 3，生成结果为：
 *
 * [
 *   "((()))",
 *   "(()())",
 *   "(())()",
 *   "()(())",
 *   "()()()"
 * ]
 *
 *
 * 思路：
 * 每个左括号对应一个右括号， 也就是说，当左括号个数大于右括号时，才能添加右括号
 * 递归出口时，当左括号和右括号数量 都被消耗完 跳出递归
 *
 */
public class GenerateParenthesis {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        generate("",n,n,ans);

        return ans;
    }

    public void generate(String item, int left, int right, List res){
        if (left==0 && right==0){
            res.add(item);
            return;
        }

        if (left>0){
            generate(item+"(",left-1,right,res);
        }

        if (left<right){
            generate(item+")",left,right-1,res);
        }
    }

    @Test
    public void test(){
        System.out.println(generateParenthesis(3));
    }
}
