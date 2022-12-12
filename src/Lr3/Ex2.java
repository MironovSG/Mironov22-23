package Lr3;
import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите любой день:");
        String day = in.nextLine ();
        day = day.toLowerCase();
        switch (day) {
            case "понедельник" -> System.out.println(1);
            case "вторник" -> System.out.println(2);
            case "среда" -> System.out.println(3);
            case "четверг" -> System.out.println(4);
            case "пятница" -> System.out.println(5);
            case "суббота" -> System.out.println(6);
            case "воскресенье" -> System.out.println(7);
            default -> System.out.println("Такого дня нет");
        }
        in.close();
    }
}
