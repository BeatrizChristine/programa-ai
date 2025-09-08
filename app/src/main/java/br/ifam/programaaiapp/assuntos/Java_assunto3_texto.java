package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import br.ifam.programaaiapp.R;

public class Java_assunto3_texto extends AppCompatActivity {

    private TextView texto1, texto2, texto3, texto4;
    private ImageView backbutton;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_assunto3);

        texto1 = findViewById(R.id.texto_assunto1);
        texto2 = findViewById(R.id.texto_assunto2);
        texto3 = findViewById(R.id.texto_assunto3);
        texto4 = findViewById(R.id.texto_assunto4);

        backbutton = findViewById(R.id.backbutton);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        texto1.setText("● Hello World: \n\n" +
                "Entre todos os programas simples Java, este é o primeiro que você deve aprender. É o primeiro dos códigos Java que quase todos os programadores compilam. Aqui está seu código:");

        texto2.setText("-A definição de classe (class): é usada para definir uma nova classe através da palavra-chave \"class\" nos códigos Java. Deve ser fechado com chaves: abertura \"{\" e fechamento \"}\" em códigos Java. \n\n" +
                "1) Método principal (main): todo aplicativo de Java deve conter o método, neste caso, o public static void main (String [ ] args) 2) Public: é colocado de modo que possa ser executado em qualquer lugar.  \n\n" +
                "3) Static: com isto o método principal pode ser chamado sem criar o objeto. \n\n" +
                "4) Void: o método principal não retorna nada. \n\n" +
                "5) String: o método principal aceita um único argumento. \n\n"+
                "● Área de um círculo: ");

        texto3.setText("1) Para obter a área de um círculo, devemos definir a fórmula que, como sabemos, consiste em A = r2 π.  \n\n" +
                "2) Além disso, atribuímos o valor de 22/7 ao símbolo grego de \"pi\". \n\n" +
                "3) O \"Import\" é uma palavra-chave com a qual podemos obter certas características das pacotes integrados. Aqui usamos o pacote \"util\" que inclui muitas classes. Uma dessas classes é \"Scanner\", que usamos para obter comandos através do console. Lembre-se de que o console é a interface entre o usuário e o programa. \n\n" +
                "4) Em seguida, podemos ver a função principal que já explicamos em detalhes no \"public static void main\".  \n\n" +
                "5) A classe scanner é responsável pela digitalização dos dados de entrada fornecidos pelo usuário através do console. Devemos criar um objeto que seja a referência para armazenar a variável \"s\". (Para ter acesso ao console, devemos criar um objeto \"new scanner \"). \n\n" +
                "6) Agora com System.out.println (\"Enter the radius:\"); pedimos o valor do raio que o usuário entra pelo teclado. \n\n" +
                "7) Usamos o \"nextdouble\", pois este é o formato que precisamos para que o console leia o número que estamos inserindo. Além disso, como o número de pi é um número com decimais, é necessário usar \"nextdouble\" em vez de \"nextint\" (um formato que não aceita decimais, mas apenas números inteiros).\n\n"+
                "● Adição de dois números: ");


        texto4.setText("1) Como nos casos anteriores, definimos nome e classe. Iniciamos o código e definimos 3 variáveis (duas que solicitaremos ao usuário e uma será o resultado das anteriores). \n\n" +
                "2) O usuário registra os números e o programa executa a soma.\n\n");

    }
}