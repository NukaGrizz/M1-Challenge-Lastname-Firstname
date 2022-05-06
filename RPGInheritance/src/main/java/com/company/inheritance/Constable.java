package com.company.inheritance;

public class Constable extends BaseCharacter{

    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name);
        this.jurisdiction = jurisdiction;
        this.strength = 60;
        this.stamina = 60;
        this.speed = 20;
        this.attackPower = 5;
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

    public String arrestAnotherCharacter(BaseCharacter arrestedCharacter){
        arrestedCharacter.setArrested(true);
        return this.getName() + " has arrested " + arrestedCharacter.getName() + " for there crimes!";
    }

    public String releaseAnotherCharacter(BaseCharacter arrestedCharacter){
        arrestedCharacter.setArrested(false);
        return this.getName() + " has released " + arrestedCharacter.getName() + " from jail!";
    }

    @Override
    public String attackAnotherCharacter(BaseCharacter defendingCharacter) {
        defendingCharacter.setHealth(defendingCharacter.getHealth()-this.getAttackPower());
        return this.getName() + " attacked " + defendingCharacter.getName() + " dealing " + this.getAttackPower() + " points of Damage";
    }

    @Override
    public String toString() {
        return "Constable{" +
                    " name='" + name + '\'' +
                    ", strength=" + strength +
                    ", health=" + health +
                    ", stamina=" + stamina +
                    ", speed=" + speed +
                    ", attackPower=" + attackPower +
                    ", jurisdiction='" + jurisdiction +'\''+
                    ", running=" + running +
                    ", arrested=" + arrested +
                    '}';

    }
}
