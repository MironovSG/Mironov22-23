package Lab11.Ex7;

import java.util.LinkedList;
import java.util.Date;
import java.util.Random;
public class LinkedListEx {
    public static void main(String[] args) {
        Date currentTime = new Date();

        Random random = new Random();
        int N = random.nextInt(2, 20);
        System.out.println("Количество элементов: " + N + " (от 0 до " + (N-1) + ")");

        LinkedList<Integer> circle = new LinkedList<>();
        for(int i=0; i<N; i++) circle.add(i); // Заполняем коллекцию

        int counter = 0;
        while(circle.size() > 1){
            for(int i=0;i< circle.size();i++){
                counter++;
                if(counter == 2){
                    System.out.println(circle.get(i) + " ("+counter+") - вычеркнут");
                    circle.remove(i);
                    i--;
                    counter = 0;
                }else {
                    System.out.println(circle.get(i) + " (" + counter + ")");
                }
            }
            System.out.println();
        }

        System.out.println("Оставшийся элемент: " + circle.get(0));

        System.out.println();
        Date newTime = new Date();
        long msDelay = newTime.getTime() - currentTime.getTime(); //вычисляем разницу
        System.out.println("Результат в миллисекундах: " + msDelay);
    }
}

