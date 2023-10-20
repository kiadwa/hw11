import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OvenTest {
    @Test
    public void constructorTest(){
        assertInstanceOf(Oven.class,new Oven());
    }
    @Test
    public void testMaxDefaultMaxTemp(){
        Oven oven = new Oven();
        assertEquals(oven.getMaxTemperature(), 320);

    }
    @Test
    public void testMaxCustomMaxTemp(){
        Oven oven = new Oven(200);
        assertEquals(oven.getMaxTemperature(),200);
    }
    @Test
    public void testZeroCustomMaxTemp(){
        Oven oven = new Oven(0);
        assertDoesNotThrow(oven::getMaxTemperature);
    }
    @Test
    public void testNegativeCustomMaxTemp(){

        assertThrows(IllegalArgumentException.class, ()->new Oven(-1));
    }


    @Test
    public void testIllegalTemp(){
        Oven oven = new Oven();
        assertThrows(IllegalArgumentException.class, ()->oven.setTemperature(-1));
        assertThrows(IllegalArgumentException.class, ()->oven.setTemperature(400));
    }
    @Test
    public void testInputTemp(){
        Oven oven = new Oven();
        oven.setTemperature(100);

        assertEquals(oven.getCurrentTemperature(),212);
    }
    @Test
    public void testInsertFood(){
        Oven oven = new Oven();
        Food food1 = new Potato();
        Food food2 = null;

        assertThrows(IllegalArgumentException.class, ()->oven.insertFood(food1,-1));
        assertThrows(IllegalArgumentException.class, ()->oven.insertFood(food2,15));
        assertThrows(IllegalArgumentException.class,()->oven.insertFood(food2,-1));
        assertDoesNotThrow(()->oven.insertFood(food1,15));
    }

}
