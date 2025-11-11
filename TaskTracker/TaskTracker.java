package TaskTracker;

public class TaskTracker {
    Node head;
    int size;

    public class Node{
        String data;
        Node next;
    }

    public TaskTracker(){
        head = null;
        size = 0;
    }

    public Boolean isEmpty(){
        return size!=0;
    }

    public void add(String data){
        Node node = new Node();
        node.data = data;
        if (head==null){
            node.next = null;
            head = node;

        }
        else {
            Node n = head;
            while (n.next!=null){
                n = n.next;
            }
            node.next = null;
            n.next = node;
        }
        size++;
    }

    public void push(){
        if (head==null){
            System.out.print("null");
        }
        else {
            head = head.next;
            size--;
        }
        
    }
    
    public void show(){
        try{
            Node n = head;
            while (n.next!=null){
                System.out.print(n.data + " || ");
                n = n.next;
            }
            System.out.print(n.data);
        }
        catch (NullPointerException e){

        }
    }

    
}
