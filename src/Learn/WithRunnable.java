package Learn;

/**
 * @author 王富昕
 * Create By EGo1ST
 * Date ：Created in 2019/9/30 14:52
 * Description：
 */
public class WithRunnable implements Runnable {

    LearnEnum learnEnum = LearnEnum.Li;


    @Override
    public void run() {
        System.out.println("子线程启动,ID为:" + Thread.currentThread().getId() +
                ",名字为" + Thread.currentThread().getName());
    }

    public static void main(String[] args)  {
        // 创建一个线程并开启线程
//        Current a = new Current();
//        a.start();
        // 多创建几个线程
//        new Current().start();
//        new Current().start();
//        new Current().start();


        String s = "abd";
        String  d = Integer.toString(20,16);

        System.out.println(d);

    }
}
