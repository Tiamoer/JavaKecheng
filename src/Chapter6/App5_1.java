package Chapter6;

public class App5_1 {
    public static void main(String[] args) {
        int i;
        int[] a = new int[5];
        for (i=0;i<5;i++)
            a[i] = i;
        for (i=a.length-1;i>=0;i--)
            System.out.print("a["+i+"] = " +a[i]+"\t");
        System.out.println("\n数组a的长度为："+a.length);
    }
}
