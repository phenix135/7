package 对象序列化;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

/**
 * 对象反序列化
 */
public class test2 {
    public static void main(String[] args) throws Exception {
        //1，创建对象字节输入流包装低级的字节输入管道
        ObjectInputStream is=new ObjectInputStream(new FileInputStream("D:\\code\\untitled7\\src\\data06.txt"));

       //2,调用对象字节输入流的反序列方法
        Student s=(Student) is.readObject();

        System.out.println(s);
    }
}
