package tests;

import static org.junit.jupiter.api.Assertions.*;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

import adventure_game.Character;
import adventure_game.Player;
import adventure_game.items.Consumable;
import adventure_game.items.HealingPotion;

import org.junit.jupiter.api.BeforeEach;

public class CharacterTests{

    private Character c;
    @BeforeEach
    void setup(){
        c = new Player("Hero", 100, 9, 7);
    }


    // Test whether the health is modified given the ModifyHealth method, in this example, if the health is modified to be 10 less than the initialized value of 100, make sure it is 90

    @Test
    void testModifyHealth(){
        assertTrue(c.getHealth() == 100);
        c.modifyHealth(-10);
        assertTrue(c.getHealth() == 90);
    }
}
    @Test

    void testAttack() {
        // Create a test character with dummy atributes and set values to 1
        Character c2 = new Player("TestPlayer", 1 , 1 , 1) {
            if (!c2.isInvincible()) {
                assertTrue(c2.getHealth() == 1);
                c.attack(c2);
                assertTrue(c2.getHealth() == 0);
                // character was killed successfully
                assertTrue(c2.isAlive() == False)

            }
            
        };
    }

    @Test //Allows user to test whether the defend method works

    void testDefend() {
        Game.rand.setSeed(1);
        c.defend(c);
        assertTrue(c.isInvincible() == true);

    }

    // Test IsVulnerable method by asserting that the character is not vulnerable
    @Test 

    void testIsVulnerable() {
        assertTrue(c.IsVulnerable() == false);

    }

    // Test if the user is able to set the amount of turns that the player is vulnerable, in this case, 3 
    @Test 

    void testSetAsVulnerable() {
        c.setAsVulnerable(3);
        assertTrue(c.isVulnerable() == true);

    }

    // Test if the user, once setting the amount of turns the character is vulnerable, is able to decrease the amount of turns as the turns go by
    @Test

    void testDecreaseTurnsVulnerable() {
        c.setAsVulnerable(1);
        c.decreaseTurnsVulnerable();
        assertTrue(c.isVulnerable() == false);
    }

    // Test whether the character is invisible, given the number of turns, so if the numTurns value is 0, the character is not Invincible, so make sure that they are not Invincible and vise versa.
    @Test testIsInvincible() {
        c.setAsInvincible(0);
        assertTrue(c.isInvincible() == false);
        c.setAsInvincible(3);
        assertTrue(c.isInvincible() == true);

    }

    // Similar to testDecreaseTurnsVulnerable, just with Invincible now
    @Test 

    void testDecreaseTurnsInvincible() {
        c.setAsInvincible(1);
        c.decreaseTurnsInvincible();
        assertTrue(c.isInvincible() == false);

    }


    // Tests whether the character is stunned, given the amount of turns of the player is greater than 0. 
    @Test

    void testIsStunned() {
        c.setAsStunned(2);
        assertTrue(c.isStunned() == true);
        c.setAsStunned(0);
        assertTrue(c.isStunned == false);

    }

    // As the turns go by, tests if the turns the character is stunned decreases
    @Test

    void testDecreaseTurnsStunned() {
        c.setAsStunned(1);
        assertTrue(c.isStunned() == true);
        c.decreaseTurnsStunned();
        assertTrue(c.isStunned() == false);

    }

    // Tests whether you are able to set the buff number to a certain integer, for example 8. 
    @Test

    void testSetTempDamageBuff() {
        c.setTempDamageBuff(8);
        assertTrue(c.getTempDamageBuff() == 10);
    }

    // Tests whether it is displayed that if the character obtains a new healing potion, it is displayed they have it in their inventory, or "hasItems"

    @Test

    void testObtain() {
        Consumable potion = new HealingPotion();
        c.obtain(potion);
        assertTrue(c.hasItems() == true);
    }

    // Tests if the character is able to use an obtained healing potion and it affects their level of health, and if it leaves their inventory after use

    @Test

    void testUseItem() {
        Consumable potion = new HealingPotion();
        c.obtain(potion);
        Character c2 = new Player("TestPlayer", 1, 1, 1);
        c.useItem(c, c2);
        assertTrue(c.hasItems() == false);
    }

    // Test if the character has a HealingPotion, given that it is obtained

    @Test

    void testHasItems(); {
        Consumable potion =  new HealingPotion();
        c.obtain(potion);
        assertTrue(c.hasItems() == True);

    }





