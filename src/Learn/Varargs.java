package Learn;

import org.junit.Test;

/**
 * @author 王富昕
 * Created by EGo1ST
 * Date：Created in 2019/12/9 15:53
 * Description:
 */
public class Varargs {
    public void print(String... strs){
        for (String s :
                strs) {
            System.out.println(s);
        }
    }

    public int digui(int i){
        if (i==0){
            return i;
        }
        i = i+digui(i-1);
        System.out.println(i);
        return i;
    }



    @Test
    public void test(){
        //print("abc","asd","ddd","qwe");
        System.out.println("结果"+digui(10));
    }
}
