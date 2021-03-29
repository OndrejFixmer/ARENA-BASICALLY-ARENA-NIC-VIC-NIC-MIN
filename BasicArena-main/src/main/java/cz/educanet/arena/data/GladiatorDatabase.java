package cz.educanet.arena.data;

import cz.educanet.arena.logic.Gladiator;

import java.io.*;

public class GladiatorDatabase {

    public static Gladiator loadGladiator(String filename) {
        Gladiator gladiator = new Gladiator();
        try{
            BufferedReader br = new BufferedReader(new FileReader(filename));

            gladiator.setName(br.readLine());
            gladiator.setFullHP(Integer.parseInt(br.readLine()));
            gladiator.setMaximumDamage(Integer.parseInt(br.readLine()));
            gladiator.setMinimalDamage(Integer.parseInt(br.readLine()));

            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return gladiator;
    }
}