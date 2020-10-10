package Experiment1;

public class App7_6 {
    public static void main(String[] args) {
        new A7_6();
    }
}

class A7_6 {
    String s;
    public A7_6() {
        this("中秋快乐！");
        System.out.println("无参构造方法被调用了！");
    }
    public A7_6(String s) {
        this.s = s;
        System.out.println("有参构造方法被调用了！");
        System.out.println("这是有参构造方法的参数："+s);
    }
}