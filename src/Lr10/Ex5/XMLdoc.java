package Lr10.Ex5;
import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;
import java.util.zip.DataFormatException;
public class XMLdoc {
    private static String author;
    private static String searchValue;

    static String getCollectionPath() { return "src/Lr10/Ex5/collection.xml"; }

    public static void main(String[] args) {
        Document collection = getXMLDocument(getCollectionPath());
        int answer = 0;

        do{
            switch(answer) {
                case 1: showCollectionMenu(collection); break;
                case 2: add2CollectionMenu(collection); break;
                case 3: searchInCollectionMenu(collection, "year"); break;
                case 4: searchInCollectionMenu(collection, "author"); break;
                case 5: searchInCollectionMenu(collection, "name"); break;
                case 6: deleteFromCollection(collection); break;
            }

            answer = mainMenu();
        } while(answer != 0);
    }

    static int mainMenu(){
        System.out.flush();
        System.out.println("1 - Просмотр коллекции");
        System.out.println("2 - Добавить книгу в коллекцию");
        System.out.println("3 - Найти книгу по году публикации");
        System.out.println("5 - Удалить книгу");
        System.out.println("\n0 - Выход");

        int answ = -1;
        boolean isFirst = true;

        Scanner in = new Scanner(System.in);
        do{
            if(isFirst) isFirst = false;
            else System.out.println("Такого пункта нет в меню");
            System.out.print("\n \nВаш ответ: ");
            try {
                String input = in.nextLine();

                if((input.length() - input.replace(",", "").length()) == 1 || (input.length() - input.replace(".", "").length()) == 1)
                    throw new ClassCastException("Необходимо целое число");
                answ = Integer.parseInt(input.trim());

            } catch (ClassCastException e) {
                System.out.println("Ошибка:" + e.getMessage());
            } catch (NumberFormatException e) {
                System.out.println("Ошибка: Не верный формат числа");
            }
        }while(answ < 0 || answ > 5);

        return answ;
    }

    static void showCollectionMenu(Document collection){
        System.out.println("Список книг в коллекции");
        NodeList nodeList = collection.getElementsByTagName("book");
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE){
                printELement(node);
            }
        }
        waitForEnter();
    }

    static void add2CollectionMenu(Document collection){
        System.out.println("Добавление книги в коллекцию");

        Scanner in = new Scanner(System.in);

        String inputName = "";
        String inputAuthor = "";
        int inputYear = 0;

        boolean valid;
        do {
            valid = true;
            System.out.print("\nВведите название произведения: ");
            try {
                inputName = in.nextLine();
                if(inputName.isEmpty()) throw new DataFormatException();
            }catch(DataFormatException e){
                System.out.println("Ошибка! Название не должно быть пустым!");
                valid = false;
            }

            if(valid){
                List<Element> book = findInCollection(collection, "name");
                if(book.size() > 0){
                    System.out.println("Ошибка! Книга с таким названием уже есть в коллекции!");
                    valid = false;
                }
            }
        }while(!valid);


        Date curdate = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(curdate);
        int year = calendar.get(Calendar.YEAR);

        do {
            valid = true;
            System.out.print("\nВведите год выхода книги: ");
            try {
                inputYear = in.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Ошибка! Введите год цифрами!");
                valid = false;
            }
            finally {
                in.nextLine();
            }

            if(valid && (inputYear < 1950 || inputYear > year)){
                System.out.println("Ошибка! Введите год в промежутке между 1950 и " + year + " годами!");
                valid = false;
            }
        }while(!valid);

        if(addInCollection(collection,inputName, inputAuthor, inputYear)) {
            System.out.println("\nСледующая книга была успешно добавлена:");
            List<Element> book = findInCollection(collection, "book");
            if(book.size() == 1) printELement(book.get(0));
        }else{
            System.out.println("\nОшибка. Книга не добавлена.");
        }
        waitForEnter();
    }
    static void searchInCollectionMenu(Document collection, String searchParam) {
        Scanner in = new Scanner(System.in);
        String inputWord = "";

        System.out.print("Поиск книги ");

        switch (searchParam) {
            case "name":
                System.out.println("по названию");
                inputWord = "название";
                break;
            case "year":
                System.out.println("по году публикации");
                inputWord = "год выпуска";
                break;
            case "author":
                System.out.println("по определённому автору");
                inputWord = "наименование автора";
                break;
        }
        System.out.print("\nВведите " + inputWord + ": ");
        String searchValue = in.nextLine();

        // Ищем
        List<Element> foundElements = findInCollection(collection, searchParam);

        if (foundElements.size() == 0)
        {
            System.out.println("\nВ коллекции ничего не найдено");
        }else{
            System.out.println("\nВ коллекции найдено книг - " + foundElements.size() + " :");
            for(int i=0;i<foundElements.size();i++){
                Node node = foundElements.get(i);
                printELement(node);
            }
        }
        waitForEnter();
    }

    static void deleteFromCollection(Document collection){
        System.out.println("Удаление книг из коллекции");

        Scanner in = new Scanner(System.in);

        String inputBook = "";

        List<Element> book = new ArrayList<>();
        boolean valid;
        do {
            valid = true;
            System.out.print("\nВведите название удаляемой книги (пустое значение - выход): ");
            inputBook = in.nextLine();

            if(inputBook.isEmpty()) return;

            book = findInCollection(collection, "title");
            if(book.size() == 0){
                System.out.println("Ошибка! Книг с таким названием нет в коллекции!");
                valid = false;
            }
        }while(!valid);

        Node bookItem = book.get(0);
        System.out.println("\nНайдена следующая книга: ");
        printELement(bookItem);

        System.out.println("\nВы уверены, что хотите её удалить из коллекции?");
        System.out.println("1 - Да");
        System.out.println("0 - Отмена");

        System.out.print("\nВаш ответ: ");
        String answer = in.nextLine();

        if(answer.equals("1")){
            Node parentNode = bookItem.getParentNode();
            parentNode.removeChild(bookItem);
            saveFile(collection);

            System.out.println("\nКнига успешно удалена!");
            waitForEnter();
        }
    }

    static void printELement(Node node){
        Element element = (Element) node;
        String gbook = element.getElementsByTagName("book").item(0).getTextContent();
        String gauthor = element.getElementsByTagName("author").item(0).getTextContent();
        int gyear = Integer.parseInt(element.getElementsByTagName("year").item(0).getTextContent());

        System.out.println("* " + gbook + " (" + gauthor + ", " + gyear + ")");
    }

    static void waitForEnter() {
        System.out.println("\n\nНажмите [Enter] чтобы вернуться в меню...");
        Scanner in = new Scanner(System.in);
        in.nextLine();
    }

    static Document getXMLDocument(String filePath){
        Document ret = null;

        try{
            File inputFile = new File(filePath);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            ret = dBuilder.parse(inputFile);
            ret.getDocumentElement().normalize();
        }catch (Exception e){
            e.printStackTrace();
        }

        return ret;
    }

    static List<Element> findInCollection(Document collection, String searchParam){
        List<Element> retList = new ArrayList();

        NodeList nodeList = collection.getElementsByTagName("book");
        for(int i=0;i<nodeList.getLength();i++){
            Node node = nodeList.item(i);
            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                String text = element.getElementsByTagName(searchParam).item(0).getTextContent();
                if(searchValue.equals(text)) retList.add(element);
            }
        }

        return retList;
    }

    static boolean addInCollection(Document collection, String name, String author, int year) {
        boolean ret = true;

        Element rootElement = collection.getDocumentElement();
        try {
            // Добавление книги
            Element book = collection.createElement("book");
            rootElement.appendChild(book);

            Element bookName = collection.createElement("name");
            bookName.appendChild(collection.createTextNode(author.trim()));
            book.appendChild(bookName);

            Element bookAuthor = collection.createElement("author");
            bookAuthor.appendChild(collection.createTextNode(author.trim()));
            book.appendChild(bookAuthor);

            Element bookYear = collection.createElement("year");
            bookYear.appendChild(collection.createTextNode(Integer.toString(year)));
            book.appendChild(bookYear);

            saveFile(collection);
        } catch (Exception e){
            e.printStackTrace();
            ret = false;
        }

        return ret;
    }

    public static void saveFile(Document collection){
        try {
            collection.normalizeDocument();
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            DOMSource source = new DOMSource(collection);
            StreamResult result = new StreamResult(new File(getCollectionPath()));
            transformer.transform(source, result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
