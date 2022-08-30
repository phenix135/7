package Thread;

/**
 * 方法二的匿名内部类写法
 */
public class demo3 {
    public static void main(String[] args) {
        //创建一个任务对象
        Runnable target=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行1"+i);
                }
            }
        };
       //把任务对象交给Thread处理
        Thread t= new Thread(target);
        //启动多线程
        t.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("子线程执行2"+i);
                }
            }
        }).start();

        new Thread(()->{
            for (int i = 0; i < 5; i++) {
                System.out.println("子线程执行3"+i);
            }
        }
        ).start();

        for (int i = 0; i < 5; i++) {
            System.out.println("主线程执行"+i);
        }
    }
}
