package br.ifam.programaaiapp.resp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Fluxo_respostas3 extends AppCompatActivity {

    private ImageView backbutton;
    private TextView resposta1, resposta3, resposta4, resposta5,
                    resposta6, resposta7, resposta8, resposta9, resposta10;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxo_respostas3);
        backbutton = findViewById(R.id.backbutton);

        resposta1 = findViewById(R.id.respostas_atvd);
        resposta3 = findViewById(R.id.respostas_atvd2);
        resposta4 = findViewById(R.id.respostas_atvd3);
        resposta5 = findViewById(R.id.respostas_atvd4);
        resposta6 = findViewById(R.id.respostas_atvd5);
        resposta7 = findViewById(R.id.respostas_atvd6);
        resposta8 = findViewById(R.id.respostas_atvd7);
        resposta9 = findViewById(R.id.respostas_atvd8);
        resposta10 = findViewById(R.id.respostas_atvd9);


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resposta1.setText("Questão 1:\n"+
                "Tomada de decisão acontece quando temos uma pergunta que normalmente pode ser " +
                "VERDADEIRO ou FALSO/SIM ou NÃO.\n\n\n"+
                "Questão 2:");

        resposta3.setText("Questão 3: ");
        resposta4.setText("Questão 4: ");
        resposta5.setText("Questão 5: ");
        resposta6.setText("Questão 6: ");
        resposta7.setText("Questão 7: ");
        resposta8.setText("Questão 8: ");
        resposta9.setText("Questão 9: ");
        resposta10.setText("Questão 10: ");

    }
}