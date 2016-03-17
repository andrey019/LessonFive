import java.util.Random;
import java.util.Scanner;

/**
  Написать функцию, которая принимает в качестве аргументов
 одну строку X, целое число Y и число с плавающей точкой Z и
 возвращает как результат строку в виде S = x + y + z
 */

public class TaskOne {
    private static String strMethod(String str, int intnum, double doublenum){
        String result = "";
        result += str + Integer.toString(intnum) + Double.toString(doublenum);
        return result;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.print("Enter whatever: ");
        String str = scan.nextLine();
        System.out.print("Enter number: ");
        int intnum = scan.nextInt();
        System.out.print("Enter decimal number: ");
        double doublenum = scan.nextDouble();

        System.out.print("Result: " + strMethod(str, intnum, doublenum));
    }
}
