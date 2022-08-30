package Thread;

/**
 * 常用API的使用
 */
public class demo5 {
    public static void main(String[] args) {
        Thread t1=new MyhTread();
        t1.setName("1号线程");
        t1.start();
        System.out.println(t1.getName());

        Thread t2=new MyhTread();
        t2.setName("2号线程");
        t2.start();
        System.out.println(t2.getName());

        Thread m=Thread.currentThread();
        System.out.println(m.getName());

        for (int i = 0; i < 5; i++) {
            System.out.println("main线程在执行"+i);
        }
    }
}
class MYThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(Thread.currentThread()+"子线程在执行"+i);
        }
    }
}