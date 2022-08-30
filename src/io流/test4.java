package io流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

//文件字节输出流
public class test4 {
    public static void main(String[] args) throws Exception {
        //1,建立一个文件字节输出流
        OutputStream os=new FileOutputStream("D:\\code\\untitled7\\src\\data03.txt",true);

        //写数据出去
        os.write('a');
        os.write(98);
       // os.write('徐');不能写中文



       //写一个字节数组出去
        byte[]buffer={'a',98,97,99};
        os.write(buffer);

        byte[]buffer2="我是中国人".getBytes();
        os.write(buffer2);

        //写一个字节数组的一部分
        byte[]buffer3={'a',97,98,99};
        os.write(buffer3,0,3);//从0开始，长度为3
        os.write("\r\n".getBytes());//换行


                //刷新数据(写数据必须刷新数据)
                // os.flush();
                os.close();//释放资源（包含刷新）
    }
}
