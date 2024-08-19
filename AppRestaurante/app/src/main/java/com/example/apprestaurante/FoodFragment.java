package com.example.apprestaurante;

import static com.example.apprestaurante.R.id.recyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/**
public class FoodFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.recyclerViewFood);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        List<Restaurante> foodList = new ArrayList<>();
        foodList.add(new Restaurante("Hamburguesa"));
        foodList.add(new Restaurante("Orden de Tacos"));
        foodList.add(new Restaurante("Pizza Familiar"));

        // Aquí utilizas el adaptador RestauranteAdapter
        RestauranteAdapter restauranteAdapter = new RestauranteAdapter(foodList, getContext());
        recyclerView.setAdapter(restauranteAdapter);

        return view;
    }
}
**/

public class FoodFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_food, container, false);
    }
}
