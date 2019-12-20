package Learn;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

        List<Integer> a = Arrays.asList(1,2,3,4,5,6,7,8,9,10) ;
        List<Integer> a1 = a.stream().filter(f->f<5).collect(Collectors.toList());
        System.out.println(a1);
    }
}
