package cz.educanet.arena.presentation;

import cz.educanet.arena.data.GladiatorDatabase;
import cz.educanet.arena.logic.Arena;
import cz.educanet.arena.logic.Gladiator;

import java.util.Scanner;

public class ArenaCLI {
    private Arena logic;
    private Scanner sc;

    public void initialize() {
        logic = new Arena();
        sc = new Scanner(System.in);
    }

    public void renderLandingPage() {
        System.out.println("     /\\                         \n" +
                "    /  \\   _ __ ___ _ __   __ _ \n" +
                "   / /\\ \\ | '__/ _ \\ '_ \\ / _` |\n" +
                "  / ____ \\| | |  __/ | | | (_| |\n" +
                " /_/    \\_\\_|  \\___|_| |_|\\__,_|");
        System.out.println("---------------------------------");
    }

    public void renderGladiatorPicker() {
        System.out.println("WELCOME TO THE ARENA! ENJOY YOUR STAY!");
        System.out.println("-----------------");
        System.out.println("YOU CAN CHOOSE FROM:");
        System.out.println("Tonda.txt");
        System.out.println("Ludvik.txt");
        System.out.println("Daniel.txt");
        System.out.println("Samuel.txt");
        System.out.println("Ondra.txt");
        System.out.println("CANT CREATE A CHARACTER(YET!)");
        System.out.println("-----------------");
            System.out.println("PICK YOUR FIGHTER NUMBER 1 (path of the file):");
            String gladiator1File = sc.nextLine();
            System.out.println("PICK YOUR FIGHTER NUMBER 2 (path of the file):");
            String gladiator2File = sc.nextLine();

                Gladiator gladiator1 = GladiatorDatabase.loadGladiator(gladiator1File);
                Gladiator gladiator2 = GladiatorDatabase.loadGladiator(gladiator2File);
                logic.setGladiator1(gladiator1);
                logic.setGladiator2(gladiator2);
        System.out.println("");
        System.out.println("<LETS GET STARTED!>");
    }

    public void renderEntireFight() {
            while (logic.getWinner() == null) {
            Gladiator gladiator1 = logic.getGladiator1();
            Gladiator gladiator2 = logic.getGladiator2();

            int round = logic.getRound();

            System.out.println();
                System.out.println("<///ROUND " + round +"///>");
                    System.out.println();

            System.out.println("<///HP OF FIGHTERS///>");
                System.out.println("<" + gladiator1.getName() + " has " + gladiator1.getHP()+"HP" + " out of " + gladiator1.getFullHP()+"HP!>");
                System.out.println("<" + gladiator2.getName() + " has " + gladiator2.getHP()+"HP" + " out of " + gladiator2.getFullHP()+"HP!>");
                        logic.fight();

        }
        Gladiator winner = logic.getWinner();
                                            System.out.println("<-/-/-/-/-/-/-/-/-/-/-/-/-/-/->");
                System.out.println("GLADIATOR " + winner.getName() + " IS OUR WINNER!");
                                            System.out.println("<-/-/-/-/-/-/-/-/-/-/-/-/-/-/->");
    }
}
