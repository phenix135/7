package 网络编程.demo2;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Socket;

/**
 * 客户端，实现一发一收
 */
public class Clientdemo1 {
    public static void main(String[] args) throws Exception {
        System.out.println("===========客户端启动===============");
        try {
            //1,创建Socket通信管道请求有服务器的连接
            /**
             * 参数一：服务端的ip地址
             * 参数二：服务端的端口
             */
            Socket socket=new Socket("127.0.0.1",7777);
            //2,从socket通信管道中得到一个字节输出流发送数据
            OutputStream os=socket.getOutputStream();
            //3,把低级的字节流包装成打印流
            PrintStream ps=new PrintStream(os);
            //4,发送消息
            ps.println("这里是TCP客户端，我已经与你对接，今晚约吗？");
            ps.flush();
            //关闭
           // socket.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
