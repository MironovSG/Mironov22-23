package TaskTimus.task_1296;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex1296 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n;
        int value;
        int pot = 0;
        int maxPot = 0;
        do {
            n = in.nextInt();
        }
        while (n < 0 || n > 60000);
        for (int i = 0; i < n; i++) {
            do {
                value = in.nextInt();
            }
            while (Math.abs(value) > 30000);
            pot += value;
            if(pot < 0) pot = 0;
            if(pot > maxPot) maxPot = pot;
            }
            out.println(maxPot);
            out.flush();
            in.close();
        }
    }
