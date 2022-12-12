package Lr3;
import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите требуемое количество чисел в последовательности Фибоначчи:");
        int n = in.nextInt();
        int b = 0, a = 1;
        for (int i = n; i>0; --i){
            int c = a + b;
            a = b;
            b = c;
            System.out.print (c + " ");
        }
        in.close();
    }
}
