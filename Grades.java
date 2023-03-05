package com.example.maths;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Grades extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grades);

        TextView chapter1Grade = (TextView) findViewById(R.id.chapter1Grade);
        int grade1=MainActivity.getGrades()[0];

        if(grade1>-1 && grade1<5){
            chapter1Grade.setBackgroundColor(Color.parseColor("#ff0000"));
            chapter1Grade.setText("Κεφάλαιο 1:\n"+grade1+"/10");
        } else if (grade1>=5 && grade1<=10){
            chapter1Grade.setBackgroundColor(Color.parseColor("#00cc66"));
            chapter1Grade.setText("Κεφάλαιο 1:\n"+grade1+"/10");
        }

        TextView chapter2Grade = (TextView) findViewById(R.id.chapter2Grade);
        int grade2=MainActivity.getGrades()[1];

        if(grade2>-1 && grade2<5){
            chapter2Grade.setBackgroundColor(Color.parseColor("#ff0000"));
            chapter2Grade.setText("Κεφάλαιο 2:\n"+grade2+"/10");
        } else if (grade2>=5 && grade2<=10){
            chapter2Grade.setBackgroundColor(Color.parseColor("#00cc66"));
            chapter2Grade.setText("Κεφάλαιο 2:\n"+grade2+"/10");
        }

        TextView chapter3Grade = (TextView) findViewById(R.id.chapter3Grade);
        int grade3=MainActivity.getGrades()[2];

        if(grade3>-1 && grade3<5){
            chapter3Grade.setBackgroundColor(Color.parseColor("#ff0000"));
            chapter3Grade.setText("Κεφάλαιο 3:\n"+grade3+"/10");
        } else if (grade3>=5 && grade3<=10){
            chapter3Grade.setBackgroundColor(Color.parseColor("#00cc66"));
            chapter3Grade.setText("Κεφάλαιο 3:\n"+grade3+"/10");
        }
    }
}