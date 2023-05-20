package TikTakToe.Game;


import TikTakToe.Main;

public class Checks {
    public static boolean checkWin(char[][] board, char symbol) {
        // for a Win!   Rows
        return board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol ||
                board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol ||
                board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol ||
                //Columns !
                board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol ||
                board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol ||
                board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol ||
                //Diagonal!
                board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol ||
                board[2][0] == symbol && board[1][1] == symbol && board[0][2] == symbol;
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
    public static void playerMoveX(char[][] board, char symbol) {


        String userInput = null;
        if (symbol == 'X') {

            while (true) {
                userInput = Main.inputScanner.nextLine();
                if (valid(board, userInput)) {
                    break;
                } else {
                    System.out.println("Invalid Number");
                }

            }
            move(board, userInput, 'X');
        } else {
            while (true) {
                userInput = Main.inputScanner.nextLine();
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
     * @param playerSymbol das Symbol des Spielers ('X' oder 'O'), der den Zug macht.
     * @throws IllegalArgumentException wenn die Position außerhalb des gültigen Bereichs liegt oder bereits belegt ist.
     */
    public static void move(char[][] board, String position, char playerSymbol) {
        switch (position) {
            case "1" -> board[0][0] = playerSymbol;
            case "2" -> board[0][1] = playerSymbol;
            case "3" -> board[0][2] = playerSymbol;
            case "4" -> board[1][0] = playerSymbol;
            case "5" -> board[1][1] = playerSymbol;
            case "6" -> board[1][2] = playerSymbol;
            case "7" -> board[2][0] = playerSymbol;
            case "8" -> board[2][1] = playerSymbol;
            case "9" -> board[2][2] = playerSymbol;
            default -> System.out.println("Invalid Number");
        }
    }
}
