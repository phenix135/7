package 网络编程.demo2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 开发Socket网络编程入门代码的服务端，接受信息
 */
public class Sever {
    public static void main(String[] args) {
        System.out.println("============服务端启动===============");
        try {
            //1,注册端口
            ServerSocket serverSocket=new ServerSocket(7777);
            //2,必须调用accept方法
            Socket socket=serverSocket.accept();
            //3,从socket通信管道中得到一个字节输入流
            InputStream is=socket.getInputStream();
            //4，把字结输入流包装成字符输入流
            BufferedReader br=new BufferedReader(new InputStreamReader(is));
            //5,按行读取信息
            String msg;
            if((msg= br.readLine())!=null){
                System.out.println(socket.getRemoteSocketAddress()+"说了"+msg);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
