import java.util.Random;
import java.util.Scanner;

public class TicTac {

    final char Xchar = 'X';
    final char Ochar = 'O';
    final char Empty = '_';
    char board[][];
    Scanner scanner;
    Random random;

    public static void main(String[] args) {
        // start game
        new TicTac().game();
    }

    //constructor
    TicTac() {
        random = new Random();
        scanner = new Scanner(System.in);
        board = new char[3][3];
    }
    void game() {
        // game logic



    }

    void initBoard() {
        for (){
            for (){

            }
        }
    }

    void drawBoard() {
        for (){
            for (){

            }
        }
    }



}








//       create board  (step1) - done
//       here we can see our board (step2) - done
// tracking correct symbols and players turn (step3)
// asking players their step before they are become valid (step4)
// set symbol on place of board (step5)
// win check (step6)
// check game on tie (step7)
//       loop to keep going (step8) - done