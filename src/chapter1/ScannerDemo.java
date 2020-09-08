package chapter1;

import java.util.Scanner;
/*
    Java输入类 Scanner 该类位于util包下
    Scanner 的next()方法和nextLine()方法的区别
    next方法一定要读取到有效字符后才可以结束输入，nextLine方法返回Enter键之前的所有字符
 */
public class ScannerDemo {
    static String s1,s2;
    static Scanner sc;
    public static void main(String[] args) {
    //    例3.7 p30
        sc = new Scanner(System.in);
        System.out.println("请输入第一个数据：");
        s1 = sc.nextLine();
        System.out.println("请输入第二个数据：");
        s2 = sc.next();
        System.out.println("您输入的为："+s1+s2);
    }
}

class Exem extends Thread {
    @Override
    public void run() {

    }
}