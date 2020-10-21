package Experiment2;

public class App8_8 {
    public static void main(String[] args) {
        Person8_8 per = new Person8_8("张三");
        Class obj = per.getClass();
        System.out.println("对象per所属的类为："+obj);
        System.out.println("对象per是否是接口："+obj.isInterface());
    }
}
class Person8_8 {
    protected String name;
    public Person8_8(String name) {
        this.name = name;
    }
}