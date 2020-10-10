package Experiment1;

public class App7_8 {
    public static void main(String[] args) {
        for (int i = 0;i<=4;i++) {
            new A7_8(Math.random()).show();
        }
    }
}

class A7_8 {
    private static int num = 0;
    double ranNum;
    A7_8(double ranNum) {
        this.ranNum = ranNum;
        num++;
    }
    public void show() {
        System.out.println("创建了"+num+"个对象");
        System.out.println("这个对象的ranNum值为:"+ranNum);
    }
}