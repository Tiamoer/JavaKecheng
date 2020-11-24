package Experiment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App10_7 {
    public static void main(String[] args) throws IOException {
        String thisLine;
        int count = 0;
        FileReader fr = new FileReader("D:/java/test.txt");
        BufferedReader br = new BufferedReader(fr);
        while ((thisLine=br.readLine())!=null) {
            count++;
            System.out.println(thisLine);
        }
        System.out.println("共读取了"+count+"行内容");
    }
}
