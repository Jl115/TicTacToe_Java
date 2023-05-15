package TikTakToe;

import java.util.Scanner;

public class Settings {
    static Scanner inputScanner = new Scanner(System.in);
    static String ANSI_RESET = "\u001B[0m";
    static String ANSI_RED = "\u001B[31m";
    static String ANSI_BLUE = "\u001B[34m";
    static boolean twoPlayer = true;
    static boolean settings = true;
    //Settings Loop
    public static void settingsLoop() {
            while (settings){
                System.out.printf(
                        "+----------------+%n" +
                                "     TikTakToe.Settings     %n" +
                                "+----------------+%n" +
                                "|1  -  Color    !|%n" +
                                "|2  -  Mode      |%n" +
                                "|3  -  CPU LvL   |%n" +
                                "|4  -  Back !    |%n" +
                                "+----------------+%n" +
                                "please Enter a Number: "
                );

                int settingsInput = inputScanner.nextInt();

                if (settingsInput == 1) {
                    System.out.println("Chose the desired Color: ");
                    System.out.println("1 - Blue");
                    System.out.println("2 - Red");
                    System.out.println("3 - Default");
                    int colorInput = inputScanner.nextInt();
                    if (colorInput == 1) {
                        System.out.println(ANSI_BLUE + "The Color is now Blue!");
                    } else if (colorInput == 2) {
                        System.out.println(ANSI_RED + "The Color is now Red!");
                    } else if (colorInput == 3) {
                        System.out.println(ANSI_RESET + "The Color is the Default!");
                    } else {
                        System.out.println("Invalid Number");
                    }
                } else if(settingsInput == 2) {
                    System.out.printf(
                            "Chose your Playing Mode: %n" +
                                    "1 - Player vs Player%n" +
                                    "2 - Player vs Cpu%n" +
                                    "3 - Back%n" +
                                    "please Enter a Number: ");

                    int modeInput = inputScanner.nextInt();

                    if(modeInput == 1) {
                        twoPlayer = true;
                        System.out.println("The TikTakToe.Board.Game Mode is now Set to Player vs Player!");
                    } else if (modeInput == 2) {
                        twoPlayer = false;
                        System.out.println("The TikTakToe.Board.Game Mode is now Set to Player vs Cpu!");
                    } else if(modeInput == 3) {
                        settingsLoop();
                    }
                    else {
                        System.out.println("Invalid answer");
                    }

                } else if (settingsInput == 3) {
                    System.out.printf(
                            "Chose CPU LVL: %n" +
                                    "1 - Easy%n" +
                                    "2 - Medium%n" +
                                    "3- Hard%n" +
                                    "please Enter a Number: ");
                    int cpuMode = inputScanner.nextInt();

                    switch (cpuMode) {
                        case 1 -> System.out.println("The LVL of the CPU is now Easy");
                        case 2 -> System.out.println("The LVL of the CPU is now Medium");
                        case 3 -> System.out.println("The LVL of the CPU is now Hard");
                        default -> System.out.println("Invalid Number");
                    }
                } else if (settingsInput == 4) {
                    settings = false;
                    Menu.menuLoop();
                }else {
                    System.out.println("Invalid Number");
                }

            }
        }

    }


