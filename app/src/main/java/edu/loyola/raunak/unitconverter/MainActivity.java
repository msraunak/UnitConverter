package edu.loyola.raunak.unitconverter;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TempConverter tempConvModel;
    public static String MA="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tempConvModel = new TempConverter();
    }

    /**
     * Called on the FtoC button is clicked
     * @param view the current view
     */
    public void onClickFtoC(View view){

        EditText etFarh = ( EditText )findViewById( R.id.editTextFarh);
        double newFarhVal;
        try {
            newFarhVal = Double.parseDouble( etFarh.getText().toString() );
            tempConvModel.setTempInF( newFarhVal );
            tempConvModel.updateCelcius();

            EditText etCelc = (EditText) findViewById (R.id.editTextCelc);
            etCelc.setText( tempConvModel.getFormattedTempInC() );
        } catch (NumberFormatException nfe){
            Log.w(MA, "Non numeric value in farhenheight text ");
        }
    }

    /**
     * Called on the Celc to Farh button is clicked
     * @param view the current view
     */
    public void onClickCtoF(View view){

        EditText etCelc = ( EditText )findViewById( R.id.editTextCelc);
        double newCelcVal;
        try {
            newCelcVal = Double.parseDouble( etCelc.getText().toString() );
            tempConvModel.setTempInC( newCelcVal );
            tempConvModel.updateFarhenheight();

            EditText etFarh = (EditText) findViewById (R.id.editTextFarh);
            etFarh.setText( tempConvModel.getFormattedTempInF() );
        } catch (NumberFormatException nfe){
            Log.w(MA, "Non numeric value in celcius text ");
        }
    }

    /**
     * When the reset button is clicked in the MainActivity Window
     * @param view the current View
     */
    public void onClickReset(View view){
        tempConvModel.reset();
        ((EditText) findViewById( R.id.editTextFarh)).setText( tempConvModel.getFormattedTempInF() );
        ((EditText) findViewById( R.id.editTextCelc)).setText( tempConvModel.getFormattedTempInC() );
    }

    /**
     * When the exit app button is clicked
     * @param view
     */
    public void onClickExit(View view) {
        finishAffinity();
        finishAndRemoveTask();
    }
}
