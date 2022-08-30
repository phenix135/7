package File_io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.logging.SimpleFormatter;

public class Filedemo2 {
    public static void main(String[] args) {
        //创建一个对象
        File f=new File("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
        //1,获取绝对路径
        System.out.println(f.getAbsoluteFile());
        //2,获取定义时候的路径
        System.out.println(f.getPath());
        //3,获取文件的名称，带路径
        System.out.println(f.getName());
        //4,获取文件的大小(字节数）
        System.out.println(f.length());
        //5,获取文件的最后修改时间
        long time=f.lastModified();
        System.out.println("最后的修改时间为"+new SimpleDateFormat("YYYY/MM/dd HH:mm:ss").format(time));
        //6,判断是否是文件
        System.out.println(f.isFile());
        //7,判断是否是文件夹
        System.out.println(f.isDirectory());
        //8,判断是否存在
        System.out.println(f.exists());
    }
}
