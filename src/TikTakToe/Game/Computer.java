package TikTakToe.Game;

import TikTakToe.Main;
/**
 * This class represents the computer player in a Tic Tac Toe game.
 */
public class Computer {
    /**
     * This method makes a move for the computer on "Easy" difficulty, which is essentially random.
     */
    public static void cpuEasyMove() {
        // need to initialize int in methode scope for accessing it
        int cpuEasyMove;
        while (true) { // it's looping until it found a number from 1..9 who has an Empty field
            cpuEasyMove = Main.random.nextInt(1, 10);
            // it's checking the Number with my Valid method and breaks out of the Loop when en Empty field was found
            if (Checks.isCorrect(Board.board, Integer.toString(cpuEasyMove))) {
                break;
            }
        }
        System.out.println("Cpu chose: " + cpuEasyMove);
        //it's using the Switch case for putting the Number on the right Array index and this function needs ah the Player
        // Symbol for putting it on the Field
        Checks.move(Board.board, Integer.toString(cpuEasyMove), 'O');
    }
    /**
     * This method makes a move for the computer on "Medium" difficulty.
     * The computer tries to complete its own lines and block the opponent's lines.
     *
     * @param symbolX The symbol representing the human player.
     * @param symbolO The symbol representing the computer player.
     */
    public static void cpuMediumMove(char symbolX, char symbolO) {
            int cpuMove = Main.random.nextInt(1, 10); // picks a Random Number
            while (true) {
                //checks for rows if one meets the condition it will replace the Random Number
                if (Board.board[0][0] == symbolX && Board.board[0][1] == symbolX && Board.board[0][2] == ' ' ||
                        Board.board[0][0] == symbolO && Board.board[0][1] == symbolO && Board.board[0][2] == ' ') {
                    cpuMove = 3;
                } else if (Board.board[0][0] == symbolX && Board.board[0][1] == ' ' && Board.board[0][2] == symbolX ||
                        Board.board[0][0] == symbolO && Board.board[0][1] == ' ' && Board.board[0][2] == symbolO) {
                    cpuMove = 2;
                }else if (Board.board[0][0] == ' ' && Board.board[0][1] == symbolX && Board.board[0][2] == symbolX ||
                        Board.board[0][0] == ' ' && Board.board[0][1] == symbolO && Board.board[0][2] == symbolO) {
                    cpuMove = 1;
                }else if (Board.board[1][0] == ' ' && Board.board[1][1] == symbolX && Board.board[1][2] == symbolX ||
                        Board.board[1][0] == ' ' && Board.board[1][1] == symbolO && Board.board[1][2] == symbolO) {
                    cpuMove = 4;
                }else if (Board.board[1][0] == symbolX && Board.board[1][1] == ' ' && Board.board[1][2] == symbolX ||
                        Board.board[1][0] == symbolO && Board.board[1][1] == ' ' && Board.board[1][2] == symbolO) {
                    cpuMove = 5;
                }else if (Board.board[1][0] == symbolX && Board.board[1][1] == symbolX && Board.board[1][2] == ' ' ||
                        Board.board[1][0] == symbolO && Board.board[1][1] == symbolO && Board.board[1][2] == ' ') {
                    cpuMove = 6;
                }else if (Board.board[2][0] == ' ' && Board.board[2][1] == symbolX && Board.board[2][2] == symbolX ||
                        Board.board[2][0] == ' ' && Board.board[2][1] == symbolO && Board.board[2][2] == symbolO) {
                    cpuMove = 7;
                }else if (Board.board[2][0] == symbolX && Board.board[2][1] == ' ' && Board.board[2][2] == symbolX ||
                        Board.board[2][0] == symbolO && Board.board[2][1] == ' ' && Board.board[2][2] == symbolO) {
                    cpuMove = 8;
                }else if (Board.board[2][0] == symbolX && Board.board[2][1] == symbolX && Board.board[2][2] == ' ' ||
                        Board.board[2][0] == symbolO && Board.board[2][1] == symbolO && Board.board[2][2] == ' ') {
                    cpuMove = 9;

                    //checks for columns X
                }else if (Board.board[0][0] == symbolX && Board.board[1][0] == symbolX && Board.board[2][0] == ' '||
                        Board.board[0][0] == symbolO && Board.board[1][0] == symbolO && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                } else if (Board.board[0][0] == symbolX && Board.board[1][0] == ' ' && Board.board[2][0] == symbolX ||
                        Board.board[0][0] == symbolO && Board.board[1][0] == ' ' && Board.board[2][0] == symbolO) {
                    cpuMove = 4;
                }else if (Board.board[0][0] == ' ' && Board.board[1][0] == symbolX && Board.board[2][0] == symbolX ||
                        Board.board[0][0] == ' ' && Board.board[1][0] == symbolO && Board.board[2][0] == symbolO) {
                    cpuMove = 1;
                }else if (Board.board[0][1] == ' ' && Board.board[1][1] == symbolX && Board.board[2][1] == symbolX ||
                        Board.board[0][1] == ' ' && Board.board[1][1] == symbolO && Board.board[2][1] == symbolO) {
                    cpuMove = 2;
                }else if (Board.board[0][1] == symbolX && Board.board[1][1] == ' ' && Board.board[2][2] == symbolX ||
                        Board.board[0][1] == symbolO && Board.board[1][1] == ' ' && Board.board[2][2] == symbolO) {
                    cpuMove = 5;
                }else if (Board.board[0][1] == symbolX && Board.board[1][1] == symbolX && Board.board[2][1] == ' '||
                        Board.board[0][1] == symbolO && Board.board[1][1] == symbolO && Board.board[2][1] == ' ') {
                    cpuMove = 8;
                }else if (Board.board[0][2] == ' ' && Board.board[1][2] == symbolX && Board.board[2][2] == symbolX ||
                        Board.board[0][2] == ' ' && Board.board[1][2] == symbolO && Board.board[2][2] == symbolO) {
                    cpuMove = 3;
                }else if (Board.board[0][2] == symbolX && Board.board[1][2] == ' ' && Board.board[2][2] == symbolX ||
                        Board.board[0][2] == symbolO && Board.board[1][2] == ' ' && Board.board[2][2] == symbolO) {
                    cpuMove = 6;
                }else if (Board.board[0][2] == symbolX && Board.board[1][2] == symbolX && Board.board[2][2] == ' ' ||
                        Board.board[0][2] == symbolO && Board.board[1][2] == symbolO && Board.board[2][2] == ' ') {
                    cpuMove = 9;

                    // checks for diagonal X
                }else if (Board.board[0][0] == symbolX && Board.board[1][1] == symbolX && Board.board[2][2] == ' ' ||
                        Board.board[0][0] == symbolO && Board.board[1][1] == symbolO && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                } else if (Board.board[0][0] == symbolX && Board.board[1][1] == ' ' && Board.board[2][2] == symbolX ||
                        Board.board[0][0] == symbolO && Board.board[1][1] == ' ' && Board.board[2][2] == symbolO) {
                    cpuMove = 5;
                }else if (Board.board[0][0] == ' ' && Board.board[1][1] == symbolX && Board.board[2][2] == symbolX ||
                        Board.board[0][0] == ' ' && Board.board[1][1] == symbolO && Board.board[2][2] == symbolO) {
                    cpuMove = 1;
                }else if (Board.board[0][2] == ' ' && Board.board[1][1] == symbolX && Board.board[2][0] == symbolX ||
                        Board.board[0][2] == ' ' && Board.board[1][1] == symbolO && Board.board[2][0] == symbolO) {
                    cpuMove = 3;
                }else if (Board.board[0][2] == symbolX && Board.board[1][1] == ' ' && Board.board[2][0] == symbolX ||
                        Board.board[0][2] == symbolO && Board.board[1][1] == ' ' && Board.board[2][0] == symbolO) {
                    cpuMove = 5;
                }else if (Board.board[0][2] == symbolX && Board.board[1][1] == symbolX && Board.board[2][0] == ' ' ||
                        Board.board[0][2] == symbolO && Board.board[1][1] == symbolO && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                }
                // it's checking the Number with my Valid method and breaks out of the Loop when en Empty field was found
                if (Checks.isCorrect(Board.board, Integer.toString(cpuMove))) {
                    break;
                }
            }
            System.out.println("Cpu chose: " + cpuMove);
            Checks.move(Board.board, Integer.toString(cpuMove), 'O');
    }
    //------------------------------------------------------------------------------------------------------------//
    // Minimax algorithms is not from me, I just wanted an extremely hard CPU !!!  from Line: 128 till Line: 213
    /**
     * This method makes a move for the computer on "Hard" difficulty.
     * The computer uses the minimax algorithm to determine the best possible move.
     */
    public static void cpuHardMove() {
        int bestScore = Integer.MIN_VALUE;
        String move = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (Board.board[i][j] == ' ') {
                    // Make the move
                    Board.board[i][j] = 'O';
                    // Computer score for this move
                    int score = minimax(Board.board, 0, false);
                    // Undo the move
                    Board.board[i][j] = ' ';
                    // If this move's score is better than the best, update bestScore and move
                    if (score > bestScore) {
                        bestScore = score;
                        move = Integer.toString(3*i + j + 1);
                    }
                }
            }
        }
        // Make the best move
        Checks.move(Board.board, move, 'O');
        System.out.println("Cpu chose: " + move);
    }
    /**
     * This method implements the minimax algorithm, which the computer uses to determine
     * the best possible move on "Hard" difficulty.
     *
     * @param board The current game board.
     * @param depth The current depth of the minimax search tree.
     * @param isMaximizing Whether the current player is maximizing (the computer) or minimizing (the human).
     * @return The best score that the current player can achieve.
     */
    public static int minimax(char[][] board, int depth, boolean isMaximizing) {
        if (Checks.isWinBoard(board, 'O')) {
            return 1;
        } else if (Checks.isWinBoard(board, 'X')) {
            return -1;
        } else if (isBoardFull(board)) {
            return 0;
        }
        int bestScore;
        if (isMaximizing) {
            bestScore = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'O';
                        int score = minimax(board, depth + 1, false);
                        board[i][j] = ' ';
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
        } else {
            bestScore = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == ' ') {
                        board[i][j] = 'X';
                        int score = minimax(board, depth + 1, true);
                        board[i][j] = ' ';
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
        }
        return bestScore;
    }
    /**
     * This method checks whether the game board is full.
     *
     * @param board The current game board.
     * @return true if the board is full, false otherwise.
     */
    public static boolean isBoardFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
    //----------------------------------------------------------------------------------------------------------------//
    //Till here !!!
}
