package ScoreForLevelOfHero;
import lombok.Data;
@Data
class CurrentPoint{
    private int points;
    private int level;
    private int damage;

    public CurrentPoint() {
        this.points = 0;
        this.level = 1;
        this.damage = 0;
    }
    public void dealDamage(int damage) {
        this.damage +=  damage;
    }
    public void GameResult(boolean isVictory){
        if(isVictory){
            int victoryPoints = calculateVictoryPoints();
            this.points += victoryPoints;
            this.level++;
        } else {
            int defeatPoints = calculateDefeatPoints();
            this.points += defeatPoints;
        }

    }
    private int calculateVictoryPoints() {
        return level * 100;
    }

    private int calculateDefeatPoints() {
        return level * 50;
    }



}
