package kg.game.players;

public class Antman extends Hero{
    public Antman(int health, int damage, String name) {
        super(health, damage, SuperAbility.NOTHING, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean one = RPG_Game.random.nextBoolean();
        if (one) {
        this.setHealth(this.getHealth() + 100);
        this.setDamage(this.getDamage() + 10);
        }
        }
    }

