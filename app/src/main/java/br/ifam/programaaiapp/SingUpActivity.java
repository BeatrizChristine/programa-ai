package br.ifam.programaaiapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import br.ifam.programaaiapp.models.Users;

public class SingUpActivity extends AppCompatActivity {

    FirebaseAuth auth;
    FirebaseDatabase database;
    DatabaseReference reference;
    boolean passowordVisible;
    private EditText singupNome, singupUserName, singupEmail, singupPassword;
    private Button singupButton;
    private TextView loginReadingText;
    private Users users;

    protected void onStart() {
        super.onStart();

        FirebaseApp.initializeApp(getApplicationContext());
        database = FirebaseDatabase.getInstance();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sing_up);

        auth = FirebaseAuth.getInstance();
        singupNome = findViewById(R.id.singup_name);
        singupUserName = findViewById(R.id.singup_userName);
        singupEmail = findViewById(R.id.singup_email);
        singupPassword = findViewById(R.id.singup_password);
        singupButton = findViewById(R.id.singup_button);
        loginReadingText = findViewById(R.id.loginReadingText);


        singupPassword.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent event) {
                final int Right = 2;
                if(event.getAction() == MotionEvent.ACTION_UP){
                    if(event.getRawX()>=singupPassword.getRight()-singupPassword.getCompoundDrawables()[Right].getBounds().width()){
                        int selection = singupPassword.getSelectionEnd();
                        singupPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_lock, 0);
                        if(passowordVisible){
                            //setar o icon de visivel
                            singupPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_pass_invisi, 0);
                            //esconder a senha
                            singupPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                            passowordVisible=false;
                        }else{
                            //setar o icon de visivel
                            singupPassword.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, R.drawable.ic_pass_visibi, 0);
                            //mostrar a senha
                            singupPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                            passowordVisible=true;
                        }
                        singupPassword.setSelection(selection);
                        return true;
                    }
                }
                return false;
            }
        });

        singupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String nome = singupNome.getText().toString();
                String username = singupUserName.getText().toString();
                String email = singupEmail.getText().toString();
                String pass = singupPassword.getText().toString();

                Users users = new Users(nome, username, email, pass);



                if(nome.isEmpty()){
                    singupNome.setError("O espaço do nome está vazio");
                    singupNome.requestFocus();
                }

                if(username.isEmpty()){
                    singupPassword.setError("O espaço do userName está vazio!");
                    singupPassword.requestFocus();
                }
                if(email.isEmpty()){
                    singupEmail.setError("O espaço do email está vazio!");
                    singupEmail.requestFocus();
                }
                if(pass.isEmpty()){
                    singupPassword.setError("O espaço da senha está vazio!");
                    singupPassword.requestFocus();
                }

                if(pass.length() <= 7){
                    singupPassword.setError("Crie uma senha no mínimo 8 caracteres!");
                    singupPassword.requestFocus();
                }

                if(nome.isEmpty() || username.isEmpty() || email.isEmpty() || pass.isEmpty() ){
                    Toast.makeText(getApplicationContext(), "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
                } else{
                    //ocultar o teclado
                    InputMethodManager manager = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
                    manager.hideSoftInputFromWindow(view.getWindowToken(), 0);

                    //verificação de cadastro com sucesso
                    auth.createUserWithEmailAndPassword( email, pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                FirebaseUser user = auth.getCurrentUser();
                                assert user != null;
                                database.getReference().child("users").child(user.getUid()).setValue(users);
                                Toast.makeText(getApplicationContext(), "Cadastrado com sucesso!", Toast.LENGTH_LONG).show();
                                startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                                finish();

                            }else{
                                //se o email estiver sendo usado
                                Toast.makeText(SingUpActivity.this,"Cadastro não realizado!\n O email ja está em uso!", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                }
            }
        });


        //texto para mudar de actiity (singup para login)
        loginReadingText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SingUpActivity.this,LoginActivity.class));
                finish();
            }
        });

        //verificação de activity para caso ela apareça duas vezes
        if (!isTaskRoot()) {
            finish();
            return;
        }


    }

}