package 多态;

public class test {
    public static void main(String[] args) {
        //1，多态的构造类型
        Animal a1 =new Dog();
        go(a1);//本类中的方法可以直接用方法名调用

        Animal a2 =new Tortoise();
        go(a2);
    }
    public static void go(Animal a){
        System.out.println("比赛开始--------");
        a.run();//它类中的方法要用类名或对象调用
        System.out.println("比赛结束---------");
    }
}
