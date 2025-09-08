package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Phyton_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout ass1, ass2, ass3, ass4, ass5, ass6, ass7, ass8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phyton_assuntos);
        backbutton = findViewById(R.id.backbutton);

        ass1 = findViewById(R.id.assunto1);
        ass2 = findViewById(R.id.assunto2);
        ass3 = findViewById(R.id.assunto3);
        ass4 = findViewById(R.id.assunto4);
        ass5 = findViewById(R.id.assunto5);
        ass6 = findViewById(R.id.assunto6);
        ass7 = findViewById(R.id.assunto7);
        ass8 = findViewById(R.id.assunto8);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        ass1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "A História do Python!");
                i.putExtra("texto_assunto",
                        " Python é uma linguagem de programação de alto nível, interpretada e orientada a " +
                        "objetos, criada por Guido Van Rossum no final dos anos 80. Guido, na época, trabalhava " +
                        "no Centro de Matemática e Informática (CWI) na Holanda, onde estava envolvido com o " +
                        "desenvolvimento de uma linguagem chamada ABC. Ele sentiu a necessidade de uma " +
                        "linguagem que fosse fácil de aprender e usar, mas que também fosse poderosa o suficiente " +
                        "para lidar com tarefas complexas.\n\n" +
                        " Em 1989, Guido começou a trabalhar no desenvolvimento de uma nova " +
                        "linguagem, que seria inspirada em outras linguagens de programação, como Modula-3, C " +
                        "e outras. A ideia era criar uma linguagem que fosse fácil de aprender, com uma sintaxe " +
                        "simples e limpa, e que também fosse poderosa o suficiente para lidar com tarefas " +
                        "complexas.\n\n" +
                        " O nome \"Python\" foi escolhido em homenagem ao grupo de comédia britânico " +
                        "Monty Python, do qual Guido era fã, porém, com o passar dos tempos, o nome da " +
                        "linguagem passou a ser conhecida pela cobra “Python (em português – Píton)”, tanto que, " +
                        "a logo atualmente simboliza duas pequenas cobras. A primeira versão do Python, 0.9.0, " +
                        "foi lançada em fevereiro de 1991. Desde então, Python tem crescido em popularidade e " +
                        "se tornou uma das linguagens de programação mais populares do mundo.\n\n" +
                        " Python é conhecido por sua simplicidade, legibilidade e clareza de código. Ele " +
                        "tem sido amplamente utilizado em áreas como ciência de dados, inteligência artificial, " +
                        "desenvolvimento web, automação de tarefas, jogos e muito mais. A comunidade Python " +
                        "é muito ativa, e existem milhares de bibliotecas e frameworks disponíveis para facilitar o " +
                        "desenvolvimento de projetos em Python.\n\n" +
                        " Em 2018, Guido Van Rossum decidiu se afastar do desenvolvimento de Python e " +
                        "deixar a comunidade assumir o controle. Desde então, Python tem sido desenvolvido por " +
                        "um grupo de voluntários liderado por um comitê de gestão de desenvolvimento, e " +
                        "continua a crescer em popularidade e uso em todo o mundo.\n\n");
                startActivity(i);
            }
        });

        ass2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "O que é uma Variável?");
                i.putExtra("texto_assunto",
                        " Uma variável é um nome que se refere a um valor ou objeto em um programa de " +
                                "computador. Em outras palavras, uma variável é uma área de armazenamento na memória " +
                                "do computador que é reservada para armazenar um valor específico.\n\n" +
                                " As variáveis são usadas para armazenar valores que podem ser alterados ao longo " +
                                "do tempo durante a execução do programa. Por exemplo, podemos criar uma variável " +
                                "chamada \"idade\" e atribuir um valor a ela como 25. Mais tarde, podemos alterar o valor " +
                                "da variável para 30 se a idade do usuário mudar.\n\n" +
                                " Em Python, as variáveis são criadas e atribuídas a valores usando o sinal de igual " +
                                "(=). Por exemplo, podemos criar uma variável chamada \"nome\" e atribuir a ela o valor " +
                                "\"Rodrigo\" da seguinte forma:\n\n" +
                                "   nome = \"Rodrigo\"\n\n" +
                                " Nesse exemplo, a variável \"nome\" está sendo atribuída ao valor \"Rodrigo\". Podemos " +
                                "então utilizar a variável \"nome\" em nosso programa para se referir a esse valor. Por " +
                                "exemplo, podemos utilizar a função print para exibir o valor da variável \"nome\" na tela:\n\n" +
                                "   print(nome)\n\n" +
                                " Isso exibirá o valor \"Rodrigo\" na tela.\n\n");
                startActivity(i);
            }
        });

        ass3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Tipos Primitivos!");
                i.putExtra("texto_assunto",
                        " Os tipos primitivos são os tipos de dados básicos que podemos utilizar em nossos " +
                                "programas. No Python, existem alguns tipos primitivos, como:\n\n\n" +
                        "Números inteiros (int):\n\n" +
                                " Os números inteiros (int) são um dos tipos de dados numéricos mais simples em " +
                                "Python. Eles representam números inteiros, sem casas decimais. Alguns exemplos de " +
                                "números inteiros são 1, 2, 3, -5, -10, etc.\n\n" +
                                " Podemos realizar operações matemáticas com números inteiros, como adição (+), " +
                                "subtração (-), multiplicação (*) e divisão (/). Além disso, também podemos utilizar " +
                                "operadores de comparação, como igual (==), maior que (>), menor que (<), entre outros.\n\n\n"+
                        "Números de ponto flutuante ou números reais (float):\n\n" +
                                " Os números de ponto flutuante (float) são outro tipo de dado numérico em Python. " +
                                "Eles representam números com casas decimais. Alguns exemplos de números de ponto " +
                                "flutuante são 3.14, 2.5, -1.0, etc.\n\n" +
                                " Podemos realizar as mesmas operações matemáticas com números de ponto " +
                                "flutuante e com números inteiros. No entanto, é importante lembrar que existem algumas " +
                                "diferenças nas operações matemáticas com números de ponto flutuante devido às " +
                                "limitações da representação binária desses números, ou seja, é possível um número " +
                                "flutuante ser um número inteiro, mas não é possível um número inteiro ser um número " +
                                "flutuante.\n\n\n"+
                        "Booleanos (bool):\n\n" +
                                " Os booleanos (bool) são um tipo de dado que representa um valor lógico " +
                                "verdadeiro (True) ou falso (False). Eles são comumente utilizados em expressões " +
                                "condicionais e de comparação.\n\n\n" +
                        "Strings (str):\n\n" +
                                " São sequências de caracteres, como \"Olá mundo!\".\n" +
                                "As strings (str) são um tipo de dado que representa uma sequência de caracteres. " +
                                "Elas são comumente utilizadas para representar textos em um programa.\n\n\n" );
                startActivity(i);
            }
        });

        ass4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Entrada e Saída de Dados!");
                i.putExtra("texto_assunto",
                        " Para interagir com o usuário do programa, podemos utilizar funções de entrada e " +
                                "saída de dados. No Python, algumas das funções mais comuns são:\n\n" +
                                "- input(): O input é utilizado para receber uma entrada do usuário, geralmente um " +
                                "texto ou um número, e armazená-la em uma variável. Por exemplo:\n\n" +
                                "   nome = input(\"Qual é o seu nome? \")\n\n" +
                                " Nesse exemplo, a função input exibe a mensagem \"Qual é o seu nome?\" na tela e " +
                                "aguarda o usuário digitar uma resposta. Quando o usuário pressiona a tecla \"Enter\", o " +
                                "texto digitado é armazenado na variável \"nome\".\n\n" +
                                "- print(): O print, por sua vez, é utilizado para exibir informações na tela. Podemos " +
                                "utilizar essa função para exibir mensagens, valores de variáveis, resultados de operações, " +
                                "entre outras coisas. Por exemplo:\n\n" +
                                "   print(\"Olá, mundo!\")\n\n" +
                                " Nesse exemplo, a função print exibe a mensagem \"Olá, mundo!\" na tela.\n\n" +
                                " As aspas simples (' ') ou aspas duplas (\" \") são utilizadas em Python para indicar " +
                                "que um texto é uma string, ou seja, uma sequência de caracteres. Quando utilizamos aspas " +
                                "simples ou duplas para delimitar um texto, estamos informando ao Python que aquele " +
                                "texto deve ser tratado como uma string.\n\n" +
                                " Podemos utilizar o print para formatar a saída de dados de diferentes maneiras. " +
                                "Por exemplo:\n\n" +
                                "Utilizar f-strings.\n\n" +
                                "   nome = \"Rodrigo\"\n" +
                                "   idade = 21\n" +
                                "       print(f’O nome é {nome} e a idade é {idade}.’)\n\n" +
                                " Nesse exemplo, a função print utiliza f-strings para inserir os valores das variáveis " +
                                "\"nome\" e \"idade\" em uma mensagem. Os valores são inseridos na mensagem entre chaves " +
                                "{} e precedidos pelo caractere \"f\". O resultado final é a mensagem \"O nome é Rodrigo e " +
                                "a idade é 21.\".\n\n" +
                                " Essas são algumas das principais maneiras de utilizar a função print em Python. É " +
                                "possível personalizar ainda mais a exibição das informações utilizando outras funções e " +
                                "métodos em conjunto com o print.\n\n\n" +
                        "Exercício explicado:\n\n" +
                        "Ex.1 Crie um programa que leia dois números e mostre a soma entre eles.\n\n" +
                                " Para somar dois valores informados pelo usuário em Python, podemos utilizar a " +
                                "função input() para receber a entrada de dados do usuário, e então convertê-los para o tipo " +
                                "numérico (int ou float) para realizar a operação de soma.\n\n" +
                                "Por exemplo, se quisermos somar dois números inteiros informados pelo usuário, " +
                                "podemos escrever o seguinte código:\n\n" +
                                "   n1 = int(input(\"Digite o primeiro número: \"))\n" +
                                "   n2 = int(input(\"Digite o segundo número: \"))\n" +
                                "   soma = n1 + n2\n" +
                                "       print(f”A soma é: {soma}”)\n\n" +
                                " Nesse código, estamos utilizando a função input() para receber dois valores " +
                                "informados pelo usuário, e a função int() para converter esses valores para o tipo inteiro, " +
                                "pois, se não declararmos o tipo de resposta do input() fornecido pelo o usuário, o python " +
                                "entenderia a resposta com uma str(string) e forneceria o valor errado ao usuário. Em " +
                                "seguida, estamos somando os valores e armazenando o resultado na variável \"soma\". Por " +
                                "fim, estamos exibindo o resultado na tela utilizando a função print(). \n\n" +
                                " No entanto, se quisermos somar dois números de ponto flutuante, ou seja, com " +
                                "casas decimais, devemos utilizar o tipo float ao invés de int para converter os valores " +
                                "informados pelo usuário. Por exemplo:\n\n" +
                                "   n1 = float(input(\"Digite o primeiro número: \"))\n" +
                                "   n2 = float(input(\"Digite o segundo número: \"))\n" +
                                "   soma = n1 + n2\n" +
                                "       print(f\"A soma é:{soma}\")\n\n" +
                                " Nesse código, estamos utilizando a função float() para converter os valores " +
                                "informados pelo usuário para o tipo float, ou seja, valores do tipo float ou números reais, " +
                                "são representados com um ponto decimal, por exemplo: 1.5, 3.14159265359, -0.5.\n\n" +
                                " Em seguida, estamos somando os valores e armazenando o resultado na variável " +
                                "\"soma\". Por fim, estamos exibindo o resultado na tela utilizando a função print().\n\n" +
                                " Em resumo, para somar dois valores informados pelo usuário em Python, devemos " +
                                "utilizar a função input() para receber a entrada de dados do usuário, e em seguida " +
                                "converter os valores para o tipo numérico (int ou float) apropriado para a operação de " +
                                "soma que desejamos realizar.\n\n\n");
                startActivity(i);
            }
        });

        ass5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operações Aritméticas!");
                i.putExtra("texto_assunto",
                        " As operações aritméticas são utilizadas na matemática para realizar cálculos " +
                                "matemáticos básicos como adição, subtração, multiplicação, divisão, entre outros. Em " +
                                "programação, as operações aritméticas são usadas para executar cálculos semelhantes, " +
                                "mas em vez de trabalhar com números em uma folha de papel, elas trabalham com valores " +
                                "armazenados na memória do computador.\n\n"+
                        "Adição (+):\n" +
                                " É utilizada para somar dois valores.\nExemplo: 2 + 3 = 5.\n\n" +
                        "Subtração (-):\n" +
                                " É utilizada para subtrair um valor de outro.\nExemplo: 5 - 2 = 3.\n\n" +
                        "Multiplicação (*):\n" +
                                " É utilizada para multiplicar dois valores.\nExemplo: 2 * 3 = 6.\n\n" +
                        "Divisão (/):\n" +
                                " É utilizada para dividir um valor por outro.\nExemplo: 6 / 3 = 2.\n\n" +
                        "Divisão inteira (//):\n" +
                                " É utilizada para realizar uma divisão inteira entre dois valores, " +
                                "ou seja, retornar apenas a parte inteira do resultado.\nExemplo: 7 // 3 = 2.\n\n" +
                        "Resto da divisão (%):\n " +
                                " É utilizada para retornar o resto da divisão entre dois " +
                                "valores.\nExemplo: 7 % 3 = 1.\n\n" +
                        "Potenciação (**):\n" +
                                " É utilizada para elevar um valor a uma potência.\nExemplo: 2 ** 3 = 8.\n\n"+
                        " Essas operações aritméticas são amplamente utilizadas em programação, " +
                                "especialmente em cálculos matemáticos complexos. Elas são uma base fundamental para " +
                                "a construção de algoritmos e programas em geral, permitindo que os programadores " +
                                "possam criar soluções computacionais para uma grande variedade de problemas, como " +
                                "cálculos financeiros, simulações físicas, processamento de imagens, entre outros.\n\n\n"+
                        "Exercício explicado:\n\n" +
                                "Ex.2 Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre sua " +
                                "média.\n\n" +
                                "   n1 = float(input('Digite a primeira nota: '))\n " +
                                "   n2 = float(input('Digite a segunda nota: '))\n " +
                                "   med = (n1+n2)/2\n" +
                                "       print(f'A média do aluno foi de {med}')\n\n" +
                                " A primeira linha e segunda linha pede ao usuário que digite as duas notas e " +
                                "armazena o valor digitado nas variáveis chamada n1 e n2, respectivamente. O input() " +
                                "retorna uma string, que é convertida em um número de ponto flutuante (float) usando a " +
                                "função float().\n\n" +
                                " A linha que está a variável “med” tem a função de calcular a média das duas notas " +
                                "e armazenar o valor na variável “med”. O cálculo da média é feito adicionando as duas " +
                                "notas e dividindo o resultado por dois.\n\n" +
                                " Por fim, a última linha exibe o resultado na tela usando a função print(). A letra " +
                                "\"f\" no início da string indica que ela é uma string formatada, chamada de f-string, " +
                                "permitindo que você insira o valor da variável med dentro da string usando chaves {}.\n\n" +
                                " Quando o programa é executado, a string será exibida na tela com o valor da média " +
                                "calculada pelo programa.\n\n\n");
                startActivity(i);
            }
        });

        ass6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Importações de Bibliotecas!");
                i.putExtra("texto_assunto",
                        "- Biblioteca Matemática:\n\n" +
                                " As bibliotecas do Python são conjuntos de módulos que contêm funções e métodos " +
                                "que podem ser usados em seus programas. As bibliotecas são usadas para realizar tarefas " +
                                "específicas que não fazem parte das funções padrão do Python.\n\n" +
                                " Para usar uma biblioteca em seu programa, você precisa primeiro importá-la. Isso " +
                                "é feito usando a palavra-chave import seguida pelo nome da biblioteca. Por exemplo, para " +
                                "importar a biblioteca math, você pode fazer o seguinte:\n\n" +
                                "   import math\n\n" +
                                " Isso faz com que todas as funções e métodos da biblioteca math fiquem " +
                                "disponíveis para uso em seu programa.\n\n" +
                                " Com essa linha de código, você está dizendo ao Python que deseja usar as funções " +
                                "da biblioteca math. Depois de importar a biblioteca, você pode usar suas funções em seu " +
                                "código chamando o nome da biblioteca, seguido pelo nome da função desejada. Para usála em seu código, você pode fazer o seguinte:\n\n" +
                                "   import math\n" +
                                "   num = 25\n" +
                                "   raiz = math.sqrt(num)\n" +
                                "       print(raiz)\n\n" +
                                " Neste exemplo, o programa importa a biblioteca math e, em seguida, chama a " +
                                "função sqrt() passando o número 25 como argumento. A raiz quadrada de 25 é calculada " +
                                "e armazenada na variável raiz. Em seguida, o programa imprime o valor da raiz quadrada " +
                                "na tela.\n\n\n" +
                        "- Biblioteca de aleatoriedade:\n\n" +
                                " A biblioteca random é uma biblioteca do Python que fornece funções para gerar " +
                                "números aleatórios e fazer operações relacionadas à aleatoriedade. Essa biblioteca pode " +
                                "ser útil em vários tipos de programas, como jogos, simulações e algoritmos de " +
                                "aprendizado de máquina.\n\n" +
                                " Para usar a biblioteca random em seu programa, você precisa importá-la usando a " +
                                "palavra-chave import. Por exemplo, você pode fazer o seguinte para importar a biblioteca " +
                                "random:\n\n" +
                                "   import Random\n\n" +
                                " Uma das funções mais comuns da biblioteca random é a função randint(), que gera " +
                                "um número inteiro aleatório entre dois valores especificados. Por exemplo, o seguinte " +
                                "código gera um número inteiro aleatório entre 1 e 10:\n\n" +
                                "   import random\n" +
                                "   numero_aleatorio = random.randint(1, 10)\n" +
                                "       print(numero_aleatorio)\n\n" +
                                " A biblioteca random também inclui funções para embaralhar elementos em uma " +
                                "lista ou sequência, como a função shuffle() e para escolher um elemento aleatório de uma " +
                                "lista, como a função choice(). Além disso, a biblioteca random também fornece suporte " +
                                "para gerar sequências pseudoaleatórias, que são úteis para testes e para garantir a " +
                                "reprodutibilidade dos resultados.\n\n" +
                                " Em resumo, a biblioteca random é uma ferramenta muito útil para lidar com " +
                                "aleatoriedade e gerar números ou sequências aleatórias em seus programas Python.\n\n\n");
                startActivity(i);
            }
        });

        ass7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Estrutura de Decisão!");
                i.putExtra("texto_assunto",
                        " A estrutura de decisão é uma forma de ensinar o computador a tomar decisões. É como " +
                                "se fosse uma escolha que o computador precisa fazer, e para isso ele precisa seguir " +
                                "algumas instruções que você escreve.\n\n" +
                                " Por exemplo, imagine que você queira ensinar o computador a decidir se deve ou " +
                                "não comer uma fruta. Você poderia escrever algo assim:\n\n" +
                                "\"Se a fruta é uma maçã, então coma a maçã. Caso contrário, não coma a fruta.\"\n\n" +
                                " Essa é uma estrutura de decisão simples que o computador pode seguir. Ele " +
                                "verifica se a fruta é uma maçã e, se for, come a maçã. Se não for uma maçã, ele não come " +
                                "a fruta.\n\n" +
                                " Você pode usar a estrutura de decisão em situações mais complexas também. Por " +
                                "exemplo, imagine que você queira ensinar o computador a decidir se uma pessoa pode " +
                                "entrar em um jogo ou não. Você poderia escrever algo assim:\n\n" +
                                "\"Se a pessoa tem mais de 18 anos, então ela pode entrar no jogo. Caso contrário, " +
                                "ela não pode entrar.\"\n\n" +
                                " Novamente, o computador verifica se a pessoa tem mais de 18 anos e, se tiver, ela " +
                                "pode entrar no jogo. Se não tiver mais de 18 anos, ela não pode entrar.\n\n\n"+

                        "Utilização dos comandos “if” e “else”:\n\n" +
                                " O comando \"if\" é usado para verificar uma condição. Se a condição for verdadeira, " +
                                "o código dentro do bloco \"if\" é executado. Se a condição for falsa, o código dentro do " +
                                "bloco \"if\" é ignorado e a execução continua no próximo bloco de código.\n\n" +
                                " O comando \"else\" é usado para executar um bloco de código alternativo caso a " +
                                "condição verificada pelo \"if\" seja falsa. O bloco \"else\" só é executado se a condição do " +
                                "\"if\" for falsa.\n\n" +
                                " Aqui está um exemplo de código Python que usa a estrutura \"if\" e \"else\": \n\n" +
                                "  idade = 18\n" +
                                "    if idade >= 18:\n" +
                                "       print(\"Você é maior de idade.\")\n" +
                                "    else:\n" +
                                "  print(\"Você é menor de idade.\")\n\n" +
                                " Neste exemplo, a variável \"idade\" é definida como 18. O comando \"if\" verifica se " +
                                "a idade é maior ou igual a 18. Como a idade é igual a 18, a condição é verdadeira e o " +
                                "código dentro do bloco \"if\" é executado. Neste caso, a mensagem \"Você é maior de " +
                                "idade.\" é exibida.\n\n" +
                                " Note que o bloco de código que deve ser executado se a condição for verdadeira " +
                                "(no caso, a impressão \"Você é maior de idade!\") é indentado, ou seja, está um nível de " +
                                "recuo à direita em relação ao comando \"if\". Isso é importante em Python, porque o " +
                                "recuo indica ao interpretador onde começa e onde termina o bloco de código que deve " +
                                "ser executado se a condição for verdadeira.\n\n\n" +

                        "Exercício Explicativo:\n\n" +
                                "Ex.4 Crie um programa que leia um número inteiro e mostre na tela se ele é par ou ímpar.\n\n" +
                                "  n1 = int(input('Digite qualquer número inteiro: '))\n" +
                                "  resto = n1 % 2\n" +
                                "     if resto == 0:\n" +
                                "       print('O número digitado é par.')\n" +
                                "     else:\n" +
                                "  print('O número digitado é ímpar.')\n\n" +
                                " Esse é um código simples que usa a estrutura de decisão \"if\" e \"else\" para verificar " +
                                "se um número é par ou ímpar.\n\n" +
                                " Na primeira linha, usamos a função \"input\" para solicitar que o usuário digite um " +
                                "número inteiro. Esse valor é convertido em um inteiro usando a função \"int\" e armazenado " +
                                "na variável \"n1\". Na segunda linha, usamos o operador de módulo \"%\" para calcular o " +
                                "resto da divisão de \"n1\" por 2. Se o resto for igual a 0, isso significa que \"n1\" é um número " +
                                "par. Caso contrário, \"n1\" é um número ímpar.\n\n" +
                                " Em seguida, o programa usa a estrutura de decisão \"if\" e \"else\" para verificar se o " +
                                "resto da divisão é igual a 0. Se for, o programa imprime \"O número digitado é par.\". Caso " +
                                "contrário, o programa imprime \"O número digitado é ímpar.\".\n\n" +
                                " Esse é um exemplo simples, mas a estrutura de decisão \"if\" e \"else\" pode ser usada " +
                                "para tomar decisões mais complexas em programas mais avançados.\n\n" );
                startActivity(i);
            }
        });

        ass8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Phyton_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Estrutura de Respetição!");
                i.putExtra("texto_assunto",
                        " A estrutura de repetição é uma forma de ensinar o computador a repetir uma tarefa " +
                                "várias vezes. É como se fosse uma sequência de instruções que o computador segue para " +
                                "fazer a mesma coisa várias vezes.\n\n" +
                                " Existem dois tipos de estruturas de repetição em Python: \"for\" e \"while\".\n\n" +
                                "For:\n" +
                                " A estrutura de repetição \"for\" é usada quando você sabe exatamente quantas vezes " +
                                "deseja que o loop se repita. Por exemplo, se você quiser imprimir a mensagem \"Olá, " +
                                "mundo!\" cinco vezes, você pode usar um loop \"for\" desta forma:\n\n" +
                                "   for i in range(5):\n" +
                                "       print(\"Olá, mundo!\")\n\n" +
                                " Neste exemplo, usamos a função \"range\" para gerar uma sequência de números " +
                                "de 0 a 4, e o loop \"for\" se repete cinco vezes, uma vez para cada número na sequência.\n\n" +
                                " Dentro do loop, imprimimos a mensagem \"Olá, mundo!\".\n\n" +
                                " A letra \"i\" é usada como uma variável de controle do loop. Essa variável assume " +
                                "valores diferentes a cada iteração do loop, começando com o valor inicial definido na " +
                                "função \"range\" e incrementando em 1 a cada iteração.\n\n" +
                                "While:\n" +
                                " O \"while\" é uma estrutura de repetição em Python que permite executar um " +
                                "conjunto de instruções enquanto uma condição for verdadeira. O loop \"while\" é útil "+
                                "quando você precisa repetir uma tarefa várias vezes, mas não sabe exatamente quantas " +
                                "vezes ela precisa ser repetida.\n\n" +
                                "Aqui vai um exemplo de como se usa o “While”.\n\n" +
                                "senha_correta = \"1234\"\n" +
                                "tentativa = input(\"Digite a senha: \")\n" +
                                "  while tentativa != senha_correta:\n" +
                                "   print(\"Senha incorreta!\")\n" +
                                "   tentativa = input(\"Digite a senha novamente: \")\n" +
                                "   print(\"Senha correta! Bem-vindo!\")\n\n" +
                                " Neste exemplo, estamos pedindo ao usuário que digite uma senha. Se a senha " +
                                "estiver incorreta, o programa informa que a senha está incorreta e pede ao usuário que " +
                                "digite a senha novamente. Isso se repete até que o usuário digite a senha correta.\n\n" +
                                " O loop \"while\" é executado enquanto a condição especificada for verdadeira.\n\n" +
                                " Neste caso, a condição é que a variável \"tentativa\" seja diferente da senha correta. A cada " +
                                "iteração do loop, o programa verifica se a senha digitada é a correta. Se não for, o " +
                                "programa pede ao usuário que digite a senha novamente e o loop se repete. Se a senha " +
                                "estiver correta, o loop termina e o programa imprime a mensagem \"Senha correta! Bemvindo!\".\n\n" +
                                " \"!=\" é um operador de comparação em Python que significa \"não é igual a\". É " +
                                "usado para comparar dois valores e verificar se eles são diferentes.\n\n" +
                                " No exemplo do código, o operador \"!=\" é usado para comparar a variável " +
                                "\"tentativa\" (que contém a senha digitada pelo usuário) com a senha correta. Enquanto as " +
                                "duas strings forem diferentes (ou seja, a senha digitada estiver incorreta), o loop \"while\" " +
                                "continuará executando e pedindo ao usuário que digite a senha novamente.\n\n" +
                                " É importante mencionar que, em Python, também existem outros operadores de " +
                                "comparação, como \"==\", que significa \"é igual a\", \"<\", que significa \"menor que\", \">\" " +
                                "que significa \"maior que\", \"<=\", que significa \"menor ou igual a\", e \">=\", que significa " +
                                "\"maior ou igual a\". Esses operadores podem ser usados para comparar diferentes tipos de " +
                                "dados, como números, strings, listas e outros objetos em Python\n\n"
                        );
                startActivity(i);
            }
        });


    }
}