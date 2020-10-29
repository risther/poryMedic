package com.example.porymedic;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.PersonaViewHolder> {


    List<EespecialidadesPrueba > personas;
    Context context;

    public RVAdapter(List<EespecialidadesPrueba > personas, Context context) {
        this.personas = personas;
        this.context = context;
    }

    @NonNull
    @Override
    public RVAdapter.PersonaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view= LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.activity_p_lista_especialidades,parent, false);

        PersonaViewHolder personaViewHolder = new PersonaViewHolder(view);

        return personaViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RVAdapter.PersonaViewHolder holder, int position) {

        holder.nombreEspecialista.setText(personas.get(position).nombreEspecilista);
        holder.nombreespecialidad.setText(personas.get(position).nombreEspecilidad);
        holder.descripcionespecialidad.setText(personas.get(position).descripcion);


        Drawable original = context
                .getResources()
                .getDrawable(personas.get(position).foto,null);


        Bitmap originalBitmap =((BitmapDrawable)original).getBitmap();
        RoundedBitmapDrawable roundedBitmapDrawable= RoundedBitmapDrawableFactory.create(context.getResources(),originalBitmap);
        roundedBitmapDrawable.setCircular(true);

        holder.fotoEspecialidad.setImageDrawable(roundedBitmapDrawable);
    }

    @Override
    public int getItemCount() {
        return personas.size();
    }

    public  static  class  PersonaViewHolder extends RecyclerView.ViewHolder{

        CardView cardView;
        TextView nombreEspecialista;
        TextView nombreespecialidad;
        TextView descripcionespecialidad;
        ImageView fotoEspecialidad;
       public  PersonaViewHolder(@NonNull View itemView){
           super(itemView);

           cardView = (CardView)itemView.findViewById(R.id.cv);
           nombreEspecialista = (TextView) itemView.findViewById(R.id.textNombreEspecialista);
           nombreespecialidad = (TextView) itemView.findViewById(R.id.textNombreEspecialidad);
           descripcionespecialidad = (TextView) itemView.findViewById(R.id.txtdescripcion);
           fotoEspecialidad = (ImageView) itemView.findViewById(R.id.fotoEspecilidad);
       }


    }
}
