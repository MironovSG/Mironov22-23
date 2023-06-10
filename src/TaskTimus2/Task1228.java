package TaskTimus2;
import java.util.Scanner;
public class Task1228 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ret = "";
        int n = in.nextInt();
        int s = in.nextInt();

        int[] d = new int[n+1];

        for(int i=1;i<=n;i++) d[i] = in.nextInt();

        s -= 1;
        int t=1;

        while(s!=0){
            ret += (s/d[t]) + " ";
            s = s%d[t];
            t++;
        }

        ret = ret.trim();
        System.out.println(ret);
    }
}

