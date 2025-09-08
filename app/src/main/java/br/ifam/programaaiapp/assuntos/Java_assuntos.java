package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;
import br.ifam.programaaiapp.atividades.Atividades_linguagens;
import br.ifam.programaaiapp.resp.Respostas_linguagens;

public class Java_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout assunto1, assunto2, assunto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_assuntos);
        backbutton = findViewById(R.id.backbutton);

        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);
        assunto3 = findViewById(R.id.assunto3);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "O que é?");
                i.putExtra("texto_assunto",
                        " Todo e qualquer desenvolvedor com certeza escuta falar do Java desde a sua época de faculdade, não é mesmo? Afinal, há muitos e muitos anos essa é uma das linguagens de programação mais consagradas e populares do mundo. \n" +
                                "Ele consiste em uma linguagem de programação orientada a objetos, baseada em classes e que permite o desenvolvimento de aplicações pelos profissionais de TI através da escrita do código uma única vez. \n" +
                                " \n" +
                                "- Pra que é usado? \n" +
                                "Seu uso pode se dar em diversos sistemas operacionais e dispositivos, desde:\n\n" +
                                "● desktops \n" +
                                "● mobile \n" +
                                "● sistemas de gerenciamento de veículos \n" +
                                "● Inteligência artificial. \n\n" +
                                "- Qual a diferença entre Java e JavaScript? \n" +
                                " Embora tenham nomes semelhantes, é preciso saber desde já que o Java e o JavaScript não são a mesma coisa. Basicamente, enquanto o primeiro é uma linguagem de programação, o segundo refere-se a uma linguagem de scripts. \n" +
                                "Isso significa que o JavaScript não cria aplicações independentes. Ele fica embutido nos documentos HTML, ou seja, sua execução é limitada ao navegador. \n" +
                                " \n" +
                                "-Como funciona? \n" +
                                "Ao contrário do que ocorre em outras linguagens de programação, as aplicações desenvolvidas em Java não são compiladas em um código nativo para ser executado diretamente pelo dispositivo. \n\n\n");
                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Características");
                i.putExtra("texto_assunto",
                        "● Bytecode - Os programas desenvolvidos em Java são compilados para o bytecode, um código intermediário interpretado e executado pela JVM. É essa característica, inclusive, que permite que a linguagem seja independente de plataforma. Logo, a linguagem tem fortes aspectos de portabilidade, uma vez que pode ser instalada em qualquer plataforma que possua a Máquina Virtual Java instalada. \n\n" +
                                "● Biblioteca de rotinas e APIs - O Java possui uma vasta biblioteca padrão para que os programas possam ser distribuídos. Isso permite que os desenvolvedores trabalhem com variados recursos de rede, o que confere mais agilidade às atividades desses. \n\n"+
                        "- Principais frameworks do Java são: \n" +
                                "\n" +
                                "● Spring, Play . Strutus \n" +
                                "● Hibernante \n" +
                                "● Wicket, Spark \n" +
                                "● Google Web Toolkit (GWT) \n" +
                                "● Java Server Faces (JSF) \n" +
                                "● JHipster e Grails \n" +
                                " \n"+
                        "● Tipagem Estática - O Java utiliza a tipagem estática, o que a torna fortemente tipada, ao usar variáveis com tipos específicos. Nesse sentido, há uma verificação dos tipos usados em dados e variáveis e isso não permite que haja alteração do tipo da variável após essa ser declarada. \n" +
                                "Suponha que tenhamos uma variável do tipo inteiro que recebe um número qualquer, ao declararmos essa variável como ‘int’, não poderemos mais alterar o seu tipo ao longo do programa. Exemplo: \n\n"+
                        "using System;\n"+
                        "namescape exemploTipagem{\n"+
                        "  class Program{\n"+
                        "    static void Main(string[] args){\n"+
                        "     int numero = 5;\n"+
                        "     Console.WriteLine(numero)\n"+
                        "     numero = \"Beatriz Christine\"\n"+
                        "    }\n"+
                        "  }\n"+
                        "}\n\n"+
                        " No trecho de código acima, vamos ter o seguinte erro de compilação na linha 22, ‘Não é possível converter implicitamente um tipo string em int’. \n" +
                                "Isso se deve ao fato dessas linguagens fazerem a verificação de tipos em tempo de compilação. \n\n"+
                        "● Principais características:\n\n" +
                                ".Portabilidade. \n" +
                                ".Simplicidade \n" +
                                ".Segurança \n" +
                                ".Vasta comunidade ativa \n\n\n");
                startActivity(i);
            }
        });

        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Java_assuntos.this, Java_assunto3_texto.class);
                startActivity(i);
            }
        });
    }
}