package Lab9;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        try{
            PositiveAverageArray(SetArray());}
        catch (NullPointerException e){
            System.out.println("Нет элементов массива для расчета ("+e+")");
        }
        catch (Exception e){
            System.out.println("Некорректный ввод ("+e+")");
        }
    }
    private static int[] SetArray() {
        Scanner scan = new Scanner(System.in);
        System.out.print("введите размер массива");
        int a = scan.nextInt();
        int[] Array = new int[a];
        for(int i=0;i<a;i++){
            System.out.print("введите целочисленный элемент массива "+"["+(i+1)+"]");
            Array[i]=scan.nextInt();
        }
        return Array;
    }
    private static void PositiveAverageArray(int [] InputArray){
        double A=0;
        boolean flag = false;
        for (int j : InputArray) {
            if (j>0){
                A += j;}
            else if (j==0){
                flag=true;
            }
        }
        if (A<=0&&!flag){
            throw new NullPointerException("Нет положительных элементов массива");
        }
        System.out.println("Среднее значение массива среди положительных элементов = ["+(A/InputArray.length)+"]");
    }
}






