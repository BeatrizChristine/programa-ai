package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Assuntos_linguagens extends AppCompatActivity {

    TextView nome_assunto, texto_assunto;
    ImageView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assuntos_linguagens);

        buttonback = findViewById(R.id.backbutton);
        nome_assunto = findViewById(R.id.nome_assunto);
        texto_assunto = findViewById(R.id.texto_assunto);
        //tabela_html = findViewById(R.id.imageView);

      //  String nomeImagem = getIntent().getStringExtra("tabela_html");
        String nomeAssunto = getIntent().getStringExtra("nome_assunto");
        String textoAssunto = getIntent().getStringExtra("texto_assunto");

     //   int idImagem = getResources().getIdentifier(String.valueOf(tabela_html), "drawable", getPackageName());


        nome_assunto.setText(nomeAssunto);
        texto_assunto.setText(textoAssunto);
   //     tabela_html.setImageResource(idImagem);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

}