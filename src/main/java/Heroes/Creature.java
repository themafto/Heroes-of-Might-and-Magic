package Heroes;

abstract class Creature {
    private String name;
    private int level;
    private int attack;
    private int defense;
    private int speed;
    private int health;
    private int quantity;
    public Creature(String name, int level, int attack, int defense, int speed, int health, int quantity) {
        this.name = name;
        this.level = level;
        this.attack = attack;
        this.defense = defense;
        this.speed = speed;
        this.health = health;
        this.quantity = quantity;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract int getDamage();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getDamage(int attack) {
        return attack;
    }


}
