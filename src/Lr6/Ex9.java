package Lr6;
public class Ex9 {
    protected char[] ReversArray(char[] ChArray) {
        char changeChar;
        int l = ChArray.length - 1;
        char[] reverseCharArray = new char[ChArray.length];
        for (int i = 0; i < ChArray.length; i++) {
            changeChar = ChArray[i];
            reverseCharArray[i] = ChArray[l - i];
            reverseCharArray[l - i] = changeChar;
        }
        return reverseCharArray;
    }
}

