package Lambda;

public class test1 {
    public static void main(String[] args) {
        //Lambda只能简化接口中只含一个方法的匿名内部类
        swimming s =()->{
            System.out.println("老师溜得贼快");
        };
        go(s);

    }
    public static void go(swimming s){
        System.out.println("开始");
        s.swim();
        System.out.println("结束");
    }
}
interface swimming{
    void swim();
}