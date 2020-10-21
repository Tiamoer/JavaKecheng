package HOW2J;
//  菱形打印
//     *
//    ***
//   ******
// **********
public class Demo1 {
    public static void main(String[] args) {
        for (int i = 0;i<4;i++) {
            for (int k = 0;k<3-i;k++)
                System.out.print(" ");
            for (int j = 1;j<=2*(i+1)-1;j++)
                System.out.print("*");
            System.out.println();
        }

        for (int i = 0;i<3;i++) {
            for (int k = 3;k>=3-i;k--)
                System.out.print(" ");
            for (int j = 5;j>=2*(i+1)-1;j--)
                System.out.print("*");
            System.out.println();
        }
    }
}