package Experiment1;

public class App6_2 {
    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(3.5f,5);
        Cylinder cylinder2 = new Cylinder(2.6f,4);
        //  修改第二个圆柱体对象的PI值
        cylinder2.PI = 3.00f;

        System.out.println("圆柱体"+cylinder1.toString()+"的底面积为"
                +BottomArea(cylinder1.r,cylinder1.h)
                +"\t体积为"+Volume(BottomArea(cylinder1.r,cylinder1.h),cylinder1.h));
        System.out.println("圆柱体"+cylinder2.toString()+"的底面积为"
                +BottomArea(cylinder2.r,cylinder2.h)
                +"\t体积为"+Volume(BottomArea(cylinder2.r,cylinder2.h),cylinder2.h));
    }

    //  圆柱的底面积计算方法
    static float BottomArea(float r,float PI) {
        return PI*r*r;
    }

    //  圆柱的体积计算方法
    static float Volume(float bottomArea,float h) {
        return bottomArea*h;
    }
}

//  圆柱体类
class Cylinder {
    float PI = 3.1415926f;
    float r;
    float h;
    public Cylinder(float r,float h) {
        this.r = r;
        this.h = h;
    }
}