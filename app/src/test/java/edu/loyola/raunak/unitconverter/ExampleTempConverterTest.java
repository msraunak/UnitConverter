package edu.loyola.raunak.unitconverter;

import org.junit.Before;
import org.junit.Test;
import java.text.DecimalFormat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * TempConverter Test Case
 *
 * @author M S Raunak
 * @version 1.0 2/12/2019
 */

public class ExampleTempConverterTest {

    private TempConverter tempConv;
    private DecimalFormat decFormat;
    private static final double DELTA = .0001;

    @Before
    public void initialize(){
         tempConv = new TempConverter();
         decFormat = new DecimalFormat("#.##");
    }

    @Test
    public void getTempInC() {
        assertEquals(tempConv.getTempInC(), 0.0, DELTA
        );
    }

    @Test
    public void getFormattedTempInC() {
        String formattedTempInC;
        formattedTempInC = decFormat.format(tempConv.getTempInC());

        assertTrue( formattedTempInC.equals(tempConv.getFormattedTempInC()) );
    }

    @Test
    public void setTempInC() {
        double testValue = 32.0;
        tempConv.setTempInC( testValue );
        assertEquals ( testValue, tempConv.getTempInC(), DELTA );
    }

    @Test
    public void getTempInF() {
        assertEquals ( tempConv.getTempInF(), 32.0, DELTA );
    }

    @Test
    public void getFormattedTempInF() {
        String formattedTempInF;
        formattedTempInF = decFormat.format( tempConv.getTempInF() );
        assertTrue (formattedTempInF.equals(tempConv.getFormattedTempInF()));

    }

    @Test
    public void setTempInF() {
        double testValue = 100.0;
        tempConv.setTempInF(testValue);
        assertEquals (testValue, tempConv.getTempInF(), DELTA);
    }

    // given a Farhenheight value, it should calculate and update the Celcius value
    @Test
    public void updateCelcius() {
        tempConv.setTempInF( 32 );
        tempConv.updateCelcius ();
        assertEquals( 0.0, tempConv.getTempInC(), DELTA );


    }

    @Test
    public void updateFarhenheight() {
        tempConv.setTempInC( 100 );
        tempConv.updateCelcius ();
        assertEquals( 0.0, tempConv.getTempInC(), DELTA );
    }

    @Test
    public void reset() {
    }
}