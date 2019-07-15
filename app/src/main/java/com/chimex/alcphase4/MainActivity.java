package com.chimex.alcphase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void aboutAlcFunction(View view) {
        intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }

    public void profileFunction(View view) {
        intent = new Intent(MainActivity.this, ProfileActivity.class);
        startActivity(intent);
    }
}
