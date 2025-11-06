package MusicPlayer;

public class DoublyLinkedList {

    Node head;
    
    public class Node{
        String data;
        Node next;
    }

    public void insert(String data){
        Node node = new Node();
        node.data = data;
        node.next = null;
        
        if (head==null){
            head = node;
        }
        else {
            Node n = head;

            while (n.next != null){
                n = n.next;
            }
            n.next = node;
            
        }
        
    }

    public void show(){
        Node node = head;

        while (node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}
