package br.ifam.programaaiapp.fragments;

import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;

import android.preference.PreferenceManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.content.Intent;

import com.github.dhaval2404.imagepicker.ImagePicker;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;


import java.util.Objects;

import br.ifam.programaaiapp.LoginActivity;

import br.ifam.programaaiapp.R;
import br.ifam.programaaiapp.models.Users;


public class PerfilFragment extends Fragment {

    View root;
    Button buttonlogout;
    TextView profileName, profileUsername, profileEmail;
    TextView titleUserName;
    ImageView  profileimg;
    FloatingActionButton camera_button;
    private ProgressBar progressBar;

    private Users users;
    private FirebaseDatabase database;
    private DatabaseReference mDatabase;
    private FirebaseAuth mAuth;

    GoogleSignInOptions gso;
    GoogleSignInClient gsc;

    public void onCreate(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO);

    }


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

            database = FirebaseDatabase.getInstance("https://programaaiapp-default-rtdb.firebaseio.com");
            String uid = FirebaseAuth.getInstance().getCurrentUser().getUid();
            mDatabase = database.getReference().child("users").child(uid);

            root = inflater.inflate(R.layout.fragment_perfil, container, false);
            buttonlogout = root.findViewById(R.id.buttonlogout);
            profileName = root.findViewById(R.id.textusername);
            profileUsername = root.findViewById(R.id.textuserUserName);
            profileEmail = root.findViewById(R.id.textuseremail);
            titleUserName = root.findViewById(R.id.titleUserName);
            profileimg = root.findViewById(R.id.profileImg);
            camera_button = root.findViewById(R.id.camera_button);
            progressBar = root.findViewById(R.id.progressBar);


            //Perfil login com google
            gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                    .requestEmail()
                    .build();

            // Inicializar o GoogleSignInClient
            gsc = GoogleSignIn.getClient(getContext(), gso);

            // Verificar se o usuário está logado com o Firebase Auth
            FirebaseAuth auth = FirebaseAuth.getInstance();
            FirebaseUser user = auth.getCurrentUser();

            if (user != null) {
                // Usuário está logado, continuar com o carregamento da tela de perfil

                // Verificar o tipo de login (Google ou cadastro normal)
                GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getContext());
                if (account != null) {
                    // Exibir informações do perfil do Google
                    String name = account.getDisplayName();
                    String email = account.getEmail();

                    profileName.setText(name);
                    profileUsername.setText(name);
                    profileEmail.setText(email);
                    titleUserName.setText(name);


                } else {
                    // Exibir informações do perfil de cadastro normal
                    mDatabase.addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot snapshot) {
                            String name = snapshot.child("name").getValue(String.class);
                            String username = snapshot.child("userName").getValue(String.class);
                            String email = snapshot.child("email").getValue(String.class);

                            titleUserName.setText(username);
                            profileUsername.setText(username);
                            profileName.setText(name);
                            profileEmail.setText(email);
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError error) {
                            // Tratar erro de leitura do banco de dados
                        }
                    });
                }
            }

            //escolha da imagem quando o butao da camera
            camera_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ImagePicker.with(PerfilFragment.this)
                            .crop()
                            //crop - cortar a imagem (opcional), verifivar sua personalização para mais opções
                            .compress(1024)
                            //o tamanho final da imagem vai ser inferior a 1mb
                            .maxResultSize(1080, 1080)
                            //a resolução final da imagem
                            .start();
                }
            });

            buttonlogout.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    FirebaseAuth auth = FirebaseAuth.getInstance();
                    FirebaseUser user = auth.getCurrentUser();

                    if (user != null) {
                        // Usuário está autenticado com o Firebase Auth

                        // Fazer logout do Firebase Auth
                        auth.signOut();
                        GoogleSignInAccount account = GoogleSignIn.getLastSignedInAccount(getContext());

                        if (account != null) {
                            // Usuário está autenticado com o login do Google

                            // Fazer logout do Google
                            GoogleSignInOptions gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN)
                                    .requestEmail()
                                    .build();

                            GoogleSignInClient gsc = GoogleSignIn.getClient(getContext(), gso);
                            gsc.signOut().addOnCompleteListener(new OnCompleteListener<Void>() {
                                @Override
                                public void onComplete(@NonNull Task<Void> task) {
                                    // Redirecionar para a tela de login
                                    startActivity(new Intent(getContext(), LoginActivity.class));
                                    requireActivity().finish();

                                }
                            });
                        } else {
                            // Redirecionar para a tela de login
                            startActivity(new Intent(getContext(), LoginActivity.class));
                            requireActivity().finish();

                        }
                    }
                }
            });


            //setar a imagem escolhida ou capturada em um objeto (profileimg) caso ela ja exista continuar com ela.
            SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
            String uriString = preferences.getString("profile_image_uri", null);
            if (uriString != null) {
                //Uri (Uniform Resource Identifier)
                Uri uri = Uri.parse(uriString);
                profileimg.setImageURI(uri);
            }
                return root;

        }

    //caso o usuario escolha por capturar a foto ou seleciona-la
    @Override
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Uri uri = data.getData();
        profileimg.setImageURI(uri);

        SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getContext());
        SharedPreferences.Editor editor = preferences.edit();
        editor.putString("profile_image_uri", uri.toString());
        editor.apply();
    }

}








