package com.example.turistiando;

public class Hotel {

    private int fotografia;
    private String nombre;
    private String precio;

    public Hotel(int fotografia, String nombre, String precio) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.precio = precio;
    }


    //ENCAPSULADOS GETTERS *******************************

    public int getFotografia() {
        return fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPrecio() {
        return precio;
    }

    //ENCAPSULADOS SETTERS *******************************


    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }





}
