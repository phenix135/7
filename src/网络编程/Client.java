package 网络编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * 发送端
 */
public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("========客户端启动============");
        //1,创建发送端对象，发送端自带默认的端口号
        DatagramSocket socket=new DatagramSocket();

        //2,创建数据包对象封装对象
        /**
         * byte buf[], int length, SocketAddress address) {
         *         this(buf, 0, length, address)
         * 参数一：封装要发送的数据（韭菜）
         * 参数二：发送数据的大小
         * 参数三：服务端的ip地址
         * 参数四：服务端的端口
         *
         */
        byte[]buffer="我是一颗快乐的韭菜，你愿意吃吗".getBytes();
        DatagramPacket packet=new DatagramPacket(buffer, buffer.length, InetAddress.getLocalHost(),8888);

        //3,发送数据出去
        socket.send(packet);

        socket.close();
    }
}
