package io流2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Propertiesdemo {
    public static void main(String[] args) throws IOException {
        //1,使用properties把键值对信息存入文件中去
        Properties properties=new Properties();
        properties.setProperty("admin","12345");
        properties.setProperty("heima","1314");

        /**
         * 参数一：保存管道
         * 参数二：保存心得
         */
        properties.store(new FileWriter("D:\\code\\untitled7\\src\\data.txt"),"i will be a master");

    }
}
