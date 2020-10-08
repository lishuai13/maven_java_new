package Socket.demo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 客户端：上传服务器文件
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        //创建一个Socket连接
        Socket socket = new Socket(InetAddress.getByName("127.0.0.1"), 8899);
        //创建一个Socket输出流
        OutputStream os = socket.getOutputStream();
        //读取本地上传的文件
        FileInputStream is = new FileInputStream(new File("E:\\File\\3-1.jpg"));

        //将文件输出流写进Socket的输出流
        byte[] bytes = new byte[1024];
        int len;
        while ((len=is.read(bytes))!=-1){
            os.write(bytes,0,len);
        }

        is.close();
        os.close();
        socket.close();
    }
}
