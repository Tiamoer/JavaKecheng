package Experiment2;
public class App8_5 {
    public static void main(String[] args) {
        Person8_5 person8_5 = new Student8_5();
        person8_5.show();
    }
}
class Person8_5 {
    public Person8_5(){};
    protected void show() {
        System.out.println("这是父类的show方法！");
    }
}
class Student8_5 extends Person8_5 {
    @Override
    protected void show() {
        System.out.println("子类的show方法！");
    }
}