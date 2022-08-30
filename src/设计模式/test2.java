package 设计模式;

public class test2 {
    public static void main(String[] args) {
        Car2 s1=Car2.getInstance();
        Car2 s2=Car2.getInstance();//引用返回对象的方法
        System.out.println(s1==s2);
    }
}
