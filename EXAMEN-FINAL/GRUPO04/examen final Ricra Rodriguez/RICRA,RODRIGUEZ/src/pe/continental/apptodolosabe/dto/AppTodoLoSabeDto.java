/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.apptodolosabe.dto;


public class AppTodoLoSabeDto {
    //datos
    private int cantidad;
    private String curso;
    private String nivel;
   
    //resultados
    
    private double duracion;
    private double costo;
    private double pagoHora;
    private double ingreso;
   
    private double pagoProfesor;
    private double publicidad;
    private double logistica;
    private double material;
    private double gastos;
    private double utilidad;

    public double getPagoProfesor() {
        return pagoProfesor;
    }

    public void setPagoProfesor(double pagoProfesor) {
        this.pagoProfesor = pagoProfesor;
    }

    public double getPagoHora() {
        return pagoHora;
    }

    public void setPagoHora(double pagoHora) {
        this.pagoHora = pagoHora;
    }
    
    
 public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    
    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
 public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }
    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getPublicidad() {
        return publicidad;
    }

    public void setPublicidad(double publicidad) {
        this.publicidad = publicidad;
    }

    public double getLogistica() {
        return logistica;
    }

    public void setLogistica(double logistica) {
        this.logistica = logistica;
    }

    public double getMaterial() {
        return material;
    }

    public void setMaterial(double material) {
        this.material = material;
    }
    
    
}
