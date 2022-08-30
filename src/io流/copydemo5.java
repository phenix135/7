package io流;

import java.io.*;

/**
 * 完成一切文件的复制
 */
public class copydemo5 {
    public static void main(String[] args) throws Exception {
        InputStream is=null;
        OutputStream os=null;

        try {
            //1,创建一个字节输入流把视频文件接通
            is = new FileInputStream("D:\\元气壁纸缓存\\sys_cache\\img1.jpg");

            //2，创建一个字节输出流管道与目标文件接通
            os =new FileOutputStream("D:\\resourse\\newpp");

            //定义一个字节数组转移数据
            byte[]buffer=new byte[1024];
            int len;//记录每次读取地字节数
            while((len= is.read(buffer))!=-1){
                os.write(buffer,0,len);
            }
            System.out.println("复制完成！");

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            //无论是否有bug,finally都会被执行
            try{
                if(is!=null) is.close();
            }catch (Exception e){
                e.printStackTrace();
            }
            try{
                if(os!=null) os.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
