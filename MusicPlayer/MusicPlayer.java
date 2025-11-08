package MusicPlayer;

import java.util.Scanner;

public class MusicPlayer {

    Node head;
    Node tail;
    int size = 0;
    int index = 0;
    
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
            head = tail = node;
        }
        else {
            Node n = head;

            while (n.next != null){
                n = n.next;
            }
            n.next = node;
            n.next.prev = n;
            n = n.next;
            n.next = null;
            tail = n;
            
            
        }
        size++;
        
    }

    public void show(){
        Node node = head;

        while (node.next != null){
            System.out.print(node.data + "||");
            node = node.next;
        }
        System.out.print(node.data);
        System.out.println();
    }


    public void insertAt(String data, int index){
        if (index>size){
            System.out.println("Index out of bounds.");
        }
        else {
            Node node = new Node();
            node.data = data;
        
            if (index==0 && size==0){
                add(data);
            }
            else if (index==0){
                node.prev = null;
                head.prev = null;
                node.next = head;
                head = node;
            }
            else if (index==size){
                node.next = null;
                tail.next = node;
                node.prev = tail;
                tail = node;
            }
            else {
                Node n = head;
                
                for (int i=0; i<index;i++){
                    n = n.next;
                }
                node.next = n;
                node.prev = n.prev;
                node.prev.next = node;
                n.prev = node;
                
            }
            size++;
        }
    
        
    }
    public void removeLast(){
        if (size==0){
            return;
        }
        else if (size==1){
            head = tail = null;
        }
        else {
            head.next.prev = null;
            head = head.next;
        }
        size--;
    }

    public void removeFront(){
        if (size==0){
            return;
        }
        else if (size==1){
            removeLast();
        }
        else {
            Node n = head;
            for (int i=1; i<size;i++){
                n = n.next;
            }
            n.prev.next = null;
            tail = n.prev;
        }
        size--;
    }

    public void removeAt(int index){
        if (size==0){
            return;
        }
        else if (index==size){
            removeFront();
        }
        else if (index==0){
            removeLast();
        }
        else {
            Node n = head;
            for (int i=0; i<index;i++){
                n = n.next;
            }
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
        size--;
    }

    public void play(){
        Node n = head;

        if (index>=0){
            for (int i=0; i<index; i++){
            n = n.next;
            }
            System.out.println("Playing: " + n.data);
        }
        
        
    }

    public void nextMusic(){
        if (index<size){
            index++;
            play();
        }
        
    }
    
    public void lastMusic(){
        if (size>0){
            index--;
            play();
        }
    }

    public char chooseAction(Scanner scanner){
        System.out.println("1. Add music");
        System.out.println("2. Remove music");
        System.out.println("3. Display playlist");
        System.out.println("4. Play Music");
        System.out.println("5. Exit");
        System.out.print("Your choice: ");
        
        return scanner.next().charAt(0);

    }

    public void addMusic(Scanner scanner){
        System.out.print("Enter music title: ");
        String title = scanner.nextLine();
        System.out.print("Would you like to assign it in the queue? (Y/N)");
        if (scanner.next().charAt(0)=='Y'){
            int indexQueue = 0;
            System.out.print("Enter queue number: ");
            indexQueue = scanner.nextInt(); scanner.nextLine();
            insertAt(title, indexQueue);
        }
        else {
            add(title);
        }
    }

    public void removeMusic(Scanner scanner){
        System.out.print("Enter queue number: ");
        int indexQueue = scanner.nextInt(); scanner.nextLine();
        removeAt(indexQueue);
    }

    public void playMusic(Scanner scanner){
        boolean repeat = true;
        while (repeat){
            System.out.println("1. Play");
            System.out.println("2. Next");
            System.out.println("3. Previous");
            System.out.println("4. Return");
            System.out.println("Your choice: ");

            switch (scanner.next().charAt(0)){
                case '1': {play(); break;}
                case '2': {nextMusic(); break;}
                case '3': {lastMusic(); break;}
                case '4': {
                    repeat = false;
                    break;
                }
                default: break;
            }
        }
        

        

    }
        
}
