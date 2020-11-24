package Experiment3;

import java.io.FileWriter;
import java.io.IOException;

public class App10_6 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("D:/java/test.txt");
        char[] c = {'H','e','l','l','o','\r','\n'};
        String str = "欢迎使用Java";
        fw.write(c);
        fw.write(str);
        fw.close();
    }
}
