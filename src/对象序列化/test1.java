package 对象序列化;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 学会对象实例化。使用ObjectOutputStream把内存中的对象存到磁盘文件中
 */
public class test1 {
    public static void main(String[] args) throws Exception {
      //1,创建学生对象
        Student s=new Student("吴磊","wulei","1314520",21);

        //2,使用对象字节输出流包装字节输出流管道
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("D:\\code\\untitled7\\src\\data06.txt"));

     //3,直接调用序列化方法
        oos.writeObject(s);

        //4，释放资源
        oos.close();
    }
}
