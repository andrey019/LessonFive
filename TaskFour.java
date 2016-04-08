import java.util.Arrays;
import java.util.Scanner;

/**
 Написать ф-ю для объединения 2-х массивов в один. Вывести
 результат на консоль.
 */

public class TaskFour {
    private static int[] addTwoArrays(int[] arrone, int[] arrtwo){
        int[] result = new int[arrone.length + arrtwo.length];
        System.arraycopy(arrone, 0, result, 0, arrone.length);
        System.arraycopy(arrtwo, 0, result, arrone.length, arrtwo.length);
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("State the first array size: ");
        int size = scan.nextInt();
        int[] arrone = RandIntArr.arrayRand(size, 100);
        System.out.print("State the second array size: ");
        size = scan.nextInt();
        int[] arrtwo = RandIntArr.arrayRand(size, 100);

        System.out.println("First array: " + Arrays.toString(arrone));
        System.out.println("Second array: " + Arrays.toString(arrtwo));
        System.out.println("Result: " + Arrays.toString(addTwoArrays(arrone, arrtwo)));
    }
}
