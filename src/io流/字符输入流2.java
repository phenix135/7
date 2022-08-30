package io流;

import java.io.FileReader;
import java.io.Reader;

public class 字符输入流2 {
    public static void main(String[] args) throws Exception {
        Reader fr=new FileReader("D:\\code\\untitled7\\src\\data04.txt");
        char[] buffer=new char[1024];
        int len;
        while((len=fr.read(buffer))!=-1){
            String rs=new String(buffer,0,len);
            System.out.println(rs);
        }
    }
}
