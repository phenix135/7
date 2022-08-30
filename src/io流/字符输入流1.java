package io流;

import java.io.FileReader;
import java.io.Reader;

public class 字符输入流1 {
    public static void main(String[] args) throws Exception{
        //每次读取一个字符
        //1,创建一个字符输入流与文件接通
        Reader fr=new FileReader("D:\\code\\untitled7\\src\\data04.txt");

        //2,每次读一个字符，并返回编号，没有读到则返回-1
        int code=fr.read();
        System.out.println((char)code); //读第一个字符

        int code1=fr.read();
        System.out.println((char)code1);

        int code2=fr.read();
        System.out.println((char)code2);
        //使用循环读取字符
        int code3;
        while((code3=fr.read())!=-1){
            System.out.print((char)code3);
        }

    }
}
