package MusicPlayer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();
        
        list.insert("Data1");
        list.insert("Data2");
        list.insert("Data2");
        list.show();
    }
}
