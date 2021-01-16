package com.example.log;

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


    public void Click(View view) { //Переход на экран MobileDark_2
        Intent intent=new Intent(this,MobileDark_2.class);
        startActivity(intent);
    }
}