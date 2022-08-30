package io流2;

import java.io.*;

public class demo2 {
    public static void main(String[] args) throws Exception {
        copy1();//使用字节输入输出流一个一个字节地复制
        copy2();//使用字节输入输出流一个一个数组地复制文件
        copy3();
        copy4();
    }

    /**
     * 方法一：使用字节输入输出流一个一个字节地复制文件
     * @throws Exception
     */
    public static void copy1() throws Exception {
        //1,建立字节输入流
        InputStream is = new FileInputStream("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
        //2,建立字节输出流
        OutputStream os = new FileOutputStream("D:/1/app1");
        int len;
        while ((len = is.read()) != -1) {
            os.write((char) len);
        }
        System.out.println("复制成功！");
        os.close();
    }
    /**
     * 方法二：使用字节输入输出流一个一个数组地复制文件
    */
    public static void copy2() throws Exception {
        //1,建立字节输入流
        InputStream is=new FileInputStream("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
        //2,建立字节输出流
        OutputStream os=new FileOutputStream("D:/1/app2");

        byte[]buffer=new byte[1024];//1024个字节

        int len;
        while ((len= is.read(buffer))!=-1) {
            os.write(buffer,0,len);
        }
        System.out.println("复制成功！");
        os.close();
    }

/**
 * 方法三：使用字符输入输出流一个一个字节地复制文件
 *
 */
   public static void copy3() throws Exception {
       //1,建立字符输入流
    Reader rs=new FileReader("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
      //2,建立字符输出流
    Writer ws=new FileWriter("D:/1/app3");

    int len;
    while((len=rs.read())!=-1){
        ws.write((char)len);
    }
       System.out.println("复制成功！");
    ws.close();
}
/**
 * 方法四：使用字符输入输出流一个数组地复制文件
 */
public static void copy4() throws Exception {
    //1,建立字符输入流
    Reader rs=new FileReader("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
    //2,建立字符输出流
    Writer ws=new FileWriter("D:/1/app4");

    char[]buffer=new char[1024];
    int len;
    while((len=rs.read(buffer))!=-1){
        ws.write(buffer,0,len);
    }
    System.out.println("复制成功！");
    ws.close();
}
}



