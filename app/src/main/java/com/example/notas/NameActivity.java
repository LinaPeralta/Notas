package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class NameActivity extends AppCompatActivity {

    private Button continuarBtn;
    private Button backBtn;
    private EditText nombreText;

    private ConstraintLayout backLayout;
    private Object MainActivity;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);


        backLayout = findViewById(R.id.backLayout);

        continuarBtn =  findViewById(R.id.continuarBtn);
        backBtn =  findViewById(R.id.backBtn);
        nombreText=  findViewById(R.id.nombreText);


//botones
        backBtn.setOnClickListener((view)->{
            Intent mainIntent = new Intent(this,MainActivity.class);
            startActivity(mainIntent);
           //; overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
        });

        continuarBtn.setOnClickListener((view) -> {
                    //accion
                   String username = nombreText.getText().toString();

                    Intent calculoActivity = new Intent( this, CalculoActivity.class);
                    calculoActivity.putExtra("nombre", username);

                    startActivity(calculoActivity);
                    nombreText.getText().clear();


                   // overridePendingTransition(R.anim.animacion1,R.anim.animacion2);

                }
        );
    }

  /*  protected void onResume() {

        super.onResume();

        SharedPreferences sp = getSharedPreferences("grades_app",MODE_PRIVATE);
        String color = sp.getString( "color", "#FFFFFF");

        backLayout.setBackgroundColor(Color.parseColor(color));
    }

   */
}
