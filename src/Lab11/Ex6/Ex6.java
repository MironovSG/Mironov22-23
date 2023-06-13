package Lab11.Ex6;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class Ex6 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        for(int i = 0; i<10; i++){
            map.put(i, getRandomString());
        }

        for (Integer key: map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
        int mult = 0;
        System.out.println();
        System.out.println("Строки, ключ которых > 5:");
        for (Integer key: map.keySet()) {
            String value = map.get(key);
            if(key > 5) {
                System.out.println(key + ": " + value);
            }
            if(value.length() > 5) mult = (mult == 0 ? key : mult*key);
        }
        System.out.println("Перемножили ключи строк, длина которых > 5 и получили: " + mult);
    }
    public static String getRandomString(){
        String ret = "";
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        int chars = random.nextInt(1, 10);

        for(int i=0; i<chars; i++){
            ret += alphabet.charAt(random.nextInt(alphabet.length()));
        }
        return ret;
    }
}

