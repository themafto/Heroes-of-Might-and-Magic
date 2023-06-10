package Heroes;
import lombok.Data;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Data
class Hero {
    private String name;
    private String faction;
    private int experience;
    private int level;
    private Map<Creature, Integer> army;

    public Hero(String name, String faction) {
        this.name = name;
        this.faction = faction;
        this.experience = 0;
        this.level = 1;
        this.army = new HashMap<>();
    }

    public void addCreature(Creature creature, int quantity) {
        army.put(creature, army.getOrDefault(creature, 0) + quantity);
    }
    public void removeCreature(Creature creature, int quantity) {
        int currentQuantity = army.getOrDefault(creature, 0);
        if (currentQuantity > 0) {
            int newQuantity = Math.max(currentQuantity - quantity, 0);
            if (newQuantity > 0) {
                army.put(creature, newQuantity);
            } else {
                army.remove(creature);
            }
        }
    }
    public List<Creature> getArmy() {
        List<Creature> creatureList = new ArrayList<>();
        for (Map.Entry<Creature, Integer> entry : army.entrySet()) {
            Creature creature = entry.getKey();
            int quantity = entry.getValue();
            for (int i = 0; i < quantity; i++) {
                creatureList.add(creature);
            }
        }
        return creatureList;
    }

}