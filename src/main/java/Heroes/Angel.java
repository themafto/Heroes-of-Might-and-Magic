package Heroes;

public class Angel extends Creature {


    public Angel(String name, int level, int attack, int defense, int speed, int health, int quantity) {
        super(name, level, attack, defense, speed, health ,quantity);
    }
    @Override
    public int getDamage(){
        return getAttack() * getLevel() + (getSpeed() * 2);
    }

}
