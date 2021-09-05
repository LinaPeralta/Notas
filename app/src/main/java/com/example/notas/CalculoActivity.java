package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CalculoActivity extends AppCompatActivity {

    private Button calculoBtn;
    private EditText proyecto1Text;
    private EditText proyecto2Text;
    private EditText quicesText;
    private EditText parcial1Text;
    private EditText parcial2Text;
    private String username;



    private double proyecto1a,  proyecto2a, quices, parcial1a, parcial2a;
    private double notaFinal;
    private boolean enviar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        calculoBtn =  findViewById(R.id.calcularBtn);
        proyecto1Text =  findViewById(R.id.proyecto1);
        proyecto2Text =  findViewById(R.id.proyecto2);
        quicesText =  findViewById(R.id.quicesBtn);
        parcial1Text =  findViewById(R.id.parcial1);
        parcial2Text =  findViewById(R.id.parcial2);


        //nombre del usuario
        username = getIntent().getExtras().getString("nombre");
       // notaFinal = getIntent().getExtras().getInt("notaFinal");


        calculoBtn.setOnClickListener((view)->{
                    try {

                        proyecto1a = Double.parseDouble(proyecto1Text.getText().toString());
                        proyecto2a = Double.parseDouble(proyecto2Text.getText().toString());
                        quices = Double.parseDouble(quicesText.getText().toString());
                        parcial1a = Double.parseDouble(parcial1Text.getText().toString());
                        parcial2a = Double.parseDouble(parcial2Text.getText().toString());

                        enviar = true;

                    } catch (NumberFormatException e) {
                       // Toast.makeText(this, "Por favor escribe números", Toast.LENGTH_SHORT).show();
                        enviar = false;

                    }

                  //calcular la nota final


                    notaFinal = ((proyecto1a*0.15) + (proyecto2a*0.15) + (quices*0.10) + (parcial1a*0.30 ) + (parcial2a*0.30));

                    if (enviar == true){
                        //Intent
                        Intent resultadoActivity = new Intent(this, ResultadoActivity.class);
                        resultadoActivity.putExtra("notaFinal",notaFinal);
                        resultadoActivity.putExtra("nombre", username);
                        startActivity(resultadoActivity);
                        Log.d("actualNota", String.valueOf(notaFinal));
                        finish();
                    }

                }
                );









    }
}