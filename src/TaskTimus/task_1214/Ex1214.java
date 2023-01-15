package TaskTimus.task_1214;
import java.util.Scanner;
public class Ex1214 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();

        String res = "";

        if((x <= 0 || y <= 0) || x == y || (x%2 == 0 && y%2 == 0) || (x%2 != 0 && y%2 != 0)) res = x + " " + y;
        else res =  y + " " + x;

        System.out.println(res);
    }
}
