package Lr10.Ex7;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.OutputKeys;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.HttpStatusException;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;

import java.io.File;
import java.util.List;
//Доработка парсера новостей:
//1.	Добавьте функционал записи полученных данных в файл для сохранения информации на будущее.
//2.	Добавьте обработку ошибок при получении HTML-кода страницы,
//      например вывод сообщения об ошибке и попытка переподключения к сайту.//
public class HtmlParser {
    public static void main(String[] args) {
        try{
            // Получение кода страницы в формате HTML
            Document doc = Jsoup.connect("http://fat.urfu.ru/index.html").get();

            // Извлекаем список новостей
            Elements newsParent = doc.select("body > table > tbody > tr > td > div > table > " +
                    "tbody > tr:nth-child(5) > td:nth-child(3) > table > tbody > " +
                    "tr > td:nth-child(1)");

            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            org.w3c.dom.Document xmldoc = docBuilder.newDocument();
            org.w3c.dom.Element rootElement = xmldoc.createElement("urfunews");
            xmldoc.appendChild(rootElement);

            // Выводим последние 10 новостей в консоль
            for(int i=3;i<20;i++){
                if(!(i % 2 == 0)){
                    List<Node> nodes = newsParent.get(0).childNodes();
                    Node titleNode = ((Element) nodes.get(i)).getElementsByClass("blocktitle").get(0).childNodes().get(0);
                    Node dateNode = ((Element) nodes.get(i)).getElementsByClass("blockdate").get(0).childNodes().get(0);

                    System.out.println("Тема: " + titleNode);
                    System.out.println("Дата: " + dateNode);

                    // Добавление первой книги
                    org.w3c.dom.Element item = xmldoc.createElement("newsitem");
                    rootElement.appendChild(item);

                    org.w3c.dom.Element newsdate = xmldoc.createElement("date");
                    newsdate.appendChild(xmldoc.createTextNode(dateNode.toString()));
                    item.appendChild(newsdate);

                    org.w3c.dom.Element newstitle = xmldoc.createElement("title");

                    newstitle.appendChild(xmldoc.createTextNode(titleNode.toString()));
                    item.appendChild(newstitle);
                }
            }

            // Запись XML-файла
            xmldoc.setXmlStandalone(true);
            xmldoc.normalizeDocument();
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();
            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            DOMSource source = new DOMSource(xmldoc);
            StreamResult result = new StreamResult(new File("src/lr10/Ex7/news.xml"));
            transformer.transform(source, result);
        }catch (HttpStatusException e){
            System.out.println("Неизвестная ошибка..." + "Проверьте правильность введения ссылки...");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

