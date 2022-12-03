package Lr2;
import java.util.Scanner;
public class Ex3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int x = in.nextInt();
        int four = x % 4;
        if (four == 0 & x > 10){
            System.out.println("Число подходит под требования");
        }else{
            System.out.println("Число не подходит под требования");
            in.close();
        }
    }
}
