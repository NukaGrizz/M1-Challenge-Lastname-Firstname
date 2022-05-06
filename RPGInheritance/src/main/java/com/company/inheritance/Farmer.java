package com.company.inheritance;

public class Farmer extends BaseCharacter{
    private boolean plowing;

    private boolean harvesting;

    public Farmer(String name) {
        super(name);
        this.plowing = false;
        this.harvesting = false;
        this.strength = 75;
        this.stamina = 75;
        this.speed = 10;
        this.attackPower = 1;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    @Override
    public String attackAnotherCharacter(BaseCharacter defendingCharacter) {
        defendingCharacter.setHealth(defendingCharacter.getHealth()-this.getAttackPower());
        return this.getName() + " attacked " + defendingCharacter.getName() + " dealing " + this.getAttackPower() + " points of Damage";
    }

    @Override
    public String toString() {
        return "Farmer{" +
                    " name='" + name + '\'' +
                    ", strength=" + strength +
                    ", health=" + health +
                    ", stamina=" + stamina +
                    ", speed=" + speed +
                    ", attackPower=" + attackPower +
                    ", harvesting=" + harvesting +
                    ", plowing=" + plowing +
                    ", running=" + running +
                    ", arrested=" + arrested +
                    '}';
    }
}
