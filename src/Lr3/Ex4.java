package Lr3;
import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int number1 = in.nextInt();
        System.out.print("Введите второе число: ");
        int number2 = in.nextInt();
        if (number1 < number2){
            for (; number1 <= number2; ++number1) System.out.print(number1 +" ");
        }
        else {
            while (number2 <= number1){
                System.out.print(number2 + " ");
                ++number2;
            }
        }
        in.close();
    }
}
