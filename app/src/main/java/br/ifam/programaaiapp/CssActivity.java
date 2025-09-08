package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.Css_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.fragments.StudyFragment;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class CssActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades,respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css);
        button_back = findViewById(R.id.backbutton);

        assuntos = findViewById(R.id.assuntos_css);
        atividades = findViewById(R.id.atividades_css);
        respostas = findViewById(R.id.respotas_css);


        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CssActivity.this, Css_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CssActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Css");
                startActivity(i);
            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(CssActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Css");
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