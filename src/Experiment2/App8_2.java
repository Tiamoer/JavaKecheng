package Experiment2;
public class App8_2 {
    public static void main(String[] args) {
        Student8_2 stu = new Student8_2();
    }
}
class Person8_2 {
    public Person8_2() {
        System.out.println("子类调用了父类的构造方法！");
    }
}
class Student8_2 extends Person8_2 {
    public Student8_2() {
        super();
        System.out.println("调用了子类的构造方法！");
    }
}