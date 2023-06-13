package Lab11.Ex8;

public class Project {
    public int value;
    public Project next;
    Project(int value, Project next){
        this.value = value;
        this.next = next;
    }
    public void createHead(Integer value){
        Project newNode = new Project(this.value, this.next);
        this.value = value;
        this.next = newNode;
    }
    public void createTail(Integer value){
        Project newTail = new Project(value, null);
        Project ref = this;
        while (ref.next != null) {
            ref = ref.next;
        }
        ref.next = newTail;
    }
    public String toString(){
        String ret = "";
        Project ref = this;
        do{
            ret += ref.value + " ";
            ref = ref.next;
        } while (ref != null);
        return ret;
    }
    public void AddFirst(int value){
        createHead(value);
    }
    public void AddLast(int value){
        createTail(value);
    }
    public void Insert(int pos, int value){
        Project newNode = new Project(value, null);
        Project ref = this;
        int k=1;
        while (ref.next!= null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        newNode.next = ref.next;
        ref.next = newNode;
    }
    public void RemoveFirst(){
        Project newHead = this.next;
        this.value = newHead.value;
        this.next = newHead.next;
        newHead.next = null;
    }
    public void RemoveLast(){
        Project ref = this;
        while (ref.next.next != null) {
            ref = ref.next;
        }
        ref.next=null;
    }
    public void Remove(int pos){
        Project ref = this;
        int k = 1;
        while (ref.next != null && (k < pos)) {
            ref = ref.next;
            k++;
        }
        ref.next = ref.next.next;
    }
}

