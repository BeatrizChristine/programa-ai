package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import br.ifam.programaaiapp.R;

public class C_assuntos extends AppCompatActivity {

    private ImageView backbutton;
    LinearLayout assunto1, assunto2, assunto3, assunto4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cassuntos);
        backbutton = findViewById(R.id.backbutton);
        assunto1 = findViewById(R.id.assunto1);
        assunto2 = findViewById(R.id.assunto2);
        assunto3 = findViewById(R.id.assunto3);
        assunto4 = findViewById(R.id.assunto4);

        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        assunto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "O que é?");
                i.putExtra("texto_assunto",
                        " O C# (pronuncia-se \"C Sharp\") é uma linguagem de programação moderna, " +
                                "orientada a objeto e fortemente tipada. A Microsoft define o C# como a principal " +
                                "linguagem de programação para uso da tecnologia .NET. Por ser uma derivação da " +
                                "linguagem C + + , sem as suas limitações, é uma linguagem bastante simples de se " +
                                "implementar.\n\n"+
                        " A linguagem de programação C# foi desenvolvida pela Microsoft em 2000, como " +
                                "uma evolução da linguagem C++. A ideia era criar uma linguagem moderna, " +
                                "orientada a objetos e com recursos de programação de alto nível, que pudesse ser " +
                                "usada para desenvolver aplicativos para a plataforma Windows.\n\n"+
                        " O objetivo da Microsoft era oferecer uma alternativa à linguagem Java, que na " +
                                "época era muito popular para desenvolvimento de aplicativos empresariais. Desde " +
                                "então, o C# tem sido amplamente adotado pelos desenvolvedores de software, " +
                                "principalmente na criação de aplicativos para desktop e para a web.\n\n"+
                        " O C# é uma linguagem de programação multiparadigma, que suporta programação " +
                                "orientada a objetos, programação funcional e programação assíncrona. Ele é " +
                                "executado no ambiente .NET Framework, que fornece uma plataforma de execução " +
                                "comum para aplicativos Windows.\n\n");

                startActivity(i);
            }
        });

        assunto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Variáveis");
                i.putExtra("texto_assunto",
                        "Variáveis são locais da memória RAM de seu computador.\n\n"+
                        "●\tint = Em C#, o tipo de dados inteiro (int) é um tipo de dados que representa um " +
                                "número inteiro de 32 bits (4 bytes) com sinal. O método inteiro (int) não é uma " +
                                "função, mas sim um tipo de dado que pode ser usado para declarar uma variável " +
                                "que armazena um valor inteiro ou para definir o valor de uma expressão que retorna " +
                                "um valor inteiro.\n\n"+
                        "Um método inteiro é um método que retorna um valor inteiro. Por exemplo, " +
                                "podemos ter um método inteiro que calcula a soma de dois números inteiros. O " +
                                "resultado do cálculo é um número inteiro que é retornado pelo método. " +
                                "Um exemplo de método inteiro em C#:\n\n"+
                        "public int Sum(int a, int b){\n" +
                        "   return a + b;\n" +
                        "}\n\n"+
                        "Neste exemplo, o método Sum recebe dois números inteiros como parâmetros e " +
                                "retorna a soma desses dois números. O resultado da soma é um número inteiro que " +
                                "é retornado pelo método.\n\n\n\n"+

                        "●\tfloat = C#, o tipo de dados float é um tipo de dados numérico que representa " +
                                "números de ponto flutuante de precisão simples. Uma variável float é usada para " +
                                "armazenar um número decimal com uma precisão limitada de 7 dígitos " +
                                "significativos.\n\n"+
                        "Uma variável float é declarada usando a palavra-chave `float`, seguida do nome da " +
                                "variável e, opcionalmente, do valor inicial:\n\n"+
                        "float myFloat = 3.14f; // declara uma variável float com valor inicial 3.14\n\n"+
                        "O sufixo `f` é usado para indicar que o valor é um número float, e não um número " +
                                "double (que é o tipo de dados padrão para números decimais em C#).\n\n"+
                        "Uma variável float pode ser usada em expressões aritméticas e de comparação, " +
                                "como qualquer outro tipo de dados numérico. Por exemplo:\n\n"+
                        "float myFloat = 3.14f;\n" +
                        "float myOtherFloat = myFloat * 2; // myOtherFloat recebe o valor 6.28\n" +
                        "bool isPositive = (myFloat > 0); // isPositive recebe true, pois myFloat é positivo\n\n\n\n"+

                        "●\tbool = Em C#, o tipo de dado booleano (bool) é um tipo de dados que representa " +
                                "um valor verdadeiro (true) ou falso (false). O método bool não é uma função, mas " +
                                "sim uma palavra-chave que é usada para declarar uma variável booleana ou para" +
                                "definir o valor de uma expressão que retorna um valor booleano.\n\n"+
                        "Um método bool é um método que retorna um valor booleano, ou seja, ele retorna " +
                                "true ou false. Por exemplo, podemos ter um método bool que verifica se um número " +
                                "é par ou ímpar. Se o número for par, o método retorna true, caso contrário, retorna " +
                                "false.\n\n"+
                        "Um exemplo de método bool em C#:\n\n" +
                                "  public bool IsEven(int number){\n" +
                                "  if(number % 2 == 0){\n" +
                                "   return true;\n" +
                                "  }\n" +
                                "  else{\n" +
                                "   return false;\n" +
                                "  }\n" +
                                "}\n\n"+
                        "Neste exemplo, o método IsEven recebe um número inteiro como parâmetro e " +
                                "verifica se ele é par ou ímpar. Se o número for par, o método retorna true, caso " +
                                "contrário, retorna false.\n\n\n\n"+

                        "●\tstring = Em C#, o tipo de dados string é um tipo de dados que representa uma " +
                                "sequência de caracteres Unicode. Uma variável string é usada para armazenar um " +
                                "texto ou uma cadeia de caracteres.\n\n"+
                        "Uma variável string é declarada usando a palavra-chave `string`, seguida do nome " +
                                "da variável e, opcionalmente, do valor inicial:\n\n"+
                        "string myString = \"Hello, world!\"; // declara uma variável string com valor inicial \"Hello, " +
                                "world!\"\n\n"+
                        "Uma variável string pode ser manipulada usando diversas operações, como " +
                                "concatenação, substituição, comparação, entre outras. Por exemplo:\n\n"+
                                "string firstName = \"John\";\n" +
                                "string lastName = \"Doe\";\n" +
                                "string fullName = firstName + \" \" + lastName; // fullName recebe \"John Doe\"\n" +
                                "string myString = \"Hello, world!\";\n" +
                                "string newString = myString.Replace(\"world\", \"C#\"); // newString recebe \"Hello, C#!\"\n" +
                                "bool containsHello = myString.Contains(\"Hello\"); // containsHello recebe true\n\n"+
                        "Uma variável string é imutável, o que significa que não é possível modificar uma " +
                                "string existente. Em vez disso, operações como concatenação e substituição criam " +
                                "uma nova string com o resultado da operação.\n\n"+
                        "Em C#, as strings são tratadas como objetos e, portanto, há uma série de métodos " +
                                "e propriedades disponíveis para manipulá-las. Por exemplo, o método `Length` " +
                                "retorna o número de caracteres na string:\n\n"+
                        "string myString = \"Hello, world!\";\n" +
                                "int length = myString.Length; // length recebe o valor 13\n\n\n\n"+

                        "●\tchar = Em C#, o tipo de dados char (caractere) é um tipo de dados que representa " +
                                "um único caractere Unicode de 16 bits. Uma variável char é usada para armazenar " +
                                "um único caractere, como uma letra, um dígito ou um símbolo.\n\n"+
                        "Uma variável char é declarada usando a palavra-chave `char`, seguida do nome da " +
                                "variável e, opcionalmente, do valor inicial:\n\n"+
                        "char myChar = 'A'; // declara uma variável char com valor inicial 'A'\n\n"+
                        "Em C#, um caractere é representado por um valor numérico de 16 bits, que é o " +
                                "código Unicode do caractere. Por exemplo, o caractere 'A' tem o código Unicode 65, " +
                                "enquanto o caractere 'B' tem o código Unicode 66.\n\n"+
                        "Podemos também usar um valor numérico inteiro para inicializar uma variável char. " +
                                "Nesse caso, o valor inteiro é convertido em um caractere Unicode correspondente:\n\n"+
                        "char myChar = 65; // inicializa a variável char com o caractere 'A' (código Unicode 65)\n\n\n");

                startActivity(i);
            }
        });

        assunto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_assuntos.this, Assuntos_linguagens.class);
                i.putExtra("nome_assunto", "Operações Matemáticas");
                i.putExtra("texto_assunto",
                        " C# suporta as operações matemáticas básicas, como adição, subtração, " +
                                "multiplicação e divisão, além de outras operações mais avançadas, como " +
                                "exponenciação, resto de divisão e operações bitwise.\n\n"+
                        " Aqui estão alguns exemplos de operações matemáticas com C#:\n\n"+
                                "●\tAdição:\n\n" +
                                "int a = 5;\n" +
                                "int b = 10;\n" +
                                "int result = a + b; // result recebe o valor 15\n\n"+

                                "●\tSubtração:\n\n" +
                                "int a = 5;\n" +
                                "int b = 10;\n" +
                                "int result = b - a; // result recebe o valor 5\n\n"+

                                "●\tMultiplicação:\n\n" +
                                "int a = 5;\n" +
                                "int b = 10;\n" +
                                "int result = a * b; // result recebe o valor 50\n\n"+

                                "●\tDivisão:\n" +
                                "int a = 10;\n" +
                                "int b = 2;\n" +
                                "int result = a / b; // result recebe o valor 5\n\n"+

                                "●\tExponenciação:\n\n" +
                                "double a = 2;\n" +
                                "double b = 3;\n" +
                                "double result = Math.Pow(a, b); // result recebe o valor 8 (2 elevado a 3)\n\n"+

                                "●\tResto de divisão:\n\n" +
                                "int a = 10;\n" +
                                "int b = 3;\n" +
                                "int result = a % b; // result recebe o valor 1 (resto da divisão de 10 por 3)\n\n"+

                        " É importante lembrar que, em operações matemáticas com tipos de dados " +
                                "diferentes, o C# realiza a conversão automática dos tipos de dados, seguindo as " +
                                "regras de conversão de tipos do C#. Além disso, é importante estar atento a " +
                                "possíveis erros de divisão zero e estouro de capacidade dos tipos numéricos.\n\n\n");

                startActivity(i);
            }
        });

        assunto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(C_assuntos.this, C_assunto_texto.class);
                startActivity(i);
            }
        });
    }
}