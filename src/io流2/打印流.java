package io流2;

import java.io.FileNotFoundException;
import java.io.PrintStream;

//可以打印任意类型的数据
public class 打印流 {
    public static void main(String[] args) throws Exception {
        PrintStream ps=new PrintStream("D:\\code\\untitled7\\src\\data.txt");
        ps.println(98);
        ps.println('a');
        ps.println("我爱你中国");

        ps.close();
    }
}
