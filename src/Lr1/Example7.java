package Lr1;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input name: ");
        String name = in.nextLine();

        System.out.println("Input age: ");
        String age = in.nextLine();

        System.out.println("name: " + name);
        System.out.println("age: " + age);

        in.close();

    }
}


