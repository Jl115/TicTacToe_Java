package TikTakToe.UI;

import TikTakToe.Game.Game;
import TikTakToe.Main;


public class Menu {


    //Menu Loop
    public static void menuLoop() {
            var start = true;
            while (start) {
                menu();
                int menuInput = Main.inputScanner.nextInt();
                if (menuInput == 1) {
                    Game.game();
                    start = false;
                } else if(menuInput == 2){
                    Settings.settings = true;
                    Settings.settingsLoop();
                    start = false;
                } else if (menuInput == 3) {
                    System.out.println("Goodbye !");
                    Main.inputScanner.close();
                    System.exit(1);
                }
            }
        }
    //printing out the menu
    public static void menu() {
        System.out.printf(
                "       TikTakToe.UI.Menu       %n" +
                        "+----------------+%n" +
                        "|1 - Start Board !|%n" +
                        "|2 - Settings    |%n" +
                        "|3 - Close Game  |%n" +
                        "+----------------+%n" +
                        "please Enter a Number: ");
    }

}

