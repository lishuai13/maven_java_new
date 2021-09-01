package socket.demo1;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * TCP客户端:发送数据
 *
 */
public class TCPClient {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress serverIP = InetAddress.getByName("127.0.0.1");
        try (
                //连接服务器
                Socket socket = new Socket(serverIP,8899);
                //创建一个输出流
                OutputStream os = socket.getOutputStream()
        ) {
            os.write("你好,欢迎学习".getBytes());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
