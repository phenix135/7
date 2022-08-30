package io流2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符缓冲输出流,bw.newline()---换行
 */
public class demo4 {
    public static void main(String[] args) throws Exception {
        //建立一个字符输出流与文件接通
        Writer fw=new FileWriter("D:\\code\\untitled7\\src\\data05.txt");
        //包装缓冲
        BufferedWriter bw=new BufferedWriter(fw);
        //
        bw.write('a');
        bw.write(98);
        bw.write('徐');
        bw.write("abc我是中国人");//输出 abc我是中国人

        bw.write("abc我是中国人",0,5);

        // bw.flush();
        bw.close();
    }
}
