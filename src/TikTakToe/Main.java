package TikTakToe;

import TikTakToe.Menu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    static Random random = new Random();


    public static void main(String[] args) {
        Menu.menuLoop();

    }
    static boolean checkWin(char[][] board, char symbol) {
        // for a Win!   Rows
        if(board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
           board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
           board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol ||
                //Columns !
           board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
           board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
           board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol ||
                //Diagonal!
           board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol ||
           board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol ) {
            return true;
        }
        return false;
    }
        // for checking The Field if its Empty its Returning true
    public static boolean valid (char [][] board, String position) {
        switch (position) {
            case "1" -> {
                return board[0][0] == ' ';
            }
            case "2" -> {
                return board[0][1] == ' ';
            }
            case "3" -> {
                return board[0][2] == ' ';
            }
            case "4" -> {
                return board[1][0] == ' ';
            }
            case "5" -> {
                return board[1][1] == ' ';
            }
            case "6" -> {
                return board[1][2] == ' ';
            }
            case "7" -> {
                return board[2][0] == ' ';
            }
            case "8" -> {
                return board[2][1] == ' ';
            }
            case "9" -> {
                return board[2][2] == ' ';
            }

        }
        return false;
    }
    //Simple Turn for the Player
    static void playerMoveX(char[][] board, char symbol) {
        Scanner gameScanner = new Scanner(System.in);

        String userInput = null;
        if (symbol == 'X') {

            while (true) {
                userInput = gameScanner.nextLine();
                if (valid(board, userInput)) {
                    break;
                } else {
                    System.out.println("Invalid Number");
                }

            }
            move(board, userInput, 'X');
        } else {
            while (true) {
                userInput = gameScanner.nextLine();
                if (valid(board, userInput)) {
                    break;
                } else {
                    System.out.println("Invalid Number");
                }

            }
            move(board, userInput, 'O');
        }

    }

    /**
     * Diese Methode setzt einen Zug auf das Spielfeld.
     *
     * @param position die Position auf dem Spielfeld, an der der Zug gesetzt werden soll (1-9).
     * @param xOrO das Symbol des Spielers ('X' oder 'O'), der den Zug macht.
     * @throws IllegalArgumentException wenn die Position außerhalb des gültigen Bereichs liegt oder bereits belegt ist.
     */
    public static void move(char[][] board, String position, char xOrO) {
        switch (position) {
            case "1" -> board[0][0] = xOrO;
            case "2" -> board[0][1] = xOrO;
            case "3" -> board[0][2] = xOrO;
            case "4" -> board[1][0] = xOrO;
            case "5" -> board[1][1] = xOrO;
            case "6" -> board[1][2] = xOrO;
            case "7" -> board[2][0] = xOrO;
            case "8" -> board[2][1] = xOrO;
            case "9" -> board[2][2] = xOrO;
            default -> System.out.println("Invalid Number");
        }
    }
}