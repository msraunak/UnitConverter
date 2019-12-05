package edu.loyola.raunak.unitconverter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest2 {

    private TempConverter tempConv;
    private static double DELTA = .0001;
    @Before
    public void setUp() throws Exception {
        tempConv = new TempConverter();
    }

    @After
    public void tearDown() throws Exception {
        tempConv = null;
    }

    @Test
    public void foo(){
        fail();
    }

    @Test
    public void updateCelcius() {
        tempConv.setTempInF(77.0);
        tempConv.updateCelcius();
        assertEquals( 25.0, tempConv.getTempInC(), DELTA );
    }
    @Test
    public void updateFarhenheight() {
        tempConv.setTempInC(25.0);
        tempConv.updateFarhenheight();
        assertEquals( 77.0, tempConv.getTempInF(), DELTA );
    }
}