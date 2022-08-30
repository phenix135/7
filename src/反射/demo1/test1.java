package 反射.demo1;

import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * 通过反射获取 构造器
 */
public class test1 {

    //1,getConstructors
    //获取全部的构造器，只能获取public修饰的

    @Test
    public void getConstructors() {
        //a,获取类对象
        Class c = Student.class;
        //b,提取类中的全部构造器对象
        Constructor[] constructors = c.getConstructors();
        //c,遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    //2,getDeclareConstructors
    //获取全部构造器
    @Test
    public void getDeclareConstructors() {
        //a,获取类对象
        Class c = Student.class;
        //b,提取类中的全部构造器对象
        Constructor[] constructors = c.getDeclaredConstructors();
        //c,遍历构造器
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "==>" + constructor.getParameterCount());
        }
    }

    //3,getConstructors-----获取某一个构造器
    @Test
    public void getConstructor() throws Exception {
        //a,获取类对象
        Class c = Student.class;
        //b,定位某个构造器
        Constructor cons = c.getConstructor();//无参数，定位无参数构造器

        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
    }


    //4,getDeclareConstructor
    //获取某个构造器（不限类型）
    @Test
    public void getDeclareConstructor() throws Exception {
        //a,获取类对象
        Class c = Student.class;
        //b,定位某个构造器
        Constructor cons = c.getDeclaredConstructor(String.class,int.class);//有参数数，定位有参数构造器

        System.out.println(cons.getName() + "===>" + cons.getParameterCount());
    }
}