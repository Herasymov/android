package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){
        EditText n1 = (EditText) findViewById(R.id.nameid);
        EditText n2 = (EditText) findViewById(R.id.ageid);
        String name = n1.getText().toString();
        int age = Integer.parseInt(n2.getText().toString());
        Intent intent = new Intent("android.intent.action.ResultActivity");
        intent.putExtra("username", name);
        intent.putExtra("age", age);
        startActivity(intent);
    }
}
