package Lr5;
//Напишите программу с классом, в котором есть два закрытых
//целочисленных поля (назовем их max и min). Значение поля max не может
//быть меньше значения поля min. Значения полям присваиваются с помощью
//открытого метода. Метод может вызываться с одним или двумя
//целочисленными аргументами. При вызове метода значения полям
//присваиваются так: сравниваются текущие значения полей и значения
//аргументов, переданных методу. Самое большое из значений присваивается
//полю max, а самое маленькое из значений присваивается полю min.
//Предусмотрите конструктор, который работает по тому же принципу, что и
//метод для присваивания значений полям. В классе также должен быть метод,
//отображающий в консольном окне значения полей объекта.
public class Ex6 {
    private int max, min;
    public Ex6(int a){
        this.setVal(a);
    }
    public Ex6(int a, int b){
        this.setVal(a, b);
    }
    public void setVal(int a) {
        this.updateValues(a, a);
    }
    public void setVal(int a, int b){
        this.updateValues(a, b);
    }
    public void showMinMax(){
        System.out.println("min: " + min + ", max: " + max);
    }
    private void updateValues(int a, int b) {
        this.max = Math.max(this.max, Math.max(a, b));
        this.min = Math.min(this.min, Math.min(a, b));
    }
}

