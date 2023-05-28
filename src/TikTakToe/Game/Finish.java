package TikTakToe.Game;

import TikTakToe.Main;
import TikTakToe.UI.Menu;

/**
 * This class handles the end of the game and presents the user with various options.
 */
public class Finish {
    /**
     * Presents the user with options after the game has finished and resets the game board.
     * The user can choose to play again, return to the main menu, or quit the game.
     */
    public static void finishQuestion() {
        while (true) {
            System.out.printf("You wanna play another ? %n" +
                    "1 - Yes!%n" +
                    "2 - To the Menu!%n" +
                    "3 - Quit Game %n");
            var playAgain = Main.inputScanner.nextLine();
            switch (playAgain) {
                case "1":
                    // Initializing new board
                    Board.board = new char[][]{
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                    };
                    // Starting a new game
                    Game.game();
                    break;
                case "2":
                    // Initializing new board
                    Board.board = new char[][]{
                            {' ', ' ', ' '},
                            {' ', ' ', ' '},
                            {' ', ' ', ' '}
                    };
                    // Returning to the main menu
                    Menu.menuLoop();
                    break;
                case "3":
                    // Closing the game
                    System.out.println("Goodbye !");
                    Main.inputScanner.close();
                    System.exit(0);
                default:
                    // Prompting for valid input
                    System.out.println("Please Enter a Number from 1 - 3!");
            }
        }
    }
}
