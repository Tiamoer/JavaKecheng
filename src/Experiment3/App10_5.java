package Experiment3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App10_5 {
    public static void main(String[] args) throws IOException {
        char[] c = new char[500];
        FileReader fr = new FileReader("D:/java/test.txt");
        int num = fr.read(c);
        String str = new String(c,0,num);
        System.out.println("读取的字符个数为："+num+",其内容如下：");
        System.out.println(str);
    }
}
