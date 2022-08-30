package 接口;

public class Car implements law{
    private String name;
    public Car(String name){
        this.name=name;
    }
    @Override
    public void run(){
        System.out.println(name+"必需跑步锻炼");
    }

    @Override
    public void write(){
        System.out.println(name+"开示写作了");
    }

}
