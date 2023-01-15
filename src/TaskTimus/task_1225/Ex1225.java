package TaskTimus.task_1225;
import java.util.Scanner;
public class Ex1225 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] M = new long[46];
        M[1] = 2;
        M[2] = 2;
        for (int i = 3; i <= N; i++) {
            M[i] = M[i - 1] + M[i - 2];
        }
        System.out.println(M[N]);
        sc.close();
    }
}
