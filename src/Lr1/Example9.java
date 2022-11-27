package Lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x > 30) {
            System.out.println("January");
            System.out.println("March");
            System.out.println("May");
            System.out.println("Julie");
            System.out.println("August");
            System.out.println("October");
            System.out.println("December");
        }
        if (x < 30) {
            System.out.println("February");
        }
        if (x == 30) {
            System.out.println("April");
            System.out.println("June");
            System.out.println("September");
            System.out.println("November");
            in.close();
        }
    }
}