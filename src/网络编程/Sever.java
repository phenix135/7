package 网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 服务端
 */
public class Sever {
    public static void main(String[] args) throws Exception {
        System.out.println("============服务端启动===========");
        //1,创建接收端对象
        DatagramSocket socket=new DatagramSocket();

        //2,创建一个数据包对象（韭菜盘子）
        byte[]buffer=new byte[1024*64];
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length);

        //等待接受数据
        socket.receive(packet);

        //收到数据
        //读取多少倒多少
        int len= packet.getLength();
        String rs=new String(buffer,0,len);
        System.out.println("收到"+rs);

        socket.close();
    }
}
