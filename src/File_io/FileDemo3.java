package File_io;

import java.io.File;
import java.io.IOException;

/**
 * 遍历文件
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException {
        File f=new File("D:/元气壁纸缓存");
        //遍历一级文件
        String[] names=f.list();  //一级遍历
        for (String name : names) {
            System.out.println(name);
        }

        //遍历一级文件对象
        File []files=f.listFiles();
        for (File file : files) {
            System.out.println(file.getAbsoluteFile());
        }
    }
}
