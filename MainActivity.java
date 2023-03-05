package com.example.maths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    private static int[] grades = {-1,-1,-1};

    public static void setGrades(int pos, int grade){
        grades[pos]=grade;
    }

    public static int[] getGrades(){
        return grades;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, Intro.class));
            }
        });
    }
}