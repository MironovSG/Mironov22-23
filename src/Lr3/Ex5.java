package Lr3;
import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество чисел в сумме: ");
        int numbers = in.nextInt(), x = 0, sum = 0;
        for (int y = 1; y <= numbers; ++x){
            if(x % 5 == 2 || x % 3 == 1){
                if (y == numbers) System.out.print(x);
                else {
                    System.out.print(x + " + ");
                }
                sum += x;
                ++y;
            }
        }
        System.out.print(" = " + sum);
        in.close();
    }
}
