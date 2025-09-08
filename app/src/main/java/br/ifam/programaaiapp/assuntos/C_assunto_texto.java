package br.ifam.programaaiapp.assuntos;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.media.Image;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.chrisbanes.photoview.PhotoView;

import br.ifam.programaaiapp.R;

public class C_assunto_texto extends AppCompatActivity {

    private TextView assunto1, assunto2, assunto3, assunto4, assunto5, assunto6;
    private ImageView buttonback, imagem1, imagem2, imagem3, imagem4, imagem5,
                        imagem6, imagem7;

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cassunto_texto);
        assunto1 = findViewById(R.id.texto_assunto);
        assunto2 = findViewById(R.id.texto_assunto2);
        assunto3 = findViewById(R.id.texto_assunto3);
        assunto4 = findViewById(R.id.texto_assunto4);
        assunto5 = findViewById(R.id.texto_assunto5);
        assunto6 = findViewById(R.id.texto_assunto6);

        imagem1 = findViewById(R.id.imagem1);
        imagem2 = findViewById(R.id.imagem2);
        imagem3 = findViewById(R.id.imagem3);
        imagem4 = findViewById(R.id.imagem4);
        imagem5 = findViewById(R.id.imagem5);
        imagem6 = findViewById(R.id.imagem6);
        imagem7 = findViewById(R.id.imagem7);

        buttonback = findViewById(R.id.backbutton);

        buttonback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        imagem1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem1);
            }
        });


        imagem2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem2);
            }
        });

        imagem3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem3);
            }
        });

        imagem4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem4);
            }
        });

        imagem5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem5);
            }
        });

        imagem6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem6);
            }
        });

        imagem7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showImageFullscreenDialog(R.drawable.c_imagem7);
            }
        });

        assunto1.setText("Nesse momento,vamos começar a aprender a estrutura inicial do programa c#. " +
                "Quando você cria um programa c#, ele gera a estrutura anterior, mas qual o " +
                "significado dele?\n\n"+
                "using System;\n" +
                "using System.Collections.Generic;\n" +
                "using System.Linq;\n" +
                "using System.Text;\n" +
                "using System.Threading.Tasks;\n\n"+
                "Esses são chamados de módulos ou pacotes, isso porque c# é uma linguagem " +
                "usada para criar jogos, aplicativos, aplicações para desktops e sites, então os " +
                "arquitetos dessa linguagem tiveram que dividi-la em pacotes/módulos. Dessa forma, " +
                "conjunto de funcionalidade do c#, precisa está em um módulo.\n\n"+
                "namespace primeiro_programa\n" +
                "{\n" +
                "  internal class Program\n" +
                "{\n\n"+
                "Essas duas linhas de códigos serão mais especificadas nos módulos seguintes. " +
                "Porém, o código c# começa abaixo dessas linhas de códigos\n\n"+
                "static void Main(string[] args)\n\n"+
                "É conhecido como função principal ou método inicial, dessa forma, qualquer " +
                "código que você coloca nessa função, será o primeiro código executado nesse " +
                "programa.\n\n"+
                "●\tVAMOS COMEÇAR A PRATICAR?\n\n"+
                "Vamos fazer um programa que exiba uma mensagem na tela. Vamos ir dentro " +
                "do método inicial e vamos digitar Console.Write(); Esse comando exibe uma " +
                "mensagem de texto para o usuário. Dentro desses parênteses, adicione “” " +
                "coloque dentro de sua mensagem. Exemplo:");

        assunto2.setText("Salve(CTRL + S) e execute. Porém a tela apareceu por poucos segundos, não " +
                "é? Vamos testar novos comandos! Abaixo do seu primeiro comando, escreva " +
                "Console.ReadLine(); Esse comando espera o usuário digitar.");

        assunto3.setText("Agora, vamos melhorar esse código. Vamos criar um código que imprima uma " +
                "mensagem, peça o nome do aluno e armazene o seu nome. Dessa forma: " +
                "Vamos executar?");

        assunto4.setText("Veja! O programa exibe duas mensagens… e uma delas é para escrever o " +
                "nome. Vamos lá?");

        assunto5.setText("Digite qualquer nome e em seguida aperte Enter. Exemplo:");

        assunto6.setText("Pronto! O programa armazenou o nome digitado na variável nome, e pôde ser " +
                "utilizada para a exibição de um texto!");
    }

    private void showImageFullscreenDialog(int imageRes) {
        LayoutInflater inflater = LayoutInflater.from(C_assunto_texto.this);
        View dialogView = inflater.inflate(R.layout.dialog_image, null);

        PhotoView photoView = dialogView.findViewById(R.id.image_fullscreen);
        photoView.setImageResource(imageRes);

        final Dialog dialog = new Dialog(C_assunto_texto.this, android.R.style.Theme_Black_NoTitleBar_Fullscreen);
        dialog.setContentView(dialogView);

        ImageButton closeButton = dialog.findViewById(R.id.button_close);
        closeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        ImageButton zoomButton = dialog.findViewById(R.id.button_zoom);
        zoomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PhotoView photoView = dialog.findViewById(R.id.image_fullscreen);
                float currentScale = photoView.getScale();
                float targetScale = currentScale < 2.0f ? 2.0f : 1.0f;
                photoView.setScale(targetScale, true);
            }
        });


        dialog.show();
    }
}

