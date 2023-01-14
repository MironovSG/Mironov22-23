package TaskTimus.Task_1295;
import java.io.PrintWriter;
import java.util.Scanner;
public class Ex1295 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int n;
        int zeroCount = 1;
        do {
            n = in.nextInt();
        }
        while (n < 1 || n > 300000);
        if (n%4==0) zeroCount = 0;
        else
        if ((n/10)%2 == 0){
            if (n%10==3 || n%10==5 || n%10==7)
                zeroCount = 2;
        }
        else if (n%10==1 || n%10==5 || n%10==9)
            zeroCount = 2;
        out.println(zeroCount);

        out.flush();
        in.close();
    }
}
