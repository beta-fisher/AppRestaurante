package com.example.apprestaurante;

public class Restaurante {
    private String nombre;
    private double price;
    private int imageResId;
    private String description;

    public Restaurante(String nombre, double price, int imageResId, String description) {
        this.nombre = nombre;
        this.price = price;
        this.imageResId = imageResId;
        this.description = description;
    }

    public Restaurante(String nombre) {
        this.nombre = nombre;
        this.price = 0.0;
        this.imageResId = 0;
        this.description = "";
    }

        public String getNombre() {
        return nombre;
    }

    public double getPrice() {
        return price;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDescription() {
        return description;
    }
}
