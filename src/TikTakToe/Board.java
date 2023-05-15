package TikTakToe;



public class Board {
    //board 2D Array
    public static char[][] board =
                    {{' ', ' ', ' '},
                     {' ', ' ', ' '},
                     {' ', ' ', ' '}};

    //printing Board
    public static void printBoard(char[][] board) {

        System.out.println(" " + board[0][0] + " " + "|" + " " + board[0][1] + " " + "|" + " " + board[0][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[1][0] + " " + "|" + " " + board[1][1] + " " + "|" + " " + board[1][2] + " ");
        System.out.println("---+---+---");
        System.out.println(" " + board[2][0] + " " + "|" + " " + board[2][1] + " " + "|" + " " + board[2][2] + " ");

    }

}

