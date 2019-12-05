package edu.loyola.raunak.unitconverter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TempConverterTest {

    TempConverter tempConverter;

    @Before
    public void beforeTest(){
        tempConverter = new TempConverter();
    }

    @Test
    public void updateCelcius() {

        assertNotNull(tempConverter);
        tempConverter.setTempInF( 61 );
        tempConverter.updateCelcius();
        assertEquals( 16, tempConverter.getTempInC(), .001);
    }

    @Test
    public void updateFarhenheight() {
    }
}