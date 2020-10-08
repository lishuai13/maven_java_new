package Socket.demo3;

import java.io.IOException;
import java.net.*;

/**
 * UDP客户端1：发送消息
 */
public class UDPClient1 {
    public static void main(String[] args) throws IOException {

        //建立UDP的DatagramSocket
        DatagramSocket socket = new DatagramSocket(8898);
        //IP地址
        InetAddress it = InetAddress.getByName("127.0.0.1");
        //传输的数据
        String msg = "测试UDP的数据";
        //数据打包
        DatagramPacket packet = new DatagramPacket(msg.getBytes(), 0, msg.getBytes().length, it, 8899);
        //发送数据
        socket.send(packet);

        socket.close();
    }
}
