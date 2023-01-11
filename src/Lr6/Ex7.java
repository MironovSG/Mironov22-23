package Lr6;

public class Ex7 {
    protected int[] convertCharArray(char[] ChArray) {
        int[] intArray = new int[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            intArray[i] = (int)ChArray[i];
        }
        return intArray;
    }
}


