package File_io;

import java.io.File;
import java.io.IOException;

//创建文件，删除文件
public class demo6 {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/元气壁纸缓存/dynamic/aaa/ccc");
        File f1=new File("D:\\code\\untitled7\\src\\data.txt");
        //System.out.println(f.createNewFile());
       // System.out.println(f.mkdir()); //单级文件

        //创建多级文件
        System.out.println(f.mkdirs());
        //删除文件
        System.out.println(f1.delete());


    }
}