package 设计模式;

public class test1 {
    public static void main(String[] args) {
        Car s1= Car.instance;
        Car  s2= Car.instance;
        System.out.println(s1 == s2);
    }
}
