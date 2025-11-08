package MusicPlayer;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MusicPlayer list = new MusicPlayer();
        
        
        System.out.println("-- MUSIC PLAYER --");
        while (true){
            char c = list.chooseAction(scanner); scanner.nextLine();

            switch (c){
                case '1': {list.addMusic(scanner); break;}
                case '2': {list.removeMusic(scanner); break;}
                case '3': {list.show(); break;}
                case '4': {list.playMusic(scanner); break;}
                case '5': System.exit(0); break;
                default: break;
            }

        }
    }

    
}
