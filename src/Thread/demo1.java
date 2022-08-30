package Thread;

/**
 * 创建多线程方式一
 */
public class demo1 {
    public static void main(String[] args) {
     //3,new一个新线程对象
        Thread t=new MyhTread();
     //4,调用start方法启动线程（运行地还是run方法）
     t.start();
     for(int i=0;i<5;i++){
         System.out.println("主线程启动"+i);
     }
    }
}

/**
 * 1，定义一个线程类继承Thread类
 */
class MyhTread extends Thread{
    //2，重写run()方法,里面定义线程以后干啥
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("子线程启动"+i);
        }
    }

}