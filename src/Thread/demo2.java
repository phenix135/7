package Thread;

/**
 * 创建多线程方式二
 */
public class demo2 {
    public static void main(String[] args) {
     //3,创建一个任务对象
        Runnable r=new MyRunnable();//多态写法
     //4,把任务对象交给Thread处理
     Thread t=new Thread(r);
     //5,启动线程
        t.start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行"+i);
        }

    }
}
//1,定义一个线程任务类，实现Runnable接口
class MyRunnable implements Runnable{
    /**
     *2,重写run方法，定义线程的执行任务
     */
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程执行"+i);
        }
    }
}