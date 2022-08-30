package File_io;

import java.io.File;

/**
 * 学会创建file对象操作文件，文件夹
 */
public class FileDemo {
    public static void main(String[] args) {
        //1,创建file对象(可以定位是对象，也可以定位文件夹）
        File f=new File("D:\\360安全浏览器下载");//绝对路径（从盘符开始）
        long size1=f.length();
        System.out.println(size1);

        //2,相对路径（从当前工程的目录开始）
        File f1=new File("untitled7/src/date.txt");
        long size2=f1.length();
        System.out.println(size2);
    }
}
