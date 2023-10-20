import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class KitchenTest {
    String rawPotato = "This is a raw potato.";
    String cookedOncePotato = "This is a baked potato.";

    String cookedTwiceOrMorePotato = "This is a baked potato. It went in the oven twice for some reason. Perhaps the chef is new.";
    String burntPotato = "This is a burnt potato.";

    String rawFries = "This is a plate of raw french fries.";
    String cookFries = "This is a plate of toasty french fries.";
    String cookedTwiceFries = "This is a plate of toasty french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.";
    String burntFries = "This is a plate of blackened french fries.";
    @Test
    public void testConstructor(){
        assertInstanceOf(Kitchen.class, new Kitchen());
    }
    @Test
    public void testCookPotato(){
        Kitchen kitchen = new Kitchen();
        assertEquals(cookedOncePotato, kitchen.cookPotato());
    }
    @Test
    public void testBurnPotato(){
        Kitchen kitchen = new Kitchen();
        assertEquals(burntPotato, kitchen.burnPotato());
    }
    @Test
    public void testDoubleCookedPotato(){
        Kitchen kitchen = new Kitchen();
        assertEquals(cookedTwiceOrMorePotato, kitchen.doubleCookPotato());
    }
    @Test
    public void testCookFries(){
        Kitchen kitchen = new Kitchen();
        assertEquals(cookFries,kitchen.cookFries());
    }
    @Test
    public void testDoubleCookedFries(){
        Kitchen kitchen = new Kitchen();
        assertEquals(cookedTwiceFries, kitchen.doubleCookFries());
    }
    @Test void testBurntFries(){
        Kitchen kitchen = new Kitchen();
        assertEquals(burntFries, kitchen.burnFries());
    }
}
