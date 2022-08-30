package 反射.demo1;

import org.junit.Test;

import java.lang.reflect.Constructor;

public class demo1 {


    //1,调用一个无参构造器得到一个类得对象返回
    @Test
    public void getDeclareConstructor() throws Exception {
        //a,获取类对象
        Class c = Student.class;
        //b,定位某个构造器
        Constructor cons = c.getDeclaredConstructor();//无参数，定位无参数构造器

        //如果遇到私有构造器，可以暴力反射
        cons.setAccessible(true);//权限被打开

        Student s=(Student)cons.newInstance();
        System.out.println(s);

        //c,定位某个有参构造器
        Constructor cons1 = c.getDeclaredConstructor(String.class,int.class);//有参数，定位有参数构造器
         Student s1=(Student)cons1.newInstance("孙悟空",1000);
        System.out.println(s1);
    }
}
