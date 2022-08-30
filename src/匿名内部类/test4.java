package 匿名内部类;

public class test4 {
    public static void main(String[] args) {
        Animals a=new Animals() {
            @Override
            public void run() {
                System.out.println("老虎跑起来了");
            }
        };
        go(a);

    }
    public static void go(Animals a){
        System.out.println("开始-----");
        a.run();
        System.out.println("结束-----");
    }
}
abstract class Animals{
    public abstract void run();
}