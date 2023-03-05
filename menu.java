package com.example.maths;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class menu extends AppCompatActivity {

    private Button btnShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);

        Button ch1 = (Button) findViewById(R.id.chapter1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this, chapter1.class));
            }
        });

        Button ch2 = (Button) findViewById(R.id.chapter2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { startActivity(new Intent(menu.this, chapter2.class));
            }
        });

        Button ch3 = (Button) findViewById(R.id.chapter3);
        ch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(menu.this, chapter3.class));
            }
        });

        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialog();
            }
        });
    }

    private void showDialog(){
        Dialog dialog = new Dialog(this, R.style.DialogStyle);
        dialog.setContentView(R.layout.layout_custom_dialog);
        dialog.getWindow().setBackgroundDrawableResource(R.drawable.bg_window);
        Button nextBtn = dialog.findViewById(R.id.nextbtn);

        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                setContentView(R.layout.activity_chapter2);
                dialog.dismiss();
            }
        });

        ImageView btnClose = dialog.findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}
