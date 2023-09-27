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

        // create board  (step1)
        char [][] board = new char[3][3];

        for (int i = 0; i < 3; i++ ){
            for (int j = 0; j < 3; j++){
                board[i][j] = '-';
            }
        }

        // here we can see our board (step2)
        System.out.println(" Hello, " + playerOne + " and " + playerTwo);
        System.out.println(" There's your board ");
        // how can i do cycle more optimal                (?)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("\t");
                System.out.print(" " + board[i][j] + " ");
                if (j == 2) System.out.println(" ");
            }
        }

        // tracking correct symbols (step3)



        // asking players their step before they are become valid (step4)


        //


    }
}