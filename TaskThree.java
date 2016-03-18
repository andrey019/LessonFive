import java.util.Arrays;
import java.util.Scanner;

/**
 Написать ф-ю, которая принимает на вход массив чисел и
 возвращает его длину в байтах как результат
 */
public class TaskThree {
    private static int sizeOfArray(int[] intarray){
        return intarray.length * 4;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("State the array size: ");
        int arraysize = scan.nextInt();
        int[] intarray = RandIntArr.arrayRand(arraysize, 100);

        System.out.println("Created array: " + Arrays.toString(intarray));
        System.out.println("Result: array size is " + sizeOfArray(intarray) + " bytes");
    }
}
