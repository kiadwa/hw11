import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class FriesTest {

    @Test
    public void constructorTest(){
        assertInstanceOf(Fries.class,new Fries());
    }

    @Test
    public void testToString(){
        Fries fries = new Fries();
        assertInstanceOf(String.class, fries.toString());
    }
    @Test
    public void testRaw(){
        Fries fries = new Fries();

        Fries fries1 = new Fries();
        fries1.cook(230,10);

        Fries fries2 = new Fries();
        fries2.cook(200,20);



        Assertions.assertEquals("This is a plate of raw french fries.",fries2.toString());
        Assertions.assertEquals("This is a plate of raw french fries.",fries1.toString());
        Assertions.assertEquals("This is a plate of raw french fries.",fries.toString());

    }


    @Test
    public void testCookedOnce(){
        Fries fries = new Fries();
        fries.cook(231,11);
        Assertions.assertEquals("This is a plate of toasty french fries.",fries.toString());
    }
    @Test
    public void testCookedTwice(){
        Fries Fries = new Fries();
        Fries.cook(250,15);
        Fries.cook(240,20);
        Assertions.assertEquals(  "This is a plate of toasty french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.",Fries.toString());
    }
    @Test
    public void testCookedTwiceOrMore(){
        Fries Fries = new Fries();
        Fries.cook(200,10);
        Fries.cook(235,15);
        Fries.cook(299,19);
        Assertions.assertEquals(  "This is a plate of toasty french fries. They went in the oven twice - now they're double cooked chips and a hipster pub can overcharge you for them.",Fries.toString());
    }
    @Test
    public void testBurnt(){
        Fries Fries = new Fries();
        Fries.cook(350,20);
        Assertions.assertEquals("This is a plate of blackened french fries.",Fries.toString());
    }

}
