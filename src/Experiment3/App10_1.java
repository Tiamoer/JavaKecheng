package Experiment3;

import java.io.*;

public class App10_1 {
    public static void main(String[] args) {
        char ch;
        int data;
        try (
                FileInputStream fileInputStream = new FileInputStream(FileDescriptor.in);
                FileOutputStream fileOutputStream = new FileOutputStream("E:myfile.txt");
        ) {
            System.out.println("请输入一串字符，并以#结束：");
            while ((ch = (char) fileInputStream.read()) != '#')
                fileOutputStream.write(ch);
        } catch (FileNotFoundException e) {
            System.out.println("文件没有找到！");
        } catch (IOException e) {
        }
        try (
                FileInputStream fileInputStream = new FileInputStream("E:myfile.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(FileDescriptor.out);
        ) {
            while (fileInputStream.available() > 0) {
                data = fileInputStream.read();
                fileOutputStream.write(data);
            }
        } catch (IOException e) {
        }
    }
}
