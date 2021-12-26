package kg.game.players;

import java.util.Random;

public class Hacker extends Hero{
    public Hacker(int health, int damage, String name) {
        super(health, damage,SuperAbility.HELP, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int health = 100;
        boss.setHealth(boss.getHealth() - health);
        for (int i = 0; i < heroes.length; i++) {
            if (this!=heroes[i]){
                i =RPG_Game.random.nextInt(heroes.length);
                heroes[i].setHealth(heroes[i].getHealth() + health);
            break;
            }

        }
    }
}
