package Lr5;

public class ChekExample {
    public static void main(String[] args) {
        Ex1 Ex1 = new Ex1();
        Ex1.setS('b');
        System.out.println(Ex1.getSCode());
        Ex1.getSToConsole();
        System.out.println();

        Ex2 testEx2 = new Ex2();
        testEx2.setChar('k', 'f');
        testEx2.setPrint();
        System.out.print("\n");
        Ex3 testEx3 = new Ex3();
        Ex3 test2Ex3 = new Ex3(23);
        Ex3 test3Ex3 = new Ex3(23, 45);

        Ex4 testEx4 = new Ex4(25, 'F' );
        Ex4 test2Ex4 = new Ex4(65.1267);

        Ex5 Ex5 = new Ex5(99);
        Ex5.checkI();
        Ex5 = new Ex5(9999);
        Ex5.checkI();
        Ex5 = new Ex5(11);
        Ex5.setI();
        Ex5.checkI();

        Ex6 Ex6 = new Ex6(1);
        Ex6.showMinMax();
        Ex6.setVal(3, 0);
        Ex6.showMinMax();
        Ex6.setVal(-1, 10);
        Ex6.showMinMax();

        System.out.println();
    }
}

