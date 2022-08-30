package io流2;

import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class demo5 {
    public static void main(String[] args) throws Exception {
        //1，完成文件复制
        IOUtils.copy(new FileInputStream("C:\\Users\\Lenovo\\Pictures\\屏幕截图 2022-07-21 220057.png"),
                new FileOutputStream("D:/resource"));
    }
}
