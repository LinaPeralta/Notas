package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button grisBtn;
    private Button azulBtn;
    private Button blancoBtn;

    private ConstraintLayout backLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backLayout =  findViewById(R.id.backLayout);



        SharedPreferences sp = getSharedPreferences("grades_app", MODE_PRIVATE);

        grisBtn = findViewById(R.id.grisBtn);
        grisBtn.setOnClickListener((view)->{
            sp.edit().putString("color","C4C4C4").apply();
            finish();
        });

        blancoBtn = findViewById(R.id.blancoBtn);
        blancoBtn.setOnClickListener((view)->{
            sp.edit().putString("color","F3F2FA").apply();
            finish();
        });

        azulBtn = findViewById(R.id.azulBtn);
        azulBtn.setOnClickListener((view)->{
            sp.edit().putString("color","DAEBEF").apply();
            finish();
        });


        grisBtn.setOnClickListener(
                (view) -> {
                    //accion
                   // String username = loginUsername.getText().toString();
                    //String password = loginPassword.getText().toString();
                    Intent i = new Intent( this, NameActivity.class);
                    startActivity(i);
                    overridePendingTransition(R.anim.animacion1,R.anim.animacion2);

                }
        );

    }
    protected void onResume() {

        super.onResume();

        SharedPreferences sp = getSharedPreferences("grades_app",MODE_PRIVATE);
        String color = sp.getString( "color", "#FFFFFF");

        backLayout.setBackgroundColor(Color.parseColor(color));
    }
}