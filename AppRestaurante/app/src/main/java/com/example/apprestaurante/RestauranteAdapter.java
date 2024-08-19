package com.example.apprestaurante;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RestauranteAdapter extends RecyclerView.Adapter<RestauranteAdapter.ViewHolder> {


    private List<Restaurante> restauranteList;
    private Context context;

    public RestauranteAdapter(List<Restaurante> restauranteList, Context context) {
        this.restauranteList = restauranteList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_restaurante, parent, false);
        return new ViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurante restaurante = restauranteList.get(position);
        holder.textViewName.setText(restaurante.getNombre());

        // Aquí se maneja el clic en cada elemento del RecyclerView
        holder.itemView.setOnClickListener(view -> {
            Intent intent = new Intent(context, RestauranteDetalleActivity.class);
            intent.putExtra("restaurant_name", restaurante.getNombre());
            context.startActivity(intent);
        });
    }
    /**

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Restaurante restaurante = restauranteList.get(position);
        holder.textViewName.setText(restaurante.getNombre());
        holder.textViewPrice.setText("$ " + String.format("%.2f", restaurante.getPrice()));

        holder.itemView.setOnClickListener(v -> {
            Intent intent = new Intent(context, ItemDetailActivity.class);
            intent.putExtra("item_name", restaurante.getNombre());
            intent.putExtra("item_price", restaurante.getPrice());
            intent.putExtra("item_image", restaurante.getImageResId());
            intent.putExtra("item_description", restaurante.getDescription());
            context.startActivity(intent);
        });
    }
**/
    @Override
    public int getItemCount() {
        return restauranteList.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewName;
        public ViewStructure textViewPrice;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewName = itemView.findViewById(R.id.textViewName);
        }
    }
}