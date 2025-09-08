package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.C_assuntos;
import br.ifam.programaaiapp.assuntos.Css_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.fragments.StudyFragment;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class CSharpActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades, respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_csharp);
        button_back = findViewById(R.id.backbutton);

        assuntos = findViewById(R.id.assuntos_c);
        atividades = findViewById(R.id.atividade_c);
        respostas = findViewById(R.id.respostas_c);

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CSharpActivity.this, C_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CSharpActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Csharp");
                startActivity(i);
            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CSharpActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Csharp");
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