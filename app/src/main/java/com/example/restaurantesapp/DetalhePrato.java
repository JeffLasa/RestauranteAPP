package com.example.restaurantesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.restaurantesapp.R;

public class DetalhePrato extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhe_prato);


        Intent intent = getIntent();
        if (intent!=null){
            Bundle bundle = getIntent().getExtras();
            if (bundle !=null){
                String nomePrato = bundle.getString("PRATO");
                int fotoPrato = bundle.getInt("FOTO");

                TextView nomePratoTextView = findViewById(R.id.nome_prato_detalhe_id);
                ImageView fotoPratoImageView = findViewById(R.id.imagem_prato_detalhe_id);

                nomePratoTextView.setText(nomePrato);
                fotoPratoImageView.setImageResource(fotoPrato);




            }
        }
    }
}
