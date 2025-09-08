package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Html_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout assunto1, assunto2, assunto3, assunto4;
    ImageView tabela_html;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_html_assuntos);
        backbutton = findViewById(R.id.backbutton);
        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);
        assunto3 = findViewById(R.id.assunto3);
        assunto4 = findViewById(R.id.assunto4);
       // tabela_html = findViewById(R.id.imageView);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Html_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "O que é?");
                i.putExtra("texto_assunto",
                        " Html é basicamente um linguagem de Marcação(não programação), nas páginas WEB.\n\n"+
                        " HTML⇒ Hypertext Markup Language\n\n"+
                        " Pra que é usado?\n\n"+
                        " HTML é uma linguagem focada em CONTEÚDO:\n" +
                        "●\tTextos\n" +
                        "●\tImagens\n" +
                        "●\tVídeos\n" +
                        "●\tTabelas\n\n"+
                        "- HTML marcações incluindo \"elementos\" especiais " +
                        "como: <head> , <title> , <body> , <header> , <footer> , <article> , <section> , <p> , <div> , <span> , <img> , <aside> e" +
                        "outras.\n\n\n"+

                        "- Exemplos de uso:\n\n"+
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "  <meta charset=\"UTF-8\">\n" +
                        "  <title>Título da Página</title>\n" +
                        "  <meta name=\"description\" content=\"Descrição da página para motores de busca\">\n" +
                        "  <meta name=\"keywords\" content=\"palavras-chave, separadas, por, vírgulas\">\n" +
                        "  <link rel=\"stylesheet\" href=\"style.css\">\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <h1>Conteúdo da Página</h1>\n" +
                        "  <p>Este é um exemplo de página HTML com uma tag <head>.</p>\n" +
                        "</body>\n" +
                        "</html>\n\n"+
                        "- Tags usadas no código acima:\n\n"+
                        "●\t<head> :É usada para incluir informações sobre a página, como o título, a descrição e as " +
                                "palavras-chave para motores de busca.\n"+
                        "●\t<title> : que define o título da página que aparece na aba ou janela do navegador\n"+
                        "●\t<meta> :para definir metadados da página\n"+
                        "●\t<link> :para importar folhas de estilo CSS.\n\n");
                startActivity(i);
            }
        });
        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Html_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Como funciona");
                i.putExtra("texto_assunto"," FRONT-END = Front-end é a parte de um site ou aplicativo que o usuário interage diretamente. É responsável pela interface " +
                        "gráfica, pela interação com o usuário e pela exibição do conteúdo.\n\n" +
                        " As linguagens mais comuns usadas no desenvolvimento front-end são:\n\n"+
                        "●\tHTML: uma linguagem de marcação que é usada para criar a estrutura da página, definindo os elementos e seu " +
                        "posicionamento na página.\n\n" +
                        "●\tCSS: uma linguagem de estilização que é usada para definir a aparência dos elementos HTML, como cores, fontes, " +
                        "tamanhos e posicionamento.\n\n" +
                        "●\tJavaScript: uma linguagem de programação que é usada para adicionar interatividade e dinamismo à página, como " +
                        "efeitos de animação, validação de formulários, carregamento de conteúdo dinâmico, entre outras funcionalidades");
                startActivity(i);
            }
        });
        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Html_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "URL");
                i.putExtra("texto_assunto",
                        " Uma URL (Uniform Resource Locator) é um endereço da web que indica o local de um recurso na internet, como uma página " +
                        "da web, imagem, vídeo, documento, entre outros. Aqui está um exemplo básico de uma sintaxe de URL:\n\n"+
                        "http://www.exemplo.com/pagina.html?parametro1=valor1&parametro2=valor2\n\n"+
                        "●\t\"http://\" é o protocolo de comunicação utilizado para acessar o recurso, nesse caso, o protocolo HTTP (Hypertext Transfer Protocol).\n\n" +
                        "●\t\"www.exemplo.com\" é o nome do domínio que hospeda o recurso.\n\n" +
                        "●\t\"/pagina.html\" é o caminho para o recurso dentro do domínio, nesse caso, uma página HTML chamada \"pagina.html\".\n\n" +
                        "●\t\"?parametro1=valor1&parametro2=valor2\" é uma string de consulta que contém parâmetros e valores que podem ser" +
                        "usados para personalizar o recurso.\n\n"+

                        "- DOMÍNIO:\n" +
                        "●\tNome único\n" +
                        "●\tPago anualmente\n" +
                        "●\tVários TLDs\n\n"+
                        "- HOSPEDAGEM:\n" +
                        "●\tEspaço para armazenar arquivos\n" +
                        "●\tPago mensalmente\n" +
                        "●\tEspaço, memória,recusos\n\n\n");
                startActivity(i);
            }
        });

        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Html_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Tags e Exemplos");
                i.putExtra("texto_assunto",
                        "●\t<body>: É uma das principais tags HTML e geralmente é usada em conjunto com outras tags, como a tag <head>, que define " +
                                "informações adicionais sobre a página, como o título, metadados, scripts, estilos, entre outros. Exemplo:\n\n"+
                        "<body>\n" +
                        "  <!-- Conteúdo da página -->\n" +
                        "</body>\n\n\n"+

                        "●\t<h1>: A tag <h1> é usada para definir o cabeçalho de nível 1 (ou o título principal) de uma seção de uma página HTML.\n" +
                                "É importante lembrar que cada página HTML deve ter apenas um título principal, que deve estar dentro da tag <h1> . O " +
                                "restante dos títulos da página (como subtítulos e títulos de seções secundárias) devem ser definidos com as tags <h2> , <h3> , " +
                                "<h4> , <h5> e <h6> , que são cabeçalhos de nível 2 a nível 6, respectivamente. Exemplo:\n\n"+
                        "<body>\n" +
                        "  <h1>Título principal da página</h1>\n" +
                        "  <h2>Subtítulo da página</h2>\n"+
                        "</body>\n\n\n"+

                        "●\t<p>: É usada para definir um parágrafo de texto em uma página HTML. Exemplo:\n\n"+
                        "<p> :É usada para definir um parágrafo de texto em uma página HTML.\n\n"+
                        " Por exemplo, se você quiser criar uma página HTML com dois parágrafos de texto, você pode usar a seguinte estrutura básica:"+
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        " <head>\n" +
                        "   <title>Título da página</title>\n" +
                        " </head>\n" +
                        " <body>\n" +
                        "  <h1>Título principal da página</h1>\n" +
                        "  <p>Este é o primeiro parágrafo de texto.</p>\n" +
                        "  <p>Este é o segundo parágrafo de texto.</p>\n" +
                        " </body>\n" +
                        "</html>\n\n\n"+

                        "●\t<a>: Na parte href , você deve especificar o caminho para a página HTML que deseja vincular. Isso pode ser uma URL " +
                                "completa (por exemplo, http://www.exemplo.com.br/outra_pagina.html ) ou um caminho relativo ao arquivo HTML atual (por " +
                                "exemplo, outra_pagina.html ou ../pasta/outra_pagina.html , se a página estiver em uma subpasta). Exemplo:\n\n"+
                        "<a href=\"caminho_para_a_outra_pagina.html\">Texto do link</a>\n\n\n"+

                        "●\t<img>: Na parte src , você deve especificar o caminho para a imagem que deseja exibir. Isso pode ser uma URL completa " +
                                "(por exemplo, http://www.exemplo.com.br/imagens/minha_imagem.jpg ) ou um caminho relativo ao arquivo HTML atual (por exemplo, " +
                                "imagens/minha_imagem.jpg ou ../pasta/imagens/minha_imagem.jpg , se a imagem estiver em uma subpasta). Exemplo:\n\n"+
                        "<img src=\"caminho_para_a_imagem.jpg\" alt=\"Texto alternativo\">\n\n\n"+

                        "●\t<ul>: Neste exemplo, a lista terá três itens com marcadores. Você pode adicionar mais itens à lista, simplesmente " +
                                "adicionando mais tags <li> dentro da tag <ul>. Exemplo:\n\n"+
                        "<ul>\n" +
                        "  <li>Item 1</li>\n" +
                        "  <li>Item 2</li>\n" +
                        "  <li>Item 3</li>\n" +
                        "</ul>\n\n"+
                        "Aqui está um exemplo completo de como criar uma lista com marcadores em uma página HTML:\n\n"+
                        "<!DOCTYPE html>\n" +
                        "<html>\n" +
                        "<head>\n" +
                        "  <title>Minha página</title>\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <h1>Minha lista com marcadores</h1>\n" +
                        "  <ul>\n" +
                        "   <li>Item 1</li>\n" +
                        "   <li>Item 2</li>\n"+
                        "   <li>Item 3</li>\n" +
                        "  </ul>\n" +
                        "</body>\n" +
                        "</html>\n\n\n"+

                        "●\t<table> , <tr> , <th> e <td>:\n\n"+
                        "<table>\n" +
                        " <tr>\n" +
                        "  <th>Cabeçalho da coluna 1</th>\n" +
                        "  <th>Cabeçalho da coluna 2</th>\n" +
                        "  <th>Cabeçalho da coluna 3</th>\n" +
                        " /tr>\n" +
                        " <tr>\n" +
                        "  <td>Linha 1, coluna 1</td>\n" +
                        "  <td>Linha 1, coluna 2</td>\n" +
                        "  <td>Linha 1, coluna 3</td>\n" +
                        " </tr>\n" +
                        " <tr>\n" +
                        "  <td>Linha 2, coluna 1</td>\n" +
                        "  <td>Linha 2, coluna 2</td>\n" +
                        "  <td>Linha 2, coluna 3</td>\n" +
                        " </tr>\n" +
                        "</table>\n\n"+
                        "Neste exemplo, a tabela terá 3 colunas e 2 linhas (sem contar a linha do cabeçalho). Você pode adicionar mais linhas e " +
                                "colunas simplesmente adicionando mais tags <tr> , <th> e <td> dentro da tag <table>.\n\n\n"+

                        "●\t<Style> ( Dentro da seção <head> ):\n\n"+
                        "<head>\n" +
                        " <style>\n" +
                        "   /* Aqui você define as regras CSS */\n" +
                        " </style>\n" +
                        "</head>\n\n"+
                        "- Defina as regras CSS para o elemento que você deseja estilizar.se você quiser estilizar o texto de um elemento <p> , você " +
                                "pode usar a seguinte regra CSS:+" +
                        "p {\n" +
                        "  color: red;\n" +
                        "  font-size: 20px;\n" +
                        "}\n\n"+
                        "- Coloque o elemento que você deseja estilizar em sua página HTML.Por exemplo, para o elemento <p> que definimos acima.\n\n"+
                        "<p>Este é um exemplo de texto que será estilizado.</p>\n\n\n"+

                        "●\t<form> e adicionar os campos do formulário usando as tags <input> , <textarea> , <select> e outras tags relacionadas. Exemplo:\n\n"+
                        "<form action=\"processar-formulario.php\" method=\"post\">\n" +
                        "  <label for=\"nome\">Nome:</label>\n" +
                        "  <input type=\"text\" id=\"nome\" name=\"nome\"><br><br>\n\n" +
                        "  <label for=\"email\">E-mail:</label>\n" +
                        "  <input type=\"email\" id=\"email\" name=\"email\"><br><br>\n\n" +
                        "  <label for=\"mensagem\">Mensagem:</label>\n" +
                        "  <textarea id=\"mensagem\" name=\"mensagem\"></textarea><br><br>\n\n"+
                        "  <label for=\"opcao\">Opção:</label>\n" +
                        "  <select id=\"opcao\" name=\"opcao\">\n" +
                        "   <option value=\"opcao1\">Opção 1</option>\n" +
                        "   <option value=\"opcao2\">Opção 2</option>\n" +
                        "   <option value=\"opcao3\">Opção 3</option>\n" +
                        "  </select><br><br>\n\n" +
                        " <input type=\"submit\" value=\"Enviar\">\n" +
                        "</form>\n\n\n"+

                        "●\t<form> :para criar o formulário de comentários e adicionar os campos necessários, como o nome do autor, endereço de e-mail, " +
                                "conteúdo do comentário, etc. Exemplo:\n\n"+
                        "<form action=\"#\" method=\"post\">\n" +
                        "  <label for=\"nome\">Nome:</label>\n" +
                        "  <input type=\"text\" id=\"nome\" name=\"nome\"><br><br>\n\n" +
                        "  <label for=\"email\">E-mail:</label>\n" +
                        "  <input type=\"email\" id=\"email\" name=\"email\"><br><br>\n\n" +
                        "  <label for=\"comentario\">Comentário:</label>\n" +
                        "  <textarea id=\"comentario\" name=\"comentario\"></textarea><br><br>\n\n" +
                        "  <input type=\"submit\" value=\"Enviar\">\n" +
                        "</form>\n\n\n"+

                        "●\t<ul> para exibir a lista de comentários. Cada comentário pode ser exibido em um elemento <li> .\n\n\n"+

                        "●\t<nav> :para envolver a lista de links do menu. Você pode usar a tag <ul> para criar a lista de links e a tag <li> para cada item do menu.\n\n"+
                        "Além disso, você pode adicionar um link para cada página do site usando a tag <a>. Exemplo:\n\n"+
                        "<nav>\n" +
                        "  <ul>\n" +
                        "    <li><a href=\"#\">Início</a></li>\n" +
                        "    <li><a href=\"#\">Sobre nós</a></li>\n" +
                        "    <li><a href=\"#\">Produtos</a></li>\n" +
                        "    <li><a href=\"#\">Contato</a></li>\n" +
                        "  </ul>\n" +
                        "</nav>\n\n\n"+

                        "●\t<footer> :e adicionar o conteúdo do rodapé dentro dele. Exemplo:\n\n" +
                        "<footer>\n" +
                        "  <p>Direitos autorais © 2023 Minha empresa. Todos os direitos reservados.</p>\n" +
                        "</footer>\n\n\n"+

                        "●\t<lang> :Para definir o idioma padrão de uma página HTML.\n" +
                        "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <title>Minha página</title>\n" +
                        "</head>\n\n\n"+
                        "- Neste exemplo, o valor do atributo lang é \"en\", que é o código de idioma para inglês.Isso informa aos navegadores e outros " +
                                "aplicativos que o idioma padrão da página é o inglês e permite que eles exibam a página adequadamente para usuários que " +
                                "falam esse idioma\n\n\n"+

                        "●\tPara definir o conjunto de caracteres usado em uma página HTML, você pode adicionar a seguinte meta tag dentro da tag " +
                        "HTML <head> :\n\n" +
                        "<meta charset=\"utf-8\">\n\n\n"+

                        "●\t< button> :Para criar um botão em uma página HTML.\n\n" +
                        "<button>Meu botão</button>\n\n\n" +

                        "●\t<select> e <option> :Para criar uma caixa de seleção em uma página HTML. Exemplo:\n\n"+
                        "<label for=\"meu-select\">Escolha uma opção:</label>\n" +
                        "<select id=\"meu-select\">\n" +
                        "  <option value=\"opcao1\">Opção 1</option>\n"+
                        "  <option value=\"opcao2\">Opção 2</option>\n" +
                        "  <option value=\"opcao3\">Opção 3</option>\n" +
                        "</select>\n\n\n"    +

                        "●\t<width> e <height> :Para definir a largura e altura de um elemento em uma página HTML usando CSS. Exemplo:\n\n" +
                                "<div style=\"width: 300px; height: 200px;\">\n" +
                                "   Conteúdo do elemento\n" +
                                "</div>\n\n\n"+

                        "●\t<ol> e <li> :Para criar uma lista numerada em uma página HTML. Exemplo:\n\n" +
                                "<ol>\n" +
                                "  <li>Item 1</li>\n" +
                                "  <li>Item 2</li>\n" +
                                "  <li>Item 3</li>\n" +
                                "</ol>\n\n\n"+

                        "●\t<dl> e <dt> e <dd> :Para criar uma lista de definições em uma página HTML. Exemplo:\n\n" +
                                "<dl>\n" +
                                "  <dt>Termo 1</dt>\n" +
                                "  <dd>Descrição do Termo 1.</dd>\n\n" +
                                "  <dt>Termo 2</dt>\n" +
                                "  <dd>Descrição do Termo 2.</dd>\n\n" +
                                "  <dt>Termo 3</dt>\n" +
                                "  <dd>Descrição do Termo 3.</dd>\n" +
                                "</dl>\n\n\n"+

                        "●\t<a> e <href> :Para criar um hyperlink em uma página HTML. Exemplo:\n\n" +
                                "<a href=\"https://www.exemplo.com\">Clique aqui</a>\n\n"+
                                "Neste exemplo, \"Clique aqui\" será exibido como um link para o endereço \"https://www.exemplo.com\". Quando o usuário " +
                                "clicar no link, o navegador será redirecionado para a página correspondente.\n\n"+
                                "Você também pode linkar para outros recursos, como arquivos de imagem ou documentos PDF, da mesma maneira.\n\n" +
                                "<a href=\"imagens/imagem1.jpg\">Veja a imagem</a>\n\n\n"+

                        "●\tposition: fixed: Para criar um cabeçalho fixo em uma página HTML.\n\n"+
                                "- 1. Crie o elemento que conterá o cabeçalho, por exemplo, uma <div>:\n\n"+
                                "<div id=\"cabecalho\">\n" +
                                "  <h1>Meu cabeçalho fixo</h1>\n" +
                                "</div>\n\n"+
                                "2. Adicione o estilo CSS para o elemento #cabecalho com o posicionamento fixo e defina a largura e altura conforme " +
                                "necessário:\n\n"+
                                "#cabecalho {\n" +
                                " position: fixed;\n" +
                                "  top: 0;\n" +
                                "  left: 0;\n" +
                                "  width: 100%;\n" +
                                "  height: 60px;\n" +
                                "  background-color: #fff;\n" +
                                "  z-index: 999;\n" +
                                "}\n\n\n"+

                        "●\t< charset> :indica o conjunto de caracteres que está sendo usado na página. Neste exemplo, estamos usando o conjunto de " +
                                "caracteres UTF-8, que é amplamente utilizado e suporta a maioria dos caracteres em todos os idiomas. Exemplo:\n\n"+
                        "<!DOCTYPE html>\n" +
                        "<html lang=\"en\">\n" +
                        "<head>\n" +
                        "  <meta charset=\"utf-8\">\n" +
                        "  <title>Minha página</title>\n" +
                        "  <!-- outros elementos do cabeçalho -->\n" +
                        "</head>\n" +
                        "<body>\n" +
                        "  <!-- conteúdo da página -->\n" +
                        "</body>\n" +
                        "</html>\n");


                startActivity(i);
            }
        });

    }
}