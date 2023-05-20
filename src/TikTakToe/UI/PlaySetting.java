package TikTakToe.UI;

import TikTakToe.Game.Game;
import TikTakToe.Main;

public class PlaySetting {
    public static void gameMode(){
        System.out.printf(
                "Chose your Playing Mode: %n" +
                        "1 - Player vs Player%n" +
                        "2 - Player vs Cpu%n" +
                        "3 - Back%n" +
                        "please Enter a Number: ");

        int modeInput = Main.inputScanner.nextInt();

        if(modeInput == 1) {
            Game.twoPlayer = true;
            System.out.println("The Game Mode is now Set to Player vs Player!");
        } else if (modeInput == 2) {
            Game.twoPlayer = false;
            System.out.println("The Game Mode is now Set to Player vs Cpu!");
        } else if(modeInput == 3) {
            Settings.settingsLoop();
        }
        else {
            System.out.println("Invalid answer");
        }
    }

    public static void cpuMode(){
        System.out.printf(
                "Chose CPU LVL: %n" +
                        "1 - Easy%n" +
                        "2 - Medium%n" +
                        "3- Hard%n" +
                        "please Enter a Number: ");
        int cpuMode = Main.inputScanner.nextInt();

        switch (cpuMode) {
            case 1 -> System.out.println("The LVL of the CPU is now Easy");
            case 2 -> {
                System.out.println("The LVL of the CPU is now Medium");
                Game.minimax = false;
            }
            case 3 -> {
                System.out.println("The LVL of the CPU is now Hard");
                Game.minimax = true;
            }
            default -> System.out.println("Invalid Number");
        }
    }
}
