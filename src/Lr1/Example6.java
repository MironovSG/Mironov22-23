package Lr1;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input lastName: ");
        String lastName = in.nextLine();

        System.out.println("Input firstName: ");
        String firstName = in.nextLine();

        System.out.println("Input secondName: ");
        String secondName = in.nextLine();

        System.out.println("lastName: " + lastName);
        System.out.println("firstName: " + firstName);
        System.out.println("secondName: " + secondName);
        in.close();

    }
}


