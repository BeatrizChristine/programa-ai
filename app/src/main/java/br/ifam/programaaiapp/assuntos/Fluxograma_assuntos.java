package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatDelegate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Fluxograma_assuntos extends AppCompatActivity {

    private LinearLayout button_1, button_2;
    private ImageView backbutton;



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_fluxograma_assuntos);
            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);
            button_1 = findViewById(R.id.assunto1);
            button_2 = findViewById(R.id.assunto2);
            backbutton = findViewById(R.id.backbutton);

            backbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            button_1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Fluxograma_assuntos.this, Assuntos_linguagens.class);
                    i.putExtra("nome_assunto", "O que é um Fluxograma?");
                    i.putExtra("texto_assunto", " Fluxograma é um tipo de diagrama, e pode ser entendido como uma representação " +
                            "esquemática de um processo ou algoritmo, muitas vezes feito através de gráficos que " +
                            "ilustram de forma descomplicada a transição de informações entre os elementos que o " +
                            "compõem, ou seja, é a sequência operacional do desenvolvimento de um processo, o qual " +
                            "caracteriza: o trabalho que está sendo realizado, o tempo necessário para sua realização, a " +
                            "distância percorrida pelos documentos, quem está realizando o trabalho e como ele flui " +
                            "entre os participantes deste processo.\n\n" +
                            " O Fluxograma é utilizado em várias áreas para melhorar e comunicar processos complexos " +
                            "por meio de diagramas claros e fáceis de entender.\n\n" +
                            " Na programação podemos usar fluxograma para estudar algoritmos e deixá-los mais fácil de " +
                            "entender e analisar." );
                    startActivity(i);


                }
            });

            button_2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Fluxograma_assuntos.this, Fluxo_assunto_texto.class);
                    startActivity(i);
                }
            });

        }

    }