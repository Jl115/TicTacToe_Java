package TikTakToe.Game;

/**
 * This class controls the game flow in a game of Tic Tac Toe.
 */
public class Game {

    public static boolean twoPlayer = true;
    public static boolean minimax = false;
    public static boolean easy = false;

    /**
     * This method starts the game and executes the main game loop.
     * It asks players for their moves and places them on the game board until the game ends.
     */
    public static void game() {
        // Printing the initial game board.
        Board.printBoard(Board.board);
        while (true) { // Game Loop
            System.out.println("Player X chose (1 - 9):  ");
            // Putting Player X's move on the board.
            Checks.playerMoveX(Board.board, 'X');
            // Checking if Player X has won the game.
            if (Checks.isWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);

            if (twoPlayer) {
                // Player O's turn in a two-player game.
                System.out.println("Player O chose (1 - 9):  ");
                Checks.playerMoveX(Board.board, 'O');
            } else if (easy) {
                // Easy difficulty CPU's move.
                Computer.cpuEasyMove();
            } else if (!minimax) {
                // Medium difficulty CPU's move.
                Computer.cpuMediumMove('X', 'O');
            } else if (minimax) {
                // Hard difficulty CPU's move.
                Computer.cpuHardMove();
            }
            // Checking if Player O or the CPU has won the game.
            if (Checks.isWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);
        }
    }
}
