package TaskTimus.task_1349;
import java.util.Scanner;
public class Ex1349 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String res;
        if(n == 0 || n > 2)
            res = "-1";
        else if(n == 1)
            res = "1 2 3";
        else
            res = "3 4 5";
        System.out.println(res);
    }
}


