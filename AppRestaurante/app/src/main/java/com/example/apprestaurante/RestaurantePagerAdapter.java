package com.example.apprestaurante;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class RestaurantePagerAdapter extends FragmentStateAdapter {

    public RestaurantePagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new FoodFragment();
            case 1:
                return new DrinksFragment();
            case 2:
                return new SupplementFragment();
            default:
                return new FoodFragment();
        }
    }

    @Override
    public int getItemCount() {
        return 3;  // Número de pestañas
    }
}