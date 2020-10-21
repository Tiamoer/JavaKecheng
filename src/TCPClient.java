import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        System.out.println("客户端初始化...");
        Socket client = new Socket("8.210.232.116",5000);
        System.out.println("服务器连接成功！");
        //  返回套接字连接的地址
        InetAddress inetAddress = client.getInetAddress();
        System.out.println("远程连接的地址为："+inetAddress.getHostAddress());
        OutputStream outputStream = client.getOutputStream();
        InputStream inputStream = client.getInputStream();


    }
}
