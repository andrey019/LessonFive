import java.util.Arrays;
import java.util.Scanner;

/**
 Написать функцию, которая принимает массив чисел в качестве
 аргумента, увеличивает его первые 3 элемента на 1 и
 возвращает их сумму как результат. После изменения массив и
 сумму надо вывести на экран
 */

public class TaskTwo {
    private static int numSum(int[] intarr){
        int result = 0;
        for (int i = 0; i < 3; i++){
            intarr[i]++;
            result += intarr[i];
        }
        System.out.println("Changed array: " + Arrays.toString(intarr));
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int arrsize = 0;

        System.out.print("State the array size (no less than 3): ");
        arrsize = scan.nextInt();
        while(arrsize < 3){
            System.out.print("Wrong! Try again: ");
            arrsize = scan.nextInt();
        }

        int[] intarr = RandIntArr.arrayRand(arrsize, 10);
        System.out.println("Initial array: " + Arrays.toString(intarr));
        int numsum = numSum(intarr);
        System.out.println("Result: " + Integer.toString(numsum));
    }
}
