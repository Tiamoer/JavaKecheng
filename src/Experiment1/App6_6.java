package Experiment1;

public class App6_6 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] newArray = new App6_6().transpose(array);
        for (int[] ints : newArray) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    int[][] transpose(int[][] array) {
        int[][] newArray = new int[array[0].length][array.length];
        for (int i = 0;i<array.length;i++) {
            for (int j = 0;j<array[i].length;j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }
}
