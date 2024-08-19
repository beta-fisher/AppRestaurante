package com.example.apprestaurante;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ItemDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        TextView textViewName = findViewById(R.id.textViewItemName);
        ImageView imageViewItem = findViewById(R.id.imageViewItem);
        TextView textViewPrice = findViewById(R.id.textViewItemPrice);
        TextView textViewDescription = findViewById(R.id.textViewItemDescription);

        // Obtener los datos del Intent
        String name = getIntent().getStringExtra("item_name");
        double price = getIntent().getDoubleExtra("item_price", 0);
        int imageResId = getIntent().getIntExtra("item_image", R.drawable.ic_launcher_foreground);
        String description = getIntent().getStringExtra("item_description");

        // Configurar los elementos con los datos recibidos
        textViewName.setText(name);
        textViewPrice.setText("$ " + String.format("%.2f", price));
        imageViewItem.setImageResource(imageResId);
        textViewDescription.setText(description);
    }
}
