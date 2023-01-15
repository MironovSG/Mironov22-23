package Lr7;

public class Ex1 {
    public static void main(String[] args) {
        SuperClass test = new SuperClass("передал в конструктор сеперкласса");
        System.out.println(test);
        SubClass testSubClass = new SubClass("передал в конструктор подкласса");
        System.out.println(testSubClass);
        SubClass testSubClass2 = new SubClass("передал в конструктор подкласса", "где два параметра");
        System.out.println(testSubClass2);
    }
}
class SuperClass{
    private final String text;
    protected SuperClass(String text){
        this.text = text;
    }
    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n" +
                "text = " + text;
    }
    String getText() {
        return text;
    }
}
class SubClass extends SuperClass {
    private String subText;
    protected SubClass(String text) {
        super(text);
    }
    protected SubClass(String text, String subText) {
        super(text);
        this.subText = subText;
    }
    @Override
    public String toString() {
        if (subText == null) {
            return "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "text = " + getText();
        }
        else {
            return "Class name: " + this.getClass().getSimpleName() + "\n" +
                    "text = " + getText() + "\n" +
                    "subText = " + subText;
        }
    }
}
