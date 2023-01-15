package TaskTimus.task_1370;
import java.util.Scanner;
public class Ex1370 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] digits = new int[n];
        for(int i=0;i<n;i++) {
            digits[i] = in.nextInt();
        }
        int x = m%n;
        String res = "";
        for(int i=0;i<10;i++) {
            res += digits[x];
            x++;
            if(x >= n) x = 0;
        }
        System.out.println(res);
    }
}
