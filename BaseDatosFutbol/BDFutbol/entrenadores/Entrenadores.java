package entrenadores;

import java.util.Date;

public class Entrenadores {

	protected String nombre;
	
	protected Date fechaNacimiento;
	
	protected String lugarNacimiento;
	
	protected int partidos;
	
	public String resultadosxTemporadas (int victoriasTemp, int empates, int derrotas) {
		return resultadosxTemporadas(0, 0, 0);
	}
		
	public final double porcentajeVictorias (float porcentaje) {
		int victorias = 0;
		return victorias/100;
	
		
	}
	
	
}
