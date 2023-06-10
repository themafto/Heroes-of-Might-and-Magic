package Heroes;

public class Swordman extends Creature{

    public Swordman(String name, int level, int attack, int defense, int speed, int health, int quantity) {
        super(name, level, attack, defense, speed, health ,quantity);
    }

    @Override
    public int getDamage(){
        return getAttack() * getLevel() - getDefense();
    }
}
