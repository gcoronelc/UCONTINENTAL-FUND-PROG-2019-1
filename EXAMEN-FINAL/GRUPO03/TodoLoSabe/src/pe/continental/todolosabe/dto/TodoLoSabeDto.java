package pe.continental.todolosabe.dto;

/**
 *
 * @author Angie y Cinthia
 */
public class TodoLoSabeDto {

    // DATOS:
    private String curso;
    private String nivel;
    private int cantidadAlumnos;

    // RESULTADOS:
    private double ingresos;
    private double pagoProfesor;
    private double publicidad;
    private double logistica;
    private double material;
    private double gastos;
    private double utilidad;

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

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public double getPagoProfesor() {
        return pagoProfesor;
    }

    public void setPagoProfesor(double pagoProfesor) {
        this.pagoProfesor = pagoProfesor;
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

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getUtilidad() {
        return utilidad;
    }

    public void setUtilidad(double utilidad) {
        this.utilidad = utilidad;
    }

}
