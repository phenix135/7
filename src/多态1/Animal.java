package 多态1;
  //定义一个抽象类
public abstract class Animal {
    public abstract void run();
}

//定义第一个实现类
class Dog extends Animal{
    public void run(){
        System.out.println("狗跑起来了");
    }
}

//定义第二个抽象类
class Tortoise extends Animal{
    @Override
    public void run() {
        System.out.println("乌龟跑不起来了");
    }
}

class test{
    public static void main(String[] args) {
        Animal a1= new Dog();
        go(a1);
        Animal a2 = new Tortoise();
        go(a2);


    }
    public static void go(Animal a){
        System.out.println("开始----");
        a.run();
        System.out.println("结束----");
    }
}