package Chapter5;

public class App5_5 {
    public static void main(String[] args) {
        int i,j,k,sum=0;
        int[][][] array = new int[][][]{
                {{1,2,3},{4,5,6}},
                {{7,8,9},{10,11,12}},
                {{13,14,15},{16,17,18}},
        };
        for (i=0;i<array.length;i++) {
            for (j=0;j<array[i].length;j++) {
                for (k=0;k<array[i][j].length;k++) {
                    System.out.println("array["+i+"]["+j+"]["+k+"]="+array[i][j][k]);
                    sum = sum+array[i][j][k];
                }
            }
        }
        System.out.println("数组总和为："+sum);
    }
}
