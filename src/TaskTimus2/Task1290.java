package TaskTimus2;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
public class Task1290 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        short n;
        do {
            n = in.nextShort();
        }
        while (n < 0 || n > 25000);

        short[] inputData = new short[n];

        for (short i = 0; i < n; i++) {
            do {
                inputData[i] = in.nextShort();
            }
            while (inputData[i] < 1 || inputData[i] > 25000);
        }
        Arrays.sort(inputData);
        for(int i = (short)inputData.length-1; i >= 0; i--) {
            out.println(inputData[i]);
        }
        out.flush();
        in.close();
    }
}

