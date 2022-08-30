package 多态1;

public interface USB {
    void connect();
    void unconnect();

}
class keyborad implements USB{     //实现
    String name;

    public keyborad(String name) {
        this.name = name;
    }

    @Override
    public void connect() {
        System.out.println("连接成功");
    }

    @Override
    public void unconnect() {
        System.out.println("断开连接");
    }

    public void run(){
        System.out.println("跑起来了");
    }//自己独立的方法，需要类型强制转换
}
class Car{
    public static void main(String[] args) {
        USB usb = new keyborad("罗技");
        usb.connect();
        usb.unconnect();

    keyborad k= (keyborad)usb; //类型强转
    k.run();


    }
}