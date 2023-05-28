package TikTakToe.UI;

import TikTakToe.Main;

/**
 * This class provides the Help functionality for the game.
 */
public class Help {
    /**
     * This method provides help to the user.
     * It displays a menu with information about how to navigate the game, details about the computer's difficulty levels,
     * and a suggestion to visit the settings for changing the game mode.
     * The user can input 'h' or 'H' to return to the main menu.
     */
    public static void help(){
        boolean helpLoop = true;
        while (helpLoop) {
            System.out.printf(
                    "+----------------------------------------------------------+%n" +
                            "                        Help Menu                           %n" +
                            "+----------------------------------------------------------+%n" +
                            "|You Navigate only with the Numbers from 1 to 9 and you can|%n" +
                            "|Always type in h or H for this helpfully Menu. If your    |%n" +
                            "|wondering why u cant win against the computer on hard     |%n" +
                            "|this is easy he predict the Future! :)                    |%n" +
                            "|I highly suggest u go and look at first at the Settings   |%n" +
                            "|for changing the Game mode to CPU. Have fun Playing !     |%n" +
                            "|h or H again is for back                                  |%n" +
                            "+----------------------------------------------------------+%n" +
                            "please Enter: "
            );
            String helpInput = Main.inputScanner.nextLine();
            if (helpInput.equals("h") || helpInput.equals("H")) {
                helpLoop = false;
                Menu.menuLoop();
            } else {
                System.out.println("Please Enter H or h !");
            }
        }
    }
}
