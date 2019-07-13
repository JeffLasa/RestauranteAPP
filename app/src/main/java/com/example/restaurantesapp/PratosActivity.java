package com.example.restaurantesapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantesapp.adapter.PratoAdapter;
import com.example.restaurantesapp.interfaces.PratoListener;
import com.example.restaurantesapp.model.Prato;
import com.example.restaurantesapp.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class PratosActivity extends AppCompatActivity implements PratoListener {


    @SuppressLint("ResourceType")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pratos);

        Restaurante restaurante;
        TextView nomeRestauranteTextView;
        ImageView fotoRestauranteImageView;
        List<Prato> listaPratos = new ArrayList<>();

        Intent intent = getIntent();

        if (intent != null) {
            Bundle bundle = intent.getExtras();
            if (bundle != null) {

                restaurante = (Restaurante) bundle.getSerializable("RESTAURANTE");

                nomeRestauranteTextView = findViewById(R.id.nome_restaurante_prato_id);
                nomeRestauranteTextView.setText(restaurante.getNomeRestaurante());

                fotoRestauranteImageView = findViewById(R.id.imagem_restaurante_pratos_id);
                fotoRestauranteImageView.setImageResource(restaurante.getFotoRestaurante());

                listaPratos = restaurante.getListaPratos();

            }
        }


        PratoAdapter pratoAdapter = new PratoAdapter(listaPratos, this);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        RecyclerView recyclerView = findViewById(R.id.container_recycler_pratos_id);
        recyclerView.setAdapter(pratoAdapter);
        recyclerView.setLayoutManager(gridLayoutManager);

    }

    @Override
    public void onPratoClicado(Prato prato) {

        Intent intent = new Intent(this, DetalhePrato.class);

        Bundle bundle = new Bundle();
        bundle.putString("PRATO", prato.getNomePrato());
        bundle.putInt("FOTO", prato.getFotoPrato());
        intent.putExtras(bundle);

        startActivity(intent);
    }
}