package Lr4;
import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Строки массива: ");
        int lines = in.nextInt();
        System.out.print("Столбцы массива: ");
        int columns = in.nextInt();
        int count = 0;
        int[][] array = new int[lines][columns];
        for (int i = 0, l = 1; i < lines; i++, l++) {
            for (int j = 0; j < columns-i; j++) {
                if (j == columns-l){
                    array[i][j] = count;
                    ++count;
                    for(int k = lines-1; k > i; --k){
                        array[k][j] = count;
                        ++count;
                    }
                }
                else {
                    array[i][j] = count;
                    ++count;
                }
            }
        }
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}


