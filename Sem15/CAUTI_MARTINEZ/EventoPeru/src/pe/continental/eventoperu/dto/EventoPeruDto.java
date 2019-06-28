package pe.continental.eventoperu.dto;

/**
 *
 * @author Angie Cauti
 * @email 74972442@continental.edu.pe
 */
public class EventoPeruDto {

    // DATOS:
    private int capacidad;
    private String categoria;
    private String ubicacion;

    // RESULTADOS:
    private double ingresos;
    private double publicidad;
    private double logistica;
    private double transporte;
    private double pagoArtista;
    private double gastos;
    private double rentabilidad;

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getIngresos() {
        return ingresos;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
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

    public double getTransporte() {
        return transporte;
    }

    public void setTransporte(double transporte) {
        this.transporte = transporte;
    }

    public double getPagoArtista() {
        return pagoArtista;
    }

    public void setPagoArtista(double pagoArtista) {
        this.pagoArtista = pagoArtista;
    }

    public double getGastos() {
        return gastos;
    }

    public void setGastos(double gastos) {
        this.gastos = gastos;
    }

    public double getRentabilidad() {
        return rentabilidad;
    }

    public void setRentabilidad(double rentabilidad) {
        this.rentabilidad = rentabilidad;
    }

}
