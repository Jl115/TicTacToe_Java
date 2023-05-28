package TikTakToe.Game;

/**
 * Represents the game board for the TikTakToe game.
 */
public class Board {
    public static char[][] board =
                   {{' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}};

    /**
     * Prints the current state of the game board to the console.
     *
     * @param board A 2D array representing the game board.
     */
    public static void printBoard(char[][] board) {

        System.out.println(" " + board[0][0] + " " + "|" + " " + board[0][1] + " " + "|" + " " + board[0][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " " + "|" + " " + board[1][1] + " " + "|" + " " + board[1][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " " + "|" + " " + board[2][1] + " " + "|" + " " + board[2][2] + " ");

    }

}


