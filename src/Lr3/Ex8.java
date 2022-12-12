package Lr3;
import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char letter = 'A';
        for (int i = 0; i < letters.length; ++i) {
            if (letter == 'A' || letter == 'E' || letter == 'U' || letter == 'I') ++letter;
            letters[i] = letter;
            ++letter;
            System.out.print(letters[i] + " ");
        }
    }
}
