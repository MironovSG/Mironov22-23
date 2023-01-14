package TaskTimus.task_1263;
import java.util.Scanner;
public class Ex1263 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        int[] votes = new int[N+1];
        for(int i=1; i<=M; i++)
        {
            int vote = in.nextInt();
            votes[vote]++;
        }
        for(int i=1;i<=N;i++) {
            float perc = (float) votes[i] / M * 100;
            System.out.println(String.format("%.02f", perc).replace(",", ".") + "%");
        }
    }
}
