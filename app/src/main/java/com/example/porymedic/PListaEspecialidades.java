package com.example.porymedic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RatingBar;

import java.util.ArrayList;
import java.util.List;

public class PListaEspecialidades extends AppCompatActivity {

    private List<EespecialidadesPrueba > personas;
    private RatingBar rating;

    private  void initializarDatos(){
        personas = new ArrayList<>();

        personas.add(new EespecialidadesPrueba ("Dr. Anuel Garcia Vazques","Espcialista confiable","Fisioterapeuta",R.drawable.es1));
        personas.add(new EespecialidadesPrueba ("Dr. Luis Antonio Perez","El mejor de tacna","Odontologo",R.drawable.es2));
         }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.rv);
        recyclerView.setHasFixedSize(true);

        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(linearLayoutManager);

       /* rating =(RatingBar)findViewById(R.id.ratingBar3);
        rating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                Toast.makeText(MainActivity.this,"Usted Califico la pelicula con "+rating,Toast.LENGTH_LONG);
            }
        });*/


        initializarDatos();
        RVAdapter rvAdapter = new RVAdapter(personas,getApplicationContext());
        recyclerView.setAdapter(rvAdapter);

    }
}