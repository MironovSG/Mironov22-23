package Lr6;
import java.util.Arrays;
public class Ex3 {
    private int[] int1;
    public void getMax(int[] int1){
        this.int1 = int1;
        Arrays.sort(int1);
        System.out.println("Минимальное значение : " + int1[0]);
    }
    public void getMin(int[] int1){
        this.int1 = int1;
        Arrays.sort(int1);
        System.out.println("Максимальное значение : " + int1[int1.length-1]);
    }
    public void getMed(int[] int1) {
        Arrays.sort(int1);
        int sum = 0;
        int temp = int1[0];
        for (int i = 0; i < int1.length; i++) {
            sum = int1[i] + sum;
        }
        for (int i = 0; i < int1.length; i++) {
            int med = sum/int1.length;
            if (Math.abs(med - int1[i]) < Math.abs(med - temp)) {
                temp = int1[i];
            }
        }
        System.out.println("Среднее значение : " + temp);
    }
}

