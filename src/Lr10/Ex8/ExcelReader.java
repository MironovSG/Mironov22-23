package Lr10.Ex8;
import org.apache.poi.EmptyFileException;
import org.apache.poi.openxml4j.exceptions.NotOfficeXmlFileException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.FileInputStream;
public class ExcelReader {
    public static void main(String[] args) throws IOException {
        // Открываем файл Excel для чтения
        String filePath = "src/lr10/Ex8/example.xlsx";
        FileInputStream inputStream = new FileInputStream(filePath);

        try {
            // Создание книги из файла
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            // Получение листа по названию
            XSSFSheet sheet = workbook.getSheet("Товары");
            // Перебираем строки и ячейки листа
            for (Row row : sheet) {
                for (Cell cell : row) {
                    // Вывод значений ячеек на экран
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }
            // Закрываем файл и освобождаем ресурсы
            workbook.close();
            inputStream.close();
        }catch (NotOfficeXmlFileException e){
            System.out.println("Указан не Excel-файл" + "Указан файл с другим названием");
        }catch (EmptyFileException e){
            System.out.println("Указан пустой файл");
        }catch (NullPointerException e) {
            System.out.println("Не найдена указанная книга \"Товар\"");
            System.out.println("Не найдено указанное количество \"Количество\"");
            System.out.println("Не найдена указанная стоимость \"Стоимость\"");
        }
    }
}

