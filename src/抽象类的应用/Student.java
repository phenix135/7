package 抽象类的应用;

public abstract class Student {     //抽象类
    public void write(){            //模板方法
        System.out.println("《我的爸爸》");
        System.out.println("他好极了");
        System.out.println(run());
        System.out.println("我很好");

    }
    public abstract String run();//抽象方法，需要被重写

}

