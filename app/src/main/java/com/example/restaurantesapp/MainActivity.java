package com.example.restaurantesapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.example.restaurantesapp.adapter.RestaurateAdapter;
import com.example.restaurantesapp.interfaces.RestauranteListener;
import com.example.restaurantesapp.model.Prato;
import com.example.restaurantesapp.model.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements RestauranteListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        List<Restaurante> listaRestaurantes = new ArrayList<>();
        List<Prato> listaPratosRestaurante1 = new ArrayList<>();
        List<Prato> listaPratosRestaurante2 = new ArrayList<>();
        List<Prato> listaPratosRestaurante3 = new ArrayList<>();


        Prato prato = new Prato();
        prato.setFotoPrato(R.drawable.acaraje);
        prato.setNomePrato("Acarajé da Bahia");
        prato.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante1.add(prato);

        Prato prato1 = new Prato();
        prato1.setFotoPrato(R.drawable.moqueca_de_abadejo);
        prato1.setNomePrato("Moqueca de Abadejo");
        prato1.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante1.add(prato1);

        Prato prato2 = new Prato();
        prato2.setFotoPrato(R.drawable.futuccini_a_marinara);
        prato2.setNomePrato("Fetuccini a Marinara");
        prato2.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante1.add(prato2);

        Prato prato3 = new Prato();
        prato3.setFotoPrato(R.drawable.sushi);
        prato3.setNomePrato("Sushi");
        prato3.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante1.add(prato3);

        Prato prato4 = new Prato();
        prato4.setFotoPrato(R.drawable.massas2);
        prato4.setNomePrato("Rondelle ao sugo");
        prato4.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante3.add(prato4);

        Restaurante restaurante = new Restaurante();
        restaurante.setNomeRestaurante("Manguinho's Gourmet");
        restaurante.setEndereco("Alameda Jau 1650");
        restaurante.setHorarioFuncionamento("Aberto das 11h as 23h");
        restaurante.setFotoRestaurante(R.drawable.vojnilo_romero_cruz);
        listaRestaurantes.add(restaurante);
        restaurante.getListaPratos().add(prato);
        restaurante.getListaPratos().add(prato1);
        restaurante.getListaPratos().add(prato2);


        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNomeRestaurante("Caluma Sushi");
        restaurante1.setEndereco("Avenida Guilherme Giorgi 1280");
        restaurante1.setHorarioFuncionamento("Aberto das 12h as 17h");
        restaurante1.setFotoRestaurante(R.drawable.restaurante_caluma_sushi);
        listaRestaurantes.add(restaurante1);
        restaurante1.getListaPratos().add(prato4);


        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNomeRestaurante("Trattoria Mama Mia");
        restaurante2.setEndereco("Rua 13 de maio 880");
        restaurante2.setHorarioFuncionamento("Aberto das 11h as 23h");
        restaurante2.setFotoRestaurante(R.drawable.massas);
        listaRestaurantes.add(restaurante2);

        Restaurante restaurante3 = new Restaurante();
        restaurante3.setNomeRestaurante("Outback Steakhouse - Shop Cidade de São Paulo");
        restaurante3.setEndereco("Av. Paulista, 1230");
        restaurante3.setHorarioFuncionamento("Aberto das 12h as 17h");
        restaurante3.setFotoRestaurante(R.drawable.outback);
        listaRestaurantes.add(restaurante3);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);
        listaRestaurantes.add(restaurante);


        RestaurateAdapter restaurateAdapter = new RestaurateAdapter(listaRestaurantes, this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);

        RecyclerView recyclerView = findViewById(R.id.container_recycler_restaurante_id);
        recyclerView.setAdapter(restaurateAdapter);
        recyclerView.setLayoutManager(layoutManager);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings_id) {
            irParaRegister();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    private void irParaRegister() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public void onRestauranteClicado(Restaurante restaurante) {

        Intent intent = new Intent(this, PratosActivity.class);

        Bundle bundle = new Bundle();
        bundle.putSerializable("RESTAURANTE",restaurante);

        intent.putExtras(bundle);

        startActivity(intent);

    }

}
