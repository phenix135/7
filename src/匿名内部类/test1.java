package 匿名内部类;

public class test1 {
    public static void main(String[] args) {
  Animal a=new Animal() {
      @Override
      public void run() {
          System.out.println("老虎跑的很快");
      }
  };     //注意：匿名类的后面要带分号
  go(a);
    }


    public static void go(Animal s){
        System.out.println("开始");
        s.run();
        System.out.println("结束");
    }
}

 /**class tiger extends Animal{     //子类
    public void run(){
        System.out.println("老虎跑的很快---");
    }
}  */



abstract class Animal{   //父类
    public abstract void run();
}