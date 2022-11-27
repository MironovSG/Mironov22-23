package Lr1;
import java.util.Scanner;
public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input lastname: ");
        String lastname = in.nextLine();
        System.out.println("Input name: ");
        String name = in.nextLine();
        System.out.println("Input surname: ");
        String surname = in.nextLine();

        System.out.println("Lastname: " + lastname);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);

        in.close();
    }
}
