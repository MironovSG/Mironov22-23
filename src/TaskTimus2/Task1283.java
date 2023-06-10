package TaskTimus2;
import java.util.Scanner;
public class Task1283 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float gold = in.nextInt();
        float minGold = in.nextInt();
        int perc = in.nextInt();
        int years = 0;
        float coef = ((float)(100-perc)/100);

        while (gold > minGold) {
            years++;
            gold *= coef;
        }

        System.out.println(years);
    }
}

