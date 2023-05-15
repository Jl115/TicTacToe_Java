package TikTakToe;

import TikTakToe.Game;
import TikTakToe.Settings;

import java.util.Scanner;

public class Menu {
    static Scanner inputScanner = new Scanner(System.in);

    //Menu Loop
    public static void menuLoop() {
            var start = true;
            while (start) {
                menu();
                int menuInput = inputScanner.nextInt();
                if (menuInput == 1) {
                    Game.game();
                    start = false;
                } else if(menuInput == 2){
                    Settings.settingsLoop();
                    start = false;
                } else if (menuInput == 3) {
                    System.out.println("Goodbye !");
                    inputScanner.close();
                    System.exit(1);
                }
            }
        }
    //printing out the menu
    public static void menu() {
        System.out.printf(
                "       TikTakToe.Menu       %n" +
                        "+----------------+%n" +
                        "|1 - Start TikTakToe.Board.Game !|%n" +
                        "|2 - TikTakToe.Settings    |%n" +
                        "|3 - Close TikTakToe.Board.Game  |%n" +
                        "+----------------+%n" +
                        "please Enter a Number: ");
    }

}

