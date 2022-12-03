package Lr2;
import java.util.Scanner;
public class Ex2 {
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число :");
        int x = in.nextInt();
        int five = x % 5;
        int seven = x % 7;
        if (five == 2 & seven == 1){
            System.out.println("Введенное число подходит под требования");
    }else{
            System.out.println("Введенное число не подходит под требования");
            in.close();
        }
    }
}
