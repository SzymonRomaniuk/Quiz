package com.example.szymon.quiz;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void Start(View v){

        Context context;
        context = getApplicationContext();
        Intent intent = new Intent(context,Quiz.class);
        startActivity(intent);
    }

}
