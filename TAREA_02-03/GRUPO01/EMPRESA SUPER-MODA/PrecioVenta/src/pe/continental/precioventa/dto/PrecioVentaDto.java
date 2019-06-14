
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.precioventa.dto;

/**
 *
 * @author Angie
 */
public class PrecioVentaDto {


    // Datos:
    public int tamañoLote;
    public double precioLote;
    public double gastos;
    public double ganancia;
  
    
    // Resultados:
    public double totalUnidades;
    public double costoTotal;
    public double costoUnidad;
    public double precioVenta;
    public double precioPublico;
    public int setTamañoLote;

    public int getTamañoLote() {
        return tamañoLote;
    }

    public void setTamañoLote(int tamañoLote) {
        this.tamañoLote = tamañoLote;
    }

    public double getPrecioLote() {
        return precioLote;
    }

    public void setPrecioLote(double precioLote) {
        this.precioLote = precioLote;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getGanancia() {
        return ganancia;
    }

    public void setGanancia(double ganancia) {
        this.ganancia = ganancia;
    }

    public double getTotalUnidades() {
        return totalUnidades;
    }

    public void setTotalUnidades(double totalUnidades) {
        this.totalUnidades = totalUnidades;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getCostoUnidad() {
        return costoUnidad;
    }

    public void setCostoUnidad(double costoUnidad) {
        this.costoUnidad = costoUnidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public double getPrecioPublico() {
        return precioPublico;
    }

    public void setPrecioPublico(double precioPublico) {
        this.precioPublico = precioPublico;
    }
    
    
    
}
