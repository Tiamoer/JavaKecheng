package chapter1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

// 基本数据类型
public class BasicDataType {
    public static void main(String[] args) throws IOException {
    //    Java语言中的Boolean定义的关键字是Boolean
    //    真值是true 假值是false
    //    关键字都是小写
    //    变量的初始化就是定义变量的同时并赋值
    //    数据类型转换分为自动类型转换和强制类型转换
    //    Java由键盘输入的数据，不管是文字还是数字，Java皆视为“字符串
        BufferedReader bufferedReader;  // 缓冲读取
        Scanner scanner = new Scanner(System.in);
        String str;
        float num,num2;
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));  //  字节流转为字符流
        System.out.print("请输入一个浮点数：");
        str = bufferedReader.readLine();
        // 你好 年号
        num = Float.parseFloat(str);    //  类型转换-String转Float
        System.out.println("您第一次输入的实数是："+num);
        System.out.println("现在使用Scanner对象实现接收输入！");
        System.out.print("请输入一个实数：");
        num2 = scanner.nextFloat();
        System.out.println("您第二次输入的实数为："+num2);
    }
}