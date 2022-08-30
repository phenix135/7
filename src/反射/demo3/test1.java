package 反射.demo3;

import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 通过反射得到方法
 */
public class test1 {
    //1,获取类中得所有成员方法对象
    @Test
    public void getDeclareMethods(){
        //1,获取类对象
        Class c=Dog.class;
        //2,提取全部方法，包括私有的
        Method[]methods=c.getDeclaredMethods();
        //3,遍历全部方法
        for (Method method : methods) {
            System.out.println(method.getName()+"返回值类型"+method.getReturnType()+"参数个数"+method.getParameterCount());
        }
    }


    //2,获取类中得某个方法对象
    @Test
    public void getDeclareMethod() throws Exception {
    //1,获取类对象
        Class c=Dog.class;
    //2,提取单个方法对象
      Method m=c.getDeclaredMethod("eat");
      Method m1=c.getDeclaredMethod("eat", String.class);

      //暴力打开权限
        m.setAccessible(true);
        m1.setAccessible(true);
      //3,触发方法的执行
        Dog d=new Dog();
        m.invoke(d);
        m1.invoke(d,"骨头");
    }
}
