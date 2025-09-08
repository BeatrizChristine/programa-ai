package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Css_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    private LinearLayout assunto1, assunto2, assunto3, assunto4, assunto5, assunto6, assunto7,
                         assunto8, assunto9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_css_assuntos);
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
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Css!\nO que é?");
                i.putExtra("texto_assunto",
                        " CSS significa \"Cascading Style Sheets\" (Folhas de Estilo em Cascata), e é uma linguagem de estilo usada para descrever a apresentação de documentos escritos em linguagens de marcação como HTML e XML.\n" +
                                "\n" +
                                " O CSS permite que os desenvolvedores definam a aparência e o layout de um documento, incluindo coisas como fontes, cores, margens, espaçamento, posicionamento de elementos e muito mais. Com o CSS, é possível separar o conteúdo de um documento da sua apresentação, o que facilita a manutenção e atualização do site.\n" +
                                "\n" +
                                " O CSS funciona em conjunto com o HTML para criar páginas da web estilizadas e atraentes. Ele oferece uma grande variedade de recursos para personalizar a aparência do conteúdo da página, como estilos em cascata, seletores, propriedades e valores. Isso permite que os desenvolvedores criem uma ampla gama de designs, desde layouts simples até designs complexos e interativos.\n"+
                        "\nClaro, aqui estão algumas exemplificações básicas de CSS:\n" +
                                "\n" +
                                "• Alterando a cor de fundo de um elemento HTML:\n\n" +
                                "body {\n" +
                                "  background-color: #f2f2f2;\n" +
                                "}\n\n\n"+
                        "• Alterando a cor do texto de um elemento HTML:\n\n" +
                                "h1 {\n" +
                                "  color: red;\n" +
                                "} \n\n\n"+
                        "• Adicionando uma borda em torno de um elemento HTML:\n\n" +
                                "div {\n" +
                                "  border: 1px solid black;\n" +
                                "}\n" +
                                "\n\n" +
                                "• Definindo uma fonte para o texto de um elemento HTML:\n\n" +
                                "p {\n" +
                                "  font-family: Arial, sans-serif;\n" +
                                "}\n\n\n"+
                        "• Alterando o tamanho da fonte de um elemento HTML:\n\n" +
                                "h2 {\n" +
                                "  font-size: 24px;\n" +
                                "}\n" +
                                "\n\n" +
                                "• Adicionando margens ao redor de um elemento HTML:\n\n" +
                                "img {\n" +
                                "  margin: 10px;\n" +
                                "}\n" +
                                "\n\n" +
                                "• Alterando a largura e altura de um elemento HTML:\n\n" +
                                "#minha-div {\n" +
                                "  width: 300px;\n" +
                                "  height: 200px;\n" +
                                "}\n\n\n"+
                        " Essas são apenas algumas das muitas propriedades CSS disponíveis. Através do CSS, você pode controlar a aparência e layout de praticamente todos os elementos HTML em uma página da web\n\n\n");
                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Propriedades do Css");
                i.putExtra("texto_assunto",
                        "- PROPRIEDADE FONT\n" +
                                ".elemento {\n" +
                                "︎font-size:*px, em,rem,pt,%*;\n/*Controla o tamanho da fonte */\n\n" +
                                "︎font-weight:*0 à 1000. Depende da fonte*;\n/*Controla o peso da fonte */\n\n" +
                                "︎font-style:*normal, italic, oblique*;\n\n" +
                                "︎font-family:*serif,sans-serif, monospace, custom*;\n/*Controla a família da fonte*/\n" +
                                "} \n\n\n"+
                        "- PROPRIEDADE TEXT\n" +
                                ".elemento\t{\n" +
                                "︎text-align: *left, center, right, justify;\n/*Controla o alinhamento do texto */\n\n" +
                                "︎text-transform: *capitalize, uppercase, lowercase, none*;\n/*controla a capitalização do texto*/\n\n" +
                                "︎text-indent: *px, em, rem, %*;\n/*Controla o tamanho da indentação que é colocado antes de uma linha de texto em um bloco */\n" +
                                "} \n\n\n"+
                        "- PROPRIEDADE LETTER-SPACING\n" +
                                ".elemento {\n" +
                                "︎letter-spacing: *px, rem, em, %, pt*;\n/* Controla o espaçamento entre uma letra e outra de um bloco  de texto*/\n" +
                                "} \n" +
                                "\n\n"+
                        "- PROPRIEDADE LINE-HEIGHT\n" +
                                ".elemento {\n" +
                                "︎line-height: *pt, px, rem, em, sem unidade de medida*;\n/* Controla a altura das linhas de um conjunto de texto*/\n" +
                                "} \n\n\n"+
                        "- PROPRIEDADES DE COR\n" +
                                ".elemento {\n" +
                                "︎color: #ff00ff;\n/* Hexadecimal #RRGGBB */\n\n" +
                                "︎color: #f0f;\n/* Hexadecimal shorthand #RGB */\n\n" +
                                "︎color: rgb(255, 0, 255);\n/* Valor RGB de 0 a 255 rgb(R, G, B)*/\n\n" +
                                "︎color: #ff00ff00;\n/*Hexadecimal com opacidade (alpha) #RRGGBBAA*/\n\n" +
                                "︎color: rgba(255, 0, 255, 0.0);\n/*Valor RGB com opacidade */\n" +
                                "} \n" +
                                "\n\n"+
                        "- PROPRIEDADE BACKGROUND\n" +
                                ".elemento {\n" +
                                "︎background-color:*hexadecimal, nome,rgb, rgba*;\n/*Controla a cor de fundo*/\n\n" +
                                "︎background-image:*url()*;\n/*Coloca uma imagem como plano de fundo*/ \n\n" +
                                "︎Background-size: *x y, x/y, cover, contain, %, px, rem, em *;\n/*Controla o tamanho do plano de fundo. Dois valores podem ser colocados, x e y ou apenas o valor de x que ele será adicionad/removido proporcionalmente em y */\n\n" +
                                "︎background-repeat: *repeat, no-repeat*;\n/* Controla se a imagem de fundo vai sofrer repetição*/\n\n" +
                                "︎background-position: *top right bottom left, top 10px, bottom 2rem right 2%*;\n/* Controla a posição do plano de fundo */\n" +
                                "} \n\n\n"+
                        "- PROPRIEDADE BORDER\n" +
                                ".elemento {\n" +
                                "︎border:*espessura* *estilo* *cor*;\n/*Coloca uma borda em todo elemento*/\n\n" +
                                "︎border-top:*espessura* *estilo* *cor*;\n/*Coloca uma borda acima do elemento*/\n\n" +
                                "︎border-right:*espessura* *estilo* *cor*;\n/*Coloca uma borda à direita do elemento*/\n\n" +
                                "︎border-bottom: *espessura* *estilo* *cor*;\n/*Coloca uma borda abaixo do elemento*/\n\n" +
                                "︎border-left:*espessura* *estilo* *cor*;\n/*Coloca uma borda à esquerda do elemento*/\n\n" +
                                "} \n" +
                                "\n\n"+
                        "- PROPRIEDADE VERTICAL-ALIGN\n" +
                                ".elemento {\n" +
                                "︎vertical-align: *baseline, top, middle, bottom*;\n/* Alinha verticalmente elementos que são inline ou inline-block*/\n" +
                                "} \n\n"+
                        "- PROPRIEDADES WIDTH E HEIGHT\n" +
                                ".elemento {\n" +
                                "︎width:*px, rem,  iem, %*;\n/*Controla a largura do elemento*/\n\n" +
                                "︎min-width:*px, rem, em, %*;\n/*Controla a largura mínima que um elemento pode ter */\n\n" +
                                "︎max-width:*px, rem, em, %*;\n/*Controla a largura máxima que um elemento pode ter */\n\n" +
                                "  height:*px, rem, em, %*;\n/*Controla a altura do elemento*/\n\n" +
                                "︎min-height:*px, rem, em, %*\n /*Controla a altura mínima que um elemento pode ter */\n\n" +
                                "︎max-height:*px, rem, em, %*;\n/*Controla a altura máxima que um elemento pode ter */\n\n" +
                                "} \n\n\n"+
                        "-PROPRIEDADE BOX-SIZING\n" +
                                ".elemento {\n" +
                                "︎box-sizing:*border-box,content-box*;\n/*Define qual caixa do box-model será usada como referência para colocar propriedades de tamanho */\n" +
                                "} \n\n"+
                        " PROPRIEDADE OVERFLOW\n" +
                                ".elemento {\n" +
                                "overflow: *visible, hidden, scroll, auto*;\n/* Controla o comportamento dos elementos internos que \"vazam\" do espaço definido pela tag mãe */\n\n" +
                                "overflow-x: *visible, hidden, scroll, auto*;\n/* Controla o comportamento dos elementos internos que \"vazam\" do espaço horizontal definido pela tag mãe */\n\n" +
                                "overflow-y: *visible, hidden, scroll, auto*;\n/* Controla o comportamento dos elementos internos que \"vazam\" do espaço vertial definido pela tag mãe*/\n\n" +
                                "}\n\n");
                startActivity(i);
            }
        });

        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Estiizando com Css");
                i.putExtra("texto_assunto",
                        " Quando  escrevemos o  HTML, marcamos o  conteúdo da  página com  tags que melhor representam  o significado daquele conteúdo. Quando abrimos a página no navegador é possível perceber que ele mostra as informações com estilos diferentes.\n" +
                                "\n" +
                                " Um  h1,por exemplo,  por padrão é apresentado em negrito numa fonte maior. Parágrafo de texto são espaçados entre si, e assim por diante. Isso quer dizer que o navegador tem um estilo padrão para as tags que usamos. Porém para  fazer  sites bonitos, ou com  o visual próximo de uma dada identidade visual (design),vamos precisar personalizar a apresentação padrão dos elementos da página. \n\n"+
                        " Antigamente, isso era feito no próprio HTML. Caso houvesse  a necessidade de um título ser vermelho, era só fazer:\n\n"+
                        "<h1><font color=\"red\">MusicDot anos 90</font></h1>\n" +
                                " \n" +
                                " Além da tag <font>, várias outras tags de estilo existiam. Mas isso é passado. Hoje em dia tags HTML para estilo são má prática e jamais devem ser usadas, são interpretadas apenas para o modo de compatibilidade.\n" +
                                "\n" +
                                " Em seu lugar, surgiu o CSS (Cascading Style Sheet ou folha de estilos em cascata), que é uma outra linguagem, separada do HTML, com objetivo único de cuidar da estilização da página. A vantagem é que o CSS é bem mais robusto que o HTML para estilização, como veremos. Mas, principalmente, escrever formatação visual misturado com conteúdo de texto no HTML se mostrou algo impraticável. O CSS resolve isso separando as coisas; regras de estilo não aparecem mais no HTML, apenas no CSS. \n\n");
                startActivity(i);
            }
        });

        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Sintaxe\nInclusão do Css");
                i.putExtra("texto_assunto","A sintaxe do CSS tem estrutura simples: é uma declaração de propriedades e valores separados por um sinal de dois pontos \":\",  e cada propriedade é separada por um sinal de ponto e vírgula  \";\" da seguinte maneira:\n\n"+
                        "color: blue;\n" +
                        "background-color: yellow;\n\n"+
                        "O elemento que receber essas propriedades será exibido com o texto na cor azul e com o fundo amarelo. Essas propriedades podem ser declaradas de três maneiras diferentes. \n\n"+
                        "• Atributo style\n" +
                        "A primeira delas é com o atributo style no próprio elemento:\n\n"+
                        "<p style=\"color: blue; background-color: yellow;\">\n" +
                        "/*O conteúdo desta tag será exibido em azul com fundo amarelo no navegador!*/\n" +
                        "</p>\n" +
                        "\n"+
                        "Mas tínhamos acabado de discutir que uma das grandes vantagens do CSS era manter as regras de estilo fora do HTML. Usando esse atributo style não parece que fizemos isso. Justamente por isso não se recomenda esse tipo de uso na prática, mas sim os que veremos a seguir. \n\n"+
                        "• A tag style\n" +
                        "A outra maneira de se utilizar o CSS é declarando\tsuas propriedades dentro de uma tag <style>.\n" +
                        "\n" +
                        "Como estamos declarando as propriedades visuais de um elemento em outro lugar do nosso documento, precisamos indicar de alguma maneira a qual elemento nos referimos. Fazemos isso utilizando um seletor CSS. É basicamente uma forma de buscar certos elementos dentro da página que receberão as regras visuais que queremos.\n\n"+
                        "No exemplo a seguir, usaremos o seletor que pega todas as tags p e altera sua cor e background:\n" +
                        "\n" +
                        "<!DOCTYPE  html>  \n" +
                        "<html>\n" +
                        "  <head>\n" +
                        "     <meta charset=”utf-8”>\n" +
                        "     <title>Sobre a MusicDot</title>\n" +
                        "     <style>\n" +
                        "       P{\n" +
                        "        Color: blue;\n" +
                        "        Background-color: yellow; \n" +
                        "       }\n" +
                        "    </style>\n" +
                        "    </head> \n" +
                        "    <body>\n" +
                        "     <p> \n" +
                        "      /* O conteúdo desta tag será exibido em azul com fundo amarelo! */\n" +
                        "     </p>\n" +
                        "     <p>\n" +
                        "      <strong>Também </strong> /*será exibido em azul com fundo amarelo!*/\n" +
                        "    </p>\n" +
                        "  </body>\n" +
                        "</html>\n\n"+
                        "O código dentro da tag <style> indica que estamos alterando a cor e o fundo de todos os elementos com tag p. Dizemos que selecionamos esses elementos pelo nome de sua tag, e aplicamos certas propriedades CSS apenas neles.\n" +
                        "\n" +
                        "Revisando então a estrutura de uso do CSS:\n" +
                        "\n" +
                        "seletor {\n" +
                        "  propriedade: valor;\n" +
                        "}\n" +
                        "\n" +
                        "Algumas propriedades  contém \"subpropriedades\" que modificam uma parte específica daquela propriedade que vamos trabalhar, sendo sua sintaxe:\n" +
                        "\n" +
                        "seletor {\n" +
                        "  propriedade-subpropriedade: valor;\n" +
                        "}\n\n"+
                        "No exemplo abaixo, em ambos os casos, trabalhamos com a propriedade text, que estiliza a aparência do texto do seletor informado. Podemos especificar quais propriedades específicas do texto queremos modificar, no caso text-align o alinhamento do texto, e com text-decoration colocamos o efeito de sublinhado.\n" +
                        "\n" +
                        "p{ \n" +
                        "  text-align: center;\n" +
                        "  text-decoration: underline;\n" +
                        "} \n" +
                        "\n"+
                        "• Arquivo externo\n" +
                        "A terceira maneira de declararmos os estilos do nosso documento é com um arquivo externo com a extensão .css. Para que seja possível declarar nosso CSS em um arquivo à parte, precisamos indicar em nosso documento HTML uma ligação entre ele e a folha de estilo (arquivo com\ta extensão .css).\n" +
                        "\n" +
                        "Além da melhor organização do projeto, a folha de estilo externa traz ainda as vantagens de mante nosso HTML mais limpo e do reaproveitamento de uma mesma folha de estilos para diversos documentos.\n" +
                        "\n" +
                        "A indicação de uso de uma folha de estilos externa deve ser feita dentro da tag <head> de um documento HTML:\n" +
                        "\n"+
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "  <head> \n" +
                        "    <meta charset=\"utf-8\">\n" +
                        "    <title>MusicDot | Sobre a empresa</title>\n" +
                        "<!—Inclusão do arquivo CSS -->\n" +
                        "    <link rel=\"stylesheet\" href=\"estilos.css\">\n" +
                        "     </head>\n" +
                        "     <body> \n" +
                        "        <p>\n" +
                        "          /* O conteúdo desta tag será exibido em azul com fundo amarelo! */\n" +
                        "        </p>\n" +
                        "        <p>\n" +
                        "          <strong>Também</strong>\n/* será exibido em azul com fundo amarelo! */\n" +
                        "        </p>\n" +
                        "   </body>\n" +
                        "</html>\n" +
                        "\n" +
                        "E dentro do arquivo estilos.css colocamos apenas o conteúdo do CSS:\n\n" +
                        "p {\n" +
                        "color: blue;\n" +
                        "background-color: yellow;\n" +
                        "}\n\n");
                startActivity(i);
            }
        });

        assunto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Propriedades Tipográficas e Fontes");
                i.putExtra("texto_assunto",
                        "Da mesma maneira que alteramos cores, podemos alterar o texto. Podemos definir fontes com o uso da propriedade font-family.\n" +
                                "\n" +
                                "A propriedade font-family pode receber seu valor com ou sem aspas dependendo da sua composição, por exemplo, quando uma fonte tem o nome separado por espaço.\n" +
                                "\n" +
                                "Por padrão, os navegadores mais conhecidos exibem texto em um tipo que conhecemos como \"serif\". As fontes mais conhecidas (e comumente utilizada como padrão) são \"Times\" e \"Times New Roman\", dependendo do sistema operacional. Elas são chamadas de fontes serifadas pelos pequenos ornamentos em suas terminações.\n" +
                                "\n" +
                                "Podemos alterar a família de fontes que queremos utilizar em nosso documento para a família \"sans-serif\" (sem serifas), que contém, por exemplo, as fontes \"Arial\" e \"Helvetica\". Podemos também declarar que queremos utilizar uma família de fontes \"monospace\" como, por exemplo, a fonte \"Courier\".\n" +
                                "\n" +
                                "Obs: Fontes monospace podem ser tanto com serifa ou sem serifa. Monospace quer dizer apenas que todas as letras possuem o mesmo tamanho\n" +
                                "\n"+
                        "h1{\n" +
                                "  font-family: serif;\n" +
                                "}\n" +
                                "\n" +
                                "h2{\n" +
                                "  font-family: sans-serif;\n" +
                                "}\n" +
                                "\n" +
                                "p{\n" +
                                "  font-family: monospace;\n" +
                                "}\n" +
                                "\n" +
                                "É possível, e muito comum, declararmos o nome de algumas fontes que gostaríamos de verificar se existem no computador, permitindo que tenhamos um controle\tmelhor da forma como nosso texto será exibido. Em nosso projeto, as fontes não têm ornamentos, vamos  declarar essa propriedade para todo o documento por meio do seu elemento body:\n" +
                                "\n" +
                                "body{\n" +
                                " font-family: \"Helvetica\", \"Lucida Grande\", sans-serif;\n" +
                                "}\n" +
                                "\n" +
                                "Nesse caso, o navegador verificará se a fonte \"Helvetica\" está disponível e a utilizará para exibir os textos de todos os elementos  do nosso documento que, por cascata,herdarão essa propriedade do elemento body.\n" +
                                "\n" +
                                "Caso a fonte \"Helvetica\" não esteja disponível, o navegador verificará a disponibilidade da próxima fonte declarada, no nosso exemplo a \"Lucida Grande\". Caso o navegador não encontre também essa fonte, ele solicita qualquer fonte que pertença à família \"sans-serif\", declarada logo a seguir, e a utiliza para exibir o texto, não importa qual seja ela.\n" +
                                "\n" +
                                "Temos outras propriedades para manipular a fonte, como a propriedade font-style\t, que define o estilo da fonte que pode ser: normal (normal na vertical), italic (inclinada)\te oblique(oblíqua). \n\n"+
                        "• ALINHAMENTO E DECORAÇÃO DE TEXTO\n" +
                                "Já vimos uma série de propriedades e subpropriedades que determinam o tipo e estilo da fonte. Vamos conhecer algumas maneiras de alterarmos as disposições dos textos.\n" +
                                "\n" +
                                "No exemplo a seguir vamos mudar o alinhamento\tdo texto com a propriedade text-align.\n" +
                                "\n" +
                                "p{\n" +
                                "  text-align: right;\n" +
                                "}\n" +
                                "\n" +
                                "O exemplo determina que  todos os parágrafos da nossa página tenham o texto alinhado para a direita. Também é possível determinar que um elemento tenha seu conteúdo alinhado ao centro ao definirmos o valor center para a propriedade text-align, ou então definir que o texto deve ocupar toda a largura do elemento aumentando o espaçamento entre as palavras com o valor justify. Por padrão o texto é alinhado à esquerda, com o valor left, porém é importante lembrar que essa propriedade propaga-se em cascata.\n" +
                                "É possível configurar também uma série de espaçamentos de texto com o CSS: \n" +
                                "\n" +
                                "p{\n" +
                                "line-height: 3px;\n/*tamanho da altura de cada linha*/\n\n" +
                                "letter-spacing: 3px;\n/* tamanho do espaço entre cada letra*/\n\n" +
                                "word-spacing: 5px;\n/*tamanho do espaço entre cada palavra*/\n\n" +
                                "text-indent: 30px;\n/*tamanho da margem da primeira linha do texto*/\n\n" +
                                "} \n\n"+
                        "• IMAGEM DE FUNDO\n" +
                                "A  propriedade background-image permite indicar um arquivo de imagem para ser exibido ao fundo do elemento. Por exemplo:\n" +
                                "\n" +
                                "h1{\n" +
                                "  background-image:\n  url(sobre-background.jpg);\n" +
                                "}\n" +
                                "\n" +
                                "Com essa declaração, o navegador vai requisitar um arquivo sobre-background.jpg, que deve estar na mesma pasta do arquivo CSS onde consta essa declaração. Mas podemos também passar um endereço da web para pegar imagens remotamente:\n" +
                                "\n" +
                                "body {\n" +
                                "  background-image:\n  url(https://i.imgur.com/uAhjMNd.jpg);\n" +
                                "} \n" +
                                "\n" +
                                "•Bordas\n" +
                                "As propriedades do CSS para definirmos as bordas de um elemento nos apresentam uma série de opções. Podemos, para cada borda de um elemento, determinar sua cor, seu estilo de exibição e sua largura. Por exemplo:\n" +
                                "\n" +
                                "body {\n" +
                                "  border-color: red;\n" +
                                "  border-style: solid;\n" +
                                "  border-width: 1px;\n" +
                                "} \n" +
                                "\n" +
                                "A propriedade border tem uma forma resumida para escrever os mesmos estilos que adicionamos acima, mas de uma maneira mais simples:\n" +
                                "\n" +
                                "body {\n" +
                                "  border:1px solid red;\n" +
                                "}\n" +
                                "\n" +
                                "Para que o efeito da cor sobre a borda surta efeito, é necessário que a propriedade border-style tenha qualquer valor diferente do padrão none.\n" +
                                "\n" +
                                "Podemos também falar em qual dos lados do nosso elemento queremos a borda usando a subpropriedade que indica lado:\n" +
                                "\n" +
                                "h1{\n" +
                                "border-top: 1px solid red;\n/*borda vermelha em cima */\n\n" +
                                "border-right: 1px solid red;\n/*borda vermelha à direita */\n\n" +
                                "border-bottom: 1px solid red;\n/*borda vermelha embaixo*/\n\n" +
                                "border-left: 1px solid red;\n/*borda vermelha à esquerda*/\n\n" +
                                "} \n" +
                                "\n" +
                                "Conseguimos fazer também comentários no CSS usando a seguinte sintaxe:\n\n" +
                                "/*deixando o fundo amarelo ouro*/\n" +
                                "body {\n" +
                                "  background-color: gold;\n" +
                                "}\n" +
                                "\n" +
                                "• CORES NA WEB\n" +
                                "Propriedades como background-color, color, border-color, entre outras aceitam uma cor como valor. Existem várias maneiras de definir cores quando utilizamos o CSS.\n" +
                                "A primeira, mais simples, é usando o nome da cor:\n" +
                                "\n" +
                                "h1{\n" +
                                "  color: red;\n" +
                                "}\n" +
                                "\n" +
                                "h2{\n" +
                                "  background-color: yellow;\n" +
                                "}\n" +
                                "\n" +
                                "O difícil é acertar a exata variação de cor que queremos no design e também cada navegador tem o seu padrão de cor para os nomes de cores. A W3C obriga que todos os navegadores tenham pelo menos 140  nomes de cores padronizados, mas existem mais de 16 milhões de cores na web e seria extremamente complicado nomear cada uma delas. Por isso, é bem incomum usarmos cores com seus nomes. O mais comum é definir a cor com base em sua composição RGB.\n" +
                                "\n" +
                                "RGB é o sistema de cor usado nos monitores, já que cada pixel nos monitores possuem 3 leds (um vermelho, um verde e um azul) e a combinação dessas 3 cores formam todas as outras 16 milhões de cores que vemos nos monitores. Podemos escolher a intensidade de cada um desses três leds básicos, numa escala de 0 a 255.\n" +
                                "\n" +
                                "Um amarelo forte, por exemplo, tem 255 de Red, 255 de Green e 0 de Blue (255, 255, 0). Se quiser um laranja, basta diminuir um pouco o verde (255, 200, 0). E assim por diante.\n" +
                                "\n" +
                                "No CSS, podemos escrever as cores tendo como base sua composição RGB. Aliás, no CSS3- que veremos melhor depois- há até uma sintaxe bem simples pra isso:\n" +
                                "\n" +
                                "h3{\n" +
                                "   color: rgb(255, 200, 0);\n" +
                                "}\n" +
                                "\n" +
                                "Essa sintaxe funciona nos browsers mais modernos e até alguns browsers super antigos mas não é a mais comum na prática, por questões de compatibilidade. O mais comum  é a notação hexadecimal. Essa sintaxe tem suporte universal nos navegadores e é mais curta de escrever, apesar de ser mais enigmática.\n" +
                                "\nh3{\n" +
                                "  background-color: #f2eded;\n" +
                                "}\n" +
                                "\n" +
                                "No fundo, porém, as duas formas  são baseadas no sistema RGB. Na notação hexadecimal (que começa com #), temos 6 caracteres, os primeiros 2 indicam o canal Red, os dois seguintes, o Green, e os dois últimos, Blue; ou seja, RGB. E usamos a matemática pra escrever menos, trocando a basnumérica de decimal para hexadecimal.\n" +
                                "\n" +
                                "Na base hexadecimal, os algarismos vão de zero a quinze (ao invés do zero a nove da base decimal comum). Para representar os algarismos de dez a quinze, usamos letras de A a F. Nessa sintaxe, portanto, podemos utilizar números de 0-9 e letras de A-F.\n" +
                                "\n" +
                                "Há uma conta por trás  dessas conversões, mas seu editor de imagens deve ser capaz de fornecer ambos  os valores para você sem problemas. Um valor 255 vira FF na notação hexadecimal. A cor #f2eded, por exemplo, é equivalente a rgb(242, 237, 237), um cinza claro.\n" +
                                "\n" +
                                "Vale aqui uma dica quanto ao uso de cores hexadecimais, toda vez que os caracteres presentes na composição da base se repetirem, estes podem ser simplificados. Então um número em hexadecimal 3366ff, pode ser simplificado para 36f.\n" +
                                "\n" +
                                "Obs :os 3 pares de números devem ser iguais entre si, ou seja, se tivermos um hexadecimal #33aabc não podemos simplificar nada do código.\n\n"+
                        "");
                startActivity(i);
            }
        });

        assunto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Espaçamentos e Dimensões");
                i.putExtra("texto_assunto",
                        "Temos algumas maneiras de trabalhar com dimensões e espaçamentos. Para espaçamento interno e externo usamos respectivamente padding e margin, e para redimensionar elementos podemos usar as propriedades de largura e altura ou width e height. Vamos ver mais a fundo essas propriedades. \n" +
                                "\n" +
                                "- DIMENSÕES\n" +
                                "É possível determinar as dimensões de um elemento, por exemplo:\n" +
                                "\n" +
                                "p{\n" +
                                "  background-color: red;\n" +
                                "  height: 300px;\n" +
                                "  width: 300px;\n" +
                                "}\n" +
                                "\n" +
                                "Todos os parágrafos do nosso HTML ocuparão 300 pixels de altura e de largura, com cor de  fundo vermelha.\n" +
                                "\n" +
                                "Obs: Se usarmos o inspetor de elementos do navegador veremos que o restante do espaço ocupado pelo elemento vira margin\n" +
                                "\n" +
                                "\n" +
                                "• ESPAÇAMENTOS\n\n" +
                                "- Padding\n" +
                                "A propriedade padding  é utilizada para definir um espaçamento interno em elementos (por espaçamento interno queremos dizer a distância entre o limite do elemento, sua borda, e seu respectivo conteúdo) e tem as subpropriedades listadas a seguir:\n" +
                                "\n" +
                                "︎padding-top\n" +
                                "︎padding-right\n" +
                                "︎padding-bottom\n" +
                                "︎padding-left\n" +
                                "\n" +
                                "Essas propriedades aplicam uma distância entre o limite do elemento e seu conteúdo acima, à direita, abaixo e à esquerda respectivamente. Essa ordem é importante para entendermos como funciona a shorthand property (encurtamento) do padding.\n" +
                                "\n" +
                                "Podemos definir todos os valores para as subpropriedades do padding em  uma  única propriedade, chamada exatamente de padding, e seu comportamento é descrito nos exemplos a seguir:\n" +
                                "Se passado somente um valor para a propriedade padding, esse mesmo valor é aplicado em todas as direções.\n" +
                                "\n" +
                                "p{\n" +
                                "   padding: 10px;\n" +
                                "}\n" +
                                "\n" +
                                "Se passados dois valores, o primeiro será aplicado acima e abaixo (equivalente a passar o mesmo valor para padding-top e padding-bottom) e o segundo será aplicado à direita e à esquerda (equivalente ao mesmo valor para padding-right e padding-left).\n" +
                                "\n" +
                                "p{\n" +
                                "    padding: 10px 15px;\n" +
                                "}\n" +
                                "\n" +
                                "Se passados três valores, o primeiro será aplicado acima (equivalente a padding-top), o segundo será aplicado à direita e  à esquerda (equivalente a passar o mesmo valor para padding-right e padding-left) e o terceiro valor será aplicado abaixo do elemento (equivalente a padding-bottom).\n" +
                                "\n" +
                                "p{\n" +
                                "   padding: 10px 20px 15px;\n" +
                                "}\n" +
                                "\n" +
                                "Se passados quatro valores, serão aplicados respectivamente a padding-top, padding-right, padding-bottom e padding-left. Para facilitar a memorização dessa ordem, basta lembrar que os valores são aplicados em sentido horário.\n" +
                                "\n" +
                                "p{\n" +
                                "   padding: 10px 20px 15px 5px;\n" +
                                "}\n\n" +
                                "DICA\n" +
                                "Uma dica para omitir valores do padding:\n\n" +
                                "Quando precisar omitir valores, sempre omita no sentido anti-horário começando a partir da subpropriedade -left. \n" +
                                "Como os valores tem posicionamento fixo na hora de declarar os espaçamentos, o navegador não sabe quando e qual valor deve ser omitido. Por exemplo:\n\n" +
                                "Se tivermos um padding:\n" +
                                "\n" +
                                "h1{\n" +
                                "   padding: 10px 25px 10px 15px;\n" +
                                "}\n" +
                                "\n" +
                                "O código não pode sofrer o encurtamento porque por mais que os valores de top e bottom sejam iguais, os valores right e left não são e eles são os primeiros a serem omitidos. Veja o que acontece quando vamos omitir o valor de 10px do bottom:\n" +
                                "\n" +
                                "h1{\n" +
                                "   padding: 10px 25px 15px;\n" +
                                "}\n\n" +
                                "O navegador vai interpretar da seguinte maneira:\n\n" +
                                "h1{\n" +
                                "   padding: top right bottom;\t\n" +
                                "}\n\n" +
                                "Que no final vai ficar igual a:\n\n" +
                                "h1{\n" +
                                "   padding-top: 10px;\n" +
                                "   padding-right: 25px;\n" +
                                "   padding-bottom: 15px;\n" +
                                "   padding-left: 25px;\n" +
                                "}\n" +
                                "\n" +
                                "E esses valores não são os que nós colocamos no começo com padding: 10px 25px 10px 15px; \n" +
                                "\n" +
                                "- Margin\n" +
                                "A propriedade margin é bem parecida com a propriedade padding, exceto que ela adiciona espaço após o limite do elemento, ou seja, é um espaçamento além do elemento em si (espaçamento externo). Além das subpropriedades listadas a seguir, há a shorthand property margin que se comporta da mesma maneira que a shorthand property do padding vista no tópico anterior.\n" +
                                "\n" +
                                "•margin-top\n" +
                                "•margin-right\n" +
                                "•margin-bottom\n" +
                                "•margin-left\n" +
                                "\n" +
                                "Há ainda uma maneira de permitir que o navegador defina qual será a dimensão da propriedade padding ou margin conforme o espaço disponível na tela: definimos o valor auto para os espaçamentos que quisermos.\n" +
                                "\n" +
                                "No exemplo a seguir, definimos que um elemento não tem nenhuma margem acima ou abaixo de seu conteúdo e que o navegador define uma margem igual para ambos os lados de acordo com o espaço disponível:\n" +
                                "\n" +
                                "p{\n" +
                                "  margin: 0 auto;\n" +
                                "}\n" +
                                "\n");
                startActivity(i);
            }
        });

        assunto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Conhecendo os padrões do Css");
                i.putExtra("texto_assunto",
                        "Vimos já o conceito de desacoplar estilos usando classes  e os benefícios que isso nos traz, mas para cada elemento que nós vamos estilizar precisamos pensar em um nome diferente e isso pode ficar muito complicado sem um padrão para seguir.\n" +
                                "\n" +
                                "Existem vários  padrões de CSS mas durante o curso vamos usar um chamado BEMCSS. A vantagem de se usar BEMCSS para quem está começando com desenvolvimento HTML e CSS é que ele é um padrão que foca bastante em estrutura e facilita bastante na hora planejar os nomes das classes.\n" +
                                "\n" +
                                "BEM usa um conceito de bloco__elemento--modificador para nomear suas classes, sendo que bloco é o elemento html que representa uma divisão de conteúdo  cuja sua existência já tenha um sentido por si só, elemento representa uma  parte semântica do bloco e modificador é uma sinalização de comportamento ou estilização.\n" +
                                "\n" +
                                "As divisões entre bloco__elemento--modificador são chamados de: double snake__case e double kebab—case. Quando queremos uma divisão como o espaço usamos ou kebab-case ou o camelCase. Kebab-case é o mais comum para HTML e CSS e camelCase é mais comum em JavaScript.\n" +
                                "\n" +
                                "Vamos ver como que BEM funciona com o exemplo abaixo: \n\n"+
                                "<!—section representa um painel (por exemplo) de produtos.\nMas não de qualquer produto, mas sim de produtos mais vendidos-->\n\n" +
                                "<section\n" +
                                "class=\"produtos produtos--mais-vendidos\">\n\n\n" +
                                "<!-- O h2 representa o título desse painel -->\n\n" +
                                "<h2 class=\"produtos__titulo\" >Produtos mais vendidos</h2>\n" +
                                " <ul class=\"produtos__lista\">\n\n\n" +
                                "<!-- li representa o produto em sí -->\n\n" +
                                "<li class=\"produtos__produto\">\n" +
                                "  <figure>\n" +
                                "   <img src=\"img/produto1.png\" alt=\"Foto do Produto 1\">\n" +
                                "   <figcaption>Foto do produto 1</figcaption>\n" +
                                "  </figure>\n" +
                                "</li>\n\n\n" +
                                "<!-- li representa o produto em sí, mas nesse caso também temos um produto destaque -->\n\n" +
                                "<li\n" +
                                "class=\"produtos__produto produtos__produto--destaque\">\n" +
                                "  <figure>\n" +
                                "   <img src=\"img/produto-destaque.png\"\nalt=\"Foto do Produto em Destaque\">\n" +
                                "   <figcaption>Foto do produto em destaque</figcaption>\n" +
                                "  </figure>\n" +
                                "</li>\n" +
                                "<li class=\"produtos__produto\">\n" +
                                "  <figure>\n" +
                                "   <img src=\"img/produto3.png\" alt=\"Foto do Produto 3\">\n" +
                                "   <figcaption>Foto do produto 3</figcaption>\n" +
                                "  </figure>\n" +
                                "</li>\n" +
                                "<li class=\"produtos__produto\">\n" +
                                "  <figure>\n" +
                                "   <img\tsrc=\"img/produto4.png\"\nalt=\"Foto do Produto 4\">\n" +
                                "   <figcaption>Foto do produto 4</figcaption>\n" +
                                "  </figure>\n" +
                                "</li>\n" +
                                "</ul>\n" +
                                "</section>\n" +
                                "\n" +
                                "Da maneira que montamos a estrutura acima fica bem fácil saber o que estamos estilizando no CSS. " +
                                "Veja a diferença:\n\n"+
                                "section h2 {\n" +
                                "/*É o h2 da section que tem os produtos? E se precisar mudar minha estrutura para um h3?*/\n\n" +
                                "  font-size: 40px;\n" +
                                "  font-weight: 800;\n" +
                                "}\n" +
                                "\n" +
                                ".produtos__titulo {\n" +
                                "/* Agora aqui eu sei que  vou estilizar o título do painel de produtos. Mesmo se mudar para um h3*/\n\n" +
                                "  font-size: 40px;\n" +
                                "  font-weight: 800;\n" +
                                "} \n" +
                                "\n"+
                        "");
                startActivity(i);
            }
        });

        assunto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Tipos de Display");
                i.putExtra("texto_assunto",
                        "Existem 2 tipos de display que caracterizam a exibição padrão da maior parte dos elementos HTML:\n\n" +
                                "display: block e display: inline.\n" +
                                "A maneira mais fácil de ver a diferença entre eles é usando as tags que possuem essas propriedades por padrão, <p> e <a> respectivamente, e colocar uma cor de fundo.\n" +
                                "\n"+
                        "- HTML:\n" +
                                "<p>Um parágrafo que é block</p>\n" +
                                "<a>Um link que é inline</a>\n" +
                                "CSS:\n" +
                                "p{\n" +
                                "  background-color: blue;\n" +
                                "}\n" +
                                "a{\n" +
                                "  background-color: red;\n" +
                                "}\n" +
                                "\n" +
                                "Veja o espaço que esses elementos  realmente ocupam. A tag <p> ocupa toda a largura da página enquanto a tag <a>  ocupa apenas o espaço necessário para mostrar o texto que colocamos. Vamos colocar mais elementos no nosso exemplo acima.\n\n"+
                        "HTML:\n" +
                                "<p>Um parágrafo que é block</p>\n" +
                                "<p>Mais um parágrafo que é block</p>\n" +
                                "<a>Um link que é inline</a>\n" +
                                "<a>Mais um link que é inline</a>\n" +
                                "\n" +
                                "CSS:\n" +
                                "p{\n" +
                                "  background-color: blue;\t\t\t\n" +
                                "}\n" +
                                "a{\n" +
                                "  background-color: red;\n" +
                                "}\n" +
                                "\n" +
                                "Podemos observar que agora um parágrafo ficou um embaixo do outro e os links ficaram um do lado do outro. Esses comportamentos são os esperados de elementos block e inline. Como um  element block ocupa toda a largura da tela não podemos colocar outro elemento do lado porque não há espaço. Agora como no inline o elemento ocupa só o espaço necessário para mostrar nosso texto então podemos colocar outros elementos que caibam naquele espaço. Bom, vamos então resolver o problema de espaço da tag <p> :\n\n"+
                        "HTML:\n" +
                                "<p>Um parágrafo que é block</p>\n" +
                                "<p>Mais um parágrafo que é block</p>\n" +
                                "<a>Um link que é inline</a>\n" +
                                "<a>Mais um link que é inline</a>\n" +
                                "\n" +
                                "CSS:\n" +
                                "p{\n" +
                                "  background-color: blue;\n" +
                                "  width: 30%;\n" +
                                "}\n" +
                                "a{\n" +
                                "  background-color: red;\n" +
                                "  width: 60%;\n" +
                                "}\n" +
                                "\n" +
                                "Bom, agora temos dois problemas. Mesmo com o espaço extra os parágrafos não ficaram um do lado do outro e nossos links não tiveram alterações em suas larguras. Vamos usar o inspetor de elementos de nosso navegador para ver o que está acontecendo com esses elementos.\n" +
                                "\n" +
                                "Selecionando a  tag <p>  com  nosso inspetor conseguimos ver que ela  realmente está ocupando 30% do espaço da tela do navegador, mas agora tem alguma coisa a mais que não colocamos no CSS. Margin. Existe uma margin ocupando o restante do espaço que era ocupado pela tag <p>. Utilizando a propriedade margin-right: 0px; não parece fazer efeito. Mas está tudo bem! Esse é o comportamento esperado de um elemento block.\n\n"+
                        "Vamos ver agora o que aconteceu com nossos links. Nossos links parecem ter ignorado completamente a propriedade de largura que colocamos. Mais uma  vez, está tudo bem! Esse é o comportamento padrão de um elemento inline. Diferente de um elemento block, um elemento inline não recebe propriedades de tamanho (width e height) e isso pode gerar alguns problemas com estilização. Foi criado então o display: inline-block que permite usar o melhor dos dois mundos. Vamos usar o exemplo acima novamente só que mudando o tipo de display do link:\n" +
                                "\n" +
                                "HTML:\n" +
                                "<p>Um parágrafo que é block</p>\n" +
                                "<p>Mais um parágrafo que é block</p>\n" +
                                "<a>Um link que é inline</a>\n" +
                                "<a>Mais um link que é inline</a>\n" +
                                "\n" +
                                "CSS:\n" +
                                "p{\n" +
                                "    background-color: blue;\n" +
                                "    width: 30%;\n" +
                                "}\n" +
                                "a{\n" +
                                "   background-color: red;\n" +
                                "   width: 60%;\n" +
                                "   display: inline-block;\n" +
                                "}\n" +
                                "\n" +
                                "Perfeito! Agora nosso link recebeu o tamanho que colocamos e  agora deixamos um <a> debaixo do outro. Se mudarmos o tamanho dessa tag <a> para um tamanho de 40%, por exemplo, vemos que as nossas tags <a> ficam uma do lado da outra. Em resumo então dos displays:\n\n"+
                                "▪ display: block :\n" +
                                "-O elemento ocupa toda a largura disponível;\n" +
                                "-Se diminuir o tamanho desse elemento o espaço restante será ocupado por uma margin não removível.\n" +
                                "\n" +
                                "▪ display: inline:\n" +
                                "-Permite que outro elemento fique do seu lado caso haja espaço;\n" +
                                "-O elemento ocupa apenas o espaço para mostrar seu conteúdo;\n" +
                                "-Não recebe propriedades de tamanho.\n" +
                                "\n" +
                                "▪ display: inline-block:\n" +
                                "-Permite que outro elemento fique do seu lado caso haja espaço;\n" +
                                "-O elemento inicialmente ocupa apenas o espaço para mostrar seu conteúdo;\n" +
                                "-Recebe propriedades de tamanho.\n" +
                                "\n" +
                                "Quando devo usar inline ou inline-block ?\n" +
                                "O ideal  é nunca limitar nossas opções quando vamos escolher uma propriedade. Se o único propósito de mudarmos o display\t de um elemento é para deixá-lo um do lado do outro, vamos usar inline-block. Se por algum motivo houver necessidade de mudar o tamanho desse elemento, já estamos com o display correto e  não precisaremos mudá-lo de novo.\n\n");
                startActivity(i);
            }
        });

        assunto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Css_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto","Bootstrap e FrameWorks");
                i.putExtra("texto_assunto",
                        "Uma tendência em alta no mundo front-end é  o uso de frameworks CSS com estilos base para nossa página. Ao nvés de começar todo projeto do zero, criando todo estilo na mão, existem frameworks que já trazem toda uma base construída de onde partiremos nossa aplicação.\n" +
                                "\n" +
                                "Existem muitas opções mas o Bootstrap talvez seja o de maior notoriedade. \n" +
                                "O Bootstrap traz uma série de recursos:\n" +
                                "\n" +
                                "• Reset CSS\n" +
                                "• Estilo visual base pra maioria das tags\n" +
                                "• Ícones\n" +
                                "• Grids prontos pra uso\n" +
                                "• Componentes CSS\n" +
                                "• Plugins JavaScript\n" +
                                "• Tudo responsivo e mobile-first\n" +
                                "\n" +
                                "\n" +
                                "• ESTILO E COMPONENTES BASE\n" +
                                "Para usar o Bootstrap, apenas incluímos seu CSS na página:\n" +
                                "\n" +
                                "<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n" +
                                "\n" +
                                "Só  isso já nos traz uma série de benefícios. Um reset é aplicado, e nossas tags ganham estilo e tipografia base. Isso quer dizer que podemos usar tags como um H1 ou um P agora e elas terão um estilo característico do Bootstrap.\n" +
                                "\n" +
                                "Além disso, ganhamos muitas classes com componentes adicionais que podemos aplicar na página. São várias opções. Por exemplo, pra criar um título com uma frase de abertura em destaque, usamos o Jumbotron:\n" +
                                "\n" +
                                "<div\n" +
                                "class=\"jumbotron jumbotron-fluid\">\n" +
                                "  <div class=\"container\">\n" +
                                "   <h1 class=\"display-4\">Ótima escolha!</h1>\n" +
                                "<p class=\"lead\">Obrigado por comprar na Mirror Fashion.</p>\n" +
                                "  </div>\n" +
                                "</div>\n" +
                                "\n");
                startActivity(i);
            }
        });


    }
}