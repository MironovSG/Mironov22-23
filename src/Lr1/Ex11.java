package Lr1;
import java.util.Scanner;
import java.time.Year;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Укажи свой возраст, а я покажу год рождения");
        System.out.println("Твой возраст:");
        int number = in.nextInt();
        int yearNow = Year.now().getValue();
        int year = yearNow - number;
        System.out.println("Твой год рождения: " + year);
        in.close();
    }
}
