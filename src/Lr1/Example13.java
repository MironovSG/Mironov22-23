package Lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи свои два числа и получи сумму");
        int number1 = in.nextInt();
        int number2 = in.nextInt();
        System.out.println(number1 + number2);
        in.close();


    }
}
