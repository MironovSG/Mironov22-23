package Lr8;
import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) throws IOException {
        Writer out;

        try {
            InputStream inFile = new FileInputStream("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile1.txt");
            out = new BufferedWriter(
                    new OutputStreamWriter(
                            new FileOutputStream("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile2.txt")));
            Scanner in = new Scanner(inFile);
            in.nextLine();// Пропускаем первую строку
            String str = in.nextLine();
            double[] num = Arrays.stream(str.split(" ")).mapToDouble(Double::parseDouble).toArray();
            for( int i = 0; i < num.length; i++){
                if (num[i] >= 0) {
                    out.write(num[i] + " ");
                    System.out.println(num[i]);
                }
            }
            out.close();
        } catch (IOException e) {
            System.out.println("Ошибка !!!!");
        }
    }
}

