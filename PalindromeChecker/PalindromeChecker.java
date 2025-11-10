package PalindromeChecker;

public class PalindromeChecker {
    String word = "";
    Node head;
    Node tail;
    int size = 0;
    public class Node{
        char data;
        Node next;
        Node prev;
    }
    public PalindromeChecker(){
        head = null;
        tail = null;
        size = 0;
    }

    public void add(char data){
        Node node = new Node();
        node.data = data;

        if (head==null && tail==null){
            node.next = null;
            node.prev = null;
            head = tail = node;
        }
        else {
            Node n = head;
            while (n.next != null){
                n = n.next;
            }
            node.next = null;
            node.prev = n;
            n.next = node;
            tail = node;
            size++;
        }
        
    }

    public void show(){
        Node n = head;
        System.out.println();
        try{
            while (n.next != null){
            System.out.print(n.data + "||");
            n = n.next;
        }
            System.out.println(n.data);

        }
        catch (NullPointerException e){
            
        }
        
    }

    public void pop(){
        try{
            Node n = tail;
            word+=n.data;
            tail = n.prev;
            tail.next = null;
            size--;
        }
        catch (NullPointerException e){
            
        }
        
    }

    public boolean ifPalindrome(String text){
        Node n = head;
        try{
            while (n.next!=null){
            pop();
        }
        }
        catch (NullPointerException e){
            
        }
        
        pop();
        return (text.equals(word));
    }

}
