package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        String user = getIntent().getExtras().getString("username");
        int age = getIntent().getExtras().getInt("age");

        TextView infoTextView = (TextView)findViewById(R.id.textView);
        if (age>=18) {
            infoTextView.setText("Hello "+user);
        }
        else {
            infoTextView.setText("You are too young!");
        }
    }
}
