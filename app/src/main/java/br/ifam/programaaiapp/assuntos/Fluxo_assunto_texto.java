package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Fluxo_assunto_texto extends AppCompatActivity {

    private ImageView backbutton;
    private TextView ass1, ass2, ass3, ass4, ass5, ass6, ass7, ass8, ass9, ass10;
    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fluxo_assunto_texto);

        backbutton = findViewById(R.id.backbutton);

        ass1 = findViewById(R.id.texto_assunto1);
        ass2 = findViewById(R.id.texto_assunto2);
        ass3 = findViewById(R.id.texto_assunto3);
        ass4 = findViewById(R.id.texto_assunto4);
        ass5 = findViewById(R.id.texto_assunto5);
        ass6 = findViewById(R.id.texto_assunto6);
        ass7 = findViewById(R.id.texto_assunto7);
        ass8 = findViewById(R.id.texto_assunto8);
        ass9 = findViewById(R.id.texto_assunto9);
        ass10 = findViewById(R.id.texto_assunto10);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ass1.setText("Fluxograma é composto por figuras geométricas que define cada função como início e fim " +
                "de um programa, Entrada de dados, Saída de dados, Decisão, entre outros representados " +
                "pelas seguintes formas.");

        ass2.setText("➢ Aparece toda vez que um programa é iniciado.");
        ass3.setText("➢ São ações gerais, podem ser processamento matemáticos, ações físicas de movimentação e muitas outras.");
        ass4.setText("➢ Usados na abstração de alguns processos que seriam melhor descritos isoladamente.");
        ass5.setText("➢ Tomada de decisão acontece quando temos uma pergunta que normalmente pode " +
                "ser VERDADEIRO ou FALSO. Terá, portanto, duas flexas de saída, ou seja, o " +
                "programa poderá tomar cursos diferentes a partir deste bloco. ");
        ass6.setText("➢ Representa algo que o programa lê, alguma informação vinda, normalmente do usuário, que está sendo inserida no programa.");
        ass7.setText("➢ (Display). Pode ser alguma informação que o programa gerou ao usuário.");
        ass8.setText("➢ Usados exclusivamente para o comando de decisão\n\n"+
                "Essas figuras acima são alguns exemplos de figuras de fluxograma.\n\n" +
                "Usamos essas figuras para montar um fluxograma, porém de forma organizada e correta. " +
                "Como podemos ver nesse exemplo abaixo:" );
        ass9.setText("Nesse exemplo podemos ver que o usuário deu início com a seguinte figura de “Terminador”.\n\n"+
                "Logo depois já usou duas figuras de “Entrada de Dados” e entrou com dois dados: N1 e N2.\n\n"+
                "Em seguida usou uma figura que indica “Processamento”, onde mostra o que vai ser " +
                "processado, nesse caso, será a soma de N1 e N2.\n\n" +
                "E por fim ele usou uma figura de “Saída de dados” que saiu o resultado da soma " +
                "representada por R\n\n" +
                "Então finalizou.\n\n"+
                "O fluxograma é basicamente isso, você pode montar de um algoritmo bem simples até um " +
                "algoritmo bem complexo.\n\n" +
                "Agora um exemplo com tomada de decisão:");

        ass10.setText("Nesse exemplo podemos ver que o sistema pode processar duas coisas diferentes " +
                "dependendo da situação.\n\n" +
                "Se por acaso o forno estiver aceso ele vai executar “Botar Lenha”\n\n" +
                "Se por acaso o forno não estiver aceso ele vai executar “Aceder Forno”.\n");

    }
}