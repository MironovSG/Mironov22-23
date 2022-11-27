package Lr1;
import java.util.Scanner;
public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи два числа, программа покажет их сумму и разность");
        int x = in.nextInt();
        int y = in.nextInt();
        int result1 = (x + y);
        int result2 = (x - y);
        System.out.println(result1);
        System.out.println(result2);
        in.close();
    }
}
