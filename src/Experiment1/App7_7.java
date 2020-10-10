package Experiment1;

public class App7_7 {
    public static void main(String[] args) {
        new A7_7("国庆快乐！");
    }
}

class A7_7 {
    String s;
    private A7_7() {
        System.out.println("私有无参构造方法被调用了！ψ(｀∇´)ψ");
    }
    public A7_7(String s) {
        this();
        this.s = s;
        System.out.print("这里是公共有参构造方法！O(∩_∩)O,");
        System.out.println("我的参数是："+s);
    }
}