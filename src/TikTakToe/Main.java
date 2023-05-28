package TikTakToe;

import TikTakToe.UI.Menu;
import java.util.Random;
import java.util.Scanner;

/**
 * The main class for the TikTakToe game.
 */
public class Main {
    //Random class of java for the Cpu turn
    public static Random random = new Random();
    //Scanner class for the userInput
    public static Scanner inputScanner = new Scanner(System.in);
    /**
     * The main method that starts the game by calling the menuLoop method from the Menu class.
     *
     * @param args an array of strings that represent the command line arguments.
     */
    public static void main(String[] args) {
        Menu.menuLoop();
    }
}
