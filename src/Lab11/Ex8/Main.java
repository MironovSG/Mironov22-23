package Lab11.Ex8;
public class Main {
    public static void main(String[] args) {
        Project head = new Project(1, null);
        System.out.println(head.toString());

        head.createHead(2);
        System.out.println(head.toString());

        head.createTail(3);
        System.out.println(head.toString());

        head.AddFirst(4);
        System.out.println(head.toString());

        head.AddLast(5);
        System.out.println(head.toString());

        head.Insert(2, 6);
        System.out.println(head.toString());

        head.RemoveFirst();
        System.out.println(head.toString());

        head.RemoveLast();
        System.out.println(head.toString());

        head.Remove(2);
        System.out.println(head.toString());
    }
}

