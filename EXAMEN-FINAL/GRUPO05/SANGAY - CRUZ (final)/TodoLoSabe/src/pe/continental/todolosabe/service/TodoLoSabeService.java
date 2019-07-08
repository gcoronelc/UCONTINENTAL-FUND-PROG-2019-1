/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.continental.todolosabe.service;

import pe.continental.todolosabe.dto.TodoLoSabeDto;

/**
 *
 * @author SANGAY
 */
public class TodoLoSabeService {

	// Constantes del Nombre del Curso
	public static final String PHP = "PHP";
	public static final String JAVA = "JAVA";
	public static final String SPRINGFRAMEWORK = "SPRING FRAMEWORK";
	public static final String ANGULARyREST = "ANGULAR Y REST";

	// Constantes del Nivel del Curso
	public static final String BASICO = "BASICO";
	public static final String INTERMEDIO = "INTERMEDIO";
	public static final String AVANZADO = "AVANZADO";

	public static TodoLoSabeDto procesarTodoLoSabe(TodoLoSabeDto dto) {
		// Paso 1: Calculo de ingresos
		double ingreso = calcularIngreso(dto.getNivel(), dto.getVacantes());

		// Paso 2: Calculo de gaastos
		double remuneracion = calcularRemuneracion(dto.getNivel());
		double publicidad = ingreso * 0.07;
		double logistica = ingreso * 0.08;
		double material = ingreso * 0.06;
		double gastoTotal = remuneracion + publicidad + logistica + material;

		// Paso 3: Utilidad
		double utilidad = ingreso - gastoTotal;

		// Paso 4: Reporte
		dto.setIngreso(Trunco2Deci(ingreso));
		dto.setRemuneracion(Trunco2Deci(remuneracion));
		dto.setPublicidad(Trunco2Deci(publicidad));
		dto.setLogistica(Trunco2Deci(logistica));
		dto.setMaterial(Trunco2Deci(material));
		dto.setGastoTotal(Trunco2Deci(gastoTotal));
		dto.setUtilidad(Trunco2Deci(utilidad));
		return dto;

	}

	public static double Trunco2Deci(double dato) {
		// Proceso
		dato = dato * 100;
		dato = Math.round(dato) * 1.0;
		dato = dato / 100.0;
		// Reporte
		return dato;
	}

	private static double calcularIngreso(String nivel, int vacantes) {
		double ingreso = 0.0;
		switch (nivel) {
			case BASICO:
				ingreso = 0;
				ingreso = vacantes * 500.0;
				break;
			case INTERMEDIO:
				ingreso = 0;
				ingreso = vacantes * 700.0;
				break;
			case AVANZADO:
				ingreso = 0;
				ingreso = vacantes * 900.0;
				break;
		}
		return ingreso;

	}

	private static double calcularRemuneracion(String nivel) {
		double remuneracion = 0.0;
		switch (nivel) {
			case BASICO:
				remuneracion = 24 * 60;
				break;
			case INTERMEDIO:
				remuneracion = 30 * 80;
				break;
			case AVANZADO:
				remuneracion = 40 * 100;
				break;
		}
		return remuneracion;
	}

}
