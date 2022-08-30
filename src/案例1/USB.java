package 案例1;

public interface USB {    //接口
      void  connect();
      void  unconnect();
}

class keyborad implements USB{      //定义一个实现类keyborad
    String name;

    public keyborad(String name) {
        this.name = name;           //定义一个有参构造器
    }

    //重写通用方法

    @Override
    public void connect() {
        System.out.println(name+"插入了");
    }

    public void unconnect(){
        System.out.println(name+"抽出了");
    }

    //独立方法
    public void run(){
        System.out.println("敲击：来了，老弟");
    }
}

class Mouse implements USB{     //定义一个鼠标类
      String name;

    public Mouse(String name) {
        this.name = name;              //定义一个有参构造器
    }

    //重写通用功能


    @Override
    public void connect() {
        System.out.println(name+"插入了");
    }

    @Override
    public void unconnect() {
        System.out.println(name+"抽出了");
    }

    //独立功能
    public void cun(){
        System.out.println("双击比心");

    }
}

class computer {    //定义一个电脑类
    String name;

    public computer(String name) {
        this.name = name;
    }
    public void start(){
        System.out.println(name+"开机了");
    }

    public void installUSB(USB usb){
        usb.connect();

        if(usb instanceof keyborad){     //父类到子类的强制转换，以实现独立功能的调用
            keyborad k =(keyborad)usb;
            k.run();
        }else if(usb instanceof Mouse){
            Mouse m =(Mouse)usb;
            m.cun();
        }

        usb.unconnect();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class test {
    public static void main(String[] args) {
        computer c =new computer("拯救者");
        c.start();

        USB k =new keyborad("罗技");
        c.installUSB(k);

        USB m=new Mouse("长生");
        c.installUSB(m);

    }
}

















