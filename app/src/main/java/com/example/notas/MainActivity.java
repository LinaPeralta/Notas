package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button grisBtn;
    private Button azulBtn;
    private Button blancoBtn;
    private Button contBtn;

    private ConstraintLayout backLayout1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        backLayout1 =  findViewById(R.id.backLayout);
        contBtn = findViewById(R.id.contBtn);


        SharedPreferences sp = getSharedPreferences("grades_app", MODE_PRIVATE);

        grisBtn = findViewById(R.id.grisBtn);
        grisBtn.setOnClickListener((view)->{
            sp.edit().putString("color","#C4C4C4").apply();
            //finish();
            Intent nameIntent = new Intent(this,NameActivity.class);
            startActivity(nameIntent);
        });

        blancoBtn = findViewById(R.id.blancoBtn);
        blancoBtn.setOnClickListener((view)->{
            sp.edit().putString("color","#F3F2FA").apply();
           // finish();
            Intent nameIntent = new Intent(this,NameActivity.class);
            startActivity(nameIntent);
        });

        azulBtn = findViewById(R.id.azulBtn);
        azulBtn.setOnClickListener((view)->{
            sp.edit().putString("color","#DAEBEF").apply();
            //finish();
            Intent nameIntent = new Intent(this,NameActivity.class);
            startActivity(nameIntent);
        });


        contBtn.setOnClickListener((view)->{
            Intent nameIntent = new Intent(this,NameActivity.class);
            startActivity(nameIntent);

            overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });
        

    }



   /*protected void onResume() {

        super.onResume();

        //CAMBIAR EL COLOR DE FONDO
        SharedPreferences sp = getSharedPreferences("grades_app",MODE_PRIVATE);
        String color = sp.getString( "color", "#FFFFFF");

        Log.d("colorActual",color);

        backLayout1.setBackgroundColor(Color.parseColor(color));


    }

    */





}