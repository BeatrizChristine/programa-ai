package br.ifam.programaaiapp.resp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Respostas_textos extends AppCompatActivity {

    ImageView backbutton;
    TextView resposta_num_atvd, resposta_atvd, num_respostas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostas_texto);

        backbutton = findViewById(R.id.backbutton);
        resposta_num_atvd = findViewById(R.id.respostas_num_atvd);
        resposta_atvd = findViewById(R.id.respostas_atvd);
        num_respostas = findViewById(R.id.num_respostas);


        String respostaNum = getIntent().getStringExtra("resposta_num_atvd");
        String respostaAtvd = getIntent().getStringExtra("resposta_atvd");
        String numRespostas = getIntent().getStringExtra("num_respostas");

        resposta_num_atvd.setText(respostaNum);
        resposta_atvd.setText(respostaAtvd);
        num_respostas.setText(numRespostas);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}