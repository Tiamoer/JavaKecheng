package demo;

import java.util.Scanner;

public class test {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n,sum = 0;
        System.out.println("请输入一个正整数：");
        n = sc.nextInt();
        for (int i=0;i<=n;i++) {
            sum += i;
        }
        System.out.println("1+2+3+...+"+n+" = "+sum);
    }
}