import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class PotatoTest {
    @Test
    public void constructorTest(){
        assertInstanceOf(Potato.class,new Potato());
    }
    @Test
    public void testToString(){
        Potato potato = new Potato();
        assertInstanceOf(String.class, potato.toString());
    }
    @Test
    public void testRaw(){
        Potato potato = new Potato();

        Potato potato1 = new Potato();
        potato1.cook(180,30);

        Potato potato2 = new Potato();
        potato2.cook(170,20);



        assertEquals("This is a raw potato.",potato2.toString());
        assertEquals("This is a raw potato.",potato1.toString());
        assertEquals("This is a raw potato.",potato.toString());

    }


    @Test
    public void testCookedOnce(){
        Potato potato = new Potato();
        potato.cook(190,32);
        assertEquals("This is a baked potato.",potato.toString());
    }
    @Test
    public void testCookedTwice(){
        Potato potato = new Potato();
        potato.cook(200,35);
        potato.cook(200,35);
        assertEquals( "This is a baked potato. It went in the oven twice for some reason. Perhaps the chef is new.",potato.toString());
    }
    @Test
    public void testCookedTwiceOrMore(){
        Potato potato = new Potato();
        potato.cook(190,35);
        potato.cook(190,35);
        potato.cook(190,35);
        assertEquals( "This is a baked potato. It went in the oven twice for some reason. Perhaps the chef is new.",potato.toString());
    }
    @Test
    public void testBurnt(){
        Potato potato = new Potato();
        potato.cook(270,50);
        assertEquals("This is a burnt potato.",potato.toString());
    }


}
