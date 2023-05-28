package TikTakToe.UI;

import TikTakToe.Main;

/**
 * This class provides functionality to set the color of the game interface.
 */
public class Color {
    // ANSI escape codes for changing the console color.
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_BLUE = "\u001B[34m";
    static final String ANSI_GREEN = "\u001B[32m";
    /**
     * This method presents a menu to the user to choose the color for the game interface.
     * The user inputs a number corresponding to their desired color, and the color of the interface changes accordingly.
     */
    public static void colorSettings() {
        System.out.println("Chose the desired Color: ");
        System.out.println("1 - Blue");
        System.out.println("2 - Red");
        System.out.println("3 - Green");
        System.out.println("4 - Default");
        String colorInput = Main.inputScanner.nextLine();

        switch (colorInput) {
            case "1" -> System.out.println(ANSI_BLUE + "The Color is now Blue!");
            case "2" -> System.out.println(ANSI_RED + "The Color is now Red!");
            case "3" -> System.out.println(ANSI_GREEN + "The Color is the Green!");
            case "4" -> System.out.println(ANSI_RESET + "The Color is now Default!");
            default -> System.out.println("Invalid Number");
        }
    }
}
