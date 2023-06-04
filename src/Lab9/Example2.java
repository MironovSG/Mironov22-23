package Lab9;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;
public class Example2 {
    public static void main(String[] args) {
        EMatrix();
        EPrintColumn();
    }
    private static void EMatrix() {
        try {PrintMatrix(CreateMatrix());}
        catch(NegativeArraySizeException e){
            System.out.println("неправильный размер матрицы ("+e+")");
            EMatrix();
        }
        catch(InputMismatchException e){
            System.out.println("неправильный параметр матрицы ("+e+")");
            EMatrix();
        }
    }
    private static void EPrintColumn(){
        try{PrintColumn();}
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("столбец за пределами матрицы ("+e+")");
            EPrintColumn();
        }
        catch(InputMismatchException e){
            System.out.println("неправильный параметр столбца ("+e+")");
            EPrintColumn();
        }
    }
    private static int width;
    private static int height;
    private static int[][] MatrixStat;
    private static void PrintMatrix(int[][] Array) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("[" + (j+1) + "][" + (i+1) + "]=" + Array[j][i]+"\t");
            }
            System.out.println();
        }
    }
    private static int [][] CreateMatrix(){
        Random random = new Random(100);
        Scanner id = new Scanner(System.in);
        System.out.print("ширина матрицы: ");
        width = id.nextInt();
        System.out.print("высота матрицы: ");
        height = id.nextInt();
        int [][] Matrix = new int [width][height];
        for (int i = 0 ; i <width; i++) {
            for (int j = 0 ; j <height; j++) {
                Matrix[i][j] = random.nextInt(100);
            }
        }
        MatrixStat = Matrix;
        return Matrix;
    }
    private static void PrintColumn(){
        Scanner id = new Scanner(System.in);
        System.out.print("выбор столбца матрицы: ");
        int column = id.nextInt();
        for(int i = 0; i<height;i++){
            System.out.print("[" + column + "][" + (i+1) + "]=" + MatrixStat[column-1][i]+"\n");
        }
    }
}

