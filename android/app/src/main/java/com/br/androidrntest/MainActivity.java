package com.br.androidrntest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        // Set up the intent
        Intent i = new Intent(getApplicationContext(), ReactMainActivity.class);
        // Launch It
        startActivity(i);
    }

}
