package cz.educanet.arena;

import cz.educanet.arena.presentation.ArenaCLI;

public class Main {

    public static void main(String[] args) {
        ArenaCLI cli = new ArenaCLI();
        cli.initialize();
            cli.renderLandingPage();
                cli.renderGladiatorPicker();
                    cli.renderEntireFight();
    }

}