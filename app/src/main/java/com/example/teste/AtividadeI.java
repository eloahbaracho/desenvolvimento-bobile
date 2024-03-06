package com.example.teste;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.desenvolvimentoweb.R;

public class AtividadeI extends AppCompatActivity {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);

        EditText editNome = findViewById(R.id.camponome);
        EditText editTel = findViewById(R.id.campotelefone);

        Button buttonSalvar = findViewById(R.id.salvar);
        buttonSalvar.setOnClickListener( e -> {
            Log.i("Agenda_Contato", "Nome " + editNome.getText());
            Log.i("Agenda_Contato", "Telefone" + editTel.getText());
        });



       // TextView texto = new TextView(this);
       // texto.setText("Olá, mundo!");
       // setContentView(texto);

        setContentView(R.layout.principal_layout);
    }
}
