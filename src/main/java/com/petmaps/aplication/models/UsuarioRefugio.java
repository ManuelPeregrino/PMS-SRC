package com.petmaps.aplication.models;

public class UsuarioRefugio extends Usuario{

    private String NombreRefugio;
    private String rfc;
    private String Ubicacion;
    protected int Capacidad;

    public UsuarioRefugio(String nombre, String username, String password,
                   String nombreRefugio, String rfc, String ubicacion, int capacidad) {
        super( nombre,  username,  password);
        this.NombreRefugio = nombreRefugio;
        this.rfc = rfc;
        this.Ubicacion = ubicacion;
        this.Capacidad = capacidad;

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
        return super.toString() +"UsuarioRefugio{" +
                "NombreRefugio='" + NombreRefugio + '\'' +
                ", rfc='" + rfc + '\'' +
                ", Ubicacion='" + Ubicacion + '\'' +
                ", Capacidad=" + Capacidad +
                '}';
    }
}
