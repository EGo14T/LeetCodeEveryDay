package Learn;

import org.junit.Test;

/**
 * @author 王富昕
 * Create By EGo1ST
 * Date ：Created in 2019/9/30 14:47
 * Description：
 */
public class Current extends Thread {
    public void test(){
        Thread t1 = new Thread(()->{
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(123);
        });

        t1.start();

        Thread t2 = new Thread(()->{
            System.out.println(456);
        });

        t2.start();
    }

    public static void main(String[] args) {
        Current current = new Current();
                current.test();
    }
}
