package Experiment2;

interface IShape {
    static final double PI = 3.14;
    abstract double getArea();
    abstract double getLength();
}

class Circlr8_11 implements IShape {
    double radius;
    public Circlr8_11(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    @Override
    public double getLength() {
        return 2*PI*radius;
    }
}

class Rectangle8_11 implements IShape {
    private double width;
    private double height;
    Rectangle8_11(double width,double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getLength() {
        return 2*(width+height);
    }
}

public class App8_11 {
    public static void main(String[] args) {
        IShape circle = new Circlr8_11(5.0);
        System.out.print("圆面积="+circle.getArea());
        System.out.println(";圆周长="+circle.getLength());
        Rectangle8_11 rect = new Rectangle8_11(6.5,10.8);
        System.out.print("矩形面积="+rect.getArea());
        System.out.println(";矩形周长="+rect.getLength());
    }
}
