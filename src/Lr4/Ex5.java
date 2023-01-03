package Lr4;
import java.util.Scanner;
import java.util.Random;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Строки массива: ");
        int lines = in.nextInt();
        System.out.print("Столбцы массива: ");
        int columns = in.nextInt();
        int[][] array = new int[lines][columns];
        Random random = new Random();
        System.out.println("Полученный массив: ");
        for (int i = 0; i < lines; i++) {

            for (int j = 0; j < columns; j++) {
                array[i][j] = random.nextInt(100);
                System.out.print(array[i][j]+ " ");
            }
            System.out.println (" ");
        }
        System.out.println ("Транспонированный массив: ");
        int[][] transposedArray = new int[columns][lines];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < lines; j++) {
                transposedArray[i][j] = array[j][i];
                System.out.print(transposedArray[i][j]+ " ");
            }
            System.out.println (" ");
        }
    }
}


