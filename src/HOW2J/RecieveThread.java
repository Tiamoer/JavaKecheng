package HOW2J;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

public class RecieveThread extends Thread {
    private final Socket socket;
    public RecieveThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            Date date = new Date();
            InetAddress inetAddress = socket.getInetAddress();
            InputStream inputStream = socket.getInputStream();
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            while (true) {
                String msg = dataInputStream.readUTF();
                String time = (1900+date.getYear())+"年"+(date.getMonth()+1)+"月"+date.getDay()+"日";
                FileOutputStream fileOutputStream = new FileOutputStream(""+time+".txt");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
                System.out.println(inetAddress.getHostAddress()+":\n"+time+"\t"+msg);
                outputStreamWriter.write(msg);
                System.out.println("写入文件成功！");
                // fileOutputStream.close();
                // outputStreamWriter.flush();
                // outputStreamWriter.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
