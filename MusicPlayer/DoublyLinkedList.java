package MusicPlayer;

public class DoublyLinkedList {

    Node head;
    Node tail;
    int size = 0;
    
    public class Node{
        String data;
        Node next;
        Node prev;
    }

    public void add(String data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head==null && tail==null){
            head = node;
            tail = node;
        }
        else {
            Node n = head;

            while (n.next != null){
                n = n.next;
            }
            n.next = node;
            
        }
        size++;
        
    }

    public void show(){
        Node node = head;

        while (node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data);
    }

    public void insertAt(String data, int index){
        if (index>size){
            System.out.println("Index out of bounds.");
        }
        else {
            Node node = new Node();
            node.data = data;
        
            if (index==0){
                node.next = head;
                head = node; 
            }
            else {
                Node n = head;
                
                for (int i=1; i<index;i++){
                    n = n.next;
                }
                node.next = n.next;
                n.next = node;
            }
            size++;
        }
    
        
    }
}
