package Lr7;
public class Ex3 {
    public static void main(String[] args) {
        SuperClassEx3 testEx3Super = new SuperClassEx3(-24);
        System.out.println("Проверка конструктора суперкласса:\n" + testEx3Super);
        testEx3Super.SetVar(99);
        System.out.println("Проверка метода суперкласса:\n" + testEx3Super);
        SubClassEx3 testEx3Sub = new SubClassEx3(10, 'W');
        System.out.println("Проверка конструктора подкласса:\n" + testEx3Sub);
        testEx3Sub.SetVar(-1, 'l');
        System.out.println("Проверка метода подкласса:\n" + testEx3Sub);
        SubSubClassEx3 testEx3SubSub = new SubSubClassEx3(77, 'D', " - конструктор с 3 аргументами");
        System.out.println("Проверка конструктора подкласса подкласса:\n" + testEx3SubSub);
        testEx3SubSub.SetVar(10245, 'p', " +- метод с 3 параметрами");
        System.out.println("Проверка метода подкласса подкласса:\n" + testEx3SubSub);
    }
}
class SuperClassEx3{
    public int integerEx3;
    public void SetVar(int newInt) {
        this.integerEx3 = newInt;
    }
    SuperClassEx3 (int newInt){
        this.integerEx3 = newInt;}
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": " + integerEx3;
    }
}
class SubClassEx3 extends SuperClassEx3{
    public char charEx3;
    SubClassEx3 (int newInteger, char newChar){
        super(newInteger);
        this.charEx3 = newChar;
    }
    public void SetVar(int newInt, char newChar) {
        super.SetVar(newInt);
        this.charEx3 = newChar;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": число : " + integerEx3 + " ,символ : " + charEx3;
    }
}
class SubSubClassEx3 extends SubClassEx3{
    public String StringEx3;
    SubSubClassEx3 (int newInteger2, char newChar2, String newString){
        super(newInteger2, newChar2);
        this.StringEx3 = newString;
    }
    public void SetVar(int newInt, char newChar, String newString){
        super.SetVar(newInt, newChar);
        this.StringEx3 = newString;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ": число : " + integerEx3 + " ,символ : " + charEx3 + " ,строка :" + StringEx3;
    }
}
