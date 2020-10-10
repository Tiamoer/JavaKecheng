package Experiment1;

public class App6_4 {
    public static void main(String[] args) {
        A6_4 a = new A6_4(3.4,2.5,3.14);
        System.out.println("圆柱体a的底面积为："+a.area());
        System.out.println("圆柱体a的体积为："+a.volume());

        A6_4 a2 = new A6_4();
        System.out.println("圆柱体a2的底面积为："+a2.area());
        System.out.println("圆柱体a2的体积为："+a2.volume());
    }
}

class A6_4 {
    double r,h,pi;
    public A6_4() {
        r = 1;
        h = 2;
        pi = 3.14;
    }
    public A6_4(double r,double h,double pi) {
        this.r = r;
        this.h = h;
        this.pi = pi;
    }
    double area() {
        return r * r * pi;
    }
    double volume() {
        return r * r * pi * h;
    }
}