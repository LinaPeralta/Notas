package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private Button againBtn;
    private TextView notaText, nameText;
    private String username;
    private double notaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        againBtn =  findViewById(R.id.againBtn);
        notaText = findViewById(R.id.notaText);
        nameText = findViewById(R.id.nameText);

//llamar variables de otras actividades
        username = getIntent().getExtras().getString("nombre");
        notaFinal = getIntent().getExtras().getDouble("notaFinal");

        Log.d("actualNota2", String.valueOf(notaFinal));
        //imprimir en pantalla
        nameText.setText("Hola, " + username + " tu nota final es:");
        notaText.setText(""+notaFinal);

       // Log.d("actualNota2", String.valueOf(notaFinal));

//boton patra calcular de nuevo
        againBtn.setOnClickListener(
                (view) -> {

                    Intent nameIntent = new Intent(this,NameActivity.class);
                    startActivity(nameIntent);
                    overridePendingTransition(R.anim.animacion1,R.anim.animacion2);
                }
        );

    }

}