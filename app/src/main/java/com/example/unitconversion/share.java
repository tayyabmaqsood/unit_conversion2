package com.example.unitconversion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class share extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        textView = findViewById(R.id.textView);
        if (message.equals("TextView")){
            message = "No Value Found";
        }
        textView.setText(message);
    }

    public void closeActivity(View view) {
        finish();
    }

    public void shareOnSocialMedia(View view) {
        Intent shareIntent = new Intent(Intent.ACTION_SEND);
        shareIntent.setType("text/plain");
        String shareBody = textView.getText().toString();
        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Share From Android app");
        shareIntent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(shareIntent,"Share using"));
    }
}