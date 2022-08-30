package io流;

import java.io.FileInputStream;

import java.io.InputStream;

public class text1 {
    public static void main(String[] args) throws Exception {
        //1,创建一个文件字节输入流管道与源文件接通

        InputStream is = new FileInputStream("D:\\code\\untitled7\\src\\data.txt");


            //读第一个字节
            int b1 = is.read();
            System.out.println((char) b1);

            int b2 = is.read();
            System.out.println((char) b2);

            int b3 = is.read();
            System.out.println((char) b3);

           int b4 = is.read();

        System.out.println(b4); //读第四个发现没有，返回-1

        //2,循环改进
        int b;
        while((b=is.read())!=-1){
            System.out.println((char)b);
        }
    }
}
