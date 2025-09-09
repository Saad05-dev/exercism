class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {
    public String toString() {
        return "Fighter is a Warrior";
    }
    @Override
    boolean isVulnerable() {
        return false;
    }
    @Override
    int getDamagePoints(Fighter opponent) {
        if(opponent.isVulnerable() == true)
        {
            return 10;
        }
        else
        {
            return 6;
        }
    }
    
}
// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean vulnerable = true;
    @Override
    boolean isVulnerable() {
        return this.vulnerable;
    }
    void prepareSpell()
    {
        this.vulnerable = false;
    }
    @Override
    int getDamagePoints(Fighter opponent) {
        if(isVulnerable() == true )
        {
            return 3;
        }
        else 
        {
            return 12;
        }
    }
    public String toString() {
        return "Fighter is a Wizard";
    }
}