package com.example.porymedic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;

public class Pprincipal extends AppCompatActivity {

    ImageView reservar,informacion,anular,localizacion;
    Button cerrar;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprincipal);
        reservar=(ImageView) findViewById(R.id.btnReservar);
        informacion=(ImageView) findViewById(R.id.btnInformacion);
        anular=(ImageView) findViewById(R.id.btnAnular);
        mAuth=FirebaseAuth.getInstance();
        cerrar=(Button) findViewById(R.id.btnCerrarSesionUsuario);

        reservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Pprincipal.this,PListaEspecialidades.class));
                finish();
            }
        });

        cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
                startActivity(new Intent(Pprincipal.this,PLogin.class));
                finish();
            }
        });
    }
}