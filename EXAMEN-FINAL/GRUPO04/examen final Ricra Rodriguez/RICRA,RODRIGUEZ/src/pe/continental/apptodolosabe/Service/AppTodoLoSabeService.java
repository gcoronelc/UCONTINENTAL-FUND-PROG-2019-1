package pe.continental.apptodolosabe.Service;

import pe.continental.apptodolosabe.dto.AppTodoLoSabeDto;

public class AppTodoLoSabeService {
	//constante de desarrolladores web

	public static final String PHP = "PHP";
	public static final String JAVA = "JAVA";
	public static final String SPRINGFRAMEWORK = "SPRING FRAMEWORK";
	public static final String REST = "REST";
	//constante nivel
	public static final String BASICO = "BASICO";
	public static final String INTERMEDIO = "INTERMEDIO";
	public static final String AVANZADO = "AVANZADO";

	public static AppTodoLoSabeDto calcular(AppTodoLoSabeDto dto) {
		// paso 1:
		double duracion = calcularDuracion(dto.getNivel());
		double costo = calcularCosto(dto.getNivel());
		double pagoHora = calcularPagoHora(dto.getNivel());
		//paso 2 calculo de ingreso:
		double ingreso = costo * dto.getCantidad();
		//paso 3 calculo de gastos:
		double publicidad = ingreso * 0.07;
		double logistica = ingreso * 0.08;
		double material = ingreso * 0.06;
		double pagoProfesor = duracion * pagoHora;
		double gasto = publicidad + logistica + material + pagoProfesor;
		//paso 4 calculo de utilidad
		double utilidad = ingreso - gasto;

		//reporte
		dto.setDuracion(Truncar2Dec(duracion));
		dto.setCosto(Truncar2Dec(costo));
		dto.setIngreso(Truncar2Dec(ingreso));
		dto.setPublicidad(Truncar2Dec(publicidad));
		dto.setLogistica(Truncar2Dec(logistica));
		dto.setMaterial(Truncar2Dec(material));
		dto.setPagoProfesor(Truncar2Dec(pagoProfesor));
		dto.setGastos(Truncar2Dec(gasto));
		dto.setUtilidad(Truncar2Dec(utilidad));
		return dto;
	}

	private static double calcularDuracion(String nivel) {
		int duracion = 0;
		switch (nivel) {
			case BASICO:
				duracion = 24; //horas
				break;
			case INTERMEDIO:
				duracion = 30; //horas
				break;
			case AVANZADO:
				duracion = 40; //horas
		}
		return duracion;
	}

	private static double calcularCosto(String nivel) {
		int costo = 0;
		switch (nivel) {
			case BASICO:
				costo = 500; //soles
				break;
			case INTERMEDIO:
				costo = 700; //soles
				break;
			case AVANZADO:
				costo = 900; //soles

		}
		return costo;
	}

	private static double calcularPagoHora(String nivel) {
		int pagoHora = 0;
		switch (nivel) {
			case BASICO:
				pagoHora = 60; //pago x horas
				break;
			case INTERMEDIO:
				pagoHora = 80; //pago x horas
				break;
			case AVANZADO:
				pagoHora = 100; //pago x horas
				break;

		}
		return pagoHora;
	}

	public static double Truncar2Dec(double dato) {

		dato = dato * 100;
		dato = Math.round(dato) * 1.0;
		dato = dato / 100.0;
		// Reporte
		return dato;
	}

}
