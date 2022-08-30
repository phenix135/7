package day1;

public class Static {
    //1.静态成员变量
    public static int olinenumber=16;
    //2,实例成员变量
    private int age=19;
    //3.静态成员方法
    public static void run(){
        System.out.println("您的系统跑起来了");
    }

    //4.实例成员方法
    public void start(){
        System.out.println("您的程序开始了");
    }

    public static void main(String[] args) {

        System.out.println("调用静态成员变量");
        System.out.println(Static.olinenumber);

        System.out.println("调用实例成员变量");
        Static  c = new Static();
        System.out.println(c.age);
      //调用静态成员方法
        Static.run();
      //调用实例成员方法
        Static c1=new Static();
        c1.start();
    }
}
