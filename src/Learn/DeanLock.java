package Learn;

/**
 * @author 王富昕
 * Create By EGo1ST
 * Date ：Created in 2019/9/30 9:41
 * Description：
 */
public class DeanLock {
    public static void main(String[] args) {
        new Thread(() -> {
            try {
                System.out.println("thread1 is running");
                synchronized (DeanLock.class) {
                    System.out.println("thread is block DeanLock");

                    Thread.sleep(1000);
                    synchronized (Object.class) {
                        System.out.println("thread is block ojb2");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
        new Thread(() -> {
            try {
                System.out.println("thread1 is running");
                synchronized (Object.class) {
                    System.out.println("thread is block obj1");

                    Thread.sleep(1000);
                    synchronized (DeanLock.class) {
                        System.out.println("thread is block Deanlock");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


    }
}
