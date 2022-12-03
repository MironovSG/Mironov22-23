package Lr2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число");
        int x = in.nextInt();
        if (5 <= x & x <= 10){
            System.out.println("Число подходит под критерии");
        }else {
            System.out.println("Число не подходит под критерии");
            in.close();
        }
    }
}
