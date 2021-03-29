package cz.educanet.arena.logic;

import java.util.Random;

public class Gladiator {

    private String name;
        private int poskozeni;
            private int minimalPosk;
            private int maximumPosk;
        private int MAXLIFE;
    private int LIFE;

        public boolean isDead() {
        return LIFE <= 0;
    }

        public void dealDamage(Gladiator enemy) {

                    Random ran = new Random();
                    setDamage(ran.nextInt(maximumPosk - minimalPosk));
                    enemy.setHP(enemy.getHP()-poskozeni);
    }
        public String getName() {
        return name;
    }
        public void setName(String name) {
        this.name = name;
    }
            public int getHP() {
            return LIFE;
    }
                public void setHP(int HP) {
                this.LIFE = HP;
    }
            public int getFullHP() {
            return MAXLIFE;
    }
            public void setFullHP(int fullHP) {
            this.MAXLIFE = fullHP;
            this.LIFE = fullHP;
    }
        public void setDamage(int Damage) {
        this.poskozeni = Damage;
    }
        public void setMaximumDamage(int maxDamage) {
        this.maximumPosk = maxDamage;
    }

        public void setMinimalDamage(int minDamage) {
        this.minimalPosk = minDamage;
    }
}