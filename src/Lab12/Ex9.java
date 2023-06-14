package Lab12;

import java.util.List;
import java.util.stream.Collectors;
public class Ex9 {
    public static void main(String[] args) {
        String string = "Напишите функцию, которая принимает на вход список строк и возвращает" +
                " новый список, содержащий только те строки, которые начинаются с большой буквы.";

        List<String> strings = List.of(string.split(" "));
        System.out.println("\n" + "Строка после сплитования: " + "\n");

        for(String e : strings){
            System.out.println(e);
        }
        List<String> stringsAfter = filterLengthString(strings);

        System.out.println("\n" + "Строка после преобразования: " + "\n");
        for(String e: stringsAfter){
            System.out.println(e);
        }
    }
    public static List<String> filterLengthString(List<String> list){
        return list.stream()
                .filter(s -> s.chars().allMatch(Character::isLetter))
                .collect(Collectors.toList());
    }
}

