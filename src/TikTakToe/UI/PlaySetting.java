package TikTakToe.UI;

import TikTakToe.Game.Game;
import TikTakToe.Main;

/**
 * This class is responsible for handling the game play settings of the TikTakToe game.
 * It allows users to set the game mode and the difficulty level of the computer.
 */
public class PlaySetting {
    /**
     * This method prints out the game mode menu and handles user's selection.
     * Users can choose to play against another player or the computer.
     * They can also go back to the previous menu.
     */
    public static void gameMode(){
        //printing out the Menu
        System.out.printf(
                "Chose your Playing Mode: %n" +
                        "1 - Player vs Player%n" +
                        "2 - Player vs Cpu%n" +
                        "3 - Back%n" +
                        "please Enter a Number: ");

        String modeInput = Main.inputScanner.nextLine(); //Storing the User input

        switch (modeInput) {
            // Player vs Player
            case "1" -> {
                Game.twoPlayer = true; // Setting the Two-player to true
                System.out.println("The Game Mode is now Set to Player vs Player!");
            }
            //Player vs Computer
            case "2" -> {
                Game.twoPlayer = false;
                System.out.println("The Game Mode is now Set to Player vs Cpu!");
            }
            //Settings
            case "3" -> Settings.settingsLoop();
            default -> System.out.println("Invalid answer"); // catching worng inputs
        }
    }
    /**
     * This method prints out the computer difficulty level menu and handles user's selection.
     * Users can set the difficulty level to Easy, Medium or Hard.
     */
    public static void cpuMode(){
        System.out.printf(
                "Chose CPU LVL: %n" +
                        "1 - Easy%n" +
                        "2 - Medium%n" +
                        "3- Hard%n" +
                        "please Enter a Number: ");
        String cpuMode = Main.inputScanner.nextLine();

        switch (cpuMode) {
            //Easy
            case "1" -> {
                System.out.println("The LVL of the CPU is now Easy");
                Game.easy = true;
            }
            //Medium
            case "2" -> {
                System.out.println("The LVL of the CPU is now Medium");
                Game.minimax = false;
                Game.easy = false;
            }
            //Hard
            case "3" -> {
                System.out.println("The LVL of the CPU is now Hard");
                Game.minimax = true;
                Game.easy = false;
            }
            default -> System.out.println("Invalid Number");
        }
    }
}