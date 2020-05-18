package org.example;

import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest 
{

    private static App app;
    private static String name;

    @BeforeClass
    public static void initateApp(){
        String name = "Dante";
        app = new App(name);
    }

    @Test
    public void getMaxValue(){
        assertEquals(10, app.maxValue(5,10));
    }

    @Test
    public void testAssert(){

        //Variable declaration
        String string1="Junit";
        String string2="Junit";
        String string3="test";
        String string4="test";
        String string5=null;
        int variable1=1;
        int	variable2=2;
        int[] arethematicArrary1 = { 1, 2, 3 };
        int[] arethematicArrary2 = { 1, 2, 3 };

        //Assert statements
        assertEquals(string1,string2);
        assertSame(string3, string4);
        assertNotSame(string1, string3);
        assertNotNull(string1);
        assertNull(string5);
        assertTrue(variable1<variable2);
        assertArrayEquals(arethematicArrary1, arethematicArrary2);
    }




    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void oneEqualsTwo(){
        assertEquals("Checking if one equals two", 1,1);
    }
}
