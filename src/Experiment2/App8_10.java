package Experiment2;

import java.awt.*;

abstract class shape8_10 {
    protected String name;
    shape8_10(String name) {
        this.name = name;
        System.out.print("名称:"+name);
    }
    abstract public double getArea();
    abstract public double getLength();
}

class circle8_10 extends shape8_10 {
    private final double PI = 3.14;
    private double radius;
    public circle8_10(String shapName,double r) {
        super(shapName);
        radius = r;
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

class rectangle8_10 extends shape8_10 {
    private double width;
    private double height;
    rectangle8_10(String shapName,double width,double height) {
        super(shapName);
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

public class App8_10 {
    public static void main(String[] args) {
        shape8_10 rect =  new rectangle8_10("长方形",6.5,10.3);
        System.out.print(";面积="+rect.getArea());
        System.out.println(";周长="+rect.getLength());
        shape8_10 circle = new circle8_10("圆",10.2);
        System.out.print(";面积="+circle.getArea());
        System.out.println(";周长="+circle.getLength());
    }
}
