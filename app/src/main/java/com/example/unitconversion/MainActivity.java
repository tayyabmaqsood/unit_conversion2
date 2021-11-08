package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.unitConversion.MESSAGE";
    RadioGroup radioGroup;
    RadioButton radioButton;
    TextView inputText,resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);
        inputText = findViewById(R.id.InputNumberText);
        resultText = findViewById(R.id.ResultText);

    }
    public void checkButton(View V){
        int radioId = radioGroup.getCheckedRadioButtonId();     //Will give us ID of radio button that we checked
        radioButton = (RadioButton) findViewById(radioId);
    }

    public void calculate(View V){
        if (radioButton != null) {
            if (radioButton.getText().toString().equals("Kilo to Pound Convertor") && inputText.getText().toString().length() != 0) {
                Double result = Double.parseDouble(inputText.getText().toString()) * 2.20462;
                resultText.setText(result.toString() + " Pounds");
            }
            else if (radioButton.getText().toString().equals( "Pound to Kilo Convertor") && inputText.getText().toString().length() != 0)
            {
                Double result = Double.parseDouble(inputText.getText().toString()) / 0.454;
                resultText.setText(result.toString() + " Kilos");
            }
            else
                resultText.setText("Please make sure you enter provide input");

        }
        else
            resultText.setText("Please make sure you select convertor option");
    }

    public void shareResult(View view) {
        //Proceed to new activity
        //Create intent to start new activity
        Intent intent = new Intent(this, share.class);
        String message = resultText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }


}