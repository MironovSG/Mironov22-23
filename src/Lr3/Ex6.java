package Lr3;
import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arrayLength;
        while (true) {
            System.out.print("Введите размер массива: ");
            try {
                arrayLength = Integer.parseInt(in.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Введено неверное значение");
            }
        }
        int i = 0;
        int[] array = new int[arrayLength];
        for (int k=0; k < array.length; ++i){
            if(i % 5 == 2){
                array[k] = i;
                System.out.print(array[k] + " ");
                ++k;
            }
        }
        in.close();
    }
}
