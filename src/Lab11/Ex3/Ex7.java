package Lab11.Ex3;
import java.util.Scanner;

//Приложение, позволяющее ввести и вывести одномерный массив целых чисел.
//Для ввода и вывода массива разработать рекурсивные методы вместо циклов for.
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        System.out.println("Введите элементы массива:");
        setArray(arr, 0);

        System.out.println("Введённый массив:");
        getArray(arr, 0);
    }
    public static void setArray(int[] a, int element){
        if(element < a.length){
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            a[element] = n;
            setArray(a, element+1);
        }
    }
    public static void getArray(int[] a, int element){
        if(element < a.length){
            System.out.print(a[element]+"\t");
            getArray(a, element+1);
        }
    }
}

