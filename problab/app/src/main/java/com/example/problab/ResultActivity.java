package com.example.problab;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    private TextView tvID;
    private TextView tvFirstName;
    private TextView tvLastName;

    private String firstName;
    private String lastName;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvID = findViewById(R.id.tvID);
        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            id = extras.getInt("id");
            firstName = extras.getString("firstName");
            lastName = extras.getString("lastName");

            tvID.setText(String.valueOf(id));
            tvFirstName.setText(firstName);
            tvLastName.setText(lastName);
        }

    }
}