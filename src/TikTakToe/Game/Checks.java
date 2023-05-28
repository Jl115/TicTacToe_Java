package TikTakToe.Game;


import TikTakToe.Main;

/**
 * This class contains various methods to perform checks in the TikTakToe game.
 */
public class Checks {

    /**
     * Checks if there's a winning condition on the board for the provided symbol.
     *
     * @param board  The game board
     * @param symbol The symbol to check the win condition for (either 'X' or 'O')
     * @return true if the symbol has a winning condition, otherwise false.
     */
    public static boolean isWinBoard(char[][] board, char symbol) {
                //Rows !
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
    /**
     * Checks if the chosen position on the game board is empty.
     *
     * @param board The game board
     * @param position The position to check
     * @return true if the position on the board is empty, otherwise false.
     */
    public static boolean isCorrect(char [][] board, String position) {
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
    /**
     * Handles a player's move.
     *
     * @param board The game board
     * @param symbol The symbol of the player making the move ('X' or 'O')
     */
    public static void playerMoveX(char[][] board, char symbol) {
        // need to initialize userInput outside for accessing it
        String userInput = null;
        // this is for the Player X
        if (symbol == 'X') {

            while (true) { // it Loops true until the number passed is on an Empty field!!
                userInput = Main.inputScanner.nextLine(); // storing the Input
                if (isCorrect(board, userInput)) {
                    break;
                } else {
                    System.out.println("Invalid Number");
                }
            }
            move(board, userInput, 'X');
        } else {
            // This is for the Player O
            while (true) { // it Loops true until the number passed is on an Empty field!!
                userInput = Main.inputScanner.nextLine(); // storing the Input
                if (isCorrect(board, userInput)) {
                    break;
                } else {
                    System.out.println("Invalid Number");
                }
            }
            move(board, userInput, 'O');
        }
    }
    /**
     * Places a player's symbol at the given position on the game board.
     *
     * @param board The game board
     * @param pos The position where to place the symbol
     * @param playSymbol The symbol of the player making the move ('X' or 'O')
     */
    public static void move(char[][] board, String pos, char playSymbol) {
        // Make the move on the board
        switch (pos) {
            case "1" -> board[0][0] = playSymbol;
            case "2" -> board[0][1] = playSymbol;
            case "3" -> board[0][2] = playSymbol;
            case "4" -> board[1][0] = playSymbol;
            case "5" -> board[1][1] = playSymbol;
            case "6" -> board[1][2] = playSymbol;
            case "7" -> board[2][0] = playSymbol;
            case "8" -> board[2][1] = playSymbol;
            case "9" -> board[2][2] = playSymbol;
            default -> System.out.println("Invalid Number");
        }
    }
    /**
     * Checks if there's a winning condition or a draw on the board.
     *
     * @param board The game board
     * @return true if there's a winning condition or a draw, otherwise false.
     */
    public static boolean isWin(char[][] board) {
        // Check winning condition or a draw
        //Player X Won
        if (Checks.isWinBoard(board, 'X')) {
            Board.printBoard(board);
            System.out.println("Player X won !");
            Finish.finishQuestion();
            return true;
        }
        // Player O || CPU Won
        if (Checks.isWinBoard(board, 'O')) {
            Board.printBoard(board);
            System.out.println("Player O won!");
            Finish.finishQuestion();
            return true;
        }
        // for a Draw !
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        Board.printBoard(board);
        System.out.println("The game ended in a Draw!");
        Finish.finishQuestion();
        return true;
    }
}
