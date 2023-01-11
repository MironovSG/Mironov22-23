package Lr5;
//Напишите программу с классом, в котором есть закрытое символьное поле
//и три открытых метода. Один из методов позволяет присвоить значение полю.
//Еще один метод при вызове возвращает результатом код символа. Третий
//метод позволяет вывести в консольное окно символ (значение поля) и его код.
public class Ex1 {
    private char s;

    public void setS(char s){
        this.s = s;
    }
    public int getSCode(){
        return (int)this.s;
    }
    public void getSToConsole(){
        System.out.println("Символ и код символа: " + this.s + " (" + this.getSCode() + ")");
    }
}
