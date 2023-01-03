package Lr4;
import java.util.Scanner;
import java.util.Arrays;
public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите текст для шифрования: ");
        String text = in.nextLine();
        System.out.print("Введите ключ: ");
        int shift = in.nextInt();

        char[] arrayChar = text.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            arrayChar[i] = (char) (arrayChar[i] + shift);
        }
        System.out.println(Arrays.toString(arrayChar));
        String answer;
        while (true) {
            System.out.print("Выполнить обратное преобразование? (y/n)");
            answer = in.next();
            if (answer.equalsIgnoreCase("y")){
                for (int i = 0; i < arrayChar.length; i++) {
                    arrayChar[i] = (char) (arrayChar[i] - shift);
                }
                String charToString = new String(arrayChar);
                System.out.println(charToString);
                break;
            }
            else if (answer.equalsIgnoreCase("n")){
                System.out.println("До свидания!");
                break;
            }
            else {
                System.out.println("Введите корректный ответ");
            }
        }
    }
}


