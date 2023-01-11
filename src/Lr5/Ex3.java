package Lr5;
//Напишите программу с классом, у которого есть два целочисленных поля.
//В классе должны быть описаны конструкторы, позволяющие создавать
//объекты без передачи аргументов, с передачей одного аргумента и с передачей
//двух аргументов.
public class Ex3 {
    private int num1, num2;
    public Ex3() {
        System.out.println("Конструктор по умолчанию");
    }
    public Ex3(int number1){
        this.num1 = number1;
    }
    public Ex3(int number1, int number2){
        this.num1 = number1;
        this.num2 = number2;
    }
}

