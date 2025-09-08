package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.Html_assuntos;
import br.ifam.programaaiapp.assuntos.Portugol_assuntos;
import br.ifam.programaaiapp.assuntos.Portugol_code_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.fragments.StudyFragment;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class PortugolActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades, respostas, portugol_pseudocode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugol);
        button_back = findViewById(R.id.backbutton);

        assuntos = findViewById(R.id.assuntos_potugol);
        atividades = findViewById(R.id.atividades_portugol);
        respostas = findViewById(R.id.respostas_portugol);
        portugol_pseudocode = findViewById(R.id.portugol_pseudocodigo);

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PortugolActivity.this, Portugol_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PortugolActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Portugol");
                startActivity(i);
            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PortugolActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Portugol");
                startActivity(i);
            }
        });

        portugol_pseudocode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PortugolActivity.this, Portugol_code_assuntos.class);
                startActivity(i);
            }
        });

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}