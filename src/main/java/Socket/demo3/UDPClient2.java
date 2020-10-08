package Socket.demo3;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * UDP客户端2：接收消息
 */
public class UDPClient2 {
    public static void main(String[] args) throws IOException {
        //建立socket，开放端口
        DatagramSocket socket = new DatagramSocket(8899);

        byte[] bytes = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length);
        //阻塞接受数据
        socket.receive(packet);
        //输出接收到的数据
        System.out.println(new String(packet.getData(),0,packet.getLength()));

        socket.close();

    }
}
