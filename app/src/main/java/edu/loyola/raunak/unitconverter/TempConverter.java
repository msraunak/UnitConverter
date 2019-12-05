package edu.loyola.raunak.unitconverter;

import java.text.DecimalFormat;

/**
 * Model for Temperature unit conversion
 * @author M S Raunak
 * @version 1.0 8/29/2019
 */
public class TempConverter {

    /** Temperature in Celcius*/
    private double tempInC;
    /** Temperature in Farhenheight */
    private double tempInF;

    private DecimalFormat df;

    /**
     * Default Constructor
     */
    public TempConverter (){
        this.tempInC = 0.0;
        this.tempInF = 32.0;
        df = new DecimalFormat ("#.##"); // Format values up to two decimal places
    }

    /**
     * parameterized constructur
     * @param celc the temperature value in Celcius
     */
    public TempConverter (double celc){
        this.tempInC = celc;
        this.updateFarhenheight(); // update the tempInFarh using the given temp in Celc
        df = new DecimalFormat ( "#.##");
    }


    public double getTempInC() {
        return tempInC;
    }

    public String getFormattedTempInC(){
        return df.format( tempInC );
    }

    public void setTempInC(double newTempInC) {
        this.tempInC = newTempInC;
    }

    public double getTempInF() {
        return tempInF;
    }

    public String getFormattedTempInF() {
        return df.format(tempInF);
    }

    public void setTempInF(double newTempInF) {
        this.tempInF = newTempInF;
    }

    /**
     * Update the Celcius value based on the current Farhenheight value
     */
    public void updateCelcius(){
        tempInC = ( (tempInF - 32)/9 ) * 5;
    }

    /** Update the Farhenheight value based on the current Celcius value*/
    public void updateFarhenheight(){
        tempInF = ( (tempInC / 5.0 ) * 9.0 ) + 32;
    }

    public void reset(){
        tempInF = 32.0;
        tempInC = 0.0;
    }

}
