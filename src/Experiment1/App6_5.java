package Experiment1;

import java.util.Scanner;

public class App6_5 {
    public static void main(String[] args) {
        int[] array = new int[10];
        int temp;
        Scanner scanner = new Scanner(System.in);
        for (int i=0;i<array.length;i++) {
            temp = scanner.nextInt();
            array[i] = temp;
        }
        System.out.println("您输入的数组为：");
        for (int i:array)
            System.out.print(i+"\t");
        System.out.println("\n最小值为:"+minNum(array));
    }
    static int minNum(int[] array) {
        int temp = array[0];
        for (int x:array)
            if (x<=temp)
                temp = x;
        return temp;
    }
}
