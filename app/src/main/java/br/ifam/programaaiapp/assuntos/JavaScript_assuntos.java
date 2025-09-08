package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class JavaScript_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout assunto1, assunto2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_script_assuntos);
        backbutton = findViewById(R.id.backbutton);

        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaScript_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","O que é?");
                i.putExtra("texto_assunto",
                        " JavaScript é uma linguagem de script ou programação usada para criar interatividade nas páginas da web. É uma linguagem de programação simples, popular e poderosa. \n" +
                                " \n" +
                                "-Como funciona o JavaScript: \n" +
                                " JavaScript é executado no navegador do usuário e pode ser interpretado e executado em qualquer sistema operacional. Ele é incorporado em páginas HTML através de tags de script que permitem ao desenvolvedor adicionar recursos interativos em uma página. \n\n\n");

                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(JavaScript_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Recursos");
                i.putExtra("texto_assunto",
                        " JavaScript oferece uma ampla gama de recursos para desenvolvedores, incluindo: \n" +
                                " \n" +
                                "● Controle de forma e validação de entrada de dados em formulários. \n\n" +
                                "● Manipulação da árvore DOM (Modelo de Objeto do Documento) que permite aos desenvolvedores criar, modificar e excluir elementos HTML e CSS em tempo real. \n\n" +
                                "● Animação de elementos HTML como divs, imagens e botões. \n\n" +
                                "● Efeito de scroll suave. \n\n" +
                                "● Criação de animações usando bibliotecas como jQuery, GSAP e outras. \n\n" +
                                "● Trabalhar com APIs externas, como o Google Maps e outras. \n\n" +
                                "● Criar jogos simples para navegador. \n\n" +
                                "● Automação de tarefas repetitivas. \n\n\n" +
                                "- Conceitos básicos do JavaScript: \n\n" +
                                " Para começar a trabalhar com JavaScript, é importante ter uma compreensão básica de alguns conceitos importantes, tais como: \n" +
                                " \n" +
                                "● Variáveis: São espaços de memória reservados para armazenar valores.\n\n" +
                                "● Tipos de dados: São a forma como o JavaScript reconhece diferentes tipos de dados, como strings, números e booleanos. \n\n" +
                                "● Operadores: São usados para realizar cálculos ou comparações. \n\n" +
                                "● If/else statements: São usados para executar diferentes ações dependendo de uma condição.\n\n" +
                                "● Laços (loops): São usados para executar ações repetitivas. \n\n" +
                                "● Funções: São uma coleção de comandos que podem ser chamados várias vezes, permitindo que o código seja reutilizável. \n\n" +
                                " Esses conceitos são apenas o básico, mas são suficientes para começar a programar em JavaScript.\n \n" +
                                " \n" +
                                "- Ferramentas para desenvolver em JavaScript: \n" +
                                "Para desenvolver aplicativos JavaScript, você precisará de algumas ferramentas importantes, tais como: \n" +
                                " \n" +
                                "● Um editor de texto, como Sublime, Visual Studio Code ou Atom. \n\n" +
                                "● Um navegador da web, como Google Chrome, Mozilla Firefox ou Safari. \n\n" +
                                "● Um servidor local, como Apache, Nginx ou XAMPP. \n\n" +
                                " Essas ferramentas são essenciais para o desenvolvimento e testes de aplicativos JavaScript. Com elas, você poderá escrever e executar código JavaScript diretamente em seu próprio computador. \n" +
                                " \n" +
                                "- Conclusão: \n" +
                                "JavaScript é uma linguagem de programação poderosa, popular e amplamente usada para desenvolvimento de aplicativos em páginas web. Com o conhecimento de conceitos básicos e ferramentas certas, é possível criar aplicativos incríveis usando JavaScript. \n\n\n");

                startActivity(i);
            }
        });
    }
}