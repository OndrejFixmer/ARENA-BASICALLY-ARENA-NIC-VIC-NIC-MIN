package cz.educanet.arena.logic;

public class Arena {

    private Gladiator glad1;
    private Gladiator glad2;

    private int round = 1;

    public void fight() {
        glad1.dealDamage(glad2);
        glad2.dealDamage(glad1);
        round++;
    }
    public Gladiator getWinner() {
        if (glad1.isDead()){
            return glad2;
        }
        if (glad2.isDead()){
            return glad1;
        }

        return null;
    }

    public Gladiator getGladiator1() {
        return glad1;
    }
    public Gladiator getGladiator2() {
        return glad2;
    }

    public int getRound() {
        return round;
    }
    public void setGladiator1(Gladiator gladiator1) {
        this.glad1 = gladiator1;
    }
    public void setGladiator2(Gladiator gladiator2) {
        this.glad2 = gladiator2;
    }
}