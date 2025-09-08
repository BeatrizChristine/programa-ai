package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.Fluxograma_assuntos;
import br.ifam.programaaiapp.assuntos.Html_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class HtmlActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades, respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html);
        button_back = findViewById(R.id.backbutton);
        assuntos = findViewById(R.id.assuntos_html);
        atividades = findViewById(R.id.atividades_html);
        respostas = findViewById(R.id.respostas_html);

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HtmlActivity.this, Html_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HtmlActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Html");
                startActivity(i);
            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(HtmlActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Html");
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