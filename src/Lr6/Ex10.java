package Lr6;
import java.util.Arrays;
public class Ex10 {
    protected static int[] calcMaxMin(int... array){
        Arrays.sort(array);
        int min = array[0];
        int max = array[array.length-1];
        return new int[]{max, min};
    }
}

