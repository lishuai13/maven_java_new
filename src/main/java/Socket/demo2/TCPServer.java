package socket.demo2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务端：接受文件并保存
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
        //创建服务器的ServerSocket
        ServerSocket serverSocket = new ServerSocket(8899);
        //阻塞式等待连接,创建Socket
        Socket socket = serverSocket.accept();
        //获取Socket的输入流
        InputStream is = socket.getInputStream();
        //创建文件输出流
        FileOutputStream os = new FileOutputStream(new File("E:\\File\\3-2.jpg"));

        //将Socket的输入流的数据写入到本地
        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        os.close();
        is.close();
        socket.close();
        serverSocket.close();
    }
}
