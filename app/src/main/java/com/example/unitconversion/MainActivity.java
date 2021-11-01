package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    RadioGroup radioGroup;
    RadioButton radioButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = findViewById(R.id.radioGroup);

//        Button resultButton = (Button) findViewById(R.id.ResultButton);
//        TextView resultView = (TextView) findViewById(R.id.ResultText);
//
//        resultButton.setOnClickListener(v -> {
//            resultView.setText("Button is pressed");
//        });
    }
    public void checkButton(View V){
    int radioId = radioGroup.getCheckedRadioButtonId();     //Will give us ID of radio button that we checked
    radioButton = findViewById(radioId);
    }
}