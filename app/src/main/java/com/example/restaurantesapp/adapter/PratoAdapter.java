package com.example.restaurantesapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantesapp.R;
import com.example.restaurantesapp.interfaces.PratoListener;
import com.example.restaurantesapp.model.Prato;

import java.util.ArrayList;
import java.util.List;

public class PratoAdapter extends RecyclerView.Adapter<PratoAdapter.ViewHolder> {

    private List<Prato> listaDePratos;
    private PratoListener pratoListener;

    public PratoAdapter(List<Prato> listaDePratos, PratoListener pratoListener) {
        this.listaDePratos = listaDePratos;
        this.pratoListener = pratoListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int position) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_pratos_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {
        final Prato prato = listaDePratos.get(position);
        viewHolder.setupPrato(prato);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                pratoListener.onPratoClicado(prato);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listaDePratos.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView pratoTextView;
        private ImageView imagemPratoImageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemPratoImageView = itemView.findViewById(R.id.prato_image_view_prato_recycler_id);
            pratoTextView = itemView.findViewById(R.id.nome_restaurante_prato_recycler_id);

        }

        public void setupPrato(Prato prato) {
            pratoTextView.setText(prato.getNomePrato());
            imagemPratoImageView.setImageResource(prato.getFotoPrato());

        }
    }
}
