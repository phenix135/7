package io流;

import java.io.FileWriter;
import java.io.Writer;

public class shuchuliu {
    public static void main(String[] args) throws Exception {
        //建立一个字符输出流与文件接通
        Writer fw=new FileWriter("D:\\code\\untitled7\\src\\data05.txt");

        //
        fw.write('a');
        fw.write(98);
        fw.write('徐');
        fw.write("abc我是中国人");//输出 abc我是中国人

        fw.write("abc我是中国人",0,5);

       // fw.flush();
          fw.close();
    }
}
