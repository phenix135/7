package 设计模式;
           //饿汉单例
public class Car {
    //1,将构造器私有化
     private Car(){
     }
     //2.单例，一个类只能定义一个对象，所以用静态变量存储
    public static Car instance=new Car();

}
