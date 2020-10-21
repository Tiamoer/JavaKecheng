package Experiment2;

public class App8_1 {
    public static void main(String[] args) {
        Student8_1 stu = new Student8_1();  //创建子类对象
        stu.setName("张三");
        stu.setAge(16);
        stu.setAddress("甘肃");
        stu.setPhone("15193996666");
        stu.show();
        stu.setDepartment("电信");
    }
}
class Person8_1 {
    private String name;
    private String address;
    private String phone;
    private int age;
    public Person8_1() {
        System.out.println("这是父类的构造方法！");
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void show() {
        System.out.println(name + "\t" + age + "\t" + address + "\t" + phone);
    }
}

class Student8_1 extends Person8_1 {
    private String department;
    public Student8_1() {
        super();
        System.out.println("调用了子类的构造方法！");
    }

    public void setDepartment(String department) {
        this.department = department;
        System.out.println("我是"+department+"的学生");
    }
}