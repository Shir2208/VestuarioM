package shir.modelo;

import shir.prenda.Categoria;
import shir.prenda.TPrenda;
import shir.prenda.region.Estado;

public class Prenda {
    private TPrenda tPrenda;
    private Estado estado;
    private Categoria categoria;
    private double cproduccion;
    private double cventa;
    private double crenta;

    public Prenda (TPrenda tPrenda, Estado estado, Categoria categoria, double costop, double costov, double costpr){
        this.tPrenda = tPrenda;
        this.estado = estado;
        this.categoria = categoria;
        this.cproduccion = costop;
        this.cventa = costov;
        this.crenta = costpr;
    }

    public TPrenda gettPrenda() {
        return tPrenda;
    }

    public Estado getEstado() {
        return estado;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public double getCproduccion() {
        return cproduccion;
    }

    public void setCproduccion(double cproduccion) {
        this.cproduccion = cproduccion;
    }

    public double getCventa() {
        return cventa;
    }

    public void setCventa(double cventa) {
        this.cventa = cventa;
    }

    public double getCrenta() {
        return crenta;
    }

    public void setCrenta(double crenta) {
        this.crenta = crenta;
    }
}
