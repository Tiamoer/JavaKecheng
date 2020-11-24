package Experiment2;

interface Face1_13 {
    static final double PI = 3.14;
    abstract double area();
}
interface Face2_13 {
    abstract void volume();
}

public class App8_13 implements Face1_13,Face2_13 {
    private double radius;
    private int height;
    App8_13(double r,int h) {
        radius = r;
        height = h;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public void volume() {
        System.out.println("圆柱体体积："+area()*height);
    }

    public static void main(String[] args) {
        App8_13 volu = new App8_13(5.0,2);
        volu.volume();
    }
}
