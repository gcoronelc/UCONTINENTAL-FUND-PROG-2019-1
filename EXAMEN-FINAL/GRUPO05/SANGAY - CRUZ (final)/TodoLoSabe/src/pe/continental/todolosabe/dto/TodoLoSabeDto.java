/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.todolosabe.dto;

/**
 *
 * @author SANGAY
 */
public class TodoLoSabeDto {
    
    // Datos
    private String curso;
    private String nivel;
    private int vacantes;
   
    
    // Resultado Ingresos
    private double ingreso;
    
    // Resultado Gastos
    private double remuneracion;
    private double publicidad;
    private double logistica;
    private double material;
    private double gastoTotal;
    
    // Resultado Utilidad
    private double utilidad;
    
    
    // Insertando Código

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(double remuneracion) {
        this.remuneracion = remuneracion;
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

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

    
}
