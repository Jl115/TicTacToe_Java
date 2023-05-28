package TikTakToe.UI;
import TikTakToe.Main;

/**
 * This class manages the settings menu of the TikTakToe game.
 * It allows users to customize their game experience including game color, mode and CPU level.
 */
public class Settings {
    static boolean settings = false; // boolean for the while Loop
    /**
     * This method provides a loop for the settings menu.
     * It prompts users for their settings preferences and processes their inputs.
     */
    public static void settingsLoop() {
        while (settings){
            //Settings UI printing
            settingsM();
            String settingsInput = Main.inputScanner.nextLine(); // Storing the User Data
            switch (settingsInput) { // Switch case for the User input
                case "1" -> Color.colorSettings(); // Calling the sub Menu Color
                case "2" -> PlaySetting.gameMode();// Calling the sub Menu gameMode
                case "3" -> PlaySetting.cpuMode();// Calling the sub Menu cpuMode
                case "4" -> {
                    //exiting settings and stopping the while Loop
                    settings = false;
                    Menu.menuLoop();
                }
                // calling the help method
                case "h", "H" -> Help.help();
                default -> System.out.println("Invalid Number"); // Incase user types something else
            }
        }
    }
    /**
     * This method prints out the Settings menu.
     */
    public static void settingsM() {
        System.out.printf(
                "+----------------+%n" +
                        "     Settings     %n" +
                        "+----------------+%n" +
                        "|1  -  Color    !|%n" +
                        "|2  -  Mode      |%n" +
                        "|3  -  CPU LvL   |%n" +
                        "|4  -  Back !    |%n" +
                        "+----------------+%n" +
                        "You can Type 'h' for Help %n" +
                        "please Enter a Number: "
        );
    }
}