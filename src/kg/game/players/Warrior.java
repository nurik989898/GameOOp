package kg.game.players;

public class Warrior extends Hero{
    public Warrior(int health, int damage,String name) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE,name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
    int coef = RPG_Game.random.nextInt(5) + 1;
    boss.setHealth(boss.getHealth() - this.getDamage()*coef);
        System.out.println("Warrior hits critically " +
                this.getDamage()*coef);
    }
}
