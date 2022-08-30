package io流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class test2 {
    public static void main(String[] args) throws Exception {
        //1,创建一个文件字节输入流与源文件接通
        InputStream is=new FileInputStream("D:\\code\\untitled7\\src\\data02.txt");

        //2,定义字节数组进行读取数据
        byte[] buffer=new byte[3];//3个字节
       int len= is.read(buffer);
        System.out.println("读取了几个字节"+len);
        //3,解码
        String rs=new String(buffer);
        System.out.println(rs);   //输出abc


        int len1= is.read(buffer);
        System.out.println("读取了几个字节"+len1);
        //3,解码
        String rs1=new String(buffer);
        System.out.println(rs1);  //输出 abc
        //buffer={abc}

       /** //读的前两滴覆盖buffer的前两滴
        int len2= is.read(buffer);
        System.out.println("读取了几个字节"+len2);
        //3,解码
        String rs2=new String(buffer);
        System.out.println(rs2); //输出cdc
        */
        int len2= is.read(buffer);
        System.out.println("读取了几个字节"+len2);
       String rs2=new String(buffer,0,len2);
        System.out.println(rs2); //输出cd

        //3.循环表示
        byte[] bytes=new byte[3];
        int len3;
        while((len3=is.read(buffer))!=-1){
            System.out.print(new String(buffer,0,len3));
        }

    }
}
