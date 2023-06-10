package Lab11.Ex5;

public class Tail {
    public static void main(String[] args) {
        Node head = new Node(0, null);

        for(int i=1;i<=9;i++) head = new Node(i, head);

        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

