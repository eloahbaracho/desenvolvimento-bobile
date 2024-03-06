package com.example.teste;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class AtividadeI extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        TextView texto = new TextView(this);
        texto.setText("Olá, mundo!");
        setContentView(texto);
    }
}
