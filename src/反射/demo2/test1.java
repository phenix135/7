package 反射.demo2;

import org.junit.Test;

import java.io.File;
import java.lang.reflect.Field;

/**
 * 通过反射获取成员变量
 */
public class test1 {
    //1获取全部成员变量
    // Field[] getDeclareFeilds()
    @Test
    public void getDelaredFeilds(){
        //1,获取class对象
        Class c=Student.class;
        //2,定位全部成员变量
        Field[] fiels=c.getDeclaredFields();
       //遍历
        for (Field fiel : fiels) {
            System.out.println(fiel.getName()+"==>"+fiel.getType());
        }

    }

    //1获取全部成员变量
    // Field[] getDeclareFeild()
    @Test
    public void getDelaredFeild() throws Exception {
        //1,获取class对象
        Class c=Student.class;
        //2,全部成员变量
        Field ageF=c.getDeclaredField("age");

        ageF.setAccessible(true);//打开权限
        //3,赋值
        Student s=new Student();
        ageF.set(s,18);
        System.out.println(s);
        //4,取值
        int age=(int)ageF.get(s);
        System.out.println(age);
    }
}
