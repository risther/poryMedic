package com.example.porymedic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class PprincipalAdministrador extends AppCompatActivity {

    Button rEspecialistas,rEspecialidades,btncerrarSA;
    private FirebaseAuth mAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pprincipal_administrador);

        rEspecialistas=(Button) findViewById(R.id.btnEspecialistas);
        rEspecialidades=(Button) findViewById(R.id.btnAgregarEspecialidad);

        btncerrarSA=(Button) findViewById(R.id.btncerrarSA);
        mAuth=FirebaseAuth.getInstance();

        rEspecialidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PprincipalAdministrador.this,PRegistrarEspecialidades.class));
                finish();
            }
        });

        rEspecialistas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(PprincipalAdministrador.this,PRegistrarEspecialistas.class));
                finish();
            }
        });



        btncerrarSA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAuth.signOut();
            }
        });
    }
}