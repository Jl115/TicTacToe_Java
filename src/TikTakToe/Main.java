package TikTakToe;


import TikTakToe.UI.Menu;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static Random random = new Random();
    public static Scanner inputScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Menu.menuLoop();

    }
}