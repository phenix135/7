package io流2;

import java.io.*;

public class demo1 {
    public static void main(String[] args) {
        try (
                //1,创建一个字节输入流把视频文件接通
                InputStream is = new FileInputStream("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");
                //进行包装
                InputStream bis=new BufferedInputStream(is);
                //2，创建一个字节输出流管道与目标文件接通
                OutputStream os =new FileOutputStream("D:\\resourse\\newpp");
                //进行缓冲包装
                OutputStream bos=new BufferedOutputStream(os);
                //只能放资源
        ){

            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;//记录每次读取地字节数
            while((len= bis.read(buffer))!=-1){
                bos.write(buffer,0,len);
            }
            System.out.println("复制完成！");

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
