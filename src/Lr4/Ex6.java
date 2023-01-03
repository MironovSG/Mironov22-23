package Lr4;
import java.util.Scanner;
import java.util.Random;
public class Ex6 {
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
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
        int deleteLines = random.nextInt(lines);
        System.out.println("Удаляемая строка: " + deleteLines);
        int deleteColums = random.nextInt(columns);
        System.out.println("Удаляемый столбец: " + deleteColums);
        int[][] smallArray = new int[lines-1][columns-1];
        System.out.println("Массив с удаленной строкой и столбцом: ");
        for (int i = 0, k = 0; i < lines; i++) {
            if (i != deleteLines) {

                for (int j = 0, l = 0; j < columns; j++) {
                    if (j != deleteColums) {
                        smallArray[k][l] = array[i][j];
                        System.out.print(smallArray[k][l] + " ");
                        ++l;
                    }
                }
                ++k;
                System.out.println(" ");
            }
        }
    }
}


