package Socket.demo1;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCP服务端：接受数据
 */
public class TCPServer {

    public static void main(String[] args){

        try (   //创建一个Socket，IP默认为本地127.0.0.1
                ServerSocket serverSocket = new ServerSocket(8899);
                //创建一个监听
                Socket socket = serverSocket.accept();
                //创建一个输入流
                InputStream is = socket.getInputStream();
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len=is.read(bytes))!=-1){
                System.out.println(new String(bytes,0,len));
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
