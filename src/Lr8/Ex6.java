package Lr8;
import java.io.*;

public class Ex6 {
    public static void main(String[] args) throws IOException {
        Reader in = null; // Можно сразу запись fileReader in = null;
        Writer out = null; // Можно сразу записать FileWriter out = null;

        try {
            in = new FileReader("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile1.txt"); // файл для чтения
            out = new FileWriter("C:\\Users\\For URFU\\IdeaProjects\\URFU\\MyFile2.txt", true); // файл для записи, True - разрешает добавление
            // Данные записываются и считываются побайтово как и для InputStream\OutputStream
            int oneByte; // переменная в которую считываются данные
            while ((oneByte = in.read()) != -1){
                //out.write((char)OneByte); // запись с уничтожением ранее существующих данных
                out.append((char) oneByte); // запись с добавленнием данных в конец
                System.out.print((char) oneByte);

            }
        }catch (IOException e){
            System.out.println("Ошибка!!!");
        }
        finally {
            in.close();
            out.close();
        }
    }
}

