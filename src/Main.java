import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // intro
        System.out.println("  Welcome to the game Tic-tac-toe");
        System.out.println(" Player One, input ur name:");
        String playerOne = scanner.nextLine();
        System.out.println(" Player Two, input ur name:");
        String playerTwo = scanner.nextLine();

        // create board
        char [][] board = new char[3][3];

        for (int i = 0; i < 3;i++ ){
            for (int m = 0; m < 3; m++){
                board[i][m] = '-';
            }
        }

        System.out.println(" Hello, " + playerOne + " and " + playerTwo);


    }
}