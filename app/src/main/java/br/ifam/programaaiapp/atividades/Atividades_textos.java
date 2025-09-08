package br.ifam.programaaiapp.atividades;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Atividades_textos extends AppCompatActivity {

    ImageView backbutton;
    TextView lista_num, lista_atvd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_textos);

        backbutton = findViewById(R.id.backbutton);
        lista_num = findViewById(R.id.lista_num);
        lista_atvd = findViewById(R.id.lista_atvd);

        String listaNum = getIntent().getStringExtra("lista_num");
        String listaAtvd = getIntent().getStringExtra("lista_atvd");

        lista_num.setText(listaNum);
        lista_atvd.setText(listaAtvd);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}