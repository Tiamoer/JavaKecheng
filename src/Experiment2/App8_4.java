package Experiment2;

public class App8_4 {
    public static void main(String[] args) {
        Student8_4 stu = new Student8_4();
        stu.show();
    }
}
class Person8_4 {
    public void show() {
        System.out.println("父类的方法！");
    }
}
class Student8_4 extends Person8_4 {
    @Override
    public void show() {
        System.out.println("子类覆盖了父类的show方法");
    }
}