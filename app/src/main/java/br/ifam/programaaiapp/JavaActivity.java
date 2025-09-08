package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import br.ifam.programaaiapp.assuntos.Html_assuntos;
import br.ifam.programaaiapp.assuntos.JavaScript_assuntos;
import br.ifam.programaaiapp.assuntos.Java_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.fragments.StudyFragment;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class JavaActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades, respostas, script;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        button_back = findViewById(R.id.backbutton);
        assuntos = findViewById(R.id.assuntos_java);
        atividades = findViewById(R.id.atividades_java);
        respostas = findViewById(R.id.respostas_java);
        script = findViewById(R.id.javascript);

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaActivity.this, Java_assuntos.class);
                startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Java");
                startActivity(i);
            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Java");
                startActivity(i);
            }
        });

        script.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaActivity.this, JavaScript_assuntos.class);
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