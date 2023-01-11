package Lr6;

public class Ex5 {
    public void getSum2(int n){
        int sum2 = 0;
        for (int i = 1; i <= n; i++){
            int k = i * i;
            sum2 = sum2 + k;
        }
        System.out.println("Cумма квадратов первых " + n + " натуральных чисел равна: " + sum2);
    }
}

