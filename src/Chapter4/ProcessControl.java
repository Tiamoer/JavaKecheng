package Chapter4;
//  流程控制
public class ProcessControl {
    static int index = 3;

    public static void main(String[] args) {
        //  while 循环
        while (index >= 0) {
            System.out.println("while循环！");
            index--;
        }

        //  do-while 循环
        do {
            System.out.println("do-while循环！");
            index++;
        } while (index <= 3);

        //  for 循环
        for (index = 0; index <= 3; index++) {
            System.out.println("for循环");
        }

        //  if  选择
        if (index != 3) {
            System.out.println("if选择_index=" + index);
        } else {
            System.out.println("else");
        }

        //  switch-case
        switch (index) {
            case 1 -> System.out.println("1");
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            default -> System.out.println("END!");
        }

        //  foreach
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i : array) {
            System.out.println("array[" + i + "]=" + i);
        }
    }
}