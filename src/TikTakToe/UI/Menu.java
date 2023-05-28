package TikTakToe.UI;

import TikTakToe.Game.Game;
import TikTakToe.Main;

/**
 * This class provides the main Menu functionality for the game.
 */
public class Menu {
    /**
     * This method handles the main menu loop.
     * It displays the menu and takes the player's input for navigation.
     * Options include starting a new game, entering settings, exiting the game, or viewing help.
     */
    public static void menuLoop() {
        var start = true;
        while (start) {
            //printing the menu
            menu();
            // storing Input in MenuInput
            String menuInput = Main.inputScanner.nextLine();
            switch (menuInput) {
                case "1" -> { //calling the Game method with the Game Loop
                    Game.game();
                    //Stop the Menu Loop
                    start = false;
                }
                case "2" -> { // Calling and Setting the Settings Loop to True
                    Settings.settings = true;
                    Settings.settingsLoop();
                    //Stop the Menu Loop
                    start = false;
                }
                case "3" -> { // shutting down the Game
                    System.out.println("Goodbye !");
                    Main.inputScanner.close();
                    System.exit(0);
                }
                case "h", "H" -> Help.help();
                default -> System.out.println("Please Enter a Number from (1..3)!");
            }
        }
    }
    /**
     * This method prints out the main menu.
     * It displays options for starting a new game, entering settings, exiting the game, and accessing help.
     */
    public static void menu() {
        System.out.printf(
                "       Menu       %n" +
                        "+----------------+%n" +
                        "|1 - Start Board!|%n" +
                        "|2 - Settings    |%n" +
                        "|3 - Close Game  |%n" +
                        "+----------------+%n" +
                        "You can Type 'h' for Help %n" +
                        "please Enter a Number: ");
    }
}
