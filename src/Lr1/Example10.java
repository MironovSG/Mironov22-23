package Lr1;
import java.util.Scanner;
import java.time.Year;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Твой год рождения");
        int year = in.nextInt();
        int yearNow = Year.now().getValue();
        int number = yearNow - year;
        System.out.println("Сейчас тебе" + number);
        in.close();

    }
}
