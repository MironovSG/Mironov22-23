package Lr6;

import java.util.Arrays;

public class ChekExample {
    public static void main(String[] args) {
        System.out.println("Ex1:");
        Ex1 testEx1 = new Ex1();
        testEx1.setEx1('V');
        testEx1.setEx1("Тест строки");
        char[] char1 = {'Q'};
        testEx1.setEx1(char1);
        char[] char2 = {'A', 'R', 'R', 'A', 'Y'};
        testEx1.setEx1(char2);

        System.out.println("Ex2:");
        Ex2.getConst();
        Ex2.getConst();
        Ex2.getConst();

        System.out.println("Ex3:");
        Ex3 testEx3 = new Ex3();
        int[] testInt = {1, 12, 7, 3, 35, 90, 22, 222, 8};
        testEx3.getMax(testInt);
        testEx3.getMin(testInt);
        testEx3.getMed(testInt);

        System.out.println("Ex4:");
        Ex4 testEx4 = new Ex4();
        testEx4.getFactor(6);

        System.out.println("Ex5:");
        Ex5 testEx5 = new Ex5();
        testEx5.getSum2(6);

        System.out.println("Ex6:");
        Ex6 testEx6 = new Ex6();
        int[] inArray = {5, 8, -12, 32, 10, -88};
        System.out.println("Новый массив : " + Arrays.toString(testEx6.getArray(inArray, 4)));

        System.out.println("Ex7:");
        Ex7 testEx7 = new Ex7();
        char[] charArray = new char[]{'е', 'к', 'л', 'м', 'н'};
        System.out.println(Arrays.toString(testEx7.convertCharArray(charArray)));

        System.out.println("Ex8:");
        int[] intArray = {8, -4, 88, 27, -63, 77};
        System.out.println("Среднее значение = " + Ex8.GetArrayMed(intArray));

        System.out.println("Ex9:");
        Ex9 testEx9 = new Ex9();
        char[] chArray = {'т', 'о', 'р', 'о', 'б', 'о', 'а', 'н'};
        System.out.print(Arrays.toString(testEx9.ReversArray(chArray)) + "\n");

        System.out.println("Ex10:");
        System.out.println("Максимум и минимум: " + Arrays.toString(Ex10.calcMaxMin(2, -2, 5, 22, -56, 8)));
    }
}

