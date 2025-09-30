import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class DnDCharacter {

    private Random random = new Random();
    int strength,dexterity,constitution,intelligence,wisdom,charisma;

    int ability(List<Integer> scores) {
        int minScore = scores.get(0);
        int sum = 0;
        for(int score : scores)
        {
            sum += score;
            if(score < minScore)
            {
                minScore = score;
            }
        }
        return sum - minScore;
    }

    List<Integer> rollDice() {

        List<Integer> Dice = new ArrayList<>() ;
        for(int i = 0; i < 4; i++)
        {
            Dice.add( random.nextInt(6) + 1);
        }
        return Dice;
    }

    DnDCharacter ()
    {
        this.strength = ability(rollDice());
        this.dexterity = ability(rollDice());
        this.constitution = ability(rollDice());
        this.intelligence = ability(rollDice());
        this.wisdom = ability(rollDice());
        this.charisma = ability(rollDice());
    }

    int modifier(int input) {
        return (int)Math.floor((input - 10) / 2.0) ;
    }

    int getStrength() {
        return this.strength;
    }

    int getDexterity() {
        return this.dexterity;
    }

    int getConstitution() {
        return this.constitution;
    }

    int getIntelligence() {
        return this.intelligence;
    }

    int getWisdom() {
        return this.wisdom;
    }

    int getCharisma() {
        return this.charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }
}
