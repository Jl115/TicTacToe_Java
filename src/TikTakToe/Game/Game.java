package TikTakToe.Game;


import TikTakToe.*;
import TikTakToe.UI.Menu;
import TikTakToe.UI.Settings;

public class Game {
    public static boolean twoPlayer = true;
    public static boolean minimax = false;
    /**
     * Diese Methode startet das Spiel und führt die Hauptspiel-Schleife aus.
     * Sie fragt die Spieler nach ihren Zügen und setzt sie auf dem Spielbrett, bis das Spiel endet.
     */
    public static void game() {

        Board.printBoard(Board.board);
        while (true) {
            System.out.println("Player X chose (1 - 9):  ");
            Checks.playerMoveX(Board.board, 'X');
            if (checkWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);
            if (twoPlayer) {
                System.out.println("Player O chose (1 - 9):  ");
                Checks.playerMoveX(Board.board, 'O');
            } else if (twoPlayer){
                Computer.cpuEasyMove();
            } else if (!minimax){
                Computer.cpuMediumMove();
            } else if (minimax) {
                Computer.cpuHardMove();
            }
            if (checkWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);
        }

    }

    /**
     * Diese Methode überprüft, ob ein Spieler gewonnen hat.
     * symbol das Symbol des Spielers ('X' oder 'O'), für den geprüft werden soll.
     * @return true wenn der Spieler gewonnen hat, sonst false.
     */
    public static boolean checkWin(char[][] board) {
        //Player X Won
        if (Checks.checkWin(board, 'X')) {
            Board.printBoard(board);
            System.out.println("Player X won !");
            finishQuestion();
            return true;
        }
        // Player O || CPU Won
        if (Checks.checkWin(board, 'O')) {
            Board.printBoard(board);
            System.out.println("Player O won!");
            finishQuestion();
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
        finishQuestion();
        return true;
    }

    //questions after finishing the game and resetting the Board
    public static void finishQuestion() {
        System.out.printf("You wanna play another ? %n" +
                "1 - Yes!%n" +
                "2 - To the Menu!%n" +
                "3 - Quit Game");

        var playAgain = Main.inputScanner.nextInt();
        if (playAgain == 1) {
            Board.board = new char[][]{
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
            game();
        } else if (playAgain == 2) {
            Board.board = new char[][]{
                    {' ', ' ', ' '},
                    {' ', ' ', ' '},
                    {' ', ' ', ' '}
            };
            Menu.menuLoop();
        } else if (playAgain == 3) {
            Main.inputScanner.close();
            System.exit(1);
        } else {
            System.out.println("Please Enter a Number from 1 - 9!");
        }
    }
}