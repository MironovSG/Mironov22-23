import java.util.Scanner;

public class MainSCSC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Запланированный бюджет:");
        float a = in.nextInt();
        System.out.println("Запланированный срок выполнения:");
        float b = in.nextInt();
        System.out.println("Время потраченное на сегодня:");
        float c = in.nextInt();
        System.out.println("Стадия готовности проекта на сегодня:");
        float d = in.nextInt();
        System.out.println("Расходы бюджета на сегодня:");
        float f = in.nextInt();

        float g = MainSCSC.GetEstimation(c, 100f, d);
        float x = MainSCSC.GetOverrun(g, b);
        System.out.println("Задержка срока выполнения: " + x);

        float k = MainSCSC.GetEstimation(g, f, c);
        float y = MainSCSC.GetOverrun(k, a);
        System.out.println("Перерасход бюджета: " + y);
    }

    static float GetEstimation(float a, float b, float c) {
        return (a*b)/c;
    }

    static float GetOverrun(float a, float b) {
        return a-b;
    }
}



