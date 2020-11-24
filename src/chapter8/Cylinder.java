package chapter8;

interface Face1 {
    static final double PI = 3.14;
    abstract double area();
}

interface Face2 {
    abstract void volume();
}

public abstract class Cylinder implements Face1,Face2 {
    private double radius;
    private int height;
    public Cylinder(double r,int h) {
        radius = r;
        height = h;
    }

    @Override
    public double area() {
        return PI*radius*height;
    }

    @Override
    public void volume() {
        System.out.println("圆柱体的面积是："+area()*height);
    }

    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.2,2) {
            @Override
            public double area() {
                return super.area();
            }

            @Override
            public void volume() {
                super.volume();
            }
        };
        cylinder.volume();
    }
}