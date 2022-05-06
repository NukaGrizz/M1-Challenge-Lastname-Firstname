package com.company.inheritance;

public class Warrior extends BaseCharacter{
    private double shieldStrength;

    public Warrior(String name) {
        super(name);
        this.shieldStrength = 100;
        this.strength = 75;
        this.stamina = 100;
        this.speed = 50;
        this.attackPower = 10;
    }

    public double getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(double shieldStrength) {
        this.shieldStrength = shieldStrength;
    }

    @Override
    public String attackAnotherCharacter(BaseCharacter defendingCharacter) {
        defendingCharacter.setHealth(defendingCharacter.getHealth()-this.getAttackPower());
        return this.getName() + " attacked " + defendingCharacter.getName() + " dealing " + this.getAttackPower() + " points of Damage";
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name='" + name + '\'' +
                ", strength=" + strength +
                ", health=" + health +
                ", stamina=" + stamina +
                ", speed=" + speed +
                ", attackPower=" + attackPower +
                ", shieldStrength=" + shieldStrength +
                ", running=" + running +
                ", arrested=" + arrested +
                '}';
    }
}
