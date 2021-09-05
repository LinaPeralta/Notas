package com.example.notas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class ResultadoActivity extends AppCompatActivity {

    private Button againBtn;
    private TextView notaText, nameText;
    private String nombre;
    private String nota,username;
    private String notaFinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        againBtn =  findViewById(R.id.againBtn);
        notaText = findViewById(R.id.notaText);
        nameText = findViewById(R.id.nameText);

//llamar variables de otras actividades
        username = getIntent().getExtras().getString("nombre");
        notaFinal = getIntent().getExtras().getString("notaFinal");


        nameText.setText("Hola, " + username + ".\n Tu nota final es de:");
        notaText.setText(notaFinal);


        againBtn.setOnClickListener(
                (view) -> {

                    Intent nameIntent = new Intent(this,NameActivity.class);
                    startActivity(nameIntent);
                }
        );

    }
}