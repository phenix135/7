package 设计模式;
                     //懒汉单例；
public class Car2 {
    //.1.将构造器私有化
     private Car2(){

     }
     //2.创建一个静止变量,最好也私有化
     private static Car2 instance;

     //3.定义一个方法，返回一个对象
    public static Car2 getInstance(){
        if(instance==null){
          instance=new Car2();
        }
        return instance;
    }


}
