package Lr3;
import java.util.Scanner;
public class Ex7 {
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
        char letter = 'a';
        char[] array = new char[arrayLength];
        for (int i = 0; i < array.length; ++i) {
            array[i] = letter;
            letter = (char) (letter + 2);
            System.out.print(array[i] + " ");
        }
        System.out.println("\nМассив в обратном порядке:");
        for (int i = array.length - 1; i >= 0; --i) {
            System.out.print(array[i] + " ");
        }
        in.close();
    }
}
