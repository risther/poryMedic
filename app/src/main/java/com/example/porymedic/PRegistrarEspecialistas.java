package com.example.porymedic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class PRegistrarEspecialistas extends AppCompatActivity {

    TextView tvdni,tvnombres,tvapellidos,tvtelefono,tvcorreo,tvContraseña;
    Button btnRegistrarCli;
    String dni,nombres,apellidos,telefono,correo,contraseña;
    FirebaseDatabase firebaseDatabase;
    FirebaseAuth mAuth;
    DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_p_registrar_especialistas);

    }
}