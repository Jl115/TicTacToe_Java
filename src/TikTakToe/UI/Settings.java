package TikTakToe.UI;


import TikTakToe.Game.Game;
import TikTakToe.Main;
import TikTakToe.UI.Menu;

public class Settings {


    static boolean settings = false;
    //Settings Loop
    public static void settingsLoop() {
            while (settings){
                System.out.printf(
                                "+----------------+%n" +
                                "     Settings     %n" +
                                "+----------------+%n" +
                                "|1  -  Color    !|%n" +
                                "|2  -  Mode      |%n" +
                                "|3  -  CPU LvL   |%n" +
                                "|4  -  Back !    |%n" +
                                "+----------------+%n" +
                                "please Enter a Number: "
                );

                int settingsInput = Main.inputScanner.nextInt();
                if (settingsInput == 1) {
                    Color.colorSettings();
                } else if(settingsInput == 2) {
                    PlaySetting.gameMode();
                } else if (settingsInput == 3) {
                   PlaySetting.cpuMode();
                } else if (settingsInput == 4) {
                    settings = false;
                    Menu.menuLoop();
                }else {
                    System.out.println("Invalid Number");
                }
            }
        }
    }


