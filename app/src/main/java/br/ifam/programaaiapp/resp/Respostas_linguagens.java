package br.ifam.programaaiapp.resp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class Respostas_linguagens extends AppCompatActivity {

    LinearLayout resp1, resp2, resp3;
    ImageView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respostas_linguagens);

        resp1 = findViewById(R.id.resp1);
        resp2 = findViewById(R.id.resp2);
        resp3 = findViewById(R.id.resp3);

        buttonback = findViewById(R.id.backbutton);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        resp1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Respostas_linguagens.this, Respostas_textos.class);

                String respostas = getIntent().getStringExtra("respostas");

                if(respostas != null){
                    if (respostas.equals("Csharp") ||
                        respostas.equals("Css") ||
                        respostas.equals("Fluxo") ||
                        respostas.equals("Html") ||
                        respostas.equals("Java") ||
                        respostas.equals("Php") ||
                        respostas.equals("Phyton") ||
                        respostas.equals("Portugol")) {

                        i.putExtra("resposta_num_atvd", "Resposta Lista 1");

                    }if(respostas.equals("Phyton")){

                        i.putExtra("resposta_atvd",
                                "Questão 1:" +
                                "\nn1 = float(input('Digite um número: '))\n" +
                                "n2 = float(input('Digite outro número: '))\n\n" +
                                "soma = n1 + n2\n\n" +
                                "print('O valor de soma entre {} e {} é: {}'.format(n1, n2, soma))\n\n\n\n"  +

                                "Questão 2:\nn1 = int(input('Digite o número: '))\n\n" +
                                "suc = n1 + 1\n" +
                                "ant = n1 - 1\n\n" +
                                "print(f'O sucessor de {n1}, é {suc} e o seu antecessor, é {ant}')\n\n\n\n" +

                                "Questão 3:\nn1 = float(input('Digite um número: '))\n\n" +
                                "dob = n1*2\n" +
                                "tri = n1*3\n" +
                                "raiz = n1**(1/2)\n\n" +
                                "print(f'O dobro desse número é {dob}, o tripo desse número é {tri}'\n\n" +
                                "print(f' e a raiz quadrada desse número é {raiz}')\n\n\n\n"+

                                "Questão 4:\nn1 = float(input('Digite a primeira nota: '))\n" +
                                "n2 = float(input('Digite a segunda nota: '))\n" +
                                "med = (n1+n2)/2\n\n" +
                                "print(f'A média do aluno foi de {med}')\n\n\n\n" +

                                "Questão 5:\nmetro = float(input('Digite a metragem: '))\n\n" +
                                "cent = metro * 100\n" +
                                "mili = metro * 1000\n\n" +
                                "print(f'{metro} metros para centímetro é, {cent}cm, e para milímetro é, {mili}mm')\n\n\n\n"+

                                "Questão 6:\nn1 = float(input('Digite o valor da sua carteira: R$ '))\n\n" +
                                "dolar = n1 / 5.18\n\n" +
                                "print(f'Com R${n1} você pode ter $ {dolar} doláres')\n\n\n\n" +

                                "Questão 7:\nalt = float(input('Digite a altura da parede: '))\n\n" +
                                "larg = float(input('Digite a largura da parede: '))\n" +
                                "area = alt * larg\n" +
                                "litros = area / 2\n\n" +
                                "print(f'Sua parede tem a dimensão de {larg}mx{alt}m.')\n\n" +
                                "print(f'A sua área é de {area}m², e precisa-se de {litros} litros de tinta.')\n\n\n\n"+

                                "Questão 8:\nn1 = float(input('Digite o preço do produto: R$ '))\n\n" +
                                "new = n1-(n1*0.09)\n\n" +
                                "print(f'O novo preço do produto com desconto de 9 % é de R${new}')\n\n\n\n"+

                                "Questão 9:\nsalario = float(input('Digite o valor do seu salário: R$ '))\n\n" +
                                "novosa = salario + (salario * 0.15)\n\n" +
                                "print(f'O reajuste do salário com aumento de 15% é de {novosa}')\n\n\n\n"+

                                "Questão 10:\nC = float(input('Informe a temperatura em celsius (°C): '))\n\n" +
                                "F = C * 1.8 + 32\n\n" +
                                "print(f'A temperatura de {C}°C, corresponde a {F}°F')\n\n\n\n");
                    }
                    if(respostas.equals("Html")){
                        i.putExtra("resposta_atvd",
                                "\nQuestão 1:\n"+
                                        " Para definir o título de uma página HTML, use a tag <title> dentro da tag <head>. Por exemplo:\n\n" +
                                        "<head><title>Título da página</title></head>\n\n" +
                                "\nQuestão 2:\n"+
                                " Para criar um link para outra página HTML, use a tag <a> com o atributo \"href\" que aponta para o endereço da página. " +
                                        "Por exemplo:\n\n" +
                                        "<a href=\"outra_pagina.html\">Link para outra página</a>\n\n"+
                                "\nQuestão 3:\n"+
                                " Para inserir uma imagem em uma página HTML, use a tag <img> com o atributo \"src\" que aponta para o endereço da " +
                                        "imagem. Por exemplo:\n\n" +
                                        "<img src=\"imagem.jpg\">\n\n" +
                                "\nQuestão 4:\n" +
                                " Para criar uma lista com marcadores em uma página HTML, use a tag <ul> com a tag <li> para cada item da lista. Por " +
                                        "exemplo:\n\n" +
                                        "<ul><li>Item 1</li><li>Item 2</li></ul>\n\n"+
                                "\nQuestão 5:\n"+
                                " Para criar uma tabela em uma página HTML, use a tag <table> com as tags <tr> para cada linha e <td> para cada célula. " +
                                        "Por exemplo:\n\n" +
                                        "<table><tr><td>Célula 1</td><td>Célula 2</td></tr></table>\n\n"+
                                "\nQuestão 6:\n"+
                                " Para definir o estilo de um elemento em uma página HTML, use a tag <style> dentro da tag <head> ou o atributo \"style\" " +
                                        "dentro da tag do elemento. Por exemplo:\n\n" +
                                        "<style>h1 {color: blue;}</style> ou <h1 style=\"color: blue;\">Título em azul</h1>\n\n"+
                                "\nQuestão 7:\n"+
                                " Para criar um formulário em uma página HTML, use a tag <form> com os elementos de formulário, como <input> e " +
                                        "<textarea>. Por exemplo:\n\n" +
                                        "<form><input type=\"text\" name=\"nome\"><textarea name=\"mensagem\"></textarea></form>\n\n"+
                                "\nQuestão 8:\n"+
                                " Para criar uma seção de comentários em uma página HTML, use a tag <!-- --> para comentários em HTML. Por exemplo:\n\n" +
                                        "<!-- Este é um comentário -->\n\n"+
                                "\nQuestão 9:\n"+
                                "  Para criar um menu de navegação em uma página HTML, use a tag <nav> com as tags <ul> e <li> para cada item do " +
                                        "menu. Por exemplo:\n\n" +
                                        "<nav><ul><li>Item 1</li><li>Item 2</li></ul></nav>\n\n"+
                                "\nQuestão 10:\n"+
                                " Para criar um rodapé em uma página HTML, use a tag <footer> com o conteúdo do rodapé. Por exemplo:\n\n" +
                                        "<footer>Este é o rodapé</footer>\n\n");
                    }
                    if(respostas.equals("Portugol")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:" +
                                        "\nprograma {\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal x, y, z\n\n" +
                                        "\t\tescreva(\"Informe a 1º número: \")\n" +
                                        "\t\tleia(x)\n\n" +
                                        "\t\tescreva(\"\\nInforme o 2º número:\")\n" +
                                        "\t\tleia(y)\n\n" +
                                        "\t\tz = x + y\n\n" +
                                        "\t\tescreva(\"\\nA soma é: \",z)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 2:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal x, y, z, w, q\n\n" +
                                        "\t\tescreva(\"Informe a 1ºnota: \")\n" +
                                        "\t\tleia(x)\n\n" +
                                        "\t\tescreva(\"\\nInforme a 2º nota: \")\n" +
                                        "\t\tleia(y)\n\n" +
                                        "\t\tescreva(\"\\nInforme a 3º nota: \")\n" +
                                        "\t\tleia(z)\n" +
                                        "\t\tescreva(\"\\nInforme a 4º nota: \")\n" +
                                        "\t\tleia(w)\n\n" +
                                        "\t\t q = (x + y + z + w)/4\n" +
                                        "\t\tescreva(\"\\nA média é: \",q)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 3:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal x, y, z\n\n"+
                                        "\t\tescreva(\"Informe o 1º número: \")\n" +
                                        "\t\tleia(x)\n\n" +
                                        "\t\tescreva(\"\\nInforme o 2º número: \")\n" +
                                        "\t\tleia(y)\n\n" +
                                        "\tz=(x*x) + (y*y)\n\n"+
                                        "\t\tescreva(\"\\nO resultado é: \",z)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 4:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal x,r\n\n" +
                                        "\t\tescreva(\"Informe a medida em metros:\")\n" +
                                        "\t\tleia(x)\n\n" +
                                        "\t\tr = x * 100\n\n" +
                                        "\t\tescreva(\"A medida em cm é: \",r,\" cm\")\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 5:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal salario, hora_trabalhada, " +
                                        "valor_hora\n\n" +
                                        "\t\tescreva(\"Informe o valor da hora de trabalho: \")\n" +
                                        "\t\tleia(valor_hora)\n" +
                                        "\t\tescreva(\"\\Informe a quantidade de horas trabalhadas: \")\n" +
                                        "\t\tleia(hora_trabalhada)\n\n" +
                                        "\t\tsalario = valor_hora * hora_trabalhada\n" +
                                        "\t\tescreva(\"\\nO salário final é R$: \",salario)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 6:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal dist\n\n" +
                                        "\t\tescreva(\"Informe a distância em milhas: \")\n" +
                                        "\t\tleia(dist)\n" +
                                        "\t\tdist = dist / 0.6214\n\n" +
                                        "\t\tescreva(\"A distância em quilômetros é: \",dist,\" KM\")\n" +
                                        "\t}\n" +
                                        "}\n\n\n" +
                                "Questão 7:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal salario\n\n" +
                                        "\t\tescreva(\"Informe o valor do salário: \")\n" +
                                        "\t\tleia(salario)\n\n" +
                                        "\t\tsalario = salario + salario * 0.15 modo básico da expressão\n" +
                                        "\t\tsalario += salario * 0.15 // Forma modificada\n\n" +
                                        "\t\tescreva(\"O valor do salário reajustado é: \",salario, \"R$\")\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 8: "+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\tinteiro x, q, r\n\n" +
                                        "\t\tescreva(\"Informe um valor: \")\n" +
                                        "\t\tleia(x)\n\n" +
                                        "\t\tq = x/3 \n" +
                                        "\t\tr = x%3\n\n" +
                                        "\t\tescreva(\"\\nO valor do quociente é: \",q)\n" +
                                        "\t\tescreva(\"\\nO valor do resto é: \",r)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 9:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal peso, dia\n\n"+
                                        "\t\tescreva(\"Informe a quantidade de alimento em kilogramas: \")\n" +
                                        "\t\tleia(peso)\n\n" +
                                        "\t\tpeso = peso * 1000//Transforma em gramas a quantidade de quilos\n" +
                                        "\t\tdia = peso / 50\n\n" +
                                        "\t\tescreva(\"A quatidade de dias que irá durar o alimento é: \", dia)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 10:"+
                                        "\nprograma{\n\n" +
                                        "\tfuncao inicio(){\n\n" +
                                        "\t\treal media_con, odo_ini, odo_fim, comb_gasto, lucro_pass, lucro_liqui\n\n" +
                                        "\t\tescreva(\"Informe o odômetro inicial: \")\n" +
                                        "\t\tleia(odo_ini)\n\n" +
                                        "\t\tescreva(\"\\nInforme o odômetro final: \")\n" +
                                        "\t\tleia(odo_fim)\n\n" +
                                        "\t\tescreva(\"\\nInforme a quatidade de " +
                                        "litros de combustivel gastos:  \")\n" +
                                        "\t\tleia(comb_gasto)\n\n" +
                                        "\t\tescreva(\"\\nInforme o valor arrecadado no dia de serviço: \")\n" +
                                        "\t\tleia(lucro_pass)\n\n" +
                                        "\t\tmedia_con = (odo_fim - odo_ini) / comb_gasto\n" +
                                        "\t\tlucro_liqui = lucro_pass - (comb_gasto * 2.50)\n\n" +
                                        "\t\tescreva(\"\\nO consume médio Km/L foi: \", media_con,\", o valor liquido arrecadado foi R$: \", lucro_liqui)\n" +
                                        "\t}\n" +
                                        "}\n\n\n" );
                    }
                    if(respostas.equals("Csharp")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                        "using System;\n" +
                                        "namespace MediaH\n" +
                                        " class Harmonica{\n" +
                                        "   static void Main(string[] args){\n" +
                                        "    double N1, N2, N3, N4, MEDIAH;\n" +
                                        "    Console.Write(\"Por favor informe a 1ª nota do aluno: \");\n" +
                                        "N1 = Double.Parse(Console.ReadLine());\n\n" +
                                        "    Console.Write(\"Por favor informe a 2ª nota do aluno: \");\n" +
                                        "N2 = Double.Parse(Console.ReadLine());\n\n" +
                                        "    Console.Write(\"Por favor informe a 3ª nota do aluno: \");\n" +
                                        "N3 = Double.Parse(Console.ReadLine());\n\n" +
                                        "    Console.Write(\"Por favor informe a 4ª nota do aluno: \");\n" +
                                        "N4 = Double.Parse(Console.ReadLine());\n\n" +
                                        "    MEDIAH = (4 / ((1 / N1) + (1 / N2) + (1 / N3) + (1 / N4)));\n" +
                                        "    Console.WriteLine(\"O valor da Média Harmônica é: {0}\", MEDIAH);\n" +
                                        "    Console.ReadLine();\n" +
                                        "   }\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 2:\n"+
                                        "using System;\n" +
                                        "namespace Quadrado{\n" +
                                        " class Cálculo{\n" +
                                        "  static void Main(string[] args){\n" +
                                        "   double lado, area;\n" +
                                        "   Console.WriteLine(\"Por favor informe a medida do lado do quadrado: \")\n\n" +
                                        "   lado =\n" +
                                        "   double.Parse(Console.ReadLine());\n" +
                                        "   area = lado * lado;\n" +
                                        "   Console.WriteLine(\" A área do quadrado é: {0}\", area);\n" +
                                        "   Console.ReadLine();\n" +
                                        "  }\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 3:\n"+
                                "No código, na segunda tomada de decisão, a mensagem não poderá ser exigida porque não há " +
                                        "outro “ (aspas)\n\n\n"+
                                "Questão 4:\n"+
                                        "using System;\n" +
                                        "namespace Triângulo{\n" +
                                        " static void Main(string[] args)\n" +
                                        " double baset, altura, area;\n" +
                                        " Console.Write(\"Por favor informe a medida da Base do Triângulo: \");\n" +
                                        " baset =\nDouble.Parse(Console.ReadLine());\n\n" +
                                        " Console.Write(\"Por favor informe a medida da Altura do Triângulo: \");\n" +
                                        " altura =\nDouble.Parse(Console.ReadLine());\n\n" +
                                        " area = (baset * altura)/2;\n" +
                                        " Console.WriteLine(\"A Área do triângulo é: {0}\", area);\n" +
                                        " Console.ReadLine();\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 5:\n"+
                                        "using System;\n" +
                                        "namespace Esfera{\n" +
                                        " class Vesfera{\n" +
                                        "  static void Main(string[] args){\n" +
                                        "   double raio, volume, pi;\n" +
                                        "   pi = 3.14159;\n" +
                                        "   Console.WriteLine(\"Informe a medida do comprimento do raio\n" +
                                        "   da esfera em metros: \");\n" +
                                        "   raio =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   Console.WriteLine();\n" +
                                        "   volume = (( 4 * pi * Math.Pow(raio,3)/3));\n" +
                                        "   Console.WriteLine(\"O volume da esfera é: {0} metros cúbicos\",\n" +
                                        "   volume);\n" +
                                        "   Console.WriteLine( );\n"+
                                        "  }\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 6:\n"+
                                        "using System;\n" +
                                        "namespace Operações{\n" +
                                        " class Contas{\n" +
                                        "  static void Main(string[] args){\n" +
                                        "   double N1, N2, SOM,SUB,MUL, DIV;\n" +
                                        "   Console.Write(\"\\tEntre com o 1º número: \");\n" +
                                        "   N1 =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   Console.WriteLine();\n" +
                                        "   Console.Write(\"\\tEntre com o 2º número: \");\n" +
                                        "   N2 =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   Console.WriteLine();\n" +
                                        "   SOM = (N1 + N2);\n" +
                                        "   SUB = (N1 - N2);\n" +
                                        "   MUL = (N1 * N2);\n" +
                                        "   DIV = (N1 / N2);\n" +
                                        "   Console.WriteLine(\"A soma dos números {0} e {1} é de: {2}\",N1, N2, SOM);\n" +
                                        "   Console.WriteLine();\n\n" +
                                        "   Console.WriteLine(\"A subtração dos números {0} e {1} é de: {2}\",N1, N2, SUB);\n" +
                                        "   Console.WriteLine();\n\n" +
                                        "   Console.WriteLine(\"A multiplicação dos números {0} e {1} é de: {2}\",N1, N2, MUL);\n" +
                                        "   Console.WriteLine();\n\n" +
                                        "   Console.WriteLine(\"A divisão dos números {0} e {1} é de: {2}\",N1, N2, DIV);\n" +
                                        "   Console.WriteLine();\n\n" +
                                        "  }\n" +
                                        "}\n\n\n"+
                                "Questão 7:\n"+
                                        "using System;\n"+
                                        "namespace Diferença{\n" +
                                        " class Numeros{\n" +
                                        "  static void Main(string[] args){\n" +
                                        "   double N1,N2, DIF;\n" +
                                        "   Console.Write(\"Informe o 1º número: \");\n" +
                                        "   N1 =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   Console.Write(\"Informe o 2º número: \");\n" +
                                        "   N2 =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   DIF =\nMath.Pow(N1,2) - Math.Pow(N2,2);\n" +
                                        "   Console.WriteLine(\"O quadrado da diferença entre os\n" +
                                        "   números {0} e {1} é de: {2}\", N1, N2, DIF);\n" +
                                        "  }\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 8:\n"+
                                "mensagem: Saldo Insuficiente; saldo 5.0\n\n\n"+
                                "Questão 9:\n"+
                                "mensagem: Saquerealizado com sucesso; saldo: 90.0\n\n\n"+
                                "Questão 10:\n"+
                                        "using System;\n" +
                                        "namespace Celsius{\n" +
                                        " /// <summary>\n" +
                                        " /// Summary description for Class1.\n" +
                                        " /// </summary>\n" +
                                        " class Temperatura{\n" +
                                        "  static void Main(string[] args){\n" +
                                        "   double C, F;\n" +
                                        "   Cnsole.Write(\"Informe a temperatura na escala Fahrenheit:\");\n" +
                                        "   F =\nDouble.Parse(Console.ReadLine());\n" +
                                        "   C = ((F - 32)* 5/9);\n"+
                                        "   Console.WriteLine(\"A temperatura de {0} graus Fahrenheit equivale a: {1} graus Celsius\", F, C);\n" +
                                        "   }\n" +
                                        " }\n" +
                                        "}\n\n\n");
                    }
                    if (respostas.equals("Fluxo")) {
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n" +
                                        "Pode ser entendido como uma representação esquemática de um processo ou algoritmo, " +
                                        "muitas vezes feito através de gráficos que ilustram de forma descomplicada a transição de " +
                                        "informações entre os elementos que o compõem.\n\n\n" +
                                        "Questão 2:\n" +
                                        "Para criar um fluxograma, é necessário identificar as etapas do processo e as decisões que " +
                                        "serão tomadas. Em seguida, os símbolos apropriados devem ser selecionados e " +
                                        "posicionados em uma planilha ou software de fluxograma. As conexões entre os símbolos " +
                                        "devem ser desenhadas para mostrar como o processo fluirá.\n\n\n" +
                                        "Questão 3:\n" +
                                        "A finalidade do fluxograma na programação é fornecer uma visualização clara e concisa do " +
                                        "processo do programa. Ele ajuda os programadores a entenderem melhor o processo e a " +
                                        "identificarem possíveis problemas ou gargalos.\n\n\n" +
                                        "Questão 4:\n" +
                                        "São eles início/fim, decisão, processo, entrada de dados, saída de dados, processo prédefinido, conector, documento e preparação.\n\n\n" +
                                        "Questão 5:\n" +
                                        "Fluxogramas são úteis para escrever um programa ou algoritmo e explicá-lo aos outros ou\n" +
                                        "colaborar com eles.\n\n\n" +
                                        "Questão 6:\n" +
                                        "Desenhar um fluxograma antes da programação ajuda a identificar possíveis problemas e " +
                                        "erros antes do desenvolvimento começar. Isso economiza tempo, dinheiro e esforço na " +
                                        "depuração e resolução de problemas mais tarde no processo de desenvolvimento. Também " +
                                        "ajuda a garantir que o programa seja organizado e fácil de entender.\n\n\n" +
                                        "Questão 7:\n" +
                                        "A estrutura condicional pode ser representada por um losango no fluxograma. No centro do " +
                                        "losango, é indicada a condição a ser testada e \"sim\" e \"não\" são escritos nas saídas do " +
                                        "losango, indicando qual caminho será seguido dependendo do resultado do teste da " +
                                        "condição.\n\n\n" +
                                        "Questão 8:\n" +
                                        "A estrutura de repetição pode ser representada por um retângulo no fluxograma, que indica " +
                                        "as instruções a serem executadas enquanto uma determinada condição for verdadeira. A " +
                                        "condição é normalmente testada no início do retângulo e a decisão de continuar ou parar é " +
                                        "tomada na saída do retângulo.\n\n\n" +
                                        "Questão 9:\n" +
                                        "A operação de atribuição pode ser representada por uma seta que conecta um símbolo que " +
                                        "representa a variável a ser atribuída ao símbolo que representa o valor que será atribuído.\n\n\n" +
                                        "Questão 10\n" +
                                        "Uma estrutura de repetição com contagem pode ser representada por uma linha de tempo " +
                                        "com marcadores. A posição do marcador indica o número da iteração atual e a decisão de " +
                                        "continuar ou parar é tomada depois de cada iteração.\n\n\n");
                    }
                    if(respostas.equals("Css")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                "main {\n" +
                                "  width: 70%;\n" +
                                "  margin: 0 auto;\n" +
                                "}\n\n\n"+
                                "Questão 2:\n"+
                                "header img {\n" +
                                        "  width: 100%;\n" +
                                        "}\n\n\n"+
                                "Questão 3:\n"+
                                "header {\n" +
                                        "  background-color: black;\n" +
                                        "  color: white;\n" +
                                        "}\n\n\n"+
                                "Questão 4:\n"+
                                "main {\n" +
                                        "  border: 1px solid gray;\n" +
                                        "}\n\n\n"+
                                "Questão 5:\n"+
                                "main {\n" +
                                        "  font-family: Arial, sans-serif;\n" +
                                        "  font-size: 16px;\n" +
                                        "}\n\n\n"+
                                "Questão 6:\n"+
                                "ol {\n" +
                                        "  list-style: none;\n" +
                                        "}\n" +
                                        "\n" +
                                        "li {\n" +
                                        "  border: 1px solid gray;\n" +
                                        "}\n\n\n"+
                                "Questão 7:\n"+
                                "li:hover {\n" +
                                        "  background-color: lightgray;\n" +
                                        "  color: white;\n" +
                                        "}\n\n\n"+
                                "Questão 8:\n"+
                                "input[type=\"text\"] {\n" +
                                        "  width: 70%;\n" +
                                        "  font-size: 14px;\n" +
                                        "}\n\n\n"+
                                "Questão 9:\n"+
                                "footer button {\n" +
                                        "  text-align: center;\n" +
                                        "}\n\n\n"+
                                "Questão 10:\n"+
                                "elemento {\n" +
                                        "  background-color: green;\n" +
                                        "  border: 2px solid blue;\n" +
                                        "}\n\n\n");
                    }
                    if(respostas.equals("Java")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n\n"+
                                         "// Programa de adição que permite a soma de dois números import  \n" +
                                        "java.util.Scanner;\n" +
                                        "// Programa utiliza a classe Scanner\n\n" +
                                        "public class Exerc1 { \n\n" +
                                        "// Método principal inicia a execução do aplicativo Java\n" +
                                        "public static void main( String[] args) { \n" +
                                        "// Cria um Scanner para obter entrada da janela de comando\n" +
                                        "Scanner input = new Scanner( System.in );\n" +
                                        "int number1; \n" +
                                        "// primeiro número a adicionar \n" +
                                        "int number2; \n" +
                                        "// segundo número a adicionar \n" +
                                        "int sum;\n" +
                                        "// soma de number1 e number2 \n" +
                                        "System.out.print( \" Digite o primeiro número: \"); \n" +
                                        "// prompt \n" +
                                        "number1 = input.nextInt(); \n" +
                                        "// lê o primeiro nº fornecido pelo usuário \n" +
                                        "System.out.print( \" Digite o segundo número: \");\n" +
                                        "// prompt \n" +
                                        "number2 = input.nextInt();\n" +
                                        "// lê o segundo mº fornecido pelo usuário\n" +
                                        "sum = number1 + number2 ;\n" +
                                        "// soma os números e armazena o total em sum\n" +
                                        "System.out.printf(\"O resultado é %s\\n\" +sum); \n" +
                                        "// exibe o resultado da soma \n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 2:\n\n"+
                                        "import java.util.Scanner;\n" +
                                        "public class Exerc2 { \n\n" +
                                        "public static void main(String args[]) { \n" +
                                        "Scanner input = new Scanner(System.in);\n" +
                                        "int  x, y ;\n" +
                                        "// primeiro número e segundo número\n" +
                                        "int soma, subt, div, mult; \n" +
                                        "// operações \n" +
                                        "System.out.print(\"Digite o primeiro número:\" );\n" +
                                        "x = input.nextInt();  \n" +
                                        "System.out.print(\"Digite o segundo número:\" );\n" +
                                        "y = input.nextInt();\n\n" +
                                        "soma = x + y;\n " +
                                        "subt = x - y;\n " +
                                        "div = x / y;\n" +
                                        "mult = x * y;\n\n" +
                                        "System.out.println(\"A soma é:\" +soma);\n" +
                                        "System.out.println(\"A subtração é:\" +subt);\n" +
                                        "System.out.println(\"A divisão é:\" +div);\n" +
                                        "System.out.println(\"A multiplicação é:\" +mult);\n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 3:\n\n"+
                                        "import java.util.Scanner;\n" +
                                        "public class Exerc3 { \n\n" +
                                        "public static void main (String args[]) { \n" +
                                        "Scanner input = new Scanner(System.in);\n " +
                                        "double taxaDeConsumo; \n" +
                                        "// media de combustível por km double  km1; \n" +
                                        "// km inicial \n\n" +
                                        "double km2 ;\n" +
                                        "// km final\n\n " +
                                        "double kmtotal;\n" +
                                        "// km percorridos\n\n" +
                                        "double litros; \n" +
                                        "// combustivel gasto \n\n" +
                                        "System.out.print(\"Informe o KM inicial: \" );  \n" +
                                        "km1 = input.nextDouble();  \n" +
                                        "System.out.print(\"Informe o KM final: \" );\n" +
                                        " km2 = input.nextDouble();  \n" +
                                        "System.out.print(\"Informe a quantidade de litros consumidos:\" ); " +
                                        " litros = input.nextDouble();  kmtotal = km2 - km1; \n\n" +
                                        "taxaDeConsumo = kmtotal / litros; \n" +
                                        "System.out.println(\"O total percorrido foi de\" + kmtotal+ \"Km\"); \n" +
                                        "System.out.println(\"A Taxa media de consumo é de:\" +TaxaDeConsumo+ \"litros por km percorrido\"); \n" +
                                        "}  \n" +
                                        "} \n\n\n"+

                                "Questão 4:\n\n"+
                                        "import java.util.Scanner;\n" +
                                        "public class Exerc4 { \n" +
                                        "public static void main(String args[]) { \n" +
                                        "Scanner input = new Scanner(System.in);\n " +
                                        "String nomeVendedor;\n" +
                                        "double salarioFixo;\n" +
                                        "// Salario Fixo do vendedor \n" +
                                        "double  vendas; \n" +
                                        "// vendas efetuadas pelo vendedor\n\n" +
                                        "double  comissao;\n" +
                                        "// comissão de 15% sobre as vendas\n\n" +
                                        "double salarioFinal;\n" +
                                        "// salario final ( fixo + comissao ) \n\n" +
                                        "System.out.print(\" Digite o nome do vendedor:\" ) ; \n" +
                                        "nomeVendedor = input.nextLine();\n" +
                                        "System.out.print(\"Digite o salário fixo do vende dor:\" );\n" +
                                        "salarioFixo = input.nextDouble(); \n" +
                                        "System.out.print(\"Digite o total de vendas efetu adas pelo vendedor:\" );\n" +
                                        "vendas = input.nextDouble();\n  " +
                                        "comissao = ( vendas * 15 ) / 100;\n" +
                                        "salarioFinal = comissao + salarioFixo;\n\n" +
                                        "System.out.println(\"Nome do Vendedor:\" +nomeVend edor);\n" +
                                        "System.out.println(\"Salario Fixo:\" +salarioFixo+ \"reais\");\n" +
                                        "System.out.println(\"Salario Final:\" +salarioFinal+ \"reais\");\n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 5:\n\n"+
                                "import java.util.Scanner;\n" +
                                        "public class Exerc5 {  \n" +
                                        "public static void  main(String args[]) {  \n" +
                                        "Scanner input = new Scanner(System.in);\n\n" +
                                        "String nomeAluno;\n" +
                                        "double nota1\n; " +
                                        "double nota2;\n" +
                                        "double nota3;\n" +
                                        "double mediaFinal;\n" +
                                        "System.out.print(\"Digite o nome do aluno:\" );\n" +
                                        "nomeAluno = input.nextLine();\n" +
                                        "System.out.print(\"Digite a nota da primeira prov a:\" ); \n" +
                                        "nota1 = input.nextDouble();  \n" +
                                        "System.out.print(\"Digite a nota da segunda prova :\" );\n" +
                                        "nota2 = input.nextDouble();\n" +
                                        "System.out.print(\"Digite a nota da terceira prova:\" ); \n" +
                                        "nota3 = input.nextDouble();\n" +
                                        "mediaFinal = ( nota1 + nota2 + nota3 ) / 3;\n" +
                                        "System.out.println(\"Nome do aluno:\" +nomeAluno);\n" +
                                        "System.out.println(\"A média do aluno é:\" +mediaFinal);\n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 6:\n\n"+
                                "import java.util.Scanner;\n" +
                                        "public class Exerc6 {  \n" +
                                        "public static void  main(String args[]) {  \n" +
                                        "Scanner input = new Scanner(System.in);\n  " +
                                        "double C, F; \n" +
                                        "System.out.print(\"Digite a temperatura em Graus Celsius:\" );\n" +
                                        "C = input.nextDouble();  \n" +
                                        "F = ( 9 * C + 160 ) / 5;  \n" +
                                        "System.out.printf(\" A temperatura convertida pa ra Fahrenheit é:\" +F);  \n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 7:\n\n"+
                                "import java.util.Scanner;\n" +
                                        "public class Exerc7 { \n" +
                                        "public static void main(String args[]) { \n" +
                                        "Scanner input = new Scanner(System.in);\n  " +
                                        "double real; \n\n" +
                                        "// valor da conversão de dólar para real double  dolar; \n" +
                                        "// quantidade em dólares do usuário double  cotacao;  \n" +
                                        "// cotação do dólar \n\n" +
                                        "System.out.print(\"Digite a quantidade em dolar:\" );\n" +
                                        "dolar = input.nextDouble(); \n" +
                                        "System.out.print(\"Digite a cotação do dolar:\" );  \n" +
                                        "cotacao = input.nextDouble();\n" +
                                        "real = dolar * cotacao; \n" +
                                        "System.out.printf(\"Quantia em reais: \" +real+ R$\");\n" +
                                        "}  \n" +
                                        "} \n\n\n" +
                                "Questão 8:\n\n"+
                                "import java.util.Scanner;\n" +
                                        "public class Exerc9 {  \n" +
                                        "public static void main(String args[]) {\n" +
                                        "Scanner input = new Scanner(System.in);\n  " +
                                        "double deposito;\n " +
                                        "// valor depositado\n " +
                                        "double juros; \n\n" +
                                        "// juros de 0,70% ao mês double  rendimento;  \n" +
                                        "// rendimento após um mês \n\n" +
                                        "System.out.print(\"Digite o valor do deposito:\" ); \n" +
                                        "deposito = input.nextDouble();\n" +
                                        "juros = ( deposito * 0.70 ) / 100;\n\n" +
                                        "// calculando a porcentagem de juros rendimento = juros + deposito; \n" +
                                        "System.out.print(\"O rendimento da poupança no mê s foi de +rendimento+ \"R$\" );  \n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 9:\n\n"+
                                "import java.util.Scanner; \n" +
                                        "public class Exerc10 {  \n" +
                                        "public static void  main(String args[]){  \n" +
                                        "Scanner input = new Scanner(System.in);\n  " +
                                        "double valorProduto;\n" +
                                        "double valorPrestacao;\n" +
                                        "int  parcelas = 5;  \n" +
                                        "System.out.print(\"Digite o valor da compra: \" );  \n" +
                                        "valorProduto = input.nextDouble();\n  " +
                                        "valorPrestacao = valorProduto / parcelas;  \n" +
                                        "System.out.print(\"O valor de cada parcela é de: \" +valorPrestacao+ \" R$\");  \n" +
                                        "}  \n" +
                                        "} \n\n\n"+
                                "Questão 10:\n\n"+
                                "import java.util.Scanner;\n" +
                                        "public class Exerc11 { \n" +
                                        "public static void  main(String args[]){  \n" +
                                        "Scanner input = new Scanner(System.in);\n  " +
                                        "double precoDeCusto;\n  " +
                                        "double  acrescimo;\n  " +
                                        "double  valorVenda;\n" +
                                        "System.out.print(\"Digite o preço de custo do produto: \");  \n" +
                                        "precoDeCusto = input.nextDouble();  \n" +
                                        "System.out.print(\"Digite a porcentagem de acres cimo: \");  \n" +
                                        "acrescimo = input.nextDouble();  \n" +
                                        "valorVenda = (precoDeCusto * acrescimo) / 100 + precoDeCusto;  \n" +
                                        "System.out.printf(\"O valor de venda  do produto é: \"+valorVenda+ R$\");  \n" +
                                        "}  \n" +
                                        "} \n\n\n");
                    }
                    if(respostas.equals("Php")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                "e) sdtClass\n\n\n"+
                                "Questão 2:\n"+
                                "F,F,F,V,V\n\n\n"+
                                "Questão 3:\n"+
                                "F,V,V\n\n\n"+
                                "Questão 4:\n"+
                                        "O PHP possui três operadores lógicos principais: \"E\" lógico (&&), \"OU\" lógico (||) e " +
                                        "\"NÃO\" lógico (!).\n\n" +
                                        "Operador \"E\" lógico (&&): Retorna verdadeiro se ambas as expressões forem " +
                                        "verdadeiras. Caso contrário, retorna falso. Por exemplo:\n\n" +
                                        "$expressao1 && $expressao2;\n\n" +
                                        "Operador \"OU\" lógico (||): Retorna verdadeiro se pelo menos uma das expressões for " +
                                        "verdadeira. Caso contrário, retorna falso. Por exemplo:\n\n" +
                                        "$expressao1 || $expressao2;\n\n" +
                                        "Operador \"NÃO\" lógico (!): Inverte o valor de uma expressão. Se a expressão for " +
                                        "verdadeira, retorna falso. Se a expressão for falsa, retorna verdadeiro. Por exemplo:\n\n" +
                                        "$expressao;\n\n\n"+
                                "Questão 5:\n"+
                                        "<?php\n" +
                                        " $num = 2;\n" +
                                        "  if($num % 2 == 0){\n" +
                                        " echo \"Par\";\n" +
                                        "}else{\n" +
                                        " echo \"Impar\";\n" +
                                        "}\n" +
                                        "?>\n\n\n"+
                                "Questão 6:\n"+
                                        "<?php\n" +
                                        "  echo \"Bom dia\";\n" +
                                        "?>\n\n\n"+
                                "Questão 7:\n"+
                                        "<?php\n" +
                                        " for ($i = 1; $i <= 10; $i++) {\n" +
                                        "  echo $i . \"<br>\";\n" +
                                        " }\n" +
                                        "?>\n\n\n"+
                                "Questão 8:\n"+
                                        "<?php\n" +
                                        "// Função para verificar se um número é múltiplo de 5\n" +
                                        " function verificarMultiploDe5($numero) {\n" +
                                        "  if ($numero % 5 == 0) {\n" +
                                        "   return true;\n" +
                                        " } else {\n" +
                                        "   return false;\n" +
                                        " }\n" +
                                        "}\n" +
                                        "// Entrada do número\n" +
                                        "echo \"Digite um número: \";\n" +
                                        "$numero = intval(readline());\n" +
                                        "// Chamada da função para verificar se o número é múltiplo de 5\n" +
                                        " if (verificarMultiploDe5($numero)) {\n" +
                                        "  echo $numero . \" é múltiplo de 5.\\n\";\n" +
                                        "} else {\n" +
                                        "  echo $numero . \" não é múltiplo de 5.\\n\";\n" +
                                        "}\n" +
                                        "?>\n\n\n"+
                                "Questão 9:\n"+
                                        "<?php\n" +
                                        "$val = -69; //Valor de entrada\n" +
                                        "$resultado = \"\";\n" +
                                        " if($val > 0){\n" +
                                        "  $resultado = \"Valor Positivo\";\n" +
                                        "}elseif($val < 0){\n" +
                                        "  $resultado = \"Valor Negativo\";\n" +
                                        "}else{\n" +
                                        "  $resultado = \"Igual a Zero\";\n" +
                                        "}\n" +
                                        "echo $resultado;\n"+
                                        "?>\n\n\n"+
                                "Questão 10:\n"+
                                        "<?php\n" +
                                        " $numA = 110;\n" +
                                        " $numB = 12;\n" +
                                        "  if($numA > $numB){\n" +
                                        "   echo \"A maior que B\";\n" +
                                        "}else{\n" +
                                        "   echo \"A menor que B\";\n" +
                                        "}\n" +
                                        "?>\n\n\n");
                    }
                }
                startActivity(i);
            }

        });

        resp2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Respostas_linguagens.this, Respostas_textos.class);

                String respostas = getIntent().getStringExtra("respostas");

                if(respostas != null){
                    if (respostas.equals("Csharp") ||
                            respostas.equals("Css") ||
                            respostas.equals("Fluxo") ||
                            respostas.equals("Html") ||
                            respostas.equals("Java") ||
                            respostas.equals("Php") ||
                            respostas.equals("Phyton") ||
                            respostas.equals("Portugol")) {

                        i.putExtra("resposta_num_atvd", "Resposta Lista 2");

                    }if(respostas.equals("Phyton")){

                        i.putExtra("resposta_atvd",
                                "Questão 1:\n" +
                                "dias = int(input('Quantos dias alugados?: '))\n" +
                                        "kmr = float(input('Quantos Km rodados?: '))\n\n" +
                                        "diaria = dias * 75\n" +
                                        "kmp = kmr * 0.20\n\n" +
                                        "total = diaria + kmp\n\n" +
                                        "print(f'O total a pagar é de R${total}')\n\n\n\n"+
                                "Questão 2:\n" +
                                "catop = float(input('Escreva o cateto oposto: '))\n" +
                                        "catad = float(input('Escreva o cateto adjacente: '))\n\n" +
                                        "import math\n" +
                                        "hipo = math.hypot(catop, catad)\n\n" +
                                        "print(f'A hipotenusa é {hipo :.2f}.')\n\n\n\n"+
                                "Questão 3:\n"+
                                "angulo = float(input('Digite o ângulo: '))\n\n" +
                                        "import math\n" +
                                        "seno = math.sin(math.radians(angulo))\n" +
                                        "cos = math.cos(math.radians(angulo))\n" +
                                        "tang = math.tan(math.radians(angulo))\n\n" +
                                        "print(f'O seno de {angulo} é {seno}')\n\n" +
                                        "print(f'O cosseno de {angulo} é {cos}')\n\n" +
                                        "print(f'A tangente de {angulo} é {tang}')\n\n\n\n"+
                                "Questão 4:\n"+
                                "import random\n\n" +
                                        "computador = random.randint(0, 5)\n" +
                                        "jogador = int(input('Descubra o número que estou pensando: '))\n\n" +
                                        "if computador == jogador:\n" +
                                        " print(f'O número escolhido foi {computador} e o que você digitou foi {jogador}.')\n\n" +
                                        " print('ACERTOU o número!!!')\n\n" +
                                        "else:\n" +
                                        " print(f'O número escolhido foi {computador} e o que você digitou foi {jogador}.')\n\n" +
                                        " print('ERROU o número!!!')\n\n\n\n"+
                                "Questão 5:\n" +
                                "velo = float(input('Digite a velocidade do carro: '))\n" +
                                        "multa = (velo-80) * 9\n\n" +
                                        "if velo > 80:\n" +
                                        " print(f'O limite de velocidade era de 80km/h e você passou a {velo}km/h.')\n\n" +
                                        " print(f'Você foi multado em R${multa}')\n\n" +
                                        "else:\n" +
                                        " print(f'O limite de velocidade era de 80km/h e você passou a {velo}km/h')\n\n" +
                                        " print('Você não foi multado')\n\n\n\n" +
                                "Questão 6:\n"+
                                "n1 = int(input('Digite qualquer número inteiro: '))\n" +
                                        "verificador = n1 % 2\n\n" +
                                        "if verificador == 0:\n" +
                                        " print('O número digitado é par.')\n\n" +
                                        "else:\n" +
                                        " print('O número digitado é ímpar.')\n\n\n\n"+
                                "Questão 7:\n" +
                                "dis = float(input('Digite a distância da viagem em km: '))\n\n" +
                                        "if dis <= 200:\n" +
                                        " price = dis * 0.65\n\n" +
                                        "else:\n" +
                                        " price = dis * 0.55\n\n" +
                                        "print(f'O preço da passagem vai ser de R${price}')\n\n\n\n" +
                                "Questão 8:\n"+
                                "ano = int(input('Digite um ano qualquer: '))\n\n" +
                                        "if ano % 4 == 0 and ano % 100 != 0 or ano % 400 == 0:\n" +
                                        " print(f'O ano de {ano} é um ano bissexto')\n\n" +
                                        "else:\n" +
                                        " print(f'O ano de {ano} NÃO é um ano bissexto')\n\n\n\n"+
                                "Questão 9:\n"+
                                "n1 = float(input('Digite o primeiro número: '))\n" +
                                        "n2 = float(input('Digite o segundo: '))\n" +
                                        "n3 = float(input('Digite o terceiro número: '))\n\n" +
                                        "maior = n1\n" +
                                        "menor = n1\n\n" +
                                        "if n2 > maior:\n" +
                                        " maior = n2\n\n" +
                                        "if n3 > maior:\n" +
                                        " maior = n3\n\n" +
                                        "if n2 < menor:\n" +
                                        " menor = n2\n\n" +
                                        "if n3 < menor:\n" +
                                        " menor = n3\n\n" +
                                        "print(f'O menor número é {menor}')\n\n" +
                                        "print(f'O maior número é {maior}')\n\n\n\n"+
                                "Questão 10:\n"+
                                "print('='*20, 'Desafio 34', '='*20)\n\n" +
                                        "salario = float(input('Digite seu salário para o aumento: '))\n\n" +
                                        "if salario > 1250:\n" +
                                        " salnovo = salario + (salario * 0.10)\n\n" +
                                        "elif salario <= 1250:\n" +
                                        " salnovo = salario + (salario * 0.15)\n\n" +
                                        "print(f'O seu salário aumentou de {salario} para {salnovo}')\n\n\n\n");
                        startActivity(i);
                    }
                    if(respostas.equals("Html")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                " Para definir o idioma padrão de uma página HTML, use o atributo \"lang\" na tag <html>. Por exemplo:\n\n" +
                                        "<html lang=\"pt-BR\">\n\n\n"+
                                "Questão 2:\n"+
                                " Para definir o conjunto de caracteres usado em uma página HTML, use a tag <meta> com o atributo \"charset\". Por " +
                                        "exemplo:\n\n" +
                                        "<meta charset=\"UTF-8\">\n\n\n"+
                                "Questão 3:\n"+
                                " Para criar uma página HTML responsiva, use media queries e tamanhos de fonte e imagem flexíveis. Por exemplo:\n\n" +
                                        "@media (max-width: 768px) {body {font-size: 16px;} img {max-width: 100%;}}\n\n"+
                                "Questão 4:\n"+
                                " Para criar um botão em uma página HTML, use a tag <button> com o atributo \"type\" definido como \"button\". Por exemplo:\n\n" +
                                        "<button type=\"button\">Clique aqui</button>\n\n\n"+
                                "Questão 5:\n"+
                                " Para criar uma caixa de seleção em uma página HTML, use a tag <select> com as tags <option> para cada opção. Por exemplo:\n\n"+
                                        "<input type=\"checkbox\" name=\"nome-da-caixa-de-selecao\" value=\"valor-da-caixa-de-selecao\">\n\n\n"+
                                "Questão 6:\n"+
                                " Para definir a largura e altura de um elemento em uma página HTML, podemos utilizar os atributos \"width\" e \"height\". Por " +
                                        "exemplo, para definir a largura de uma imagem como 500 pixels e a altura como 300 pixels, podemos usar a seguinte " +
                                        "sintaxe:\n\n" +
                                        "<img src=\"imagem.jpg\" width=\"500\" height=\"300\">\n\n\n"+
                                "Questão 7:\n"+
                                " Para criar uma lista numerada em uma página HTML, podemos utilizar a tag \"ol\" (ordered list) juntamente com a tag \"li\" " +
                                        "(list item) para cada item da lista. Por exemplo:\n\n" +
                                        "<ol>\n" +
                                        "   <li>Item 1</li>\n" +
                                        "   <li>Item 2</li>\n" +
                                        "   <li>Item 3</li>\n" +
                                        "</ol>\n\n\n"+
                                "Questão 8:\n"+
                                " Para criar uma lista de definições em uma página HTML, podemos utilizar a tag \"dl\" (description list) juntamente com as " +
                                        "tags \"dt\" (term) para o termo e \"dd\" (definition) para a definição. Por exemplo:\n\n" +
                                        "<dl>\n" +
                                        "   <dt>HTML</dt>\n" +
                                        "   <dd>Linguagem de marcação para a criação de páginas web.</dd>\n" +
                                        "   <dt>CSS</dt>\n" +
                                        "   <dd>Linguagem de estilos para a apresentação visual de páginas web.</dd>\n" +
                                        "</dl>\n\n\n"+
                                "Questão 9:\n"+
                                " Para criar um hyperlink em uma página HTML, podemos utilizar a tag \"a\" (anchor) juntamente com o atributo \"href\" para " +
                                        "indicar a URL para onde o link deve apontar. Por exemplo:\n\n" +
                                        "<a href=\"https://www.exemplo.com\">Clique aqui para visitar o site de exemplo</a>\n\n\n"+
                                "Questão 10:\n"+
                                " Para criar um cabeçalho fixo em uma página HTML, podemos utilizar a tag \"header\" para o cabeçalho e a tag \"nav\" para o " +
                                        "menu de navegação. Em seguida, podemos definir o estilo CSS para fixar o cabeçalho no topo da página. Por exemplo:\n\n" +
                                        "<header>\n" +
                                        " <h1>Meu site</h1>\n" +
                                        " <nav>\n" +
                                        "  <ul>\n" +
                                        "   <li><a href=\"#\">Página inicial</a></li>\n" +
                                        "   <li><a href=\"#\">Sobre</a></li>\n" +
                                        "   <li><a href=\"#\">Contato</a></li>\n" +
                                        "  </ul>\n" +
                                        " </nav>\n" +
                                        "</header>\n" +
                                        "<style>\n" +
                                        " header {\n" +
                                        "  position: fixed;\n" +
                                        "  top: 0;" +
                                        "  left: 0;\n" +
                                        "  right: 0;\n" +
                                        "  background-color: #fff;\n" +
                                        "  z-index: 1;\n" +
                                        "  padding: 10px;\n" +
                                        " }\n" +
                                        "</style>\n\n\n");
                        startActivity(i);
                    }
                    if(respostas.equals("Fluxo")){
                        Intent intent = new Intent(Respostas_linguagens.this, Fluxo_respostas2.class);
                        startActivity(intent);
                    }
                    if(respostas.equals("Portugol")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "   real n_emp_loja, salario_min,\np_cust_bic, n_bic_vendida,\nv_total_bic_vendida, salario_final,\ncomissao, lucro_liq\n\n" +
                                        "escreva(\"informe o número de empregados da loja: \")\n" +
                                        "leia(n_emp_loja)\n" +
                                        "escreva(\"\\nInforme o valor do salário mínimo: \")\n" +
                                        "leia(salario_min)\n" +
                                        "escreva(\"\\nInforme o valor de custo da cada bicicleta: \")\n" +
                                        "leia( p_cust_bic)\n" +
                                        "escreva(\"\\nInforme o número de bicicletas vendidas: \")\n" +
                                        "leia(n_bic_vendida)\n" +
                                        "\n" +
                                        "v_total_bic_vendida = (p_cust_bic + (p_cust_bic * 0.5)) * n_bic_vendida\n" +
                                        "\n" +
                                        "comissao = p_cust_bic * 0.15 * n_bic_vendida\n" +
                                        "\n" +
                                        "salario_final = 2 * salario_min + comissao/n_emp_loja\n" +
                                        "\n" +
                                        "lucro_liq = v_total_bic_vendida - (salario_final * n_emp_loja)\n" +
                                        "\n" +
                                        "escreva(\"\\nO salário final de cada funcionário é R$: \",salario_final)\n" +
                                        "escreva(\"\\nO Lucro liquido da loja é: \",lucro_liq)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 2:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "  real public, renda, pop, ge, arq, cad\n\n" +
                                        " escreva(\"Informe o público do jogo: \")\n" +
                                        "\tleia(public)\n" +
                                        "\tpop = public * 0.1\n" +
                                        "\tge = public * 0.5\n" +
                                        "\tarq = public * 0.3\n" +
                                        "\tcad = public * 0.1\n" +
                                        "\n" +
                                        "renda = (pop * 5) + (ge * 10) + (arq * 20) + (cad * 30)\n" +
                                        "\n" +
                                        "escreva(\"O valor da renda total é R$ \", renda)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 3:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "   real comb_abast, dist_perc, dist_max\n" +
                                        "\n" +
                                        "escreva(\"Informe a quantidade de combustivel abastacido: \")\n" +
                                        "leia(comb_abast)\n" +
                                        "escreva(\"Informe a distância percorrida por litro de combustível: \")\n" +
                                        "leia(dist_perc)\n" +
                                        "dist_max = comb_abast * dist_perc\n" +
                                        "\n" +
                                        "escreva(\"A distância máxima percorrida é \",dist_max,\" KM\")\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 4:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "inteiro quant_livros,valor\n\n" +
                                        " escreva(\"Digite o n° de livros comprados: \")\n" +
                                        " leia(quant_livros)\n" +
                                        "  se (quant_livros < 10){\n" +
                                        "   valor = quant_livros*12\n" +
                                        "  }senao{\n" +
                                        "   valor = quant_livros*8\t\n" +
                                        "  }\n" +
                                        "escreva(\"O valor total a pagar é: \",valor)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 5:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t\treal A ,B ,C\n" +
                                        "\n" +
                                        "\tescreva(\"Informe o 1º valor: \")\n" +
                                        "\t leia(A)\n" +
                                        "\tescreva(\"Informe o 2º valor: \")\n" +
                                        "\t leia(B)\n" +
                                        "\tescreva(\"\\nOs valores antes das trocas são A: \",A,\" e B: \",B)\n" +
                                        "\n" +
                                        "\t\tC = A\n" +
                                        "\t\tA = B\n" +
                                        "\t\tB = C\n" +
                                        "\n" +
                                        "\t\tescreva(\"\\nOs valores depois das trocas são A: \",A,\" e B: \",B)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 6:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t operacao\n" +
                                        "\t real x, y\n" +
                                        "\n" +
                                        "\tescreva(\"Informe o 1° valor: \")\n" +
                                        "\t leia(x)\n" +
                                        "\tescreva(\"Informe o 1° valor: \")\n" +
                                        "\t leia(y)\n" +
                                        "  escreva(\"\\nEscolha uma operação: \")\n" +
                                        "\tescreva(\"\\n1 - Adição\")\n" +
                                        "\tescreva(\"\\n2 - Subtração\")\n" +
                                        "\tescreva(\"\\n3 - Divisão\")\n" +
                                        "\tescreva(\"\\n4 - Multiplicação\\n\")\n" +
                                        "\t leia(operacao)\n" +
                                        "\t limpa()\n" +
                                        "\t  escolha(operacao){\n" +
                                        "\t   caso 1:\n" +
                                        "\t   x += y\n" +
                                        "\t   escreva(\"A soma é \",x)\n" +
                                        "\t   pare\n\n" +
                                        "\t   caso 2:\n" +
                                        "\t   x -= y\n" +
                                        "\t   escreva(\"A subtração é \",x)\n" +
                                        "\t   pare\n\n" +
                                        "\t   caso 3:\n" +
                                        "\t   x /= y\n" +
                                        "\t   escreva(\"A divisão é \",x)\n" +
                                        "\t   pare\n\n" +
                                        "\t   caso 4:\n" +
                                        "\t   x *= y\n" +
                                        "\t   escreva(\"A multiplicação é \",x)\n" +
                                        "\t\tpare\n\n" +
                                        "\t\tcaso contrario:\n" +
                                        "\tescreva(\"Operação inválida!\")\n" +
                                        "\t }\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 7:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t\tinteiro lanche, bebida\n" +
                                        "\n" +
                                        "escreva(\" Selecione o lanche\\n\")\n" +
                                        "escreva(\" 1 - Bauru  2 - X Galinha   3 - Pizza  \\n\")\n" +
                                        "leia(lanche)\n" +
                                        "\n" +
                                        "escreva(\"\\n\")\n" +
                                        "escreva(\" Selecione a bebida \\n\")\n" +
                                        "escreva(\" 1 - Guaraná  2 - Água   3 - Vinho  \\n\")\n" +
                                        "leia(bebida)\n" +
                                        "\n" +
                                        "escreva(\"\\n\")\n" +
                                        "se((lanche == 1 e bebida == 1) ou (lanche == 2 e bebida == 2) ou\n" +
                                        " (lanche == 3 e bebida == 1)){\n" +
                                        "escreva(\"\\nNão é possível a combinação!\")\n" +
                                        "}senao{\n" +
                                        "escreva(\"Pedido anotado, aguarde seu lanche e bebida!\")}\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 8:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t\tcadeia nome \n" +
                                        "\t\tcaracter sexo \n" +
                                        "\t\tinteiro idade\n" +
                                        "\t\treal salario\n" +
                                        "\n" +
                                        "escreva(\"Informe o nome do funcionário: \\n\")\n" +
                                        "leia(nome)\n" +
                                        "\t\t\n" +
                                        "escreva(\"Informe a idade do funcionário: \\n\")\n" +
                                        "leia(idade)\n" +
                                        "\t\t\n" +
                                        "escreva(\"Informe o sexo do funcionário: (M - Masculino ou F - Feminino) \\n\")\n" +
                                        "leia(sexo)\n" +
                                        "\t\t\n" +
                                        "escreva(\"Informe o salário fixo R$: \\n\")\n" +
                                        "leia(salario)\n" +
                                        "\n" +
                                        "se(sexo == 'M' e idade >=30){ \n" +
                                        "salario += 100\n" +
                                        "escreva(\"O salário do(a) funcionário \",nome,\" é de R$ \",salario)}\n" +
                                        "  \n" +
                                        " se (sexo == 'M' e idade < 30){ \n" +
                                        "  salario += 50\n" +
                                        "  escreva(\"O salário do(a) funcionário \",nome,\" é de R$ \",salario) \n" +
                                        "}\n" +
                                        " se (sexo == 'F' e idade >= 30){ \n" +
                                        "  salario += 200\n" +
                                        "  escreva(\"O salário do(a) funcionário \",nome,\" é de R$ \",salario)\n" +
                                        "}\n"+
                                        " se (sexo == 'F' e idade < 30){ \n" +
                                        "  salario += 80\n" +
                                        "  escreva(\"O salário do(a) funcionário \",nome,\" é de R$ \",salario)}\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 9:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t inteiro dist\n\n" +
                                        "escreva(\"Informe a distância percorrida pelo nadador: \\n\")\n" +
                                        "leia(dist)\n" +
                                        " se(dist < 800){\n" +
                                        "  escreva(\"O prêmio é de R$ 5.000,00\")\n" +
                                        "}senao se (dist >= 800 e dist <= 1500){\n" +
                                        "  escreva(\"O prêmio é de R$ 10.000,00\")\n" +
                                        "} senao{\n" +
                                        "\tescreva(\"O prêmio é de 15.000,00\")\n" +
                                        "\t }" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 10:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t\treal prec\n" +
                                        "\t\tinteiro cod\n" +
                                        "\n" +
                                        "escreva(\"Informe o preço: \\n\")\n" +
                                        "leia(prec)\n" +
                                        "\n" +
                                        "escreva(\"Informe o código da região:\\n\")\n" +
                                        "escreva(\"1 - Região Norte\\n\")\n" +
                                        "escreva(\"2 - Região Sul\\n\")\n" +
                                        "escreva(\"3 - Região Sudeste\\n\")\n" +
                                        "escreva(\"4 - Região Nordeste\\n\")\n" +
                                        "escreva(\"5 - Região Centro-Oeste\\n\")\n" +
                                        "leia(cod)\n" +
                                        "\n" +
                                        "escolha(cod){\n" +
                                        "caso 1:\n" +
                                        "prec -= (prec * 0.05) \n" +
                                        "escreva(\"O preço com desconto é R$ \",prec)\n" +
                                        "pare\n" +
                                        "\n" +
                                        "caso 2:\n" +
                                        "prec -= (prec * 0.15) \n" +
                                        "escreva(\"O preço com desconto é R$ \",prec)\n" +
                                        "pare\n" +
                                        "\n" +
                                        "caso 3:\t\n" +
                                        "prec -= (prec * 0.07) \n" +
                                        "escreva(\"O preço com desconto é R$ \",prec)\n" +
                                        "pare\n" +
                                        "\n" +
                                        "caso 4:\n" +
                                        "prec -= (prec * 0.12) \n" +
                                        "escreva(\"O preço com desconto é R$ \",prec)\n" +
                                        "pare\n" +
                                        "\n" +
                                        "caso 5:\n" +
                                        "prec -= (prec * 0.20) \n" +
                                        "escreva(\"O preço com desconto é R$ \",prec)\n" +
                                        "pare\n" +
                                        "\n" +
                                        "\t\t\t\n" +
                                        "caso contrario:\n" +
                                        "\t\n" +
                                        "escreva(\"O produto é importado\\n\")}\n" +
                                        "\t}\n" +
                                        "}\n\n\n");
                        startActivity(i);
                    }
                }

            }
        });

        resp3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Respostas_linguagens.this, Respostas_textos.class);

                String respostas = getIntent().getStringExtra("respostas");

                if(respostas != null){
                    if (respostas.equals("Csharp") ||
                            respostas.equals("Css") ||
                            respostas.equals("Fluxo") ||
                            respostas.equals("Html") ||
                            respostas.equals("Java") ||
                            respostas.equals("Php") ||
                            respostas.equals("Phyton") ||
                            respostas.equals("Portugol")) {

                        i.putExtra("resposta_num_atvd", "Resposta Lista 3");

                    }if(respostas.equals("Phyton")) {

                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                "n1 = float(input('Digite o comprimento da primeira reta: '))\n" +
                                        "n2 = float(input('Digite o comprimento da segunda reta: '))\n" +
                                        "n3 = float(input('Digite o comprimento da terceira reta: '))\n\n" +
                                        "if ((n1+n2) > n3) and ((n1+n3) > n2) and ((n2+n3) > n1):\n" +
                                        " print('Ela pode formar um triângulo!!')\n\n" +
                                        "else:\n" +
                                        " print('Ela NÃO pode formar um triângulo!!')\n\n\n\n" +
                                "Questão 2:\n" +
                                "num1 = int(input(\"Digite o primeiro número: \"))\n" +
                                        "num2 = int(input(\"Digite o segundo número: \"))\n\n" +
                                        "soma = num1 + num2\n" +
                                        "subtracao = num1 - num2\n" +
                                        "multiplicacao = num1 * num2\n" +
                                        "divisao = num1 / num2\n" +
                                        "modulo = num1 % num2\n\n" +
                                        "print(\"A soma é:\", soma)\n\n" +
                                        "print(\"A subtração é:\", subtracao)\n\n" +
                                        "print(\"A multiplicação é:\", multiplicacao)\n\n" +
                                        "print(\"A divisão é:\", divisao)\n\n" +
                                        "print(\"O módulo é:\", modulo)\n\n\n\n" +
                                "Questão 3:\n"+
                                "n = int(input(\"Digite um número inteiro positivo: \"))\n\n" +
                                        "soma = 0\n\n" +
                                        "for i in range(1, n+1):\n" +
                                        " soma += i\n\n" +
                                        "print(\"A soma de todos os números inteiros positivos menores ou iguais a\", n, \"é\", " +
                                        "soma)\n\n\n\n" +
                                "Questão 4:\n"+
                                "n = int(input(\"Digite um número inteiro positivo: \"))\n\n" +
                                        "for i in range(1, n+1, 2):\n" +
                                        " print(i)\n\n\n\n"+
                                "Questão 5:\n"+
                                "palavra = input(\"Digite uma palavra: \")\n\n" +
                                        "for letra in palavra:\n" +
                                        " print(letra)\n\n\n\n"+
                                "Questão 6:\n"+
                                "n = int(input(\"Digite um número inteiro positivo: \"))\n\n" +
                                        "primo = True\n\n" +
                                        "if n < 2:\n" +
                                        " primo = False\n\n" +
                                        "for i in range(2, n):\n" +
                                        " if n % i == 0:\n\n" +
                                        " primo = False\n\n" +
                                        " break\n\n" +
                                        "if primo:\n" +
                                        " print(\"O número é primo\")\n\n" +
                                        "else:\n" +
                                        " print(\"O número não é primo\")\n\n\n\n"+
                                "Questão 7:\n" +
                                "soma = 0\n" +
                                        "contador = 0\n\n" +
                                        "numero = int(input(\"Digite um número inteiro positivo (-1 para terminar): \"))\n\n" +
                                        "while numero != -1:\n" +
                                        " soma += numero\n" +
                                        " contador += 1\n\n" +
                                        " numero = int(input(\"Digite um número inteiro positivo (-1 para terminar): \"))\n\n" +
                                        "if contador > 0:\n" +
                                        " media = soma / contador\n\n" +
                                        " print(\"A média aritmética é:\", media)\n\n" +
                                        "else:\n" +
                                        " print(\"Não foi digitado nenhum número.\")\n\n\n\n" +
                                "Questão 8:\n"+
                                "n = int(input(\"Digite um número inteiro positivo: \"))\n\n" +
                                        "numeros = []\n" +
                                        "contador = 0\n\n" +
                                        "while contador < n:\n\n" +
                                        " numero = int(input(\"Digite um número inteiro: \"))\n\n" +
                                        " numeros.append(numero)\n" +
                                        " contador += 1\n" +
                                        "pares = []\n\n" +
                                        "for numero in numeros:\n\n" +
                                        " if numero % 2 == 0:\n" +
                                        " pares.append(numero)\n\n" +
                                        "print(\"Os números pares digitados foram:\", pares)\n\n\n\n"+
                                "Questão 9:\n"+
                                "num = 1\n\n" +
                                        "while num <= 10:\n\n" +
                                        " print(num)\n" +
                                        " num += 1\n\n\n\n"+
                                "Questão 10:\n" +
                                "n = int(input(\"Digite um número inteiro positivo: \"))\n\n" +
                                        "i = 0\n\n" +
                                        "while i <= n:\n\n" +
                                        " if i % 2 == 0:\n" +
                                        "   print(i)\n" +
                                        " i += 1\n\n\n\n");
                        startActivity(i);
                    }
                    //Html
                    if(respostas.equals("Html")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                " Para criar um menu suspenso em HTML, use a tag <select> com a tag <option> para definir as opções e a tag <label>\n" +
                                        "para rotular o menu.\n\n" +
                                        "<select>\n" +
                                        " <option value=\"opcao1\">Opção 1</option>\n" +
                                        " <option value=\"opcao2\">Opção 2</option>\n" +
                                        " <option value=\"opcao3\">Opção 3</option>\n" +
                                        "</select>\n\n\n"+
                                "Questão 2:\n"+
                                " Para inserir um vídeo em HTML, use a tag <video> e defina os atributos src para o URL do vídeo e controls para mostrar " +
                                        "controles de reprodução.\n\n" +
                                        "<video src=\"video.mp4\" width=\"640\" height=\"360\" controls></video>\n\n\n"+
                                "Questão 3:\n"+
                                "  Para definir uma cor de fundo para uma página HTML, use o atributo \"background-color\" na tag <body> ou em um " +
                                        "elemento CSS.\n\n" +
                                        "<body style=\"background-color: #f2f2f2;\">\n" +
                                        " <!-- conteúdo da página aqui -->\n" +
                                        "</body>\n\n\n"+
                                "Questão 4:\n"+
                                " Para criar um elemento de texto estilizado em HTML, use as tags <span> ou <p> e defina estilos CSS para elas.\n\n" +
                                        "<p style=\"font-size: 20px; font-weight: bold; color: red;\">Texto estilizado</p>\n\n\n"+
                                "Questão 5:\n"+
                                " Para criar um elemento de imagem estilizado em HTML, use a tag <img> e defina estilos CSS para ela.\n\n" +
                                        "<img src=\"imagem.jpg\" alt=\"Descrição da imagem\" style=\"border: 1px solid black; border-radius: 10px;\">\n\n\n"+
                                "Questão 6:\n"+
                                " Para criar um elemento de formulário estilizado em HTML, use as tags <form>, <input>, <select>, <textarea>, etc. e defina " +
                                        "estilos CSS para elas.\n\n" +
                                        "<form>\n" +
                                        " <label for=\"nome\">Nome:</label>\n" +
                                        " <input type=\"text\" id=\"nome\" name=\"nome\" style=\"padding: 5px; border-radius: 5px;\">\n" +
                                        " <br>\n" +
                                        " <label for=\"email\">Email:</label>\n" +
                                        " <input type=\"email\" id=\"email\" name=\"email\" style=\"padding: 5px; border-radius: 5px;\">\n" +
                                        " <br>\n" +
                                        "<button type=\"submit\"style=\"background-color: #4CAF50;\n" +
                                        "color: white;\n" +
                                        "padding: 8px 16px;\n border-radius: 5px;\">Enviar</button>\n" +
                                        "</form\n\n\n"+
                                "Questão 7:\n"+
                                "Para criar um mapa de imagem em HTML, use a tag <map> e as tags <area> para definir as áreas clicáveis.\n\n" +
                                        "<img src=\"imagem-com-mapa.jpg\"alt=\"Imagem com mapa\">\n" +
                                        "<map name=\"mapa\">\n" +
                                        " <area shape=\"rect\" coords=\"0,0,50,50\" href=\"pagina1.html\">\n" +
                                        " <area shape=\"rect\" coords=\"50,50,100,100\"href=\"pagina2.html\">\n" +
                                        "</map>\n\n\n"+
                                "Questão 8:\n"+
                                " Para definir a largura de uma tabela em HTML, use o atributo \"width\" na tag <table> ou em um elemento CSS.\n\n" +
                                        "<table style=\"width: 100%;\">\n" +
                                        " <tr>\n" +
                                        "  <td>Coluna 1</td>\n" +
                                        "  <td>Coluna 2</td>\n" +
                                        "  <td>Coluna 3</td>\n" +
                                        " </tr>\n" +
                                        " <tr>\n" +
                                        "  <td>Linha 2, Coluna 1</td>\n" +
                                        "  <td>Linha 2, Coluna 2</td>\n" +
                                        "  <td>Linha 2, Coluna 3</td>\n" +
                                        " </tr>\n" +
                                        "</table>\n\n\n"+
                                "Questão 9:\n"+
                                " Para definir uma imagem de fundo para uma página HTML, use o atributo \"background-image\" na tag <body> ou em um " +
                                        "elemento CSS.\n\n" +
                                        "<body style=\"background-image: \nurl('imagem-de-fundo.jpg'); background-repeat:no-repeat; background-size: cover;\">\n" +
                                        " <!-- conteúdo da página aqui -->\n" +
                                        "</body>\n\n\n"+
                                "Questão 10:\n"+
                                " Para criar uma seção de cabeçalho em HTML, use as tags <header> e <nav> para definir o cabeçalho e a navegação da " +
                                        "página.\n\n" +
                                        "<header>\n" +
                                        " <h1>Título do Site</h1>\n" +
                                        " <nav>\n" +
                                        "  <ul>\n" +
                                        "   <li><a href=\"#\">Link 1</a></li>\n" +
                                        "   <li><a href=\"#\">Link 2</a></li>\n" +
                                        "   <\n\n\n");
                        startActivity(i);
                    }
                    if(respostas.equals("Fluxo")){
                        Intent intent = new Intent(Respostas_linguagens.this, Fluxo_respostas3.class);
                        startActivity(intent);
                    }
                    if(respostas.equals("Portugol")){
                        i.putExtra("resposta_atvd",
                                "Questão 1:\n"+
                                        "programa{\n" +
                                        "\tfuncao inicio(){\n" +
                                        "\t\tinteiro cod, quant\n" +
                                        "\t\treal valor\n" +
                                        "escreva(\"ESCOLHA UM LANCHE\\n\")\n" +
                                        "escreva(\" Digite o código!\")\n" +
                                        "escreva(\"101 para cachorro quente, valor  1,20\")\n" +
                                        "escreva(\"102 para Bauru Simples, valor 1,30\")\n" +
                                        "escreva(\"103 para Bauru com Ovo valor   1,50\")\n" +
                                        "escreva(\"104 para Hambúrger  valor  1,20\")\n" +
                                        "escreva(\"105 para Cheeseburger valor 1,30\")\n" +
                                        "escreva(\"106 para Refrigerante, valor 1,00\")\n" +
                                        "leia(cod)\n\n" +
                                        "escreva(\"Informe a quantidade: \")\n" +
                                        "leia(quant)\n" +
                                        "          \n" +
                                        " escolha(cod){\n" +
                                        "  caso 101:\n" +
                                        "   valor = quant * 1.2\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n\n" +
                                        "  caso 102:\n" +
                                        "   valor = quant * 1.3\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n\n" +
                                        "  caso 103:\n" +
                                        "   valor = quant * 1.5\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n\n" +
                                        "  caso 104:\n" +
                                        "   valor = quant * 1.2\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n" +
                                        "\n" +
                                        "  caso 105:\n" +
                                        "   valor = quant * 1.3\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n" +
                                        "\n" +
                                        "  caso 106:\n" +
                                        "   valor = quant * 1.0\n" +
                                        "   escreva(\"O valor do pedido é R$ \",valor)\n" +
                                        "  pare\n" +
                                        "\t\t\n" +
                                        " caso contrario:\n" +
                                        "  escreva(\"Código não válido!\\n\")}\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 2:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\treal  x, soma = 0, cont\n" +
                                        "\n" +
                                        "para(cont = 0; cont < 5; cont ++){\n" +
                                        " escreva(\"Informe o número você deseja somar: \\n\")\n" +
                                        " leia(x)\n" +
                                        "  soma = soma + x\n" +
                                        "}\n" +
                                        "escreva(\"O somatório é: \",soma)\t\t\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 3:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro cont, x, res\n\n" +
                                        "escreva(\"Informe o número que deseja obter a tabuada da multiplicação: \\n\")\n" +
                                        "leia(x)\n" +
                                        "escreva(\"TABUADA DO \",x, \"\\n\")\n" +
                                        " para(cont = 1; cont <= 10; cont ++){\n" +
                                        "  res = cont * x\n" +
                                        "  escreva(cont,\" X \",x,\" = \",res,\"\\n\") }\t\t\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 4:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro cont, x, dobro, triplo\n\n" +
                                        "escreva(\"Informe um número: \\n\")\n" +
                                        "leia(x)\n" +
                                        "escreva(\"VALOR  \\t QUADRADO  \\t CUBO\\n\")\n" +
                                        " para(cont = x; cont >= 1; cont --){\n" +
                                        "  dobro = cont*cont\n" +
                                        "  triplo = cont*cont*cont\n" +
                                        "  escreva(cont,\"     \\t\",dobro,\"     \\t\",triplo,\"\\n\") }\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 5:\n"+
                                        "programa{ \n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro cont, idade,qtde, qtde2 = 0, qtde3 = 0, soma = 0\n" +
                                        "  real media, porc, altura,peso\n\n" +
                                        "para(cont = 0; cont < 10; cont++){\n" +
                                        " escreva (\"\\nDigite a idade: \")\n" +
                                        " leia (idade)\n" +
                                        " escreva (\"\\nDigite a altura: \")\n" +
                                        " leia (altura)\n" +
                                        " escreva (\"\\nDigite o peso: \")\n" +
                                        " leia (peso)\n" +
                                        "\n" +
                                        " se(idade>50){\n" +
                                        "  qtde++\n" +
                                        " }\n" +
                                        " se(idade > 10 e idade < 20){\n" +
                                        "  soma = soma+altura\n" +
                                        "  qtde2++\n" +
                                        " }\n" +
                                        " se(peso < 40){\n" +
                                        "  qtde3++\n" +
                                        " }\n" +
                                        "}\n\n" +
                                        " media = soma / qtde2\n" +
                                        " porc = (qtde3 / cont)*100\n" +
                                        "\n" +
                                        " escreva (\"\\n A quantidade de pessoas acima de 50 anos e: \", qtde)\n" +
                                        " escreva (\"\\n A média das alturas entre as idade de 10 e 20 anos é: \", media)\n" +
                                        " escreva (\"\\n A porcentagem com peso inferior a 40 KG é: \", porc)\n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 6:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "  inteiro par=0, impar=0, produtoPar=1 ,somaImpar=0, nro, x\n\n" +
                                        "para (x = 0;x < 20;x++){\n" +
                                        " escreva(\"\\nDigite um valor inteiro: \")\n" +
                                        " leia(nro)\n" +
                                        "  se(nro == 0){\n" +
                                        "   pare\n" +
                                        "  }\n" +
                                        "  enquanto(nro < 0){\n" +
                                        "\t escreva(\"\\nValor inválido, tente um número possitivo: \")\n" +
                                        "   leia(nro)\n" +
                                        "  }\n" +
                                        "  se(nro % 2 == 0){\n" +
                                        "   par += 1\n" +
                                        "   produtoPar *= nro\n" +
                                        "  }senao{\n" +
                                        "   impar += 1\n" +
                                        "   somaImpar += nro\n" +
                                        "  }\n" +
                                        "}\n" +
                                        "\n" +
                                        "escreva(\"Numero de impares: \", impar)\n" +
                                        "escreva(\"Numero de pares: \", par)\n" +
                                        "escreva(\"O produto dos pares: \", produtoPar)\n" +
                                        "escreva(\"A soma dos impares: \", somaImpar) \n" +
                                        "\t}\n" +
                                        "}\n\n\n"+
                                "Questão 7:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "  inteiro voto, votoJoao=0, votoMaria=0, votoPedro=0, votoMarcos=0, nulo=0\n" +
                                        "  inteiro branco=0, totalVotos=0\n" +
                                        "  caracter novoVoto = 'S'\n" +
                                        "  real perc_nulo, perc_branco\n" +
                                        "         \n" +
                                        " enquanto (novoVoto == 'S'){\n" +
                                        "  escreva(\"\\nInforme o voto eleitor: \")\n" +
                                        " escreva(\"\\n|1 - João | 2 - Maria | 3 - Pedro | 4 - Marcos | 5 - Nulo | 6 - Branco|\\n\")\n" +
                                        " leia(voto)\n\n" +
                                        " enquanto(voto!=1 e voto!=2 e voto!=3 e voto!=4 e voto!=5 e voto!=6){\n" +
                                        " escreva(\"\\nVoto Inválido! Tente novamente\")\n" +
                                        " escreva(\"\\nInforme o voto eleitor: \")\n" +
                                        " escreva(\"\\n|1 - João | 2 - Maria | 3 - Pedro | 4 - Marcos | 5 - Nulo | 6 - Branco|\\n\")\n" +
                                        " leia(voto)\n" +
                                        " }\n" +
                                        "  se (voto == 1){\n" +
                                        "    votoJoao += 1\n" +
                                        "  }se (voto == 2){\n" +
                                        "    votoMaria += 1\n" +
                                        "  }se (voto == 3){\n" +
                                        "    votoPedro += 1 \n" +
                                        "  }se (voto == 4){\n" +
                                        "    votoMarcos += 1\n" +
                                        "  }se (voto == 5){\n" +
                                        "     nulo += 1\n " +
                                        "  }se (voto == 6){\n" +
                                        "     branco += 1\n" +
                                        "  }\n" +
                                        "  totalVotos += 1\n" +
                                        "\n" +
                                        "escreva(\"\\nNovo voto? [S - Sim | N - Não]\\n\")\n" +
                                        " leia(novoVoto)\n" +
                                        "}\n" +
                                        " perc_nulo = (nulo * 100)/totalVotos\n" +
                                        " perc_branco = (branco * 100)/totalVotos \n" +
                                        " escreva(\"O total de votos para o candidato João foi \", votoJoao)\n" +
                                        " escreva(\"O total de votos para a candidata Maria foi \", votoMaria)\n" +
                                        " escreva(\"O total de votos para o candidato Pedro foi \", votoPedro)\n" +
                                        " escreva(\"O total de votos para o candidato Marcos foi \", votoMarcos)\n" +
                                        " escreva(\"O total de votos nulos foi \", nulo)\n" +
                                        " escreva(\"O total de votos brancos foi \", branco)\n" +
                                        " escreva(\"O percentual de votos nulos foi \", perc_nulo)\n" +
                                        " escreva(\"O percentual de votos brancos foi \", perc_branco)\n" +
                                        "\t}\n\n" +
                                        "  escreva(\"O total de votos foi: \",totalVotos)\n" +
                                        "}\n\n\n"+
                                "Questão 8:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro x,y\n" +
                                        "\n" +
                                        "para(x = 1 ; x <= 10; x++){\n" +
                                        " escreva(\"\\n\\nTABUADA DA MULTIPLICAÇÃO POR \",x,\"\\n\")\n" +
                                        " para(y = 1 ; y <= 10; y++){\n" +
                                        "\tescreva(\"\\n\",x,\" X \",y,\" = \",x*y)\n" +
                                        " }\n" +
                                        "}\n" +
                                        " para(x = 1 ; x <= 10; x++){\n" +
                                        "\tescreva(\"\\n\\nTABUADA DA DIVISÃO POR \",x,\"\\n\")\n" +
                                        " para(y = 1 ; y <= 10; y++){\n" +
                                        "\tescreva(\"\\n\",y*x,\" / \",x,\" = \",(y*x)/x)\n" +
                                        "   }\n" +
                                        "  }\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 9:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro x, y\n\n" +
                                        "para(x = 1; x <= 15; x++){\n" +
                                        " para(y = 1; y <= x; y++){\n" +
                                        "  escreva(\"*\")\n" +
                                        "}\n" +
                                        "\tescreva(\"\\n\")\n" +
                                        "\t}\n" +
                                        " }\n" +
                                        "}\n\n\n"+
                                "Questão 10:\n"+
                                        "programa{\n" +
                                        " funcao inicio(){\n" +
                                        "\tinteiro nro, maior , menor  , cont\n\n" +
                                        "para(cont = 1; cont <= 5; cont++){\n" +
                                        " escreva(\"\\nInforme o \",cont,\"º número: \")\n" +
                                        " leia(nro)\n" +
                                        "se (maior < nro){\n" +
                                        " maior = nro\n" +
                                        "}\n" +
                                        " se(menor > nro){\n" +
                                        "  menor = nro\n" +
                                        " }\n" +
                                        "}\n" +
                                        " escreva(\"O maior número é: \",maior)\n" +
                                        " escreva(\"nO menor número é: \",menor)\n" +
                                        "\t}\n" +
                                        "}\n\n\n");
                        startActivity(i);
                    }

                }

            }


        });

    }

}
