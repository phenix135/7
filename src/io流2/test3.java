package io流2;

import java.io.*;

/**
 * 建立一个缓冲地字符输入流,独有功能 readline()
 */
public class test3 {
    public static void main(String[] args) {
        try(
                Reader fr=new FileReader("D:\\code\\untitled7\\src\\data05.txt");
                BufferedReader br=new BufferedReader(fr);
                ) {
            char[]buffer=new char[1024];
            int len;
            while ((len= br.read(buffer))!=-1){
                String rs=new String(buffer,0,len);
                System.out.println(rs);
            }
          //读一行
            System.out.println(br.readLine());//BufferedReader独有地功能
            String line;
            while ((line= br.readLine())!=null){
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
