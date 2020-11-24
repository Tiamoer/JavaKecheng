package Experiment3;

import java.io.*;

public class App10_8 {
    public static void main(String[] args) throws IOException {
        String str = new String();
        try (
                BufferedReader bfr = new BufferedReader(new FileReader("D:/java/test.txt"));
                BufferedWriter bfw = new BufferedWriter(new FileWriter("D:/java/test1.txt"));
        ) {
            while ((str = bfr.readLine()) != null) {
                System.out.println(str);
                bfw.write(str);
                bfw.newLine();
            }
            bfw.flush();
        } catch (IOException ioe) {
            System.out.println("错误："+ioe);
        }
    }
}
