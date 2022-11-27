package Lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input nameOfTheDay: ");
        String nameOfTheDay = in.nextLine();

        System.out.println("Input nameOfTheMonth: ");
        String nameOfTheMonth = in.nextLine();

        System.out.println("input date");
        String date = in.nextLine();

        System.out.println("nameOfTheDay: " + nameOfTheDay);
        System.out.println("nameOfTheMonth: " + nameOfTheMonth);
        System.out.println("date: " + date);

        in.close();
    }
}
