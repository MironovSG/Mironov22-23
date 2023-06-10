package Lab11.Ex5;

public class Head {
    public static void main(String[] args) {
        Node head = new Node(0, null);

        for(int i=1;i<=9;i++){
            Node newTail = new Node(i, null);

            Node ref = head;
            while (ref.next != null) ref = ref.next;

            ref.next = newTail;
        }
        Node ref = head;
        while(ref != null){
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

