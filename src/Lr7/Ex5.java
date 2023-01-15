package Lr7;
public class Ex5 {
    public static void main(String[] args) {
        SuperEx5 testEx5 = new SuperEx5("Строка суперкласса");
        testEx5.display();
        Sub1ClassEx5 test2Ex5 = new Sub1ClassEx5("Строка 1 подкласса", 45);
        test2Ex5.display();
        Sub2ClassEx5 test3Ex5 = new Sub2ClassEx5("Строка 2 подкласса", 'R');
        test3Ex5.display();
        SuperEx5 test4Ex5 = new SuperEx5(test2Ex5.textEx5);
        test4Ex5.display();
        SuperEx5 test5Ex5 = new SuperEx5(test3Ex5.textEx5);
        test5Ex5.display();
    }
}
class SuperEx5{
    protected String textEx5;
    SuperEx5(String newStr){
        this.textEx5 = newStr;
    }
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5);
    }
}
class Sub1ClassEx5 extends SuperEx5{
    protected int intEx5;
    public Sub1ClassEx5(String newStr, int newInt) {
        super(newStr);
        this.intEx5 = newInt;
    }
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5 + ", Integer = " + intEx5);
    }
}
class Sub2ClassEx5 extends SuperEx5{
    protected char charEx5;
    public Sub2ClassEx5(String newStr, char newChar) {
        super(newStr);
        this.charEx5 = newChar;
    }
    @Override
    public void display() {
        System.out.println(this.getClass().getSimpleName() + "\n" +
                "text = " + textEx5 + ", Char = " + charEx5);
    }
}
