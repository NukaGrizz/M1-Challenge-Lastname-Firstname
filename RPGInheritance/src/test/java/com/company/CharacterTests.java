package com.company;

import com.company.inheritance.Constable;
import com.company.inheritance.Farmer;
import com.company.inheritance.Warrior;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CharacterTests {

    private Constable constable1;
    private Farmer farmer1;
    private Warrior warrior1;


    @Before
    public void setUp(){
        constable1 = new Constable("Stephine The Spider","City Of Margate");
        farmer1 = new Farmer("Chuck");
        warrior1 = new Warrior("Dan The Man");
    }

    @Test
    public void shouldTestWarriorCharacterCreations(){

        assertEquals("Dan The Man",warrior1.getName());
        assertEquals(100,warrior1.getShieldStrength(),.01);
        assertEquals(75,warrior1.getStrength(), .01);
        assertEquals(100,warrior1.getHealth(),.01);
        assertEquals(100,warrior1.getStamina(),.01);
        assertEquals(50,warrior1.getSpeed(),.01);
        assertEquals(10,warrior1.getAttackPower(),0.01);
        assertEquals(false,warrior1.isRunning());
        assertEquals(false,warrior1.isArrested());
    }

    @Test
    public void shouldTestConstableCharacterCreations(){

        assertEquals("Stephine The Spider",constable1.getName());
        assertEquals("City Of Margate",constable1.getJurisdiction());
        assertEquals(60,constable1.getStrength(), .01);
        assertEquals(100,constable1.getHealth(),.01);
        assertEquals(60,constable1.getStamina(),.01);
        assertEquals(20,constable1.getSpeed(),.01);
        assertEquals(5,constable1.getAttackPower(),0.01);
        assertEquals(false,constable1.isRunning());
        assertEquals(false,constable1.isArrested());
    }

    @Test
    public void shouldTestFarmerCharacterCreations(){

        assertEquals("Chuck",farmer1.getName());
        assertEquals(false,farmer1.isPlowing());
        assertEquals(false,farmer1.isHarvesting());
        assertEquals(75,farmer1.getStrength(), .01);
        assertEquals(100,farmer1.getHealth(),.01);
        assertEquals(75,farmer1.getStamina(),.01);
        assertEquals(10,farmer1.getSpeed(),.01);
        assertEquals(1,farmer1.getAttackPower(),0.01);
        assertEquals(false,farmer1.isRunning());
        assertEquals(false,farmer1.isArrested());
    }

    @Test
    public void ShouldTestCharacterAttackAnotherCharacterAndHealthReduction(){
        assertEquals("Dan The Man attacked Chuck dealing 10.0 points of Damage",warrior1.attackAnotherCharacter(farmer1));
        assertEquals(90,farmer1.getHealth(),.01);
        assertEquals("Chuck attacked Dan The Man dealing 1.0 points of Damage",farmer1.attackAnotherCharacter(warrior1));
        assertEquals(99,warrior1.getHealth(),.01);
        assertEquals("Stephine The Spider attacked Dan The Man dealing 5.0 points of Damage",constable1.attackAnotherCharacter(warrior1));
        assertEquals(94,warrior1.getHealth(),.01);
        assertEquals("Dan The Man attacked Stephine The Spider dealing 10.0 points of Damage",warrior1.attackAnotherCharacter(constable1));
        assertEquals(90,constable1.getHealth(),.01);
    }

    @Test
    public void shouldTestConstableArrestAndReleaseCharacter(){
        assertEquals("Stephine The Spider has arrested Dan The Man for there crimes!",constable1.arrestAnotherCharacter(warrior1));
        assertEquals(true,warrior1.isArrested());
        assertEquals("Stephine The Spider has released Dan The Man from jail!",constable1.releaseAnotherCharacter(warrior1));
        assertEquals(false,warrior1.isArrested());
        assertEquals("Stephine The Spider has arrested Chuck for there crimes!",constable1.arrestAnotherCharacter(farmer1));
        assertEquals(true,farmer1.isArrested());
        assertEquals("Stephine The Spider has released Chuck from jail!",constable1.releaseAnotherCharacter(farmer1));
        assertEquals(false,farmer1.isArrested());
        assertEquals("Stephine The Spider has arrested Stephine The Spider for there crimes!",constable1.arrestAnotherCharacter(constable1));
        assertEquals(true,constable1.isArrested());
        assertEquals("Stephine The Spider has released Stephine The Spider from jail!",constable1.releaseAnotherCharacter(constable1));
        assertEquals(false,constable1.isArrested());
    }

    @Test
    public void shouldTestFarmerPlowing(){
        farmer1.setPlowing(true);
        assertEquals(true,farmer1.isPlowing());
        farmer1.setPlowing(false);
        assertEquals(false,farmer1.isPlowing());
    }

    @Test
    public void shouldTestFarmerHarvesting(){
        farmer1.setHarvesting(true);
        assertEquals(true,farmer1.isHarvesting());
        farmer1.setHarvesting(false);
        assertEquals(false,farmer1.isHarvesting());
    }
}
