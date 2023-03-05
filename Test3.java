package com.example.maths;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Test3 extends AppCompatActivity {

    int grade=0;
    String[] questionsSL = {"Απάντηση","Σωστό","Λάθος"};
    String[] answers = {"Λάθος", "Σωστό", "Σωστό", "Λάθος", "Λάθος", "Σωστό", "Λάθος", "Λάθος", "Λάθος", "Σωστό"};
    Spinner q1,q2,q3,q4,q5,q6,q7,q8,q9,q10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test3);

        q1 = findViewById(R.id.spinner1);
        ArrayAdapter<String> adapter1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q1.setAdapter(adapter1);

        q2 = findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q2.setAdapter(adapter2);

        q3 = findViewById(R.id.spinner3);
        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q3.setAdapter(adapter3);

        q4 = findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q4.setAdapter(adapter4);

        q5 = findViewById(R.id.spinner5);
        ArrayAdapter<String> adapter5 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q5.setAdapter(adapter5);

        q6 = findViewById(R.id.spinner6);
        ArrayAdapter<String> adapter6 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q6.setAdapter(adapter6);

        q7 = findViewById(R.id.spinner7);
        ArrayAdapter<String> adapter7 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q7.setAdapter(adapter7);

        q8 = findViewById(R.id.spinner8);
        ArrayAdapter<String> adapter8 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q8.setAdapter(adapter8);

        q9 = findViewById(R.id.spinner9);
        ArrayAdapter<String> adapter9 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
        q9.setAdapter(adapter9);

        q10 = findViewById(R.id.spinner10);
        ArrayAdapter<String> adapter10 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, questionsSL);
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
                MainActivity.setGrades(2, grade);
                startActivity(new Intent(Test3.this, Grades.class));
            }
        });
    }
}