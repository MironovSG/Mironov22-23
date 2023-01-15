package TaskTimus.task_1209;
import java.util.Scanner;
public class Ex1209 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        StringBuilder res = new StringBuilder();
        while (n > 0) {
            long x = in.nextLong();
            double s = Math.sqrt(8*x-7);
            if (s % 1 == 0) res.append(" 1");
            else res.append(" 0");
            n--;
        }
        System.out.println(res);
    }
}
