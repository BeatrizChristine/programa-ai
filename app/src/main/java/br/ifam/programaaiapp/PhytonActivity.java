package br.ifam.programaaiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import javax.crypto.Cipher;

import br.ifam.programaaiapp.assuntos.Html_assuntos;
import br.ifam.programaaiapp.assuntos.Phyton_assuntos;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.fragments.StudyFragment;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class PhytonActivity extends AppCompatActivity {

    ImageView button_back;
    Button assuntos, atividades, respostas;
    LinearLayout atvd1, atvd2, atvd3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyton);
        button_back = findViewById(R.id.backbutton);
        respostas = findViewById(R.id.respostas_phyton);
        assuntos = findViewById(R.id.assuntos_phyton);
        atividades = findViewById(R.id.atividades_phyton);

        assuntos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent i = new Intent(PhytonActivity.this, Phyton_assuntos.class);
               startActivity(i);
            }
        });

        atividades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhytonActivity.this, Atividades_linguagens.class);
                i.putExtra("chamadaOrigem", "Phyton");
                startActivity(i);

            }
        });

        respostas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(PhytonActivity.this, Respostas_linguagens.class);
                i.putExtra("respostas", "Phyton");
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
