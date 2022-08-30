package io流2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class propertiesdemo2 {
    public static void main(String[] args) throws Exception {
        Properties properties=new Properties();

        properties.load(new FileReader("D:\\code\\untitled7\\src\\data.txt"));

        System.out.println(properties);

        String rs1=properties.getProperty("admin");
        System.out.println(rs1);

        String rs2=properties.getProperty("heima");
        System.out.println(rs2);
    }
}
