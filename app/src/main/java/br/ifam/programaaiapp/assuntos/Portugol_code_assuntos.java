package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Portugol_code_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    private LinearLayout assunto1, assunto2, assunto3, assunto4, assunto5, assunto6, assunto7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugol_code_assuntos);
        backbutton = findViewById(R.id.backbutton);

        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);
        assunto3 = findViewById(R.id.assunto3);
        assunto4 = findViewById(R.id.assunto4);
        assunto5 = findViewById(R.id.assunto5);
        assunto6 = findViewById(R.id.assunto6);
        assunto7 = findViewById(R.id.assunto7);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Portugol\nPseudocódigo");
                i.putExtra("texto_assunto",
                        "- Quando Surgiu?\n" +
                                "\n" +
                                " A primeira variação (dialeto) de Portugol foi criada pelos professores Antonio Carlos Nicolodi (Brasil) e António Manso (Portugal) em 1986, e que originou outras duas variações. O esforço iniciou como uma tradução da linguagem de programação Pascal para a língua portuguesa.\n\n" +
                                "- O que é?\n\n" +
                                " O Portugol é uma pseudo-línguagem algorítmica muito utilizada na descrição de algoritmos, destaca-se pelo uso de comandos em português, o que facilita o aprendizado da lógica de programação, habituando o iniciante com o formalismo de programação.\n" +
                                "\n" +
                                " Portugol como método ou pseudolinguagem permite a qualquer pessoa falante de português desenvolver algoritmos estruturados de forma relativamente mais simples e intuitiva, independentemente da sintaxe de linguagens de programação verdadeiras. \n" +
                                "\n" +
                                " Essa palavra “pseudocódigo” é uma junção de duas palavras: pseudo e código. “Pseudo” é algo cujo conteúdo não é real ou verdadeiro. Dessa forma, o pseudocódigo nada mais é do que um rascunho de um programa ou algoritmo antes de ser implementado em uma linguagem de programação.\n" +
                                "\n" +
                                " Alguns pontos importantes que você precisa saber sobre pseudocódigos:\n" +
                                "\n" +
                                "● Não é uma linguagem de programação;\n\n" +
                                "● É apenas uma ferramenta de aprendizado e raciocínio, usada por pessoas programadoras para sublinhar como escrever o código real;\n\n" +
                                "● pseudocódigo não pode ser executado ou compilado por nenhum compilador, interpretador ou montador;\n\n" +
                                "● Ao contrário do código da linguagem de programação, o pseudocódigo não segue uma estrutura e sintaxe rígidas. A pessoa programadora pode escrever a sintaxe do pseudocódigo como quiser;\n\n");
                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Como Funciona?");
                i.putExtra("texto_assunto",
                        "●\tUm algoritmo é descrito como uma série de passos, como por exemplo uma receita de bolo;\n" +
                                "\n" +
                                "●\tEmprega-se a técnica de refinamentos sucessivos, ou seja, cada passo é refinado de forma a se parecer com uma instrução que uma máquina pode executar;\n" +
                                "\n" +
                                "●\tApós o refinamento final, o algoritmo é codificado em alguma linguagem livre de contexto.\n" +
                                "\n" +
                                "●\tEstrutura Fixa: Algoritmo, Var, Inicio e Fim.\n" +
                                "\n" +
                                "- Exemplo: \n" +
                                "\n" +
                                "Algoritmo soma;\n" +
                                "var\n" +
                                "   num01, num02, soma: Real;\n" +
                                "Inicio\n" +
                                "   escreva(\"Entre com o 1º número\");\n" +
                                "   leia(num01);\n" +
                                "   escreva(\"Entre com o 2º número\");\n" +
                                "   leia(num02);\n" +
                                "\n" +
                                "   soma = num01 + num02;\n" +
                                "   escreva(\"SOMA = \", soma);\n" +
                                "Fim.\n");
                startActivity(i);
            }
        });

        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Comandos e Variáveis");
                i.putExtra("texto_assunto",
                        "Quais os comandos básicos para usar em pseudocódigos?\n\n" +
                                "A seguir, vejamos algumas das principais instruções utilizadas nos pseudocódigos:\n" +
                                "\n" +
                                "- Regra Geral:\n " +
                                "Nenhum dos comandos podem ser adicionados ao código com acentuação, somente as palavras que estão dentro de aspas\n\n"+
                                "- Comandos fixos (Estrutura):\n\n"+
                                "● Algoritmo\n" +
                                "O comando fixo Algoritmo, é usado para que o desenvolvedor possa adicionar um nome ao seu código, mas para isso existem algumas regras:\n\n" +
                                "-Precisa começar com letra minúscula;\n"+
                                "-Não pode começar com números;\n"+
                                "-Não pode incluir caracteres especiais;\n" +
                                "-Só poderá usar números quando pelo menos uma letra minúscula for adicionada;\n"+
                                "-Não pode começar com letra maiuscula;\n"+
                                "-Obrigatoriamente precisa ser terminado com ponto e vírgula(;)\n\n"+
                                "● Var\n" +
                                "O Var serve para armazenar variáveis em seu programa. Como uma variável numero := inteiro; e etc\n\n" +
                                "● Inicio \n" +
                                "O comando fixo INICIO, é muito importante para a estrutura, pois vai ser nele que irá começar o funcionamento de seu algoritmo. \n" +
                                "\n" +
                                "● Fim.\n" +
                                "Outro comando fixo é o FIM, que serve para finalizar o funcionamento de seu algoritmo. Tudo que estiver abaixo dessa instrução, não será executado. É importante lembrar que esse comando obrigatoriamente precisa ser acompanhado com um ponto final. \n\n" +
                                "● Então aprendemos a estrutura base do seu algoritmo! caso um desses comandos não estiverem no seu código ele estará errado e não irá ser executado.\n\n"+

                                "- Alguns Comandos Utilizados:\n\n" +
                                "- Obs: toda linha de código que será feita, obrigatoriamente terá que ter o ponto e vírgula no final (;), com exceção dos comandos fixos, que não podem ser finalizados com ponto e vírgula.\n\n"+
                                "● escreva (“ ”)\n" +
                                " Mostrar uma mensagem para a pessoa que estiver executando o programa no computador. Exemplo:\n" +
                                "\n" +
                                "Algoritmo escreva;\n"+
                                "var\n"+
                                "Inicio\n"+
                                "  escreva(\"Programa Ai!\");\n"+
                                "Fim.\n\n"+
                                "- Obs: o código irá mostrar na tela a frase \"Programa Ai\". Quando você quer digitar uma frase dentro do comando escreva, obrigatoriamente precisa-se usar os parênteses e as aspas, mostrando para o compilador que dentro do comando existe algo para ser mostrado ao usuário. Caso você não queira mostrar uma frase e sim algo que já está definido, como por exemplo uma variável número que possui um valor (10), você só precisa por ele dentro do comando escreva, sem as aspas. Exemplo:\n\n"+
                                "Algoritmo escreva;\n"+
                                "var\n"+
                                "  num := inteiro;\n"+
                                "Inicio\n"+
                                "  num := 10;\n"+
                                "  escreva(num);\n"+
                                "Fim.\n\n"+

                                "● leia ( )\n" +
                                " Receber alguma informação digitada pela pessoa que está executando o programa (o usuário). Ou seja se cria um espaço na memória do seu sistema, onde irá receber o que for digitado pelo usuário. Exemplo:\n" +
                                "\n" +
                                "Algoritmo leia;\n"+
                                "var\n"+
                                "  num := inteiro;\n"+
                                "Inicio\n"+
                                "  escreva(\"Digite um número\");\n"+
                                "  leia(num);\n"+
                                "Fim.\n\n"+
                                "Nesse código o LEIA irá receber o número que será digitado pelo usuário.\n\n"+
                                "- Obs: o comando LEIA, precisa estar acompanhado dos parênteses e uma variável que será usada para o usuário digitar algo.\n\n\n"+

                                "-Símbolos Usados e\nsuas funcionalidades: \n\n" +
                                "● <- ou := : Atribuir um valor para um espaço que você criou.\n" +
                                "\n" +
                                "● + : Somar dois valores.\n" +
                                "\n" +
                                "● – : Subtrair dois valores.\n" +
                                "\n" +
                                "● / : Divisão entre dois valores.\n" +
                                "\n" +
                                "● * : Multiplicação entre valores.\n" +
                                "\n" +
                                "● <> : Verifica se dois valores são diferentes.\n\n"+
                                "Exemplo:\n"+
                                "Algoritmo exemplo_diferente;\n" +
                                "var\n" +
                                "   num: inteiro;\n" +
                                "Inicio\n" +
                                "   num := 20;\n" +
                                "   Se (num <> 18) entao\n"+
                                "     escreva(\"O número é diferente de 18\");\n"+
                                "   fimse;\n"+
                                "Fim.\n\n"+

                                "● Mod : resto da divisão \n(dividendo-(quociente*divisor)).\n" +
                                "\n" +
                                "Exemplo: \n" +
                                "Algoritmo exemplo_mod;\n" +
                                "var\n" +
                                "   num: inteiro;\n" +
                                "Inicio\n" +
                                "   num := 10\n"+
                                "   Se (num mod 2 := 0) entao\n"+
                                "     escreva(\"número divisível por 2\")\n"+
                                "   fimse;\n"+
                                "Fim.");
                startActivity(i);
            }
        });

        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Estrutura de Decisão");
                i.putExtra("texto_assunto",
                        "● Se ... entao (estrutura simples):\n\n" +
                                "É utilizada quando queremos executar um bloco de código somente se uma determinada condição for verdadeira. Se ela for, o bloco de código será executado. Caso for falso, ele será ignorado. Exemplo:\n\n" +
                                "Algoritmo exemplo_se;\n" +
                                "var\n" +
                                "  idade: inteiro;\n" +
                                "Inicio\n" +
                                "   idade := 20;\n" +
                                "   Se (idade >= 18) entao\n"+
                                "     escreva(\"Você é maior de idade\");\n"+
                                "   fimse;\n"+
                                "Fim.\n\n"+
                        "Nesse código, foi declarada uma variável idade, que recebe o número 20. Na estrutura de decisão simples o \"Se\" da como condição se idade for maior ou igual a 18, ou seja irá aparecer na tela a frase \"Você é maior de idade\"!\n\n"+
                        "Se idade recebesse o número 15, o sistema não iria entrar na estrutura de decisão e iria encerrar, pois a estrutura só irá rodar caso a condição for verdadeira (idade >= 18)\n\n"+
                        "- Obs: A estrutura fixa do SE, sempre seguirá esse padrão, como foi visto no exemplo.\n\n"+
                        "Se (condição) entao\n"+
                        "  resto do código\n"+
                        "fimse;\n\n"+
                        "- palavras fixas: se, entao e fimse;\n\n\n"+
                        "● Se ... entao ... Senao (estrutura composta):\n\n"+
                        "É utilizada juntamente com a estrutura simples. Ela permite definir um bloco de código alternativo para ser executado quando a condição do SE for falsa. Exemplo:\n\n"+
                        "Algoritmo exemplo_senao;\n"+
                        "var\n"+
                        "  idade: inteiro;\n"+
                        "Inicio\n"+
                        "  idade := 15;\n"+
                        "  Se (idade >= 18) entao\n"+
                        "     escreva(\"Você é maior de idade\");\n"+
                        "  Senao\n" +
                        "     escreva(\"Você é menor de idade\");\n"+
                        "  fimse;\n"+
                        "Fim.\n\n"+
                        "Nesse código, a variável idade recebe o número 15. Como agora foi adicionado o SENAO dentro da estrutura, a condição do SE se da como falsa, pois 15 não é maior ou igual a 18, então nesse caso o 15 entrará no senao e mostrará na tela a frase \"Você é menor de idade\".\n\n"+
                        "- Obs: O SENAO, não possui uma condição, pois ele faz parte da estrutura do SE (que ja possui uma condição). Então o SENAO sempre será a negação da condição do SE.\n\n"+
                        "o FIMSE sempre ficarà no final do SENAO (caso você decidir usar a estrutura composta). Então sempre que você abrir um SE, terá que fechar com um FIMSE.\n\n"+
                        "- palavras fixas: se, entao, senao e fimse;\n\n"+
                        "● Se...entao...senao...se: \n\n"+
                        "É utilizada para realizar uma série de testes e executar diferentes blocos de código com base nos resultados. Essa estrutura permite tomar decisões e executar diferentes ações de acordo com as condições especificadas. Exemplo:\n\n"+
                        "Algoritmo exemplo_senaose;\n"+
                        "var\n"+
                        " idade: inteiro;\n"+
                        "Inicio\n"+
                        " idade := 25\n"+
                        " Se (idade < 18) entao\n"+
                        "  escreva(\"Você é menor de idade\");\n"+
                        " Senao Se (idade >= 18 e idade <= 65) entao\n"+
                        "  escreva(\"Você é adulto\");\n"+
                        " Senao\n"+
                        "  escreva(\"Você é idoso\");\n"+
                        " fimse;\n"+
                        "Fim.\n\n"+
                        "Nesse código, a variável idade está recebendo o número 25. Como foi adicionado o SENAO SE, existem mais possibilidades para serem verificadas, porém só uma será verdadeira.\n\n"+
                        "- Obs: Na condição do SENAO SE, mostra que se a idade for maior ou igual a 18 e se ela for menor ou igual a 65, mostrará a frase \"Você é adulto\". Como a idade possui o número 25, ela entrará nessa condição e irá ignorar as outras condições (falsas), mostrando somente a condição que foi verdadeira.\n\n "+
                        "- palavras fixas: se, entao, senao se, senao e fimse;\n\n");
                startActivity(i);
            }
        });

        assunto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Estrutura de Repetição");
                i.putExtra("texto_assunto",
                        "● Para : \n"+
                        "É um laço contável, ou seja, você sabe antecipadamente a quantidade de vezes que um código deve ser executado. Ele consiste em uma variável de controle (que precisa ser declarada e ser um valor inteiro), um valor inicial, valor final e um incremento. O código é executado repetidamente (loop), incrementando o valor que foi dado a variável de controle em cada repetição, até que o valor final seja atinjido. Exemplo:\n\n"+
                                "Algoritmo exemplo_para;\n" +
                                "var\n" +
                                "  i: inteiro;\n" +
                                "Inicio\n" +
                                "   Para (i de 1 ate 10 passo 1) faca\n"+
                                "     escreva(\"Inovatech!\");\n"+
                                "   fimpara;\n"+
                                "Fim.\n\n"+
                        "Nesse exemplo, o código irá executar 10 vezes a frase \"Inovatech\".\n\n"+
                        "- Obs: o valor inicial do laço será 1 e irá acabar quando chegar no 10. O incremento vai ser a somatória do valor inicial a cada vez que o laço for se repetir, ou seja foi declarado como 1, então valor_inicial + 1.\n\n"+
                        "- palavras fixas: Para, de, ate, passo, faca e fimpara;\n\n"+
                        "● Enquanto:\n"+
                        "É um laço incotável, ou seja, você não sabe a quantidade de vezes que ele deve ser executado. Enquanto a condição for verdadeira, o código será executado e caso contrário, a execução será interrompida. Exemplo:\n\n"+
                                "Algoritmo exemplo_enquanto;\n" +
                                "var\n" +
                                "  contador: inteiro;\n" +
                                "Inicio\n" +
                                "   contador := 1;\n"+
                                "   Enquanto (contador <= 10) faca\n"+
                                "     escreva(\"Inovatech!\");\n"+
                                "     contador := contador + 1;\n"+
                                "   fimenquanto;\n"+
                                "Fim.\n\n"+
                        "Nesse código, será executado enquanto o valor do contador for menor ou igual a 10. A frase \"Inovatech\" aparecerá na tela 10 vezes.\n\n"+
                        "- Obs: a linha de código \"contador := contador + 1\", faz com que a variável contador receba o seu valor atual incrementando sempre mais 1.\n\n"+
                        "- palavras fixas: Enquanto, faca, fimenquanto;\n\n"+
                        "● Repita: \n"+
                        "É utilizado quando o código deve ser executado pelo menos uma vez, e a condição para continuar a repetição é verificada após a execução do código. Enquanto a condição for verdadeira, o código continuará sendo executado. Exemplo:\n\n"+
                                "Algoritmo exemplo_repita;\n" +
                                "var\n" +
                                "  contador: inteiro;\n" +
                                "Inicio\n" +
                                "  contador := 1;\n"+
                                "   Repita\n"+
                                "     escreva(\"Inovatech!\");\n"+
                                "     contador := contador + 1;\n"+
                                "   Ate que (contador > 10);\n"+
                                "Fim.\n\n"+
                        "Nesse código, só ira parar a repetição quando o contador atingir um valor maior que 10. \n\n"+
                        "- palavras fixas: Repita, Ate que;\n\n");
                startActivity(i);
            }
        });

        assunto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Na prática!");
                i.putExtra("texto_assunto",
                        "Abaixo, utilizamos o pseudocódigo Portugol para escrever um algoritmo que soma dois valores. Confira:\n" +
                                "\n" +
                                "Algoritmo programa_ai;\n"+
                                "Var\n"+
                                "  n1, n2, result: inteiro;\n"+
                                "Inicio\n" +
                                "   escreva(\"Digite um número:\");\n"+
                                "   leia(n1)\n" +
                                "   escreva(\"Digite outro número:\");\n"+
                                "   leia(n2)\n" +
                                "   result := n1 + n2\n" +
                                "   escreva(\"A soma é:\", result)\n" +
                                "Fim.\n" +
                                "\n" +
                                "Agora, explicaremos o que cada linha faz:\n" +
                                "\n" +
                                "- linha 01: Comando Algoritmo que define o nome do seu algoritmo;\n" +
                                "- linha 02: Comando Var que define as variáveis; \n" +
                                "- linhas 03: Declaração das variáveis, n1, n2 e result que são do tipo inteiro;\n" +
                                "- linha 04: Comando inicio que irá iniciar seu algoritmo;\n" +
                                "- linha 05, 06, 07 e 08: Entrada de dados com o escreva, para que o usuário possa digitar um número e logo em seguida o comando para receber esses números;\n" +
                                "- linha 09: Aqui diz que a variável RESULT recebe a soma do n1 com n2;\n"+
                                "- linha 10: Nessa linha está a saída de dados, que mostra ao usuário o valor total da soma dos números digitados.\n"+
                                "- linha 11: Final do algoritmo.\n\n");

                startActivity(i);
            }
        });

        assunto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_code_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Curiosidades");
                i.putExtra("texto_assunto", " Você sabia que o nome Portugol deriva da junção de três palavras? Pois é, o nome vem do Português, e das linguagens de programação Algol e PascaL, assim, PORTUGUÊS + ALGOL + PASCAL = PORTUGOL. Agora note como tudo poderia ter sido resolvido apena com o português e Algol, brincadeiras à parte, mas o que é esse tal Algol?\n" +
                        "\n" +
                        " Algol é uma linguagem de programação da qual descende o Pascal, ela, a linguagem de programação Algol foi muita usada em mainframes (computadores de grande porte). E foi também uma linguagem muito importante na década de 60, época em que foi desenvolvida.\n" +
                        "\n" +
                        " Esta linguagem cujo nome vem de “Algorithmic Language” é considerada uma linguagem de programação de alto nível, sendo voltada principalmente para aplicações científicas.\n" +
                        "\n" +
                        " Voltando agora ao Portugol, ele foi criado pelos professores Antônio Carlos Nicolodi (brasileiro) e Antônio Mannso (português). Eles o desenvolveram pensando justamente em quem está começando. Criaram então uma forma de ensinar programação sem que a estrutura de uma linguagem pesasse sobre os ombros do aspirante a programador.\n");

                startActivity(i);
            }
        });


    }
}