package com.example.apprestaurante;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RestauranteAdapter restauranteAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Restaurante> restauranteList = new ArrayList<>();
        /**
        restauranteList.add(new Restaurante("Restaurante A"));
        restauranteList.add(new Restaurante("Restaurante B"));
        restauranteList.add(new Restaurante("Restaurante C"));
        restauranteList.add(new Restaurante("Restaurante D"));
        **/

        restauranteList.add(new Restaurante("Restaurante A", 0.0, R.drawable.burguer, "Descripción A"));
        restauranteList.add(new Restaurante("Restaurante B", 0.0, R.drawable.tacos, "Descripción B"));
        restauranteList.add(new Restaurante("Restaurante C", 0.0, R.drawable.pizza, "Descripción C"));

        // Pasar el contexto actual a RestauranteAdapter
        restauranteAdapter = new RestauranteAdapter(restauranteList, this);
        recyclerView.setAdapter(restauranteAdapter);
    }
}