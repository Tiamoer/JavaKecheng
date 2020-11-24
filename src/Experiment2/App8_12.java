package Experiment2;

interface Face1 {
    static final double PI = 3.14;
    abstract double area();
}

interface Face2 {
    abstract void setColor(String color);
}

interface Face3 extends Face2,Face1 {
    abstract void volume();
}

public class App8_12 implements Face3 {
    private double radius;
    private int height;
    protected String color;
    App8_12(double r,int h) {
        radius = r;
        height = h;
    }

    @Override
    public double area() {
        return PI*radius*radius;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
        System.out.println("颜色："+color);
    }

    @Override
    public void volume() {
        System.out.println("圆柱体体积="+area()*height);
    }

    public static void main(String[] args) {
        App8_12 volu = new App8_12(3.0,2);
        volu.setColor("红色");
        volu.volume();
    }
}
