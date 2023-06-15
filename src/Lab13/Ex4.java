package Lab13;

import java.time.LocalTime;
public class Ex4 {
    public static void main(String[] args) {
        int n = 10;
        Thread[] th = new Thread[n];
        for(int i=0; i<n; i++){
            th[i] = new Thread(() -> {
                System.out.println(Thread.currentThread().getName() + ": " + LocalTime.now());
            });
        }
        for(int i=0; i<n; i++){
            th[i].setName("Thread #" + (i+1));
            th[i].start();
        }
    }
}

