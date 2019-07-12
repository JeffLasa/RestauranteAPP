package com.example.restaurantesapp.model;

import android.widget.ImageView;

import java.io.Serializable;

public class Prato implements Serializable {
    private String nomePrato;
    private int fotoPrato;
    private String detalhesPrato;

    public Prato() {
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public int getFotoPrato() {
        return fotoPrato;
    }

    public void setFotoPrato(int fotoPrato) {
        this.fotoPrato = fotoPrato;
    }

    public String getDetalhesPrato() {
        return detalhesPrato;
    }

    public void setDetalhesPrato(String detalhesPrato) {
        this.detalhesPrato = detalhesPrato;
    }
}
