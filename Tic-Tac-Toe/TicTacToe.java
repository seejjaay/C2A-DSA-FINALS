import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char playerMove = 'x';

        char[][] board = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '_';
            }
        }
        printBoard(board);

        while(true){
            int column =0;
            int row = 0;

            System.out.println("Enter column and row: ");
            column=scanner.nextInt();
            row = scanner.nextInt();

            if (checkSpot(board, column, row)){
                System.out.println("This spot is already taken. Try again.");
                printBoard(board);
                continue;
            }

            board[column][row] = playerMove;
            printBoard(board);
            checkBoardHorizontally(board);
            checkBoardVertically(board);
            checkBoardDiagonally(board);
            checkBoardForTie(board);

            alternatePlayerMove(playerMove);
        }
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void checkBoardHorizontally(char[][] board){
        if (
            (board[0][0] == 'x' && board[0][1] == 'x' && board[0][2] == 'x')||
            (board[1][0] == 'x' && board[1][1] == 'x' && board[1][2] == 'x')||
            (board[2][0] == 'x' && board[2][1] == 'x' && board[2][2] == 'x')
            ){
                System.out.println("Player X Wins!");
                System.exit(0);
        }
        else if (
            (board[0][0] == 'o' && board[0][1] == 'o' && board[0][2] == 'o')||
            (board[1][0] == 'o' && board[1][1] == 'o' && board[1][2] == 'o')||
            (board[2][0] == 'o' && board[2][1] == 'o' && board[2][2] == 'o')
        ){
            System.out.println("Play O Wins!");
            System.exit(0);
        }
    }

    public static void checkBoardVertically(char[][] board){
        if (
            (board[0][0] == 'x' && board[1][0] == 'x' && board[2][0] == 'x')||
            (board[0][1] == 'x' && board[1][1] == 'x' && board[2][1] == 'x')||
            (board[0][2] == 'x' && board[1][2] == 'x' && board[2][2] == 'x')
            ){
                System.out.println("Player X Wins!");
                System.exit(0);
        }
        else if (
            (board[0][0] == 'o' && board[1][0] == 'o' && board[2][0] == 'o')||
            (board[0][1] == 'o' && board[1][1] == 'o' && board[2][1] == 'o')||
            (board[0][2] == 'o' && board[1][2] == 'o' && board[2][2] == 'o')
        ){
            System.out.println("Play O Wins!");
            System.exit(0);
        }
    }

    public static void checkBoardDiagonally(char[][] board){
        if (
            (board[0][0] == 'x' && board[1][1] == 'x' && board[2][2] == 'x')||
            (board[0][2] == 'x' && board[1][1] == 'x' && board[2][0] == 'x')
            ){
                System.out.println("Player X Wins!");
                System.exit(0);
        }
        else if (
            (board[0][0] == 'o' && board[1][1] == 'o' && board[2][2] == 'o')||
            (board[0][2] == 'o' && board[1][1] == 'o' && board[2][0] == 'o')
        ){
            System.out.println("Play O Wins!");
            System.exit(0);
        }
    }

    public static void checkBoardForTie(char[][] board){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j]=='_'){
                    return;
                }
            }
        }
        System.out.println("TIE!");
        System.exit(0);
    }

    public static char alternatePlayerMove(char playerMove){
        if (playerMove=='x'){
            return 'o';
        }
        return 'x';
    }

    public static boolean checkSpot(char[][] board, int column, int row){
        if (board[column][row] != '_'){

            return true;
        }
        return false;
    }
}