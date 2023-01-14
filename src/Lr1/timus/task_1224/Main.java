package Lr1.timus.task_1224;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long M = in.nextLong();
        long ret = Math.min(2*(N-1),  2*M-1);

        System.out.println(ret);
    }
}
