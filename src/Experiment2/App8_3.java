package Experiment2;
public class App8_3 {
    public static void main(String[] args) {
        Student8_3 stu = new Student8_3();
        stu.show();
    }
}
class Person8_3 {
    public static final double ID = 3.001;
    private String name;
    private int age;
    public Person8_3(String name,int age) {
        this.name = name;
        this.age = age;
        System.out.println("子类调用了父类的构造方法！");
    }
    public String getNameAndAge() {
        return name+"\t"+age;
    }
}
class Student8_3 extends Person8_3 {
    public Student8_3() {
        super("张三",16);
        System.out.println("调用了子类的构造方法！");
    }
    public void show() {
        System.out.println(super.getNameAndAge()+"\tID:"+ID);
    }
}