package Lr6;

public class Ex8 {
    protected static double GetArrayMed(int[] Array){
        int sum=0;
        for (int i : Array) {
            sum += i;
        }
        return (double)sum/Array.length;
    }
}

