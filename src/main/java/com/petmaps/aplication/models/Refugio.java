package com.petmaps.aplication.models;

public class Refugio {
    private String NombreRefugio;
    private String rfc;
    private String Ubicacion;
    private int Capacidad;

    public Refugio(String nombreRefugio, String rfc, String ubicacion, int capacidad) {
        NombreRefugio = nombreRefugio;
        this.rfc = rfc;
        Ubicacion = ubicacion;
        Capacidad = capacidad;
    }

    public String getNombreRefugio() {
        return NombreRefugio;
    }

    public void setNombreRefugio(String nombreRefugio) {
        NombreRefugio = nombreRefugio;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        Ubicacion = ubicacion;
    }

    public int getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(int capacidad) {
        Capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "\nNombre del Refugio: '" + NombreRefugio + '\'' +
                ", \nUbicacion: '" + Ubicacion + '\'' +
                ", \nCapacidad: " + Capacidad;
    }
}
