package Lr1;
import java.util.Scanner;
public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введи число, а программа покажет число: -1, =, +1, сумма трех в квадрате");
        int x = in.nextInt();
        System.out.println(x - 1);
        System.out.println(x = x);
        System.out.println(x + 1);
        int result = ((x-1)+(x+1)+x)*((x-1)+(x+1)+x);
        System.out.println(result);
        in.close();
    }
}
