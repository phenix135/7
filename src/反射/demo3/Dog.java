package 反射.demo3;

public class Dog {
    String name;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void run(){
        System.out.println("狗跑得贼快");
    }

    private void eat(){
        System.out.println("狗在吃东西");
    }

    public String eat(String name){
        System.out.println("狗吃"+name);
        return "吃得很开心！";
    }

    public void inAddr(){
        System.out.println("在吉山区有一群单身狗！");
    }
}
