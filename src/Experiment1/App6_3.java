package Experiment1;

import java.util.Scanner;

public class App6_3 {
    static final float PI = 3.14f;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        float r,h;
        System.out.println("请输入圆柱体底面积的半径和高:");
        r = scanner.nextFloat();
        h = scanner.nextFloat();
        System.out.println("圆柱体的底面积为："+BottomArea(r)+"\n圆柱体的体积为："+Volume(r,h));
    }

    //  圆柱的底面积计算方法
    static float BottomArea(float r) {
        return PI*r*r;
    }

    //  圆柱的体积计算方法
    static float Volume(float r,float h) {
        return PI*r*r*h;
    }
}
