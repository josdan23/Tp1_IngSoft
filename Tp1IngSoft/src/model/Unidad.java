/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author josdan
 */
public class Unidad {

    private int nroUnidad;
    private int cantAsientos;
    private String dominio;
    private String marca;
    private String tipo;

    public Unidad() {

    }

    public Unidad(int nroUnidad, int cantAsientos, String dominio, String marca, String tipo) {
        this.nroUnidad = nroUnidad;
        this.cantAsientos = cantAsientos;
        this.dominio = dominio;
        this.marca = marca;
        this.tipo = tipo;
    }

    public int getNroUnidad() {
        return nroUnidad;
    }

    public void setNroUnidad(int nroUnidad) {
        this.nroUnidad = nroUnidad;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public String getDominio() {
        return dominio;
    }

    public void setDominio(String dominio) {
        this.dominio = dominio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
