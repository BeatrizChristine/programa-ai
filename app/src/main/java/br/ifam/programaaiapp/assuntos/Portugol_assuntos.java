package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Portugol_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    private LinearLayout assunto1, assunto2, assunto3, assunto4, assunto5, assunto6,
            assunto7, assunto8, assunto9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portugol_assuntos);
        backbutton = findViewById(R.id.backbutton);
        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);
        assunto3 = findViewById(R.id.assunto3);
        assunto4 = findViewById(R.id.assunto4);
        assunto5 = findViewById(R.id.assunto5);
        assunto6 = findViewById(R.id.assunto6);
        assunto7 = findViewById(R.id.assunto7);
        assunto8 = findViewById(R.id.assunto8);
        assunto9 = findViewById(R.id.assunto9);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Portugol\nO que é?");
                i.putExtra("texto_assunto", " Foram feitos alguns estudos de como o aprendizado de programação pode ser difícil para iniciantes, principalmente usando IDEs profissionais. Além disso, as linguagens de programação usam, na maioria, o idioma inglês, uma barreira muito comum para iniciantes. Além de que as mensagens de erro de muitos compiladores não indicam o problema dificultando saber qual erro o usuário iniciante está cometendo. Outro problema é o fato de os depuradores das IDEs profissionais serem muito complexos, dificultando ao aprendiz saber o que está acontecendo.\n\n" +
                        " Com essa ideia em mente o Portugol Studio teve início em 2007 com o desenvolvimento do núcleo do Portugol Studio, feito pelo estudante Luiz Fernando Noschang na Universidade do Vale do Itajaí (UNIVALI). O núcleo do Portugol Studio, diferente da linguagem conhecida como Portugol, foi desenvolvido com uma sintaxe mais parecida com C e PHP, para facilitar a transição dos estudantes para linguagens de programação profissionais, por isso, essa sintaxe foi chamada de Portugol 2.0. Essa decisão foi tomada porque o Portugol Studio seria designado à iniciantes de programação e seria uma ferramenta que os ajudasse a iniciar nas linguagens profissionais.\n\n\n"+
                        " Está baseado em quais linguagens?\n\n" +
                        " O Portugol Studio é uma ferramenta para aprender programação, voltada para as pessoas que falam o idioma português. Possui uma sintaxe fácil baseada em C e PHP, diversos exemplos e materiais de apoio à aprendizagem. Também possibilita a criação de jogos e outras aplicações.\n\n");

                startActivity(i);
            }
        });
        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Tipos de Dados");
                i.putExtra("texto_assunto","Tipos:\n\n" +
                        "●\tTipo Cadeia \n" +
                        "●\tTipo Caracter \n" +
                        "●\tTipo Inteiro \n" +
                        "●\tTipo Lógico  \n" +
                        "●\tTipo Real  \n" +
                        "●\tTipo Vazio\n\n\n"+
                        "- Tipo Cadeia\n\n" +
                        " Em algumas situações precisa-se armazenar em uma variável, um texto ou uma quantidade grande de caracteres. Para armazenar este tipo de conteúdo, utiliza-se uma variável do tipo cadeia. Cadeia é uma sequência ordenada de caracteres (símbolos) escolhidos a partir de um conjunto pré-determinado. A sintaxe é a palavra reservada cadeia seguida do nome da variável.\n\n\n"+
                        "- Tipo Caracter\n\n" +
                        " Em determinadas situações faz-se necessário o uso de símbolos, letras ou outro tipo de conteúdo. Por exemplo, em um jogo da velha, seriam necessárias variáveis que tivessem*conteúdos de 'X' e '0'. Para este tipo de situação, existe a variável do tipo caracter. A variável do tipo caracter é aquela que contém uma informação composta de apenas UM caracter alfanumérico ou especial. \n"+
                        "Exemplos de caracteres são letras, números, pontuações e etc.\n\n\n"+
                        "- Tipo Inteiro \n\n" +
                        " Em determinadas situações faz-se necessário a utilização de valores inteiros em um algoritmo. Como faríamos, por exemplo, uma simples soma entre dois números pertencentes*ao conjunto dos números inteiros? Simples. Utilizando variáveis do tipo inteiro. Uma variável do tipo inteiro pode ser entendida como uma variável que contém qualquer número*que pertença ao conjunto dos números inteiros. Podem ser positivos, negativos ou nulos.\n\n\n"+
                        "- Tipo Lógico \n\n" +
                        " Em determinadas situações faz-se necessário trabalhar com informações do tipo verdadeiro e falso. Este tipo de necessidade aparece muito em operações relacionais para exibir*se determinada condição é verdadeira ou falsa. Por exemplo: como poderíamos verificar se um número digitado pelo usuário é maior que zero? Através de uma variável do tipo logico. Uma variável do tipo logico é aquela que contém um tipo de dado, usado em operações lógicas, que possui somente dois valores, que são consideradas pelo Portugol*como verdadeiro e falso.\n\n\n"+
                        "- Tipo real\n\n" +
                        " Em algumas situações é necessário armazenar valores que não pertencem aos números inteiros. Por exemplo, se quiséssemos armazenar o valor da divisão de 8 por 3, como faríamos? Este problema pode ser solucionado com uma variável do tipo real. Uma variável do tipo real armazena um número real como uma fração decimal possivelmente*infinita, como o número PI 3.1415926535. \n" +
                        " Os valores do tipo de dado *real* são números separados por pontos e não por vírgulas.\n\n\n"+
                        "- Tipo Vazio\n\n" +
                        " Vazio é usado para o resultado de uma função que retorna normalmente, mas não fornece um valor de resultado ao seu chamado. Normalmente, essas funções de tipo vazio são chamadas por seus efeitos colaterais, como a realização de alguma tarefa ou escrevendo os seus parâmetros na saída de dados. A função com o tipo vazio termina ou por atingir o final da função ou executando um comando retorne sem valor retornado.\n\n\n" );

                startActivity(i);
            }
        });
        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Declarações");
                i.putExtra("texto_assunto"," Sejam números ou letras, nossos programas tem que conseguir armazenar dados temporariamente para poderem fazer cálculos, exibir mensagens na tela, solicitar a digitação de valores e assim por diante. \n\n"+
                        " Uma declaração especifica o identificador, tipo, e outros aspectos de elementos da linguagem, tais como variáveis, constantes e funções. Declarações são feitas para anunciar a existência do elemento para o compilador. \n\n"+
                        " Para as variáveis, a declaração reserva uma área de memória para armazenar valores e ainda dependendo onde ela foi declarada pode ser considerada local (vai existir somente dentro de seu escopo) ou global (vai existir enquanto o programa estiver em execução). \n\n"+
                        " Para as constantes a declaração funciona de forma parecida a de uma variável, porem sem a possibilidade de alterar seu valor no decorrer do programa. \n\n"+
                        " Para as funções, declarações fornecem o corpo e assinatura da função. \n\n" +
                        "Nesta seção, abordaremos os seguintes tipos de declarações: \n" +
                        "●\tDeclaração de Constante  \n" +
                        "●\tDeclaração de Função  \n" +
                        "●\tDeclaração de Matriz  \n" +
                        "●\tDeclaração de Variáveis  \n" +
                        "●\tDeclaração de vetor\n\n\n"+
                        "- Declaração de Constante\n" +
                        "\n" +
                        " Existem algumas situações em que precisamos que um determinado parâmetro não tenha seu valor alterado durante a execução do programa. Para isso, existem as constantes. Constante é um identificador cujo valor associado não pode ser alterado pelo programa durante a sua execução. \n\n" +
                        " Para declarar uma constante basta adicionar a palavra reservada const seguida do tipo de dado, pelo nome da constante e atribuir um valor a ela.\n\n\n"+

                        "- Declaração de Função\n" +
                        "\n" +
                        " Se lhe fosse solicitado um algoritmo para preencher uma matriz, você o resolveria correto? Porém, se ao invés de uma matriz fossem solicitadas dez matrizes? \n\n" +
                        " Concordamos que o algoritmo ficaria muito cansativo e repetitivo. Mas, e se pudéssemos repetir o mesmo procedimento, quantas vezes necessárias, o escrevendo apenas uma vez? Nós podemos. Para isso, usamos uma função. Função consiste em uma porção de código que resolve um problema muito específico, parte de um problema maior.\n\n\n"+

                        "- Declaração de Matriz \n" +
                        "\n" +
                        " Para a melhor compreensão do conceito de matriz, e interessante o entendimento de Vetores. Os vetores permitem solucionar uma série de problemas onde é necessário armazenamento de informações, porém ele possui a restrição de ser linear. Por exemplo, imagine que queremos armazenar três notas obtidas por quatro alunos diferentes. Neste caso, existe outra estrutura mais adequada para armazenar os dados.\n\n " +
                        " A matriz: a matriz é definida como sendo um vetor com mais de uma dimensão (geralmente duas). Enquanto o vetor armazena as informações de forma linear, a matriz armazena de forma tabular (com linha e colunas).\n\n\n"+

                        "- Declaração de Variáveis \n" +
                        "\n" +
                        " O computador armazena os dados que são utilizados nos programas e algoritmos na memória de trabalho ou memória RAM (Random Access Memory). A memória do computador é sequencial e dividida em posições. Cada posição de memória permite 12    armazenar uma palavra (conjunto de bytes) de informação e possui um número que indica o seu endereço. \n\n" +
                        " Vamos supor que queremos fazer um programa que solicita para um usuário digitar a sua idade e exibe a ele quantos anos faltam para ele atingir 100 anos de idade. \n\n" +
                        " Precisaremos armazenar a idade do usuário para depois realizar o cálculo 100 - idade_usuario e depois armazenar também o resultado. \n\n" +
                        " Para facilitar a nossa vida de programadores, foram criadas as variáveis. As variáveis podem ser entendidas como sendo apelidos para as posições de memória. É através das variáveis que os dados dos nossos programas serão armazenados. A sintaxe para se declarar uma variável é o tipo da variável, o nome da variável ou das variáveis (separadas por virgula cada uma) e opcionalmente pode ser atribuído a ela um valor de inicialização (exceto se for declarado mais de uma na mesma linha).\n\n\n"+

                        "- Declaração de Vetores\n" +
                        "\n" +
                        " Armazenar a nota de um aluno é possível utilizando uma variável do tipo real. Mas para armazenar as notas de todos os alunos de uma turma? Seria necessário criar uma variável para cada aluno? E se cada turma tiver quantidade de alunos variáveis? " +
                        "E os nomes de cada um dos alunos? Poderíamos armazenar estes dados em variáveis, porém o controle de muitas variáveis em um programa não é uma solução prática. Ao invés disso, utiliza-se uma estrutura de dados que agrupa todos estes valores em um nome único. Esta estrutura chama-se vetor. \n\n" +
                        " Um vetor pode ser visto como uma variável que possui diversas posições, e com isso armazena diversos valores, porém todos do mesmo tipo. Assim como as variáveis, o vetor tem que ser declarado. Sua declaração é similar à declaração de variáveis, definindo primeiro o seu tipo, em seguida do seu nome e por fim a sua dimensão entre colchetes (opcional se for atribuir valores a ele na declaração).\n\n");

                startActivity(i);
            }
        });
        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Entrada e Saída de Dados");
                i.putExtra("texto_assunto","\n" +
                        " Entrada/saída é um termo utilizado quase que exclusivamente no ramo da computação (ou informática), indicando entrada(inserção) de dados por meio de algum código ou programa,para algum outro programa ou hardware, bem como a sua saída (obtenção de dados) ou retorno de dados, como resultado de alguma operação de algum programa,consequentemente resultado de alguma entrada. \n\n"+
                        " A instrução de entrada de dados possibilita que o algoritmo capture dados provenientes do ambiente externo (fora da máquina) e armazene em variáveis. Assim um algoritmo consegue representar e realizar operações em informações que foram fornecidas por um usuário tais como: nome, idade,salário, sexo, etc. A forma mais comum de capturar dados é através do teclado do computador. Por meio dele o usuário pode digitar números, palavras, frases etc.\n\n"+
                        " A instrução de saída de dados permite ao algoritmo exibir dados na tela do computador. Ela é utilizada para exibir mensagens, resultados de cálculos, informações contidas nas variáveis, etc. \n\n" +
                        "Nesta seção, serão abordados os seguintes tópicos: \n"+
                        "●\tEscreva  \n" +
                        "●\tLeia  \n" +
                        "●\tLimpa \n\n\n"+

                        "- Escreva \n" +
                        "\n" +
                        " Em determinadas situações precisamos mostrar ao usuário do programa alguma informação. Para isso, existe um comando na programação que exibe dados ao usuário. No portugol a instrução de saída de dados para a tela é chamada de “escreva\", pois segue a ideia de que o algoritmo está escrevendo dados na tela do computador. \n\n" +
                        " O comando escreva é utilizado quando deseja-se mostrar informações no console da IDE, ou seja, é um comando de saída de dados .Para utilizar o comando escreva, você deverá escrever este comando e entre parênteses colocar a(s) variável(eis) ou texto que você quer mostrar no console. \n\n" +
                        " Lembrando que quando você utilizar textos, o texto deve estar entre aspas.\n\n"+
                        " Existem duas ferramentas importantes que auxiliam a organização e visualização de textos exibidos na tela. São elas: o quebra-linha e a tabulação. \n\n" +
                        " O quebra-linha é utilizado para inserir uma nova linha aos textos digitados. Sem ele, os textos seriam exibidos um ao lado do outro. Para utilizar este comando, basta inserir \"\\n\". O comando de tabulação é utilizado para inserir espaços maiores entre os textos digitados. Para utilizar este comando, basta inserir \"\\t\". \n\n\n" +

                        "- Leia \n" +
                        "\n" +
                        " Em alguns problemas, precisamos que o usuário digite um valora ser armazenado. Por exemplo, se quisermos elaborar um algoritmo para calcular a média de nota dos alunos,precisaremos que o usuário informe ao algoritmo quais as suas notas. No portugol a instrução de entrada de dados via teclado é chamada de \"leia\", pois segue a ideia de que o algoritmo está lendo dados do ambiente externo(usuário) para poder utilizá-los. O Comando leia é utilizado quando se deseja obter informações do teclado do computador, ou seja, é um comando de entrada de dados. Esse comando aguarda um valor a ser digitado e o atribui diretamente na variável. \n\n" +
                        " Para utilizar o comando leia, você deverá escrever este comando e entre parênteses colocar a(s) variável (eis) que você quer que recebam os valores a serem digitados.\n\n"+
                        " Note que para armazenar um valor em uma variável, é necessário que a mesma já tenha sido declarada anteriormente. Assim como no comando escreva, se quisermos que o usuário entre com dados sucessivos, basta separar as variáveis dentro dos parênteses com vírgula.\n\n\n"+

                        "- Limpa \n" +
                        "\n" +
                        " À medida que um algoritmo está sendo executado ele exibe mensagens e executa ações no console. Assim, em alguns casos o console fica poluído com informações desnecessárias, que atrapalham a compreensão e visualização do programa. Para isso, podemos usar o comando limpa. O comando limpa é responsável por limpar o console. Nãorequer nenhum parâmetro e não tem nenhuma saída.\n\n\n");

                startActivity(i);
            }
        });
        assunto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Desvios Condicionais");
                i.putExtra("texto_assunto"," Não é só na vida que fazemos escolhas. Nos algoritmos encontramos situações onde um conjunto de instruções deve ser executado caso uma condição seja verdadeira. Por exemplo: sua aprovação na disciplina de algoritmos depende da sua média final ser igual ou superior a 6. Podemos ainda pensar em outra situação: a seleção brasileira de futebol só participa de uma copa do mundo se for classificada nas eliminatórias, se isso não ocorrer ficaremos sem o hexacampeonato. \n\n"+
                " Estas e outras situações podem ser representadas nos algoritmos por meio de desvios condicionais.\n\n"+
                "Nesta seção, serão abordados os seguintes tópicos: \n\n" +
                "●\tse  \n" +
                "●\tse-senao\n" +
                "●\tse-senao-se \n" +
                "●\tescolha-caso\n\n\n"+

                "- Se  \n" +
                "\n" +
                " Aqui veremos como dizer a um algoritmo quando um conjunto de instruções deve ser executado. Esta determinação é estabelecida se uma condição for verdadeira. Mas o que seria esta condição? Ao executar um teste lógico teremos como resultado um valor verdadeiro ou falso. A condição descrita anteriormente nada mais é que um teste lógico. \n" +
                "\n Se este teste lógico resultar verdadeiro, as instruções definidas dentro do desvio condicional serão executadas. Se o teste for falso, o algoritmo pulará o trecho e continuará sua execução a partir do ponto onde o desvio condicional foi finalizado.\n\n\n"+

                "- Se-senao \n" +
                "\n" +
                " Agora vamos imaginar que se a condição for falsa um outro conjunto de comandos deve ser executado. Quando iremos encontrar esta situação? \n" +
                "\n Imagine um programa onde um aluno com média final igual ou maior a 6 é aprovado. Se quisermos construir um algoritmo onde após calculada a média, seja mostrada na tela uma mensagem indicando se o aluno foi aprovado ou reprovado. Como fazer isto? Utilizando o comando se junto com o senao\n\n\n"+

                "- Se-senao se \n" +
                "\n" +
                " Agora imagine que você precise verificar a nota da prova de um aluno e falar se ele foi muito bem, bem, razoável ou mau em uma prova como fazer isto ? \n" +
                "\n Quando você precisa verificar se uma condição é verdadeira, e se não for, precise verificar se outra condição é verdadeira uma das formas de se fazer*esta verificação é utilizando o se ... senao se; \n" +
                "\n A sua sintaxe é parecida com a do senao, mas usando o comando se imediatamente após escrever o comando senao.\n\n\n"+

                "- Escolha Caso\n" +
                "\n" +
                " Apesar de suas similaridades com o se, ele possui algumas diferenças. Neste comando não é possível o uso de operadores lógicos, ele apenas trabalha com valores definidos, ou o valor é igual ou diferente. Além disto, o escolha e o caso tem alguns casos testes, e se a instrução pare não for colocada ao fim de*cada um destes testes, o comando executará todos casos*existentes. \n" +
                "\n A sintaxe do escolha é respectivamente o comando escolha a condição a ser testada e entre chaves se coloca os casos. \n" +
                "\n A sintaxe para se criar um caso é a palavra reservada caso, o valor que a condição testada deve possuir dois pontos e suas instruções. Lembre-se de termina-las com o comando pare.\n\n"+
                " O Portugol contém 3 tipos de laços de repetição: pré-testado, pós-testado e laço com variável de controle. \n" +
                "\n Nesta seção, serão abordados os seguintes tópicos: \n" +
                "●\tEnquanto  \n" +
                "●\tFaça-Enquanto  \n" +
                "●\tPara\n\n\n"+

                "- Laço Enquanto (Pré-Testado) \n" +
                "\n" +
                " Se fosse necessário a elaboração de um jogo, como por exemplo um jogo da velha, e enquanto houvessem lugares disponíveis no tabuleiro, este jogo devesse continuar, como faríamos para que o algoritmo tivesse este comportamento? É simples. O comando enquanto poderia fazer esse teste lógico. A função do comando enquanto é: executar uma lista de comandos enquanto uma*determinada condição for verdadeira.\n\n\n"+

                "- Laço Faça-Enquanto (Pós-Testado) \n" +
                "\n" +
                " Em algumas situações, faz-se necessário verificar se uma condição é verdadeira ou não após uma entrada de dados do usuário. Para situações como essa, podemos usar o laço de repetição faca-enquanto. Este teste é bem parecido com o enquanto. A diferença está no fato de que o teste lógico é realizado no final, e com isso as instruções do laço sempre serão realizadas pelo menos uma vez. O teste verifica se elas devem ser repetidas ou não. \n" +
                "\n A sintaxe é respectivamente a palavra reservada faca, entre chaves as instruções a serem executadas, a palavra reservada enquanto e entre parênteses a condição a ser testada\n\n\n"+

                "- Laço Para (Com Variável de Controle) \n" +
                "\n" +
                " E se houver um problema em que sejam necessárias um número determinado de repetições? Por exemplo, se quiséssemos pedir ao usuário que digitasse 10 valores. Poderíamos utilizar a instrução Leia repetidas vezes. Porém se ao invés de 10 valores precisássemos de 100, essa tarefa se tornaria muito extensa. Para resolver problemas como esse, podemos usar um laço de*repetição com variável de controle. No portugol, ele é conhecido como para.\n\n\n");

                startActivity(i);
            }
        });

        assunto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operações Aritméticas");
                i.putExtra("texto_assunto","Símbolos usados: \n\n" +
                        "●\tOperação de Adição ( + )\n" +
                        "●\tOperação de Divisão ( / )\n" +
                        "●\tOperação de Módulo( % )\n" +
                        "●\tOperação de Multiplicação( * )\n" +
                        "●\tOperação de Subtração( -  )\n\n\n");

                startActivity(i);
            }
        });
        assunto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operações Lógicas");
                i.putExtra("texto_assunto"," As operações lógicas são uma novidade para muitos, pois raramente são vistas na escola. Um operador lógico opera somente valores lógicos, ou seja, é necessário que o valor à esquerda e a direita do operador sejam valores lógicos (verdadeiro ou falso). \n\n"+
                        "●\tE \n" +
                        "●\tOU  \n" +
                        "●\tNAO\n\n"+

                        "- E\n" +
                        "\n" +
                        " Em algumas situações, necessitamos que alguma instrução só seja executada se outras condições forem verdadeiras. Por exemplo, se você quisesse testar se duas variáveis*distintas têm valor igual a 2, como faria? Para isso podemos utilizar o operador lógico e. \n\n" +
                        " Quando usamos o operador e o resultado de uma operação lógica será verdadeiro somente quando AMBOS os operandos forem verdadeiros. Ou seja, basta que um deles seja falso e a resposta será falsa.\n\n\n"+

                        "- OU \n" +
                        "\n" +
                        " Em algumas situações, necessitamos que alguma instrução seja executada se uma entre várias condições forem verdadeiras. Por exemplo, se você quisesse testar se pelo menos uma entre duas variáveis distintas têm valor igual a 2, como faria? Para isso podemos utilizar o operador lógico ou. \n\n" +
                        " Quando usamos o operador *ou* o resultado de uma operação lógica será verdadeiro sempre que UM dos operandos for verdadeiro.\n\n\n"+

                        "- NAO\n" +
                        "\n" +
                        " Em algumas situações necessitamos verificar se o contrário de uma sentença é verdadeiro ou não. Por exemplo, se você tem uma variável com um valor falso, e quer fazer um teste que será positivo sempre que essa variável for falsa, como faria? Para isso podemos utilizar o operador lógico nao. \n\n" +
                        " O operador nao funciona de forma diferente, pois necessita apenas de um operando. Quando usamos o operador nao, o valor lógico do operando é invertido, ou seja, o valor*falso torna-se verdadeiro e o verdadeiro torna-se falso. Em geral, os operadores lógicos são utilizados em conjunto com as Estruturas de Controle.\n\n\n");

                startActivity(i);
            }
        });
        assunto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operações Relacionais");
                i.putExtra("texto_assunto","Símbolos usados: \n\n" +
                        "●\tMaior que ( > )\n" +
                        "●\tMenor que ( < )\n" +
                        "●\tMaior ou igual que ( >= )\n" +
                        "●\tMenor ou igual que ( <= )\n" +
                        "●\tIgual que ( = )\n" +
                        "●\tDiferente que ( != )\n");

                startActivity(i);
            }
        });
        assunto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Portugol_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Bibliotecas");
                i.putExtra("texto_assunto"," Em todo o algoritmo que se possa elaborar, existe a possibilidade da utilização de um conjunto de funções e comandos já existentes. A estes conjuntos de funções e comandos, dá-se o nome de Bibliotecas. \n" +
                        " As bibliotecas contém códigos e dados auxiliares, que provém serviços a programas independentes, o que permite o compartilhamento e a alteração de código e dados de forma modular. Existem diversos tipos de bibliotecas, cada uma com funções para atender a determinados problemas. \n" +
                        " Para se utilizar uma biblioteca é necessário primeiro importa-la para o seu programa. \n" +
                        " No portugol para importar uma biblioteca usa-se as palavras reservadas inclua biblioteca seguido do nome da biblioteca que se deseja usar, e opcionalmente pode-se atribuir um apelido a ela usando do operador \"-->\" sem aspas seguido do apelido.\n\n"+
                        " No portugol, existem as seguintes bibliotecas: \n\n" +
                        "●\t Arquivos\n" +
                        "●\t  Graficos\n" +
                        "●\t  Matematica\n" +
                        "●\t  Mouse \n" +
                        "●\t Sons \n" +
                        "●\t Teclado\n" +
                        "●\t  Texto \n" +
                        "●\t Tipos\n" +
                        "●\t  Util\n\n");

                startActivity(i);
            }
        });
    }
}