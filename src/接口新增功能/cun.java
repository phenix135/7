package 接口新增功能;

public interface cun {
    static void run(){  //静态方法
        System.out.println("我会慢慢喜欢上java语言的");
    }
}
class win{
    public static void main(String[] args) {
        cun.run();  //用接口名调用方法
    }
}