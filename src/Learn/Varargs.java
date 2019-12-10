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

    @Test
    public void test(){
        print("abc","asd","ddd","qwe");
    }
}
