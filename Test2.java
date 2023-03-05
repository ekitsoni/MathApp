package com.example.maths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Test2 extends AppCompatActivity {

    int grade=0;
    String[] question1 = {"Απάντηση","75","4","0,25"};
    String[] question2 = {"Απάντηση","9,95","0,95","9"};
    String[] question3 = {"Απάντηση","0,9","10,51","61,85"};
    String[] question4 = {"Απάντηση","0,8","11,5","5,25"};
    String[] question5 = {"Απάντηση","3/2","20/12","1/2"};
    String[] question6 = {"Απάντηση","60","40","5"};
    String[] question7 = {"Απάντηση","1","0","2"};
    String[] question8 = {"Απάντηση","-0,1","1","0,5"};
    String[] question9 = {"Απάντηση","150","5","100"};
    String[] question10 = {"Απάντηση","25","0,25","7,5"};

    String[] answers = {"4", "9,95", "61,85", "11,5", "20/12", "5", "1", "-0,1", "5", "25"};
    Spinner q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test2);

        q1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question1);
        q1.setAdapter(adapter1);

        q2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question2);
        q2.setAdapter(adapter2);

        q3 = findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question3);
        q3.setAdapter(adapter3);

        q4 = findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question4);
        q4.setAdapter(adapter4);

        q5 = findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question5);
        q5.setAdapter(adapter5);

        q6 = findViewById(R.id.spinner6);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question6);
        q6.setAdapter(adapter6);

        q7 = findViewById(R.id.spinner7);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question7);
        q7.setAdapter(adapter7);

        q8 = findViewById(R.id.spinner8);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question8);
        q8.setAdapter(adapter8);

        q9 = findViewById(R.id.spinner9);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question9);
        q9.setAdapter(adapter9);

        q10 = findViewById(R.id.spinner10);
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, question10);
        q10.setAdapter(adapter10);

        Button endBtn = (Button) findViewById(R.id.end);
        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answers[0].equals(q1.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[1].equals(q2.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[2].equals(q3.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[3].equals(q4.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[4].equals(q5.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[5].equals(q6.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[6].equals(q7.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[7].equals(q8.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[8].equals(q9.getSelectedItem().toString())) {
                    grade++;
                }
                if (answers[9].equals(q10.getSelectedItem().toString())) {
                    grade++;
                }
                MainActivity.setGrades(1, grade);
                startActivity(new Intent(Test2.this, Grades.class));
            }
        });
    }
}