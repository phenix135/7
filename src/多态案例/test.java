package 多态案例;

public class test {
    public static void main(String[] args) {
        //1.创建电脑对象
     computer c =new computer("外星人");
       c.start();

       //2.创建鼠标对象，键盘对象
        USB u=new keyborad("双飞燕");
        c.installUSB(u);

        USB u1=new Mouse("罗技");
        c.installUSB(u1);
    }
}
