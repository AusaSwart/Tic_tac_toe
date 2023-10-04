import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("BooleanMethodIsAlwaysInverted")
public class TicTac {

    // symbolic constants
    final char XChar = 'X';
    final char OChar = 'O';
    final char Empty = '_';
    char[][] board;
    Scanner scanner;
    Random random;
    static int player;

    // entrance in program
    public static void main(String[] args) {
        // start game
        new TicTac().game(player);
    }

    //constructor
    TicTac() {
        random = new Random();
        scanner = new Scanner(System.in);
        board = new char[3][3];
        System.out.println("""
                             Welcome to the game Tic-Tac-Toe\s
                             Would you play with machine or another player? (1 or 2)\s
                             In cause of wrong decision you will be play with machine
                            """);
        player = scanner.nextInt();
    }

    // game logic
    void game( int player ) {
        // init
        initBoard();
        // infinity loop
        while (true) {
            // human turn
            playerOne(XChar);
            // check
            if (check(XChar)) {
                System.out.println(" Player One Win");
                break;
            }
            if (boardFull()) {
                System.out.println(" Draw");
                break;
            }
            if (player != 2) {
                // machine turn
                System.out.println(" Machine move");
                playerTwo();
                // check
                if (check(OChar)) {
                    System.out.println(" Player Two Win");
                    break;
                }
                if (boardFull()) {
                    System.out.println(" Draw");
                    break;
                }
            }
            if ( player == 2) {
                playerOne(OChar);

                // check
                if (check(OChar)) {
                    System.out.println(" Player Two Win");
                    break;
                }
                if (boardFull()) {
                    System.out.println(" Draw");
                    break;
                }
            }

        }
        System.out.println();
        System.out.println(" Game over");
        drawBoard();
    }

    // player one move
    private void playerOne( char symbol) {
        int x, y;
        do {
            System.out.println(" Enter x - row & y - cow, coordinates ( 1, 2, 3 ): ");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isValidCell(x, y));
        board[x][y] = symbol;
        drawBoard();
    }

    // player two move
    private void playerTwo() {
        int x, y;
        do {
            x = random.nextInt(3);
            y = random.nextInt(3);
        } while (!isValidCell(x, y));
        board[x][y] = OChar;
        drawBoard();
    }

    // check coordinates of cell, if they are valid
    private boolean isValidCell(int x, int y) {
        if ( x < 0 || y < 0 || x >= 3 || y >= 3 || board[x][y] != Empty) {
            System.out.println(" Incorrect coordinates, try again");
            return false;
        }
        return true;
    }


    // check if board full
    private boolean boardFull() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                if (board[i][j] == Empty){
                    return false;
                }
            }
        }
        return true;
    }

    // win check
    private boolean check(char w) {
        if (board[1][1] == w &&
                ((board[0][0] == w && board[2][2] == w) ||
                 (board[2][0] == w && board[0][2] == w))){
            return true;
        }
        for (int i = 0; i < 3; i++ ){
            if ( (board[0][i] == w && board[1][i] == w && board[2][i] == w) ||
                 (board[i][0] == w && board[i][1] == w && board[i][2] == w) ) {
                return true;
            }
        }
        return false;

    }

    // board initialization
    void initBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = Empty;
            }
        }
    }

    // draw a board
    void drawBoard() {
        for (int i = 0; i < 3; i++) {
            System.out.print(" ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                if( j < 2) System.out.print(" | ");
            }
            if (i < 2 ) System.out.println("\n____________");
        }
        System.out.println("\n\n");
    }
}


// optimization: add human player