package Lr2;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = in.nextInt();
        x /= 1000;
        x %= 10;
        System.out.println("Количество тысяч в данном числе : " + x);
        in.close();
    }
}
