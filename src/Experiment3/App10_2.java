package Experiment3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App10_2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("G:\\LeaningJava\\Java程序设计课程\\src\\Experiment3\\正装男 .png");
        FileOutputStream fileOutputStream = new FileOutputStream("G:\\LeaningJava\\Java程序设计课程\\src\\Experiment3\\正装男2.png");
        System.out.println("文件大小:"+fileInputStream.available());
        byte[] b = new byte[fileInputStream.available()];
        fileInputStream.read(b);
        fileOutputStream.write(b);
        System.out.println("文件已被复制并重命名！");
    }
}
