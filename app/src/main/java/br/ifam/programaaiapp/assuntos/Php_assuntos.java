package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Php_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout assunto1, assunto2, assunto3, assunto4, assunto5, assunto6,
    assunto7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_php_assuntos);
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
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "História do Php");
                i.putExtra("texto_assunto",
                        " O PHP (Hypertext Preprocessor) é uma linguagem de programação de código aberto " +
                                "amplamente utilizada para o desenvolvimento web. Foi criada por Rasmus Lerdorf em 1994 como uma " +
                                "ferramenta para rastrear visitantes de seu site pessoal. Inicialmente, o PHP era apenas um conjunto de " +
                                "scripts CGI (Common Gateway Interface) escritos em C.\n\n"+
                        " Com o tempo, a popularidade do PHP cresceu e Rasmus Lerdorf lançou a primeira versão oficial " +
                                "do PHP em 1995. Essa versão inicial permitia que os desenvolvedores incorporassem código PHP em " +
                                "páginas HTML, permitindo a criação de páginas dinâmicas. O PHP evoluiu rapidamente e, em 1997, foi " +
                                "lançada a versão 3, que incluía várias melhorias e recursos novos.\n\n"+
                        " No entanto, foi com o lançamento da versão 4 do PHP em 2000 que a linguagem ganhou " +
                                "reconhecimento mundial e se tornou amplamente adotada pelos desenvolvedores web. A versão 4 " +
                                "trouxe melhorias significativas, incluindo suporte a programação orientada a objetos e um novo " +
                                "modelo de execução de scripts.\n\n"+
                        " Em 2004, o PHP 5 foi lançado, trazendo recursos avançados de orientação a objetos, como " +
                                "namespaces, interfaces e classes abstratas. Essa versão também introduziu melhorias de desempenho " +
                                "significativas e recursos de gerenciamento de memória aprimorados.\n\n"+
                        " A evolução do PHP continuou com o lançamento do PHP 7 em 2015. Essa versão trouxe uma " +
                                "melhoria significativa no desempenho, tornando o PHP mais rápido e eficiente. Além disso, o PHP 7 " +
                                "introduziu recursos como o operador de nave espacial (<=>) para comparações e declaração de tipo " +
                                "escalares.\n\n"+
                        " Desde então, o PHP continua a ser desenvolvido e aprimorado pela comunidade de " +
                                "desenvolvedores em todo o mundo. A linguagem se tornou um dos pilares do desenvolvimento web, " +
                                "sendo amplamente utilizada em aplicações de todos os tamanhos, desde pequenos sites até grandes " +
                                "sistemas de gerenciamento de conteúdo e aplicativos web complexos.\n\n"+
                        " Hoje, o PHP é suportado por uma ampla gama de frameworks populares, como Laravel, " +
                                "Symfony e CodeIgniter, que ajudam os desenvolvedores a criar aplicativos web robustos e escaláveis. " +
                                "Além disso, o PHP também tem uma vasta comunidade de desenvolvedores que contribuem com " +
                                "bibliotecas, pacotes e recursos adicionais para facilitar o desenvolvimento web.\n\n"+
                        " Em resumo, a história do PHP mostra como uma ferramenta inicialmente criada para rastrear " +
                                "visitantes de um site pessoal se transformou em uma das linguagens de programação mais populares " +
                                "e influentes para o desenvolvimento web.\n\n");
                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Tipos de Variáveis");
                i.putExtra("texto_assunto", " No PHP, existem vários tipos de variáveis que podem ser usadas para armazenar diferentes " +
                        "tipos de dados. Aqui estão os principais tipos de variáveis no PHP:\n\n\n"+
                        "●\tInteger (Inteiro): Armazena números inteiros, como 1, 10, -5, etc.\n\n" +
                        "   $idade = 25;\n\n\n"+
                        "●\tFloat (Ponto Flutuante): Armazena números com casas decimais, como 3.14, 2.5, etc.\n\n" +
                        "   $altura = 1.75;\n\n\n"+
                        "●\tString: Armazena sequências de caracteres, como texto.\n\n" +
                        "   $nome = \"João\";\n\n\n"+
                        "●\tBoolean: Armazena valores lógicos verdadeiro (true) ou falso (false).\n\n" +
                        "   $aprovado = true;\n\n\n"+
                        "●\tArray: Armazena uma coleção de valores relacionados, que podem ser acessados por índices.\n\n" +
                        "   $numeros = array(1, 2, 3, 4, 5);\n\n\n"+
                        "●\tObject (Objeto): Armazena uma instância de uma classe, que contém propriedades e métodos.\n\n" +
                        "   class Pessoa {\n" +
                        "     public $nome;\n" +
                        "     public $idade;\n" +
                        "   }\n" +
                        "   $pessoa = new Pessoa();\n" +
                        "   $pessoa->nome = \"Maria\";\n" +
                        "   $pessoa->idade = 30;\n\n\n"+
                        "●\tNULL: Armazena um valor nulo, indicando que a variável não possui nenhum valor definido.\n" +
                        "   $valor = null;\n\n"+
                        " Esses são os principais tipos de variáveis usados no PHP. É importante notar que o PHP é uma " +
                        "linguagem fracamente tipada, o que significa que você não precisa declarar explicitamente o tipo de " +
                        "uma variável antes de usá-la. O tipo da variável é inferido automaticamente com base no valor " +
                        "atribuído a ela.\n\n");
                startActivity(i);
            }
        });

        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Entrada e Saída de Dados");
                i.putExtra("texto_assunto",
                        " No PHP, existem várias maneiras de lidar com a entrada e saída de dados. Aqui estão algumas " +
                        "das principais formas de realizar essa tarefa:\n\n"+
                        "- Saída de dados:\n\n"+
                        "●\techo: O echo é usado para imprimir dados diretamente na saída do script PHP. Você pode usar " +
                                "o echo para imprimir strings, variáveis e expressões.\n\n" +
                                " Exemplo:\n\n" +
                                " $nome = \"João\";\n" +
                                " echo \"Olá, $nome!\"; // Saída: Olá, João!\n\n\n"+
                        "●\tprint: O print é semelhante ao echo e também é usado para imprimir dados na saída. A " +
                                "diferença é que o print retorna um valor (1) e só pode ser usado para imprimir uma string.\n\n" +
                                " Exemplo:\n\n" +
                                " $mensagem = \"Bem-vindo!\";\n" +
                                " print $mensagem; // Saída: Bem-vindo!\n\n\n"+

                        "- Entrada de dados:\n\n"+
                        "●\t$_GET e $_POST: Essas são superglobais do PHP que são usadas para lidar com dados enviados " +
                                "por meio dos métodos GET e POST em formulários HTML. Você pode acessar esses dados diretamente " +
                                "por meio das variáveis $_GET e $_POST, que são arrays associativos.\n\n"+
                                " Exemplo:\n\n" +
                                "   $nome = $_POST['nome'];\n" +
                                "   $email = $_POST['email'];\n\n\n"+
                        "●\t$_REQUEST: A variável superglobal $_REQUEST é usada para acessar dados enviados tanto por " +
                                "métodos GET quanto POST. Ela combina os dados de $_GET, $_POST e $_COOKIE, permitindo acesso a " +
                                "todas as informações enviadas pelo cliente.\n\n" +
                                " Exemplo:\n\n" +
                                "   $nome = $_REQUEST['nome'];\n" +
                                "   $email = $_REQUEST['email'];\n\n\n"+
                        "●\tfgets(STDIN): Se você estiver executando um script PHP em um terminal, pode usar a função " +
                                "fgets para ler a entrada do usuário a partir do STDIN (entrada padrão). Ela permite que você leia dados " +
                                "digitados pelo usuário durante a execução do script.\n\n" +
                                " Exemplo:\n\n" +
                                "   $idade = fgets(STDIN);\n\n\n"+
                        " Essas são apenas algumas das principais formas de lidar com a entrada e saída de dados em " +
                                "PHP. Existem também outras funções e métodos específicos para diferentes casos de uso, como leitura " +
                                "e gravação de arquivos, acesso a bancos de dados, etc.\n\n\n");
                startActivity(i);
            }
        });

        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operadores Matemáticos");
                i.putExtra("texto_assunto",
                        " No PHP, existem vários operadores matemáticos que permitem realizar operações aritméticas " +
                                "com valores numéricos. Aqui estão os principais operadores matemáticos no PHP:\n\n\n"+
                        "- Operador de Adição (+): Realiza a adição de dois valores.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = 5;\n" +
                                "   $b = 3;\n" +
                                "   $resultado = $a + $b;\n" +
                                "   echo $resultado; // Saída: 8\n\n\n"+
                        "- Operador de Subtração (-): Realiza a subtração de dois valores.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = 8;\n" +
                                "   $b = 3;\n" +
                                "   $resultado = $a - $b;\n" +
                                "   echo $resultado; // Saída: 5\n\n\n"+
                        "- Operador de Multiplicação (*): Realiza a multiplicação de dois valores.\n\n"+
                                " Exemplo:\n" +
                                "   $a = 4;\n" +
                                "   $b = 2;\n" +
                                "   $resultado = $a * $b;\n" +
                                "   echo $resultado; // Saída: 8\n\n\n"+
                        "- Operador de Divisão (/): Realiza a divisão de dois valores.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = 10;\n" +
                                "   $b = 2;\n" +
                                "   $resultado = $a / $b;\n" +
                                "   echo $resultado; // Saída: 5\n\n\n"+
                        "- Operador de Módulo/Resto da Divisão (%): Retorna o resto da divisão de dois valores.\n\n" +
                                " Exemplo:\n" +
                                "   $a = 10;\n" +
                                "   $b = 3;\n" +
                                "   $resultado = $a % $b;\n" +
                                "   echo $resultado; // Saída: 1\n\n\n"+
                        "- Operador de Exponenciação (**):\n Realiza a exponenciação de um valor.\n\n" +
                                " Exemplo:\n" +
                                "   $a = 2;\n" +
                                "   $b = 3;\n" +
                                "   $resultado = $a ** $b;"+
                                "   echo $resultado; // Saída: 8\n\n\n"+
                        "- Operadores de Incremento (++) e Decremento (--): Incrementa ou decrementa o valor de uma " +
                                "variável.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = 5;\n" +
                                "   $a++; // Incremento\n" +
                                "   echo $a; // Saída: 6\n\n" +
                                "   $b = 8;\n" +
                                "   $b--; // Decremento\n" +
                                "   echo $b; // Saída: 7\n\n\n"+
                        " Esses são os principais operadores matemáticos disponíveis no PHP. Eles podem ser usados em " +
                                "expressões aritméticas para realizar cálculos e manipular valores numéricos.\n\n\n");
                startActivity(i);
            }
        });

        assunto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operadores Lógicos");
                i.putExtra("texto_assunto",
                        " No PHP, existem três operadores lógicos principais: \"E\" lógico (&&), \"OU\" lógico (||) e \"NÃO\" " +
                                "lógico (!). Esses operadores são usados para combinar e avaliar expressões lógicas. Aqui está uma " +
                                "descrição de cada um deles:\n\n"+
                        "- Operador \"E\" lógico (&&): Retorna verdadeiro apenas se todas as expressões envolvidas forem " +
                                "verdadeiras. Caso contrário, retorna falso.\n\n"+
                        " Exemplo:\n\n" +
                                "   $a = true;\n" +
                                "   $b = false;\n\n" +
                                "   if ($a && $b) {\n" +
                                "   echo \"Ambas as condições são verdadeiras.\";\n" +
                                "   } else {\n"+
                                "       echo \"Pelo menos uma das condições é falsa.\";\n" +
                                "   }\n\n\n"+
                        "- Operador \"OU\" lógico (||): Retorna verdadeiro se pelo menos uma das expressões envolvidas " +
                                "for verdadeira. Retorna falso somente se todas as expressões forem falsas.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = true;\n" +
                                "   $b = false;\n\n"+
                                "   if ($a || $b) {\n" +
                                "     echo \"Pelo menos uma das condições é verdadeira.\";\n" +
                                "   } else {\n" +
                                "   echo \"Ambas as condições são falsas.\";\n" +
                                "   }\n\n\n"+
                        "- Operador \"NÃO\" lógico (!): Inverte o valor de uma expressão, tornando verdadeiro falso e falso " +
                                "verdadeiro.\n\n" +
                                " Exemplo:\n\n" +
                                "   $a = true;\n\n"+
                                "     if (!$a) {\n" +
                                "       echo \"A condição é falsa.\";\n" +
                                "     } else {\n" +
                                "      echo \"A condição é verdadeira.\";\n" +
                                "     }\n\n\n"+
                        " Além desses operadores, também é possível usar parênteses para agrupar e controlar a ordem " +
                                "de avaliação das expressões lógicas.\n\n"+
                        " É importante entender a lógica desses operadores para criar condições eficientes em " +
                                "seus programas PHP.\n\n");
                startActivity(i);
            }
        });

        assunto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Estruturas Condicionais");
                i.putExtra("texto_assunto", "Condicional Simples e Composta: \n\n"+
                        "- Estrutura condicional simples: \n\n"+
                        " A estrutura condicional simples é utilizada quando você deseja executar um bloco de código " +
                        "apenas se uma condição for verdadeira. A sintaxe é a seguinte:\n\n"+
                        "   if (condição) {\n" +
                        "     // Código a ser executado se a condição for verdadeira\n" +
                        "   }\n\n" +
                        " Exemplo:\n\n"+
                        "  $idade = 25;\n\n" +
                        "    if ($idade >= 18) {\n" +
                        "      echo \"Você é maior de idade.\";\n" +
                        "    }\n\n"+
                        " Nesse exemplo, o código dentro do bloco do if será executado apenas se a variável $idade for " +
                        "maior ou igual a 18.\n\n\n"+

                        "- Estrutura condicional composta: \n\n"+
                        " A estrutura condicional composta é utilizada quando você deseja executar um bloco de código " +
                        "se uma condição for verdadeira e outro bloco de código se a condição for falsa. A sintaxe é a seguinte:\n\n"+
                        "   if (condição) {\n" +
                        "     // Código a ser executado se a condição for verdadeira\n" +
                        "   } else {\n" +
                        "    // Código a ser executado se a condição for falsa\n" +
                        "   }\n\n"+
                        " Exemplo:\n\n" +
                        "  $idade = 15;\n\n" +
                        "   if ($idade >= 18) {\n" +
                        "     echo \"Você é maior de idade.\";\n" +
                        "   } else {\n" +
                        "     echo \"Você é menor de idade.\";\n" +
                        "   }\n\n\n"+

                        " Nesse exemplo, se a variável $idade for maior ou igual a 18, será exibida a mensagem \"Você é " +
                        "maior de idade\". Caso contrário, será exibida a mensagem \"Você é menor de idade\".\n\n"+
                        " Essas estruturas condicionais são fundamentais para tomar decisões em seu código com base " +
                        "em condições específicas. Você pode aninhar condicionais e utilizar operadores lógicos para criar " +
                        "lógicas mais complexas, conforme necessário\n\n\n");

                startActivity(i);
            }
        });

        assunto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Php_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Laços de Repetição");
                i.putExtra("texto_assunto",
                        " No PHP, você pode utilizar laços de repetição para executar blocos de código várias vezes com " +
                                "base em uma condição. Existem três tipos principais de laços de repetição no PHP: for, while e do-while.\n\n"+
                        "- for: \n\n"+
                        " O laço for é utilizado quando você sabe antecipadamente quantas vezes o bloco de código " +
                                "precisa ser repetido. A estrutura básica é a seguinte:\n\n"+
                        "   for (inicialização; condição; incremento) {\n" +
                                "   // Código a ser repetido\n" +
                                "   }\n\n" +
                                " Exemplo:\n\n" +
                                "   for ($i = 1; $i <= 10; $i++) {\n" +
                                "     echo $i . \" \";\n" +
                                "   }\n\n" +
                                " Nesse exemplo, o laço for irá imprimir os números de 1 a 10.\n\n\n"+

                        "- while: \n\n"+
                        " O laço while é utilizado quando você precisa repetir um bloco de código enquanto uma " +
                                "condição for verdadeira. A estrutura básica é a seguinte:\n\n"+
                        "   while (condição) {\n" +
                        "    // Código a ser repetido\n" +
                        "   }\n\n"+
                        " Exemplo:\n\n" +
                        "  $i = 1;\n\n" +
                        "    while ($i <= 10) {\n" +
                        "      echo $i . \" \";\n" +
                        "      $i++;\n" +
                        "    }\n\n"+
                        " Nesse exemplo, o laço while irá imprimir os números de 1 a 10\n\n\n"+

                        "- do-while: \n\n"+
                        " O laço do-while é semelhante ao while, mas a diferença é que o bloco de código é executado " +
                        "pelo menos uma vez, mesmo se a condição for falsa. A estrutura básica é a seguinte:\n\n"+
                        "   do {\n" +
                        "    // Código a ser repetido\n" +
                        "   } while (condição);\n\n" +
                        "Exemplo:\n\n" +
                        "   $i = 1;\n\n"+
                        "     do {\n" +
                        "        echo $i . \" \";\n"+
                        "        $i++;\n" +
                        "     } while ($i <= 10);\n\n" +
                        " Nesse exemplo, o laço do-while irá imprimir os números de 1 a 10.\n\n"+
                        " Esses são os principais laços de repetição no PHP. Eles permitem que você execute blocos de " +
                                "código repetidamente com base em uma condição, facilitando a implementação de lógica de repetição " +
                                "em seus programas. Além disso, você também pode aninhar laços e utilizar instruções de controle " +
                                "como break e continue para controlar o fluxo de execução dos laços.\n\n\n");
                startActivity(i);
            }
        });

    }
}
