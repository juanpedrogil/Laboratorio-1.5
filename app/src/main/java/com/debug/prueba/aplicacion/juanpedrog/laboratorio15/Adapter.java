package com.debug.prueba.aplicacion.juanpedrog.laboratorio15;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by juanpedrog on 22/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder> {
    String[][] datos;
    public Adapter(String[][] datos){
        this.datos=datos;
    }
    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout,parent,false);
        ListaViewHolder lista=new ListaViewHolder(view);
        return lista;
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {
        holder.lblNombre.setText(datos[position][0]);
        holder.lblControl.setText(datos[position][1]);
        holder.lblCarrera.setText(datos[position][2]);
    }

    @Override
    public int getItemCount() {
        return datos.length;
    }

    public static class ListaViewHolder extends RecyclerView.ViewHolder{
        ImageView imagen;
        TextView lblNombre;
        TextView lblControl;
        TextView lblCarrera;
        public ListaViewHolder(View itemView) {
            super(itemView);
            imagen=itemView.findViewById(R.id.imagen);
            lblNombre=itemView.findViewById(R.id.lblNombre);
            lblControl=itemView.findViewById(R.id.lblControl);
            lblCarrera=itemView.findViewById(R.id.lblCarrera);
        }
    }

}
