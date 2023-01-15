package Lr7;

public class Ex2 {
    public static void main(String[] args) {
        SubClassEx2 testEx2 = new SubClassEx2("test", 23);
        testEx2.setText();
        System.out.println(testEx2);
        testEx2.setText("тест с 1 аргументом - строка");
        System.out.println(testEx2);
        testEx2.setText(12);
        System.out.println(testEx2);
        testEx2.setText("тест с 2 аргументами", 10);
        System.out.println(testEx2);
    }
}
class SuperClassEx2{
    private String text;
    public void setText() {
        this.text = null;
    }
    public void setText(String text) {
        this.text = text;
    }
    SuperClassEx2 (String str){setText(str);}

    public int getLength() {
        return text.length();
    }
    public String getText() {
        return text;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + text;
    }
}
class SubClassEx2 extends SuperClassEx2{
    public int integer;
    SubClassEx2 (String str, int newInteger){
        super(str);
        this.integer = newInteger;
    }
    @Override
    public void setText() {
        super.setText();
        this.integer = 0;
    }
    @Override
    public void setText(String text) {
        super.setText(text);
        this.integer = 0;
    }
    public void setText(int newInteger) {
        super.setText();
        this.integer = newInteger;
    }
    public void setText(String newText, int newInteger) {
        super.setText(newText);
        this.integer = newInteger;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": строка : " + getText() + " ,число : " + integer;
    }
}
