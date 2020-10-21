import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        System.out.println("服务器初始化...");
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("等待客户端连接...");
        Socket client = serverSocket.accept();
        InetAddress inetAddress = client.getInetAddress();
        System.out.println("客户端"+inetAddress.getHostAddress()+"已连接！");

        OutputStream outputStream = client.getOutputStream();
        InputStream inputStream = client.getInputStream();


    }
}
