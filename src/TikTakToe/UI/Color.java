package TikTakToe.UI;

import TikTakToe.Main;

public class Color {
    static final String ANSI_RESET = "\u001B[0m";
    static final String ANSI_RED = "\u001B[31m";
    static final String ANSI_BLUE = "\u001B[34m";
    public static void colorSettings() {
        System.out.println("Chose the desired Color: ");
        System.out.println("1 - Blue");
        System.out.println("2 - Red");
        System.out.println("3 - Default");
        int colorInput = Main.inputScanner.nextInt();
        if (colorInput == 1) {
            System.out.println(ANSI_BLUE + "The Color is now Blue!");
        } else if (colorInput == 2) {
            System.out.println(ANSI_RED + "The Color is now Red!");
        } else if (colorInput == 3) {
            System.out.println(ANSI_RESET + "The Color is the Default!");
        } else {
            System.out.println("Invalid Number");
        }
    }
}
