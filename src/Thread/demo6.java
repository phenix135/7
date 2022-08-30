package Thread;

/**
 * 模拟取钱案例----线程安全问题
 */
public class demo6 {
    public static void main(String[] args) {
     //1,定义线程类，创建一个共享的账户对象
        Account  acc=new Account("ICBC-111",100000);

     //2，创建两个线程对象
     new DrawThread(acc,"小明").start();
     new DrawThread(acc,"小红").start();
    }
}
