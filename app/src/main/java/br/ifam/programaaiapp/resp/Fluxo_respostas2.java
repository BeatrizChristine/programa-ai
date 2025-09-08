package br.ifam.programaaiapp.resp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Fluxo_respostas2 extends AppCompatActivity {

    private TextView resposta, resposta7, resposta8, resposta9, resposta10;
    private ImageView backbutton;

    @SuppressLint({"SetTextI18n"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxo_respostas2);
        resposta = findViewById(R.id.respostas_atvd);

        resposta7 = findViewById(R.id.respostas_atvd7);
        resposta8 = findViewById(R.id.respostas_atvd8);
        resposta9 = findViewById(R.id.respostas_atvd9);
        resposta10 = findViewById(R.id.respostas_atvd10);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resposta.setText(
                "Questão 1:\n" +
                        "A entrada de dados pode ser representada por um paralelogramo, onde é indicado qual " +
                        "dado deve ser fornecido e onde este deve ser armazenado.\n\n\n" +
                        "Questão 2:\n" +
                        "A saída de dados pode ser representada por um paralelogramo, onde é indicado qual dado " +
                        "deve ser fornecido e de onde este deve ser recuperado.\n\n\n" +
                        "Questão 3:\n" +
                        "A estrutura de sequência pode ser representada por uma seta que conecta os símbolos que " +
                        "representam as operações a serem executadas em ordem.\n\n\n" +
                        "Questão 4:\n\n" +
                        "Início do programa\n" +
                        "Ler a senha\n" +
                        "Verificar se a senha possui pelo menos 8 caracteres\n" +
                        "Se a senha não tiver pelo menos 8 caracteres, ir para a etapa 6\n" +
                        "Verificar se a senha possui letras maiúsculas e minúsculas\n" +
                        "Se a senha não tiver letras maiúsculas e minúsculas, ir para a etapa 6\n" +
                        "Verificar se a senha possui números\n" +
                        "Se a senha não tiver números, ir para a etapa 6\n" +
                        "Imprimir que a senha é válida\n" +
                        "Fim do programa\n\n\n" +
                        "Questão 5:\n" +
                        "Geralmente usados em gráficos mais complexos, este símbolo conecta elementos " +
                        "separados em uma página.\n\n\n"+
                        "Questao 6:");

        resposta7.setText("Questão 7:");
        resposta8.setText("Questão 8:");
        resposta9.setText("Questão 9:");
        resposta10.setText("Questão 10:");
    }
}