package io流;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 定义与文件一样大的字节数组，一次性输入
 */
public class text3 {
    public static void main(String[] args) throws Exception {

        File f=new File("D:\\code\\untitled7\\src\\data.txt");//pathname只能是绝对路径：D:\\code\\untitled7\\src\\data.txt
                                                                        //或者：src\\data.txt(不要项目名)
        InputStream is=new FileInputStream(f);
        //定义一个字节数组和文件一样大
        byte[]buffer=new byte[(int)f.length()];
        int len= is.read(buffer);
        System.out.println("读取了"+len+"字节");
        System.out.println("文件大小为"+f.length());
        System.out.println(new String(buffer));


       //或者
        byte[]buffer1= is.readAllBytes();//获取全部字节
        System.out.println(new String(buffer1));
    }
}
