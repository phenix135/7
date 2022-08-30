package 接口新增功能;

public interface law {
    default void run(){//默认方法
        System.out.println("java语言我会一直努力坚持学下去的");
    }
}
class Car implements law{


}
class kk{
    public static void main(String[] args) {
        Car s =new Car();
        s.run();
    }
}