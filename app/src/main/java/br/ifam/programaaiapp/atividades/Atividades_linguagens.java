package br.ifam.programaaiapp.atividades;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import br.ifam.programaaiapp.CSharpActivity;
import br.ifam.programaaiapp.CssActivity;
import br.ifam.programaaiapp.FluxoActivity;
import br.ifam.programaaiapp.HtmlActivity;
import br.ifam.programaaiapp.JavaActivity;
import br.ifam.programaaiapp.PhpActivity;
import br.ifam.programaaiapp.PhytonActivity;
import br.ifam.programaaiapp.PortugolActivity;
import br.ifam.programaaiapp.R;

public class Atividades_linguagens extends AppCompatActivity {

    LinearLayout atvd1, atvd2, atvd3;
    ImageView buttonback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividades_linguagens);

        atvd1 = findViewById(R.id.atvd1);
        atvd2 = findViewById(R.id.atvd2);
        atvd3 = findViewById(R.id.atvd3);
        buttonback = findViewById(R.id.backbutton);

            buttonback.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    finish();
                }
            });

            atvd1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Atividades_linguagens.this, Atividades_textos.class);
                    String chamadaOrigem = getIntent().getStringExtra("chamadaOrigem");

                    if (chamadaOrigem != null) {
                        if (chamadaOrigem.equals("Csharp") ||
                                chamadaOrigem.equals("Css") ||
                                chamadaOrigem.equals("Fluxo") ||
                                chamadaOrigem.equals("Html") ||
                                chamadaOrigem.equals("Java") ||
                                chamadaOrigem.equals("Php") ||
                                chamadaOrigem.equals("Phyton") ||
                                chamadaOrigem.equals("Portugol")) {

                            i.putExtra("lista_num", "Lista 1");

                        }
                        //setar atividades lista 1 para phyton
                        if(chamadaOrigem.equals("Phyton")){
                            i.putExtra("lista_atvd", "1. Faça um programa que leia 2 números inteiro e mostre a soma entre eles.\n\n" +
                                     "2. Faça um programa que leia um número inteiro e mostre na tela o seu sucessor e seu antecessor.\n\n" +
                                    "3. Crie um algoritmo que leia um número e mostre o seu dobro, triplo e a raiz quadrada.\n\n" +
                                    "4. Desenvolva um programa que leia as duas notas de um aluno, calcule e mostre sua média. \n\n"+
                                    "5. Escreva um programa que leia um valor em metros e o exiba convertido em centímetros e milímetros. \n\n" +
                                    "6. Crie um programa que leia quanto dinheiro uma pessoa tem na carteira e mostre quantos dólares ela pode comprar.\n" +
                                    "Considere a cotação de US $1,00 = R$ 5.18\n\n" +
                                    "7. Faça um programa que leia a largura e a altura de uma parede em metros, calcule a sua área e a quantidade de tinta necessária para pintá-lo, sabendo que " +
                                    "cada litro de tinta pinta uma área de 2 m². \n\n" +
                                    "8. Faça um algoritmo que leia o preço de um produto e mostre seu novo preço, com 9% de desconto. \n\n" +
                                    "9. Faça um algoritmo que leia o salário de um funcionário e mostre seu novo salário, com 15% de aumento. \n\n" +
                                    "10. Escreva um programa que converta uma temperatura digitada em °C e converta para °F.\n\n\n");
                        }
                        if(chamadaOrigem.equals("Html")){
                            i.putExtra("lista_atvd",
                                    "1. Como definir o título de uma página HTML?\n\n" +
                                            "2. Como criar um link para outra página HTML?\n\n" +
                                            "3. Como inserir uma imagem em uma página HTML?\n\n" +
                                            "4. Como criar uma lista com marcadores em uma página HTML?\n\n" +
                                            "5. Como criar uma tabela em uma página HTML?\n\n" +
                                            "6. Como definir o estilo de um elemento em uma página HTML?\n\n" +
                                            "7. Como criar um formulário em uma página HTML?\n\n" +
                                            "8. Como criar uma seção de comentários em uma página HTML?\n\n" +
                                            "9. Como criar um menu de navegação em uma página HTML?\n\n" +
                                            "10. Como criar um rodapé em uma página HTML?\n\n\n");
                        }
                        if(chamadaOrigem.equals("Portugol")){
                            i.putExtra("lista_atvd",
                                    "1. Criar algoritmo que leia dois números e mostre a soma .\n\n\n"+
                                    "2. Construa um algoritmo que leia 4 notas e mostre a média. \n\n\n"+
                                    "3. Desenvolva um algoritmo que receba dois valores numéricos inteiros, calcule e mostre a soma do quadrado desses dois valores.\n\n\n"+
                                    "4. Escreva um algoritmo que leia uma medida em metros e converta para centímetros.\n\n\n"+
                                    "5. Faça um algoritmo que leia o valor que um funcionário ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.\n\n\n"+
                                    "6. Faça um algoritmo para transformar uma distância expressa em milhas para quilômetros. Sabe-se que um km corresponde a 0,6214 milhas. \n\n\n"+
                                    "7. Desenvolva um algoritmo que receba o salário de um funcionário, calcule e mostre seu novo  salário com reajuste de 15%.\n\n\n"+
                                    "8. Desenvolva um algoritmo que receba um valor numérico inteiro, calcule e mostre qual o quociente e o resto da divisão desse número por 3.\n\n\n"+
                                    "9. Desenvolva um algoritmo que receba uma quantidade de um alimento em quilos, calcule e mostre quantos dias durará esse alimento para uma pessoa que consome 50 gramas desse alimento por dia.\n\n\n"+
                                    "10. Um motorista de taxi deseja calcular o rendimento de seu carro na praça. Sabendo-se que o preço do combustível é de R$ 2,50, escreva um algoritmo para ler: a marcação do odômetro (Km) no início do dia, a marcação (Km) no final do dia, o número de litros de combustível gasto e o valor total (R$) recebido dos passageiros. Calcular e escrever: a média do consumo em Km/L e o lucro (líquido) do dia.\n\n\n");
                        }
                        if(chamadaOrigem.equals("Csharp")){
                            i.putExtra("lista_atvd",
                                    "1. Calcular a média de 4 notas de um aluno. Mostrar de forma simples como " +
                                            "declarar variáveis e manipular dados de entrada e saída.\n\n\n"+
                                    "2. Calcular a área de um quadrado. Demonstra a simples utilização de entrada e " +
                                            "saída de dados\n\n\n"+
                                    "3. Verifique a estrutura do Código e encontre o erro.\n\n" +
                                            "int valor = 15;\n" +
                                            "string mensagem = \"\";\n" +
                                            "if (valor > 10)\n" +
                                            "{\n" +
                                            "  mensagem = \"Maior que dez\";\n" +
                                            "}\n" +
                                            "else\n" +
                                            "{\n" +
                                            "  mensagem = \"Menor que dez;\n" +
                                            "}\n" +
                                            "Console.WriteLine(mensagem);\n" +
                                            "Console.ReadLine();\n\n\n\n"+
                                    "4. Realizar o cálculo da área de um triângulo.\n\n\n"+
                                    "5. Calcular o volume de uma esfera\n\n\n"+
                                    "6.  Ler dois números reais e efetuar as quatro operações entre eles. Demonstra de forma " +
                                            "simples como efetuar cálculos, declarar variáveis e utilizar a console para manipular " +
                                            "dados\n\n\n"+
                                    "7. Calcular o quadrado da diferença entre dois números quaisquer. Demonstra de " +
                                            "forma simples o uso de consoles, entrada e saída de dados e o método pow:\n\n\n"+
                                    "8. Qual é a mensagem e o valor da variável saldo após a execução " +
                                            "do seguinte código?\n\n"+
                                            "double saldo = 5.0;\n" +
                                            "double valorSaque = 10.0;\n" +
                                            "if (saldo >= valorSaque) {\n" +
                                            "  saldo -= valorSaque;\n" +
                                            "  Console.WriteLine(\"Saque realizado com sucesso\");\n " +
                                            "}\n"+
                                            " else{\n" +
                                            "  Console.WriteLine(\"Saldo Insuficiente\");\n" +
                                            "}\n\n" +
                                            "● mensagem: Saquerealizado com sucesso; saldo: -5.0\n" +
                                            "● mensagem: Saldo Insuficiente; saldo -5.0 mensagem: Saldo\n" +
                                            "Insuficiente; saldo 5.0\n" +
                                            "●\n" +
                                            "● mensagem: Saquerealizado com sucesso; saldo: 5.0\n" +
                                            "● mensagem: Saldo Insuficiente; saldo 5.0.\n\n\n"+
                                    "9. Qual é a mensagem e o valor da variável saldo " +
                                            "após a execução do seguinte código?\n\n"+
                                            "double saldo = 100.0;\n" +
                                            "double valorSaque = 10.0;\n" +
                                            "if (saldo >= valorSaque){\n" +
                                            "  saldo -= valorSaque;\n" +
                                            "  Console.WriteLine(\"Saque realizado com sucesso\");\n" +
                                            "}\n" +
                                            " else{\n" +
                                            "  Console.WriteLine(\"Saldo Insuficiente\");\n" +
                                            "}\n\n" +
                                            "mensagem: Saquerealizado com sucesso; saldo: 90.0\n" +
                                            "mensagem: Saldo Insuficiente; saldo 90.0\n" +
                                            "mensagem: Saquerealizado com sucesso; saldo: 100.0\n" +
                                            "mensagem: Saldo Insuficiente; saldo 100.0\n" +
                                            "mensagem: Saquerealizado com sucesso; saldo: 10.0\n\n\n");
                        }
                        if(chamadaOrigem.equals("Fluxo")){
                            i.putExtra("lista_atvd",
                                    "1. Como funciona um fluxograma de programação?\n\n\n" +
                                            "2. Como criar um fluxograma para um determinado problema de programação?\n\n\n" +
                                            "3. Qual a finalidade de um fluxograma na programação.\n\n\n" +
                                            "4. Quais são os símbolos mais utilizados em um fluxograma de linguagem de programação?\n\n\n" +
                                            "5. Qual a importância de um fluxograma na programação?\n\n\n" +
                                            "6. Qual é a importância de desenhar fluxogramas antes da programação?\n\n\n" +
                                            "7. Como pode ser representada a estrutura condicional em um fluxograma?\n\n\n" +
                                            "8. Como pode ser representada a estrutura de repetição em um fluxograma?\n\n\n" +
                                            "9. Como pode ser representada a operação de atribuição em um fluxograma?\n\n\n" +
                                            "10. Como pode ser representada uma estrutura de repetição com contagem em um fluxograma?\n\n\n");
                        }
                        if(chamadaOrigem.equals("Css")){
                            i.putExtra("lista_atvd",
                                    "1. Faça com que o conteúdo principal (main) ocupe 70% da largura da tela e fique alinhado ao centro.\n\n\n"+
                                    "2. Adicione uma imagem ao cabeçalho e defina a largura da imagem como 100% para que ela se ajuste ao tamanho da tela.\n\n\n"+
                                    "3. Defina a cor de fundo do cabeçalho como preto e a cor do texto como branco.\n\n\n"+
                                    "4. Adicione uma borda de 1px sólida em torno do conteúdo principal (main) e defina a cor da borda como cinza.\n\n\n"+
                                    "5. Defina a fonte do texto do conteúdo principal como Arial e o tamanho da fonte como 16px.\n\n\n"+
                                    "6. Adicione uma lista ordenada ao conteúdo principal com pelo menos 5 itens e defina o estilo da lista como \"none\". Em seguida, defina uma borda de 1px sólida em torno de cada item da lista e defina a cor da borda como cinza.\n\n\n"+
                                    "7. Ao passar o mouse sobre cada item da lista, defina a cor de fundo como cinza claro e a cor do texto como branco.\n\n\n"+
                                    "8. Adicione um formulário simples ao rodapé (footer) com um campo de entrada de texto e um botão de envio. Defina a largura do campo de entrada de texto como 70% e o tamanho da fonte como 14px.\n\n\n"+
                                    "9. Faça com que o botão de envio fique alinhado ao centro e defina a cor de fundo como verde e a cor do texto como branco. Ao passar o mouse sobre o botão de envio, defina a cor de fundo como azul claro.\n\n\n"+
                                    "10.  Como fazer um elemento ficar com um fundo verde e uma borda de 2px azul?\n\n\n");
                        }
                        if(chamadaOrigem.equals("Java")){
                            i.putExtra("lista_atvd",
                                    "1. Escrever um programa java que receba dois números e exiba o resultado da sua soma.\n\n\n"+
                                    "2. Escrever um programa que receba dois números e ao final mostre a soma, subtração, multiplicação e a divisão dos números lidos.\n\n\n"+
                                    "3. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto. \n\n\n"+
                                    "4. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês. \n\n\n"+
                                    "5. Escrever um programa que leia o nome de um aluno e  as notas das três provas que ele obteve no semestre. No final informa r o nome do aluno e a  sua média (aritmética). \n\n\n"+
                                    "6. Ler uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit. A fórmula de conversão é: F=(9*C+160) / 5, sendo F a  temperatura em Fahrenheit e C a temperatura em Celsius. \n\n\n"+
                                    "7. Elaborar um programa que efetue a apresentação do valor da conversão em eeal (R$) de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação do dólar e também a quantidade de dólares disponíveis com o usuário. \n\n\n"+
                                    "8. Faça um programa que receba um valor que foi depositado e exiba o valor com rendimento após um mês. Considere fixo o juro da poupança em 0.70% a. m. \n\n\n"+
                                    "9. A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros. Faça um programa que receba u m valor de uma compra e mostre o valor das prestações.  \n\n\n"+
                                    "10. Faça um programa que receba o preço de custo de um  produto e mostre o  valor de venda. Sabe-se que o preço de custo recebe rá um acréscimo de  acordo com um percentual informado pelo usuário.   \n\n\n");
                        }
                        if(chamadaOrigem.equals("Php")){
                            i.putExtra("lista_atvd",
                                    "1. Qual das alternativas a seguir é uma classe definida padrão do PHP?\n\n"+
                                        "a)Star\n" +
                                            "b)Disco\n" +
                                            "C)after\n" +
                                            "D)Final C\n" +
                                            "e) sdtClass\n\n\n"+
                                    "2. Em relação às regras para variáveis PHP, marque V para as afirmativas verdadeiras e F para as falsas.\n\n"+
                                            "( ) Os nomes das variáveis podem começar com números.\n" +
                                            "( ) Os nomes das variáveis podem conter espaço em branco.\n" +
                                            "( ) Os nomes das variáveis podem conter caracteres especiais, tais como + - % ( ) . &.\n" +
                                            "( ) Declarações de variáveis começam com $, seguido pelo nome da variável.\n" +
                                            "( ) Os nomes das variáveis diferenciam letras maiúsculas de minúsculas.\n\n\n"+
                                    "3. Quanto as principais características técnicas da linguagem PHP, analise as " +
                                            "afirmativas abaixo e dê valores Verdadeiro (V) ou Falso (F).\n\n"+
                                    "( ) A desvantagem do PHP é suportar somente alguns SGBDs.\n" +
                                            "( ) É possível programar pelo paradigma orientado a objetos.\n" +
                                            "( ) Pode-se incorporá-lo diretamente em um código HTML.\n\n\n"+
                                    "4. Quais são os operadores lógicos do PHP e quais suas funções?\n\n\n"+
                                    "5. Solicite a entrada de um número e descubra se um número digitado é par ou ímpar.\n\n\n"+
                                    "6. Escreva um algoritmo em PHP que diga bom dia.\n\n\n"+
                                    "7. Crie um algoritimo que escreva de 1 a 10\n\n\n"+
                                    "8. Escreva um algoritmo que informe se um numero e múltiplo de 5\n\n\n"+
                                    "9. Crie um algoritmo que receba um número digitado pelo usuário e verifique se " +
                                            "esse valor é positivo, negativo ou igual a zero. A saída deve ser: \"Valor Positivo\", " +
                                            "\"Valor Negativo\" ou \"Igual a Zero\".\n\n\n"+
                                    "10. Faça um algoritmo em PHP onde verifica se o valor da variável A é maior ou " +
                                            "menor que o valor da variável B. A mensagem a ser impressa deve ser “A maior que " +
                                            "B” ou “A menor que B”\n\n\n");
                        }
                    }
                    startActivity(i);

                }
            });
            atvd2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Atividades_linguagens.this, Atividades_textos.class);

                    String chamadaOrigem = getIntent().getStringExtra("chamadaOrigem");

                    if (chamadaOrigem != null) {
                        if (chamadaOrigem.equals("Csharp") ||
                                chamadaOrigem.equals("Css") ||
                                chamadaOrigem.equals("Fluxo") ||
                                chamadaOrigem.equals("Html") ||
                                chamadaOrigem.equals("Java") ||
                                chamadaOrigem.equals("Php") ||
                                chamadaOrigem.equals("Phyton") ||
                                chamadaOrigem.equals("Portugol")) {

                            i.putExtra("lista_num", "Lista 2");
                        }
                        //setar atividades lista 2 para phyton
                        if(chamadaOrigem.equals("Phyton")){
                            i.putExtra("lista_atvd", "1. Escreva um programa que pergunte a quantidade de Km percorridos por um carro alugado e a quantidade de dias pelos quais ele foi alugado. Calcule o preço a " +
                                "pagar, sabendo que o carro custa R$75,00 por dia e R$0,20 por Km rodado.\n\n" +
                                "2. Faça um programa que leia o comprimento do cateto oposto e do cateto adjacente de um triângulo retângulo, calcule e mostre o comprimento da " +
                                "hipotenusa. \n\n" +
                                "3.Faça um programa que leia um ângulo qualquer e mostre na tela o valor do seno, cosseno e tangente desse ângulo. \n\n" +
                                "4. Escreva um programa que faça o computador \"pensar\" em um número inteiro entre 0 e 5 e peça para o usuário tentar descobrir qual foi o número escolhido pelo " +
                                "computador. O programa deverá apresentar na tela se o usuário venceu ou perdeu. \n\n" +
                                "5. Escreva um programa que leia a velocidade de um carro. Se ele ultrapassar 80km/h, mostre uma mensagem dizendo que ele foi multado. A multa vai custar R$ " +
                                "9,00 por cada km/h acima do limite. \n\n" +
                                "6. Crie um programa que leia um número inteiro e mostre na tela se ele é par ou ímpar.\n\n"+
                                "7. Desenvolva um programa que pergunte a distância de uma viagem em km.\n" +
                                    "Calcule o preço da passagem, cobrando R$0.65 por km para viagens de até 200km e R$0.55 para viagens mais longas.\n\n" +
                                "8. Faça um programa que leia um ano qualquer e mostre se ele é bissexto. \n\n" +
                                "9. Faça um programa que leia 3 números e mostre qual é o maior e qual é o menor. \n\n" +
                                "10. Escreva um programa que pergunte o salário de um funcionário e calcule o valor do seu aumento.\n" +
                                    "\n-Para salários superiores a R$ 1.250,00, calcule um aumento de 10%.\n" +
                                    "-Para os inferiores ou iguais, o aumento é de 15%.\n\n");
                        }
                        if(chamadaOrigem.equals("Html")) {
                            i.putExtra("lista_atvd",
                                    "1. Como definir o idioma padrão de uma página HTML?\n\n" +
                                            "2. Como definir o conjunto de caracteres usado em uma página HTML?\n\n" +
                                            "3. Como criar uma página HTML responsiva?\n\n" +
                                            "4. Como criar um botão em uma página HTML?\n\n" +
                                            "5. Como criar uma caixa de seleção em uma página HTML?\n\n" +
                                            "6. Como definir a largura e altura de um elemento em uma página HTML?\n\n" +
                                            "7. Como criar uma lista numerada em uma página HTML?\n\n" +
                                            "8. Como criar uma lista de definições em uma página HTML?\n\n" +
                                            "9. Como criar um hyperlink em uma página HTML?\n\n" +
                                            "10. Como criar um cabeçalho fixo em uma página HTML?\n\n\n");
                        }if(chamadaOrigem.equals("Portugol")){
                            i.putExtra("lista_atvd",
                                    "1. Uma loja vende bicicletas com um acréscimo de 50% sobre o seu preço de custo. Ela paga a cada vendedor dois salários-mínimos mensais, mais uma comissão de 15 % sobre o preço de custo de cada bicicleta vendida, dividida igualmente entre eles. Escreva um algoritmo que leia o número de empregados da loja, o valor do salário-mínimo, o preço de custo de cada bicicleta, o número de bicicletas vendidas, calcule e escreva: O salário final de cada empregado e o lucro (líquido) da loja. \n\n\n"+
                                    "2. Elaborar um algoritmo que lê o público total de um jogo de futebol e fornece a renda do jogo, sabendo-se que havia 4 tipos de ingressos assim distribuídos: popular 10% do público a R$ 5,00, geral 50% do público a R$ 10,00, arquibancada 30% do público a R$ 20,00 e cadeiras 10% do público a R$ 30,00.\n\n\n"+
                                    "3. Escreva um algoritmo que leia a quantidade de combustível abastecido em um automóvel em litros, bem como, a distância que o automóvel percorre por litro abastecido. O algoritmo deverá calcular e mostrar a distância máxima que o automóvel poderá atingir.\n\n\n" +
                                    "4. Criar um algoritmo onde o cliente insira o n° de livros que comprou e mostre o valor total a pagar. Se comprar menos de 10 livros, o valor unitário do livro será R$ 12,00. Mas, se comprar 10 ou mais o valor unitario por livro será R$ 8,00.\n\n\n"+
                                    "5. Escreva um algoritmo que leia um valor para a variável A e um valor para a variável B. Logo após, o algoritmo deverá fazer com que a variável A guarde o valor da variável B e a variável B guarde o valor da variável A. Apresentar os valores das variáveis A e B antes e depois da troca.\n\n\n"+
                                    "6. CALCULADORA: escreva um algoritmo para ler 2 valores e uma das seguintes operações a serem executadas (codificada da seguinte forma: (1.Adição, 2.Subtração, 3.Divisão, 4.Multiplicação). Calcular e escrever o resultado dessa operação sobre os dois valores lidos.\n\n\n"+
                                    "7. Uma lancheria está com alguns problemas para atender aos pedidos dos clientes. Não vai ser possível atender pedidos que tenham algumas combinações do cardápio, são elas: \n\n" +
                                            "a) O lanche bauru não poderá ser acompanhado da bebida guaraná. \n" +
                                            "b) Se o cliente pedir X galinha, não poderá pedir água. \n" +
                                            "c) Quando o cliente pedir Pizza, somente poderá beber vinho ou água. Dessa forma, elabore um algoritmo que leia o lanche e a bebida e verifique se o pedido poderá ser ou não atendido.\n\n\n"+
                                    "8. Escreva um algoritmo que receba o nome, idade, sexo e salário fixo de um funcionário. Calcule e mostre o nome e salário líquido do funcionário de acordo com a tabela:\n\n" +
                                            "a) SEXO = M e IDADE >= 30,  ABONO = 100\n" +
                                            "b) SEXO = M e IDADE < 30,  ABONO = 50\n" +
                                            "c) SEXO = F e IDADE >= 30,  ABONO = 200\n" +
                                            "d) SEXO = M e IDADE < 30,  ABONO = 80\n\n\n" +
                                    "9. Em uma competição o nadador é premiado de acordo com a distância máxima que percorrer. Se o nadador percorrer uma distância menor que 800 metros, recebe R$ 5.000,00 reais de prêmio. Caso percorra uma distância entre 800 e 1500 metros, recebe R$ 10.000,00. E se percorrer uma distância superior a 1500 metros, recebe R$ 15.000,00 em prêmio. Escreva um algoritmo que leia a distância percorrida e mostre na tela o valor da premiação a ser recebida pelo nadador.\n\n\n"+
                                    "10. Elabore um algoritmo que tendo como entrada o preço e código de origem de um produto, Calcule e mostre na tela o valor do desconto concedido. Os códigos são os seguintes:\n\n" +
                                            "1 -região norte com desconto de 5%,\n" +
                                            "2 -região sul com desconto de 15%,\n" +
                                            "3 -região sudeste com desconto de 7%,\n" +
                                            "4 -região nordeste com desconto de 12% e\n" +
                                            "5- região centro-oeste com desconto de 20%.\n\n" +
                                            "Caso não seja informado nenhum código válido informar na tela que o produto é importado.\n\n\n");
                        }
                        if(chamadaOrigem.equals("Fluxo")){
                            i.putExtra("lista_atvd",
                                    "1. Como pode ser representada a entrada de dados em um fluxograma?\n\n\n" +
                                            "2. Como pode ser representada a saída de dados em um fluxograma?\n\n\n" +
                                            "3. A estrutura de sequência pode ser representada por uma seta que conecta os " +
                                            "símbolos que representam as operações a serem executadas em ordem.\n\n\n" +
                                            "4. Fluxograma para validar uma senha:\n\n\n" +
                                            "5. Como pode ser usado o conector no fluxograma.\n\n\n"+
                                            "6. Elabore um fluxograma para somar 4 números e exibir o resultado.\n\n\n" +
                                            "7. Elabore um fluxograma para calcular a Média entre duas notas.\n\n\n" +
                                            "8. Desenvolva um Fluxograma para encontrar o menor dentre 3 números inteiros.\n\n\n" +
                                            "9. Faça um fluxograma para calcular a Média entre 4 notas.\n\n\n" +
                                            "10. Leia dois valores inteiros e apresente a diferença do maior pelo menor.\n\n\n");

                        }
                    }
                    startActivity(i);
                }
            });

            atvd3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent i = new Intent(Atividades_linguagens.this, Atividades_textos.class);

                    String chamadaOrigem = getIntent().getStringExtra("chamadaOrigem");

                    if (chamadaOrigem != null) {
                        if (chamadaOrigem.equals("Csharp") ||
                                chamadaOrigem.equals("Css") ||
                                chamadaOrigem.equals("Fluxo") ||
                                chamadaOrigem.equals("Html") ||
                                chamadaOrigem.equals("Java") ||
                                chamadaOrigem.equals("Php") ||
                                chamadaOrigem.equals("Phyton") ||
                                chamadaOrigem.equals("Portugol")) {

                            i.putExtra("lista_num", "Lista 3");


                        }
                        if(chamadaOrigem.equals("Phyton")){
                            i.putExtra("lista_atvd", "1.Desenvolva um programa que leia o comprimento de três retas e diga ao usuário se elas podem ou não formar um triangulo.\n\n" +
                                "2. Escreva um programa Python que solicite ao usuário dois números inteiros e, em seguida, calcule e imprima a soma, subtração, multiplicação, divisão e módulo " +
                                    "(resto) dos dois números. \n\n" +
                                "3. Escreva um programa que peça ao usuário para digitar um número inteiro positivo e calcule a soma de todos os números inteiros positivos menores ou iguais a " +
                                    "esse número.\n" +
                                    "\nExemplo de entrada/saída:\n" +
                                    "-Digite um número inteiro positivo: 5\n" +
                                    "-A soma de todos os números inteiros positivos menores ou iguais a 5 é 15.\n\n" +
                                "4. Escreva um programa que solicite ao usuário que digite um número inteiro positivo e, em seguida, imprima na tela todos os números ímpares de 1 até esse número. \n\n"+
                                "5.Escreva um programa que solicite ao usuário que digite uma palavra e, em seguida, imprima na tela todas as letras dessa palavra, uma letra por linha.\n\n" +
                                "6. Escreva um programa que solicite ao usuário que digite um número inteiro positivo e, em seguida, verifique se o número é primo ou não. Se o número for " +
                                        "primo, imprima \"O número é primo\". Caso contrário, imprima \"O número não é " +
                                        "primo\".\n" +
                                        " Lembre-se de que um número é primo se for divisível apenas por 1 e por ele " +
                                        "mesmo.\n\n" +
                                "7. Escreva um programa que solicite ao usuário que digite uma sequência de números inteiros positivos, um por vez. A sequência deve terminar com o número - " +
                                        "1. O programa deve calcular a média aritmética dos números digitados, desconsiderando o número -1. Em seguida, o programa deve imprimir a média " +
                                        "aritmética na tela. \n\n" +
                                "8. Escreva um programa que solicite ao usuário que digite um número inteiro " +
                                        "positivo n. O programa deve então solicitar ao usuário que digite n números " +
                                        "inteiros e armazená-los em uma lista. Em seguida, o programa deve imprimir na " +
                                        "tela os números da lista que são pares. \n" +
                                        "\nExemplo de entrada/saída:\n" +
                                        "Digite um número inteiro positivo: 6\n" +
                                        "Digite um número inteiro: 3\n" +
                                        "Digite um número inteiro: 8\n" +
                                        "Digite um número inteiro: 1\n" +
                                        "Digite um número inteiro: 6\n" +
                                        "Digite um número inteiro: 2\n" +
                                        "Digite um número inteiro: 5\n" +
                                        "Os números pares digitados foram: [8, 6, 2] \n\n" +
                                "9. Escreva um programa que imprima na tela os números de 1 a 10. \n\n" +
                                "10. Escreva um programa que solicite ao usuário que digite um número inteiro positivo n, e imprima na tela todos os números pares de 1 até n. \n\n");
                        } if(chamadaOrigem.equals("Html")) {
                            i.putExtra("lista_atvd",
                                    "1. Como criar um menu suspenso em uma página HTML?\n\n" +
                                            "2. Como inserir um vídeo em uma página HTML?\n\n" +
                                            "3. Como definir uma cor de fundo para uma página HTML?\n\n" +
                                            "4. Como criar um elemento de texto estilizado em uma página HTML?\n\n" +
                                            "5. Como criar um elemento de imagem estilizado em uma página HTML?\n\n" +
                                            "6. Como criar um elemento de formulário estilizado em uma página HTML?\n\n" +
                                            "7. Como criar um mapa de imagem em uma página HTML?\n\n" +
                                            "8. Como definir a largura de uma tabela em uma página HTML?\n\n" +
                                            "9. Como definir uma imagem de fundo para uma página HTML?\n\n" +
                                            "10. Como criar uma seção de cabeçalho em uma página HTML?\n\n\n");
                        }if(chamadaOrigem.equals("Portugol")){
                            i.putExtra("lista_atvd",
                                    "1. O cardápio de uma lanchonete é o seguinte:\n\n" +
                                            "  LANCHE           CÓDIGO        VALOR\n\n" +
                                            "Cachorro Quente      101          1,20\n" +
                                            "Bauru Simples        102          1,30\n" +
                                            "Bauru Com Ovo        103          1,50\n" +
                                            "Hambúrguer           104          1,20\n" +
                                            "Cheeseburger         105          1,30\n" +
                                            "Refrigerante         106          1,00\n\n" +
                                            "Escrever um algoritmo que leia o código do item pedido e a quantidade. Calcule o valor a ser pago por aquele lanche. Considere que a cada execução somente será calculado um item. Caso não seja informado algum código da lista, deve-se informar que o código do lanche é inválido.\n\n\n"+
                                    "2. Escreva um algoritmo que leia dez valores numéricos inteiros e apresente na tela o somatório dos valores. \n\n\n"+
                                    "3. Elabore um algoritmo que leia um determinado número e apresente na tela a tabuada de multiplicação deste número. Por exemplo, digamos que o número informado foi 2, o programa deverá apresentar na tela:\n\n" +
                                            "1 x 2 = 2\n" +
                                            "2 x 2 = 4\n" +
                                            "3 x 2 = 6\n" +
                                            "?\n" +
                                            "10 x 2 = 20\n\n\n"+
                                    "4. Escrever um algoritmo que lê um valor numérico inteiro. Após, escreva uma tabela com cabeçalho, contendo o valor, seu quadrado e seu cubo. Mostrar para todos valores entre o valor " +
                                            "informado e 1. Por exemplo, digamos que o número informado seja 20, deve-se apresentar na tela:\n\n" +
                                            "Número  quadrado  cubo\n" +
                                            "  20      400     8000\n" +
                                            "  19      361     6859\n" +
                                            "  18      324     5832\n\n\n"+
                                    "5. Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:\n\n" +
                                            "a) a quantidade de pessoas com idade superior a 50 anos;\n" +
                                            "b) a média das alturas das pessoas com idade entre 10 e 20 anos;\n" +
                                            "c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.\n\n\n"+
                                    "6. Faça um algoritmo que leia 20 números inteiros e positivos e calcule o produto dos números " +
                                            "pares e o somatório dos ímpares. Além disso, deve-se verificar a quantidade de pares e ímpares " +
                                            "informados. O algoritmo não poderá aceitar valores negativos, nem zero. O fim da leitura será " +
                                            "indicado pelo número 0.\n\n\n" +
                                    "7. Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio deum código (representando os candidatos). Os códigos utilizados são:\n\n" +
                                            "1- João\n" +
                                            "2- Maria\n" +
                                            "3- Pedro\n" +
                                            "4- Marcos\n" +
                                            "5- Nulo\n" +
                                            "6- Em branco\n\n" +
                                            "Escreva um algoritmo que calcule e mostre:\n\n" +
                                            "a) o total de votos para cada candidato;\n" +
                                            "b) o total de votos nulos;\n" +
                                            "c) o total de votos em branco;\n" +
                                            "d) o percentual de nulos em relação ao total de votos;\n" +
                                            "e) o percentual de brancos em relação ao total de votos.\n\n\n"+
                                    "8. Elabore um algoritmo que, utilizando estruturas de repetição aninhadas, apresente na tela as tabuadas de multiplicação e divisão dos números de 1 a 10.\n\n\n" +
                                    "9. Construa um algoritmo que mostre na tela de 1  até 15:\n\n" +
                                            "//*\n" +
                                            "//**\n" +
                                            "//***\n" +
                                            "//****\n" +
                                            "//*****\n\n\n" +
                                    "10. Escreva um algoritmo que leia 50 valores e encontre o maior e o menor deles. Mostre o resultado.\n\n\n");
                        }
                        if(chamadaOrigem.equals("Fluxo")){
                            i.putExtra("lista_atvd",
                                    "1. Explique como funciona a figura de tomada de decisão.\n\n\n" +
                                            "2. Usando Fluxograma faça um algoritmo que mostre o nome “Programa Ai” na tela.\n\n\n" +
                                            "3. Elabore um Fluxograma que converta o real para o dólar. Neste exemplo o Dólar vale US$4.\n\n\n" +
                                            "4. Complementando a questão de número 8 utilizando o mesmo fluxograma faça com que o " +
                                            "usuário saiba se pode comprar uma passagem ou não. Se caso o saldo, em dólar, for maior " +
                                            "que US$500 ele escreva (Você pode viajar). Se não escreva (Você não pode viajar).\n\n\n" +
                                            "5. Faça um fluxograma para o usuário saber sua idade apenas digitando o ano atual e o ano de " +
                                            "nascimento.\n\n\n" +
                                            "6. Complementando a questão de número 10 utilizando o mesmo fluxograma faça com que o " +
                                            "usuário saiba se ele é maior de idade ou menor de idade. Neste caso, a idade de maior idade " +
                                            "é de 18 anos para cima.\n\n\n" +
                                            "7. Faça um fluxograma que diz se o número é negativo ou positivo ou igual a zero.\n\n\n" +
                                            "8. Faça um fluxograma que lê três números e diz se são iguais ou diferente.\n\n\n" +
                                            "9. Faça um fluxograma que diz se o número é ímpar ou par.\n\n\n" +
                                            "10. Em uma loja de CD´s existem apenas quatro tipos de preços que estão associados a cores.\n\n" +
                                            "Assim os CD´s que ficam na loja não são marcados por preços e sim por cores. Desenvolva o " +
                                            "algoritmo que a partir da entrada de uma cor o software mostre o preço. Use as seguintes " +
                                            "informações:\n\nVERDE=R$10,00/\nAZUL=R$20,00/\nAMARELO=R$30,00/\nVERMELHO=R$40,00.\n\n");
                        }
                    }
                    startActivity(i);
                }
            });

    }
}

