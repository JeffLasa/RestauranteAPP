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

        List<Restaurante>listaRestaurantes=new ArrayList<>();
        List<Prato> listaPratosRestaurante1 = new ArrayList<>();
        List<Prato> listaPratosRestaurante2 = new ArrayList<>();
        List<Prato> listaPratosRestaurante3 = new ArrayList<>();
        List<Prato> listaPratosRestaurante4 = new ArrayList<>();


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
        listaPratosRestaurante2.add(prato3);

        Prato prato4 = new Prato();
        prato4.setFotoPrato(R.drawable.hotroll);
        prato4.setNomePrato("Hot-roll");
        prato4.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante2.add(prato4);

        Prato prato5 = new Prato();
        prato5.setFotoPrato(R.drawable.massas2);
        prato5.setNomePrato("Rondelle ao sugo");
        prato5.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante3.add(prato5);

        Prato prato6 = new Prato();
        prato6.setFotoPrato(R.drawable.massas);
        prato6.setNomePrato("Talharini");
        prato6.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante3.add(prato6);

        Prato prato7 = new Prato();
        prato7.setFotoPrato(R.drawable.outback_steahouse);
        prato7.setNomePrato("Rib Steak");
        prato7.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante4.add(prato7);

        Prato prato8 = new Prato();
        prato8.setFotoPrato(R.drawable.robalo_grelhado);
        prato8.setNomePrato("Robalo Grelhado");
        prato8.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante4.add(prato8);

        Prato prato9 = new Prato();
        prato9.setFotoPrato(R.drawable.sashimi);
        prato9.setNomePrato("Sashimi");
        prato9.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante2.add(prato9);

        Prato prato10 = new Prato();
        prato10.setFotoPrato(R.drawable.sushi);
        prato10.setNomePrato("Sushi");
        prato10.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante2.add(prato10);

        Prato prato11 = new Prato();
        prato11.setFotoPrato(R.drawable.farfala_a_paglia);
        prato11.setNomePrato("Farfala a Paglia");
        prato11.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante3.add(prato11);

        Prato prato12 = new Prato();
        prato12.setFotoPrato(R.drawable.filet_mignon_a_paris);
        prato12.setNomePrato("Filet Mignon à Paris");
        prato12.setDetalhesPrato("Curabitur blandit euismod facilisis euismod consectetur dictum habitasse congue dolor consequat taciti, eleifend nostra lobortis mauris hac torquent ut curae curabitur praesent tempor, facilisis integer blandit libero lacus aenean sit magna neque lacus. ipsum nostra eros mattis praesent elementum auctor ut eros, orci porttitor per et ultricies ante sit per etiam, nullam ut ultrices magna mauris facilisis urna. dapibus donec mattis dictumst diam condimentum mauris donec torquent etiam interdum nec, magna euismod aptent vehicula ullamcorper arcu ullamcorper tristique urna sociosqu nam, rutrum ac pulvinar diam consequat gravida vehicula inceptos rutrum vestibulum.");
        listaPratosRestaurante4.add(prato11);

        Restaurante restaurante1 = new Restaurante();
        restaurante1.setNomeRestaurante("Manguinho's Gourmet");
        restaurante1.setEndereco("Alameda Jau 1650");
        restaurante1.setHorarioFuncionamento("Aberto das 11h as 23h");
        restaurante1.setFotoRestaurante(R.drawable.vojnilo_romero_cruz);
        listaRestaurantes.add(restaurante1);
        restaurante1.getListaPratos().add(prato);
        restaurante1.getListaPratos().add(prato1);
        restaurante1.getListaPratos().add(prato2);
        restaurante1.getListaPratos().add(prato);
        restaurante1.getListaPratos().add(prato1);
        restaurante1.getListaPratos().add(prato2);
        restaurante1.getListaPratos().add(prato);
        restaurante1.getListaPratos().add(prato1);
        restaurante1.getListaPratos().add(prato2);
        restaurante1.getListaPratos().add(prato);
        restaurante1.getListaPratos().add(prato1);
        restaurante1.getListaPratos().add(prato2);



        Restaurante restaurante2 = new Restaurante();
        restaurante2.setNomeRestaurante("Harumi Sushi");
        restaurante2.setEndereco("Avenida Guilherme Giorgi 1280");
        restaurante2.setHorarioFuncionamento("Aberto das 12h as 17h");
        restaurante2.setFotoRestaurante(R.drawable.restaurante_harumi_sushi);
        listaRestaurantes.add(restaurante2);
        restaurante2.getListaPratos().add(prato4);
        restaurante2.getListaPratos().add(prato9);
        restaurante2.getListaPratos().add(prato10);
        restaurante2.getListaPratos().add(prato4);
        restaurante2.getListaPratos().add(prato9);
        restaurante2.getListaPratos().add(prato10);
        restaurante2.getListaPratos().add(prato4);
        restaurante2.getListaPratos().add(prato9);
        restaurante2.getListaPratos().add(prato10);
        restaurante2.getListaPratos().add(prato4);
        restaurante2.getListaPratos().add(prato9);
        restaurante2.getListaPratos().add(prato10);



        Restaurante restaurante3 = new Restaurante();
        restaurante3.setNomeRestaurante("Trattoria Mama Mia");
        restaurante3.setEndereco("Rua 13 de maio 880");
        restaurante3.setHorarioFuncionamento("Aberto das 11h as 23h");
        restaurante3.setFotoRestaurante(R.drawable.massas);
        listaRestaurantes.add(restaurante3);
        restaurante3.getListaPratos().add(prato5);
        restaurante3.getListaPratos().add(prato6);
        restaurante3.getListaPratos().add(prato11);
        restaurante3.getListaPratos().add(prato5);
        restaurante3.getListaPratos().add(prato6);
        restaurante3.getListaPratos().add(prato11);
        restaurante3.getListaPratos().add(prato5);
        restaurante3.getListaPratos().add(prato6);
        restaurante3.getListaPratos().add(prato11);
        restaurante3.getListaPratos().add(prato5);
        restaurante3.getListaPratos().add(prato6);
        restaurante3.getListaPratos().add(prato11);



        Restaurante restaurante4 = new Restaurante();
        restaurante4.setNomeRestaurante("Outback Steakhouse - Shop Cidade de São Paulo");
        restaurante4.setEndereco("Av. Paulista, 1230");
        restaurante4.setHorarioFuncionamento("Aberto das 12h as 17h");
        restaurante4.setFotoRestaurante(R.drawable.outback);
        listaRestaurantes.add(restaurante4);
        restaurante4.getListaPratos().add(prato7);
        restaurante4.getListaPratos().add(prato8);
        restaurante4.getListaPratos().add(prato12);
        restaurante4.getListaPratos().add(prato7);
        restaurante4.getListaPratos().add(prato8);
        restaurante4.getListaPratos().add(prato12);
        restaurante4.getListaPratos().add(prato7);
        restaurante4.getListaPratos().add(prato8);
        restaurante4.getListaPratos().add(prato12);
        restaurante4.getListaPratos().add(prato7);
        restaurante4.getListaPratos().add(prato8);
        restaurante4.getListaPratos().add(prato12);

        listaRestaurantes.add(restaurante4);
        listaRestaurantes.add(restaurante4);
        listaRestaurantes.add(restaurante4);
        listaRestaurantes.add(restaurante4);
        listaRestaurantes.add(restaurante4);



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
