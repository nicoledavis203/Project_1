package tests;
import adventure_game.Character;
import adventure_game.Player;
import adventure_game.items.HealingPotion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import adventure_game.*;
import java.util.Random;

public class HealingPotionTests {

    @BeforeEach

    void setup(){
        c = new Player("Hero", 100, 9, 7);
    }
    
    }

    @Test

    void testHealingPotion(){
        Consumable potion =  new HealingPotion();
        c.obtain = new HealingPotion;


        // TO-DO - help
        // Implement this
    }
}
