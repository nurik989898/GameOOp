package kg.game.players;

public class Berserk extends Hero{
    public Berserk(int health, int damage,String name) {

        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageChast = boss.getDamage()/2;
    boss.setHealth(boss.getHealth() - damageChast);
    System.out.println("Berserk hits " +  damageChast);
    }
}
