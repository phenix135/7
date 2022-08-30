package io流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class test6 {
    public static void main(String[] args) {

        try (
            //1,创建一个字节输入流把视频文件接通
            InputStream is = new FileInputStream("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");

            //2，创建一个字节输出流管道与目标文件接通
             OutputStream os =new FileOutputStream("D:\\resourse\\newpp");
             //只能放资源
             ){

            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;//记录每次读取地字节数
            while((len= is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成！");

        }catch (Exception e){
            e.printStackTrace();
    }
}
}
