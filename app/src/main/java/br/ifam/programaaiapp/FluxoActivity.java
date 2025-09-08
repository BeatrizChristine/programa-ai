package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.Fluxograma_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.resp.Respostas_linguagens;


public class FluxoActivity extends AppCompatActivity  {

    ImageView button_back;
    Button assuntos, atividades, respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxo);
        button_back = findViewById(R.id.backbutton);
        assuntos = findViewById(R.id.assunto_fluxo);
        atividades = findViewById(R.id.atividade_fluxo);
        respostas = findViewById(R.id.respostas_fluxo);

        button_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FluxoActivity.this, Fluxograma_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FluxoActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Fluxo");
                startActivity(i);
            }
        });


        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(FluxoActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Fluxo");
                startActivity(i);
            }
        });
    }

}
