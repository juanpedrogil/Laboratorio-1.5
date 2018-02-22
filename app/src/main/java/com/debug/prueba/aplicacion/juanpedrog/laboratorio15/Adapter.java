package com.debug.prueba.aplicacion.juanpedrog.laboratorio15;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by juanpedrog on 22/02/18.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ListaViewHolder> {

    @Override
    public ListaViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(ListaViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
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
