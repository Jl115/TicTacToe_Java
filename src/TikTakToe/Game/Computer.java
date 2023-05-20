package TikTakToe.Game;

import TikTakToe.Main;

public class Computer {
    //Easy CPU move with Random Numbers
    public static void cpuEasyMove() {
        // need to initialize int in methode scope for accessing it
        int cpuEasyMove = 0;
        while (true) { // it's looping until it found a number from 1..9 who has an Empty field
            cpuEasyMove = Main.random.nextInt(1, 10);
            // it's checking the Number with my Valid method and breaks out of the Loop when en Empty field was found
            if (Checks.valid(Board.board, Integer.toString(cpuEasyMove))) {
                break;
            }
        }
        System.out.println("Cpu chose: " + cpuEasyMove);
        //it's using the Switch case for putting the Number on the right Array index and this function needs ah the Player
        // Symbol for putting it on the Field
        Checks.move(Board.board, Integer.toString(cpuEasyMove), 'O');
    }
    //Medium CPU
    public static void cpuMediumMove() {
            int cpuMove = Main.random.nextInt(1, 10); // picks a Random Number
            while (true) {
                //checks for rows if one meets the condition it will replace the Random Number
                if (Board.board[0][0] == 'X' && Board.board[0][1] == 'X' && Board.board[0][2] == ' ') {
                    cpuMove = 3;
                } else if (Board.board[0][0] == 'X' && Board.board[0][1] == ' ' && Board.board[0][2] == 'X') {
                    cpuMove = 2;
                }else if (Board.board[0][0] == ' ' && Board.board[0][1] == 'X' && Board.board[0][2] == 'X') {
                    cpuMove = 1;
                }else if (Board.board[1][0] == ' ' && Board.board[1][1] == 'X' && Board.board[1][2] == 'X') {
                    cpuMove = 4;
                }else if (Board.board[1][0] == 'X' && Board.board[1][1] == ' ' && Board.board[1][2] == 'X') {
                    cpuMove = 5;
                }else if (Board.board[1][0] == 'X' && Board.board[1][1] == 'X' && Board.board[1][2] == ' ') {
                    cpuMove = 6;
                }else if (Board.board[2][0] == ' ' && Board.board[2][1] == 'X' && Board.board[2][2] == 'X') {
                    cpuMove = 7;
                }else if (Board.board[2][0] == 'X' && Board.board[2][1] == ' ' && Board.board[2][2] == 'X') {
                    cpuMove = 8;
                }else if (Board.board[2][0] == 'X' && Board.board[2][1] == 'X' && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                    //checks for columns X
                }else if (Board.board[0][0] == 'X' && Board.board[1][0] == 'X' && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                } else if (Board.board[0][0] == 'X' && Board.board[1][0] == ' ' && Board.board[2][0] == 'X') {
                    cpuMove = 4;
                }else if (Board.board[0][0] == ' ' && Board.board[1][0] == 'X' && Board.board[2][0] == 'X') {
                    cpuMove = 1;
                }else if (Board.board[0][1] == ' ' && Board.board[1][1] == 'X' && Board.board[2][1] == 'X') {
                    cpuMove = 2;
                }else if (Board.board[0][1] == 'X' && Board.board[1][1] == ' ' && Board.board[2][2] == 'X') {
                    cpuMove = 5;
                }else if (Board.board[0][1] == 'X' && Board.board[1][1] == 'X' && Board.board[2][1] == ' ') {
                    cpuMove = 8;
                }else if (Board.board[0][2] == ' ' && Board.board[1][2] == 'X' && Board.board[2][2] == 'X') {
                    cpuMove = 3;
                }else if (Board.board[0][2] == 'X' && Board.board[1][2] == ' ' && Board.board[2][2] == 'X') {
                    cpuMove = 6;
                }else if (Board.board[0][2] == 'X' && Board.board[1][2] == 'X' && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                    // checks for diagonal X
                }else if (Board.board[0][0] == 'X' && Board.board[1][1] == 'X' && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                } else if (Board.board[0][0] == 'X' && Board.board[1][1] == ' ' && Board.board[2][2] == 'X') {
                    cpuMove = 5;
                }else if (Board.board[0][0] == ' ' && Board.board[1][1] == 'X' && Board.board[2][2] == 'X') {
                    cpuMove = 1;
                }else if (Board.board[0][2] == ' ' && Board.board[1][1] == 'X' && Board.board[2][0] == 'X') {
                    cpuMove = 3;
                }else if (Board.board[0][2] == 'X' && Board.board[1][1] == ' ' && Board.board[2][0] == 'X') {
                    cpuMove = 5;
                }else if (Board.board[0][2] == 'X' && Board.board[1][1] == 'X' && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                    // checks for row O
                }else if (Board.board[0][0] == 'O' && Board.board[0][1] == 'O' && Board.board[0][2] == ' ') {
                    cpuMove = 3;
                } else if (Board.board[0][0] == 'O' && Board.board[0][1] == ' ' && Board.board[0][2] == 'O') {
                    cpuMove = 2;
                }else if (Board.board[0][0] == ' ' && Board.board[0][1] == 'O' && Board.board[0][2] == 'O') {
                    cpuMove = 1;
                }else if (Board.board[1][0] == ' ' && Board.board[1][1] == 'O' && Board.board[1][2] == 'O') {
                    cpuMove = 4;
                }else if (Board.board[1][0] == 'O' && Board.board[1][1] == ' ' && Board.board[1][2] == 'O') {
                    cpuMove = 5;
                }else if (Board.board[1][0] == 'O' && Board.board[1][1] == 'O' && Board.board[1][2] == ' ') {
                    cpuMove = 6;
                }else if (Board.board[2][0] == ' ' && Board.board[2][1] == 'O' && Board.board[2][2] == 'X') {
                    cpuMove = 7;
                }else if (Board.board[2][0] == 'O' && Board.board[2][1] == ' ' && Board.board[2][2] == 'O') {
                    cpuMove = 8;
                }else if (Board.board[2][0] == 'O' && Board.board[2][1] == 'O' && Board.board[2][2] == ' ') {
                    cpuMove = 9;

                    //checks for columns O
                }else if (Board.board[0][0] == 'O' && Board.board[1][0] == 'O' && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                } else if (Board.board[0][0] == 'O' && Board.board[1][0] == ' ' && Board.board[2][0] == 'O') {
                    cpuMove = 4;
                }else if (Board.board[0][0] == ' ' && Board.board[1][0] == 'O' && Board.board[2][0] == 'O') {
                    cpuMove = 1;
                }else if (Board.board[0][1] == ' ' && Board.board[1][1] == 'O' && Board.board[2][1] == 'O') {
                    cpuMove = 2;
                }else if (Board.board[0][1] == 'O' && Board.board[1][1] == ' ' && Board.board[2][2] == 'O') {
                    cpuMove = 5;
                }else if (Board.board[0][1] == 'O' && Board.board[1][1] == 'O' && Board.board[2][1] == ' ') {
                    cpuMove = 8;
                }else if (Board.board[0][2] == ' ' && Board.board[1][2] == 'O' && Board.board[2][2] == 'O') {
                    cpuMove = 3;
                }else if (Board.board[0][2] == 'O' && Board.board[1][2] == ' ' && Board.board[2][2] == 'O') {
                    cpuMove = 6;
                }else if (Board.board[0][2] == 'O' && Board.board[1][2] == 'O' && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                    // checks for diagonal O
                }else if (Board.board[0][0] == 'O' && Board.board[1][1] == 'O' && Board.board[2][2] == ' ') {
                    cpuMove = 9;
                } else if (Board.board[0][0] == 'O' && Board.board[1][1] == ' ' && Board.board[2][2] == 'O') {
                    cpuMove = 5;
                }else if (Board.board[0][0] == ' ' && Board.board[1][1] == 'O' && Board.board[2][2] == 'O') {
                    cpuMove = 1;
                }else if (Board.board[0][2] == ' ' && Board.board[1][1] == 'O' && Board.board[2][0] == 'O') {
                    cpuMove = 3;
                }else if (Board.board[0][2] == 'O' && Board.board[1][1] == ' ' && Board.board[2][0] == 'O') {
                    cpuMove = 5;
                }else if (Board.board[0][2] == 'O' && Board.board[1][1] == 'O' && Board.board[2][0] == ' ') {
                    cpuMove = 7;
                }
                // it's checking the Number with my Valid method and breaks out of the Loop when en Empty field was found
                if (Checks.valid(Board.board, Integer.toString(cpuMove))) {
                    break;
                }
            }
            System.out.println("Cpu chose: " + cpuMove);
            Checks.move(Board.board, Integer.toString(cpuMove), 'O');
    }
    //------------------------------------------------------------------------------------------------------------//
    // Minimax algorithms is not from me, I just wanted an extremely hard CPU !!!  from Line: 111 till Line: 162
    public static void cpuHardMove() {
        int bestScore = Integer.MIN_VALUE;
        String move = null;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (Board.board[i][j] == ' ') {
                    // Make the move
                    Board.board[i][j] = 'O';
                    // Compute score for this move
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
    public static int minimax(char[][] board, int depth, boolean isMaximizing) {
        if (Checks.checkWin(board, 'O')) {
            return 1;
        } else if (Checks.checkWin(board, 'X')) {
            return -1;
        } else if (isBoardFull(board)) {
            return 0;
        }
        if (isMaximizing) {
            int bestScore = Integer.MIN_VALUE;
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
            return bestScore;
        } else {
            int bestScore = Integer.MAX_VALUE;
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
            return bestScore;
        }
    }
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
