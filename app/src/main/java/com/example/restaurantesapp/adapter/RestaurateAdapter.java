package com.example.restaurantesapp.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantesapp.R;
import com.example.restaurantesapp.interfaces.RestauranteListener;
import com.example.restaurantesapp.model.Restaurante;

import java.util.List;

public class RestaurateAdapter extends RecyclerView.Adapter<RestaurateAdapter.ViewHolder> {

    private List<Restaurante> listaDeRestaurantes;
    private RestauranteListener restauranteListener;

    public RestaurateAdapter(List<Restaurante> listaDeRestaurantes, RestauranteListener restauranteListener) {
        this.listaDeRestaurantes = listaDeRestaurantes;
        this.restauranteListener = restauranteListener;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_restaurante_celula, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        final Restaurante restaurante = listaDeRestaurantes.get(i);
        viewHolder.setupRestaurantes(restaurante);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restauranteListener.onRestauranteClicado(restaurante);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listaDeRestaurantes.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView restauranteTextView;
        private ImageView imagemRestauranteImageView;
        private TextView enderecoTextView;
        private TextView horarioTextView;


        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imagemRestauranteImageView = itemView.findViewById(R.id.imageView_recycler_id);
            restauranteTextView = itemView.findViewById(R.id.nome_restaurante_recycler_id);
            enderecoTextView = itemView.findViewById(R.id.endereco_recycler_id);
            horarioTextView = itemView.findViewById(R.id.horario_recycler_id);
        }

        public void setupRestaurantes(Restaurante restaurante){
            restauranteTextView.setText(restaurante.getNomeRestaurante());
            enderecoTextView.setText(restaurante.getEndereco());
            horarioTextView.setText(restaurante.getHorarioFuncionamento());
            imagemRestauranteImageView.setImageResource(restaurante.getFotoRestaurante());


        }
    }
}
