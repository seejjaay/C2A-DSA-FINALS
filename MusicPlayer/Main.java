package MusicPlayer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DoublyLinkedList list = new DoublyLinkedList();
        
        list.add("Data1");
        list.add("Data2");
        list.add("Data3");
        list.add("Data4");
        list.add("Data5");
        list.show();
    }
}
