package pe.continental.boleta.dto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 * @youtube www.youtube.com/c/DesarrollaSoftware
 */
public class BoletaDto {

  // Datos de Entrada
  private int dias;
  private int feriados;
  private double costoPasaje;
  private double pagoDia;
  private double ventaMes;

  // Resultado Ingresos
  private double sueldoBruto;
  private double sueldoFeriado;
  private double comision;
  private double sueldoImponible;
  private double transporte;
  private double totalIngresos;

  // Resultado Descuentos
  private double afpFondo;
  private double afpSeguro;
  private double afpComision;
  private double dctoTotal;

  // Aportes
  private double essalud;

  // Otros
  private double sueldoNeto;

  public int getDias() {
    return dias;
  }

  public void setDias(int dias) {
    this.dias = dias;
  }

  public int getFeriados() {
    return feriados;
  }

  public void setFeriados(int feriados) {
    this.feriados = feriados;
  }

  public double getCostoPasaje() {
    return costoPasaje;
  }

  public void setCostoPasaje(double costoPasaje) {
    this.costoPasaje = costoPasaje;
  }

  public double getPagoDia() {
    return pagoDia;
  }

  public void setPagoDia(double pagoDia) {
    this.pagoDia = pagoDia;
  }

  public double getVentaMes() {
    return ventaMes;
  }

  public void setVentaMes(double ventaMes) {
    this.ventaMes = ventaMes;
  }

  public double getSueldoBruto() {
    return sueldoBruto;
  }

  public void setSueldoBruto(double sueldoBruto) {
    this.sueldoBruto = sueldoBruto;
  }

  public double getSueldoFeriado() {
    return sueldoFeriado;
  }

  public void setSueldoFeriado(double sueldoFeriado) {
    this.sueldoFeriado = sueldoFeriado;
  }

  public double getComision() {
    return comision;
  }

  public void setComision(double comision) {
    this.comision = comision;
  }

  public double getSueldoImponible() {
    return sueldoImponible;
  }

  public void setSueldoImponible(double sueldoImponible) {
    this.sueldoImponible = sueldoImponible;
  }

  public double getTransporte() {
    return transporte;
  }

  public void setTransporte(double transporte) {
    this.transporte = transporte;
  }

  public double getTotalIngresos() {
    return totalIngresos;
  }

  public void setTotalIngresos(double totalIngresos) {
    this.totalIngresos = totalIngresos;
  }

  public double getAfpFondo() {
    return afpFondo;
  }

  public void setAfpFondo(double afpFondo) {
    this.afpFondo = afpFondo;
  }

  public double getAfpSeguro() {
    return afpSeguro;
  }

  public void setAfpSeguro(double afpSeguro) {
    this.afpSeguro = afpSeguro;
  }

  public double getAfpComision() {
    return afpComision;
  }

  public void setAfpComision(double afpComision) {
    this.afpComision = afpComision;
  }

  public double getDctoTotal() {
    return dctoTotal;
  }

  public void setDctoTotal(double dctoTotal) {
    this.dctoTotal = dctoTotal;
  }

  public double getEssalud() {
    return essalud;
  }

  public void setEssalud(double essalud) {
    this.essalud = essalud;
  }

  public double getSueldoNeto() {
    return sueldoNeto;
  }

  public void setSueldoNeto(double sueldoNeto) {
    this.sueldoNeto = sueldoNeto;
  }

}
