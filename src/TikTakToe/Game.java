package TikTakToe;

import java.util.Scanner;

public class Game {
    static Scanner inputScanner = new Scanner(System.in);
    /**
     * Diese Methode startet das Spiel und führt die Hauptspiel-Schleife aus.
     * Sie fragt die Spieler nach ihren Zügen und setzt sie auf dem Spielbrett, bis das Spiel endet.
     */
    public static void game() {

        Board.printBoard(Board.board);
        while (true) {
            System.out.println("Player X chose (1 - 9):  ");
            Main.playerMoveX(Board.board, 'X');
            if (checkWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);
            if (Settings.twoPlayer) {
                System.out.println("Player O chose (1 - 9):  ");
                Main.playerMoveX(Board.board, 'O');
            } else {
                cpuEasyMove();
            }
            if (checkWin(Board.board)) {
                break;
            }
            Board.printBoard(Board.board);
        }

    }

    /**
     * Diese Methode überprüft, ob ein Spieler gewonnen hat.
     *
     * symbol das Symbol des Spielers ('X' oder 'O'), für den geprüft werden soll.
     * @return true wenn der Spieler gewonnen hat, sonst false.
     */
    public static boolean checkWin(char[][] board) {
        //Player X Won
        if (Main.checkWin(board, 'X')) {
            Board.printBoard(board);
            System.out.println("Player X won !");
            finishQuestion();
            return true;
        }
        // Player O || CPU Won
        if (Main.checkWin(board, 'O')) {
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
                "2 - To the TikTakToe.Main TikTakToe.Menu!%n" +
                "3 - Quit TikTakToe.Board.Game");

        var playAgain = inputScanner.nextInt();
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
            inputScanner.close();
            System.exit(1);
        } else {
            System.out.println("Invalid Number !");
        }
    }

    //Easy CPU move with Random Numbers
    public static void cpuEasyMove() {
        int cpuEasyMove = 0;
        while (true) {
            cpuEasyMove = Main.random.nextInt(1, 9);
            if (Main.valid(Board.board, Integer.toString(cpuEasyMove))) {
                break;
            }
        }
        System.out.println("Cpu chose: " + cpuEasyMove);
        Main.move(Board.board, Integer.toString(cpuEasyMove), 'O');
    }

}
