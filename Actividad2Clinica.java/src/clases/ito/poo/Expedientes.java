package clases.ito.poo;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashSet;

public class Expedientes {
	
	private String nombre = "";
	private String rfc = "";
	private LocalDate fechaNacimiento = null;
	private HashSet<LocalDate> fechaConsultas = new HashSet<LocalDate>();
	private Sintomas sintomas = null;
	private HashSet<String> diagnostico = new HashSet<String>();
	private HashSet<String> receta = new HashSet<String>();

	public Expedientes() {
		super();
	}

	public Expedientes(String nombre, String rfc, LocalDate fechaNacimiento, Sintomas sintomas) {
		super();
		this.nombre = nombre;
		this.rfc = rfc;
		this.fechaNacimiento = fechaNacimiento;
		this.sintomas = sintomas;
	}

	//============================================
	public boolean addConsulta(LocalDate fecha) {
		boolean addConsulta = false;
		addConsulta = this.fechaConsultas.add(fecha);
		return addConsulta;
	}
	
	public boolean addDiagnostico(String padecimiento) {
		boolean addDiagnostico = false;
		addDiagnostico = this.diagnostico.add(padecimiento);
		return addDiagnostico;
	}
	
	public boolean addReceta(String medicamento) {
		boolean addReceta = false;
		addReceta = this.receta.add(medicamento);
		return addReceta;
	}

	public int calculaEdad() {
		int calculaEdad = 0;
		Period edad = Period.between(this.fechaNacimiento, LocalDate.now());
		calculaEdad = edad.getYears();
		return calculaEdad;
	}

	//============================================
	public String getNombre() {
		return this.nombre;
	}

	//============================================
	public void setNombre(String newNombre) {
		this.nombre = newNombre;
	}

	//============================================
	public String getRfc() {
		return this.rfc;
	}

	//============================================
	public void setRfc(String newRfc) {
		this.rfc = newRfc;
	}

	//============================================
	public LocalDate getFechaNacimiento() {
		return this.fechaNacimiento;
	}

	//============================================
	public void setFechaNacimiento(LocalDate newFechaNacimiento) {
		this.fechaNacimiento = newFechaNacimiento;
	}

	//============================================
	public HashSet<LocalDate> getFechaConsultas() {
		return this.fechaConsultas;
	}

	//============================================
	public Sintomas getSintomas() {
		return this.sintomas;
	}

	//============================================
	public void setSintomas(Sintomas newSintomas) {
		this.sintomas = newSintomas;
	}

	//============================================
	public HashSet<String> getDiagnostico() {
		return this.diagnostico;
	}

	//============================================
	public HashSet<String> getReceta() {
		return this.receta;
	}

	@Override
	public String toString() {
		return "Expediente de: " + nombre + "\nRFC: " + rfc + "\nFecha de Nacimiento: " + fechaNacimiento
				+ "\nUltimas consultas: " + fechaConsultas + sintomas + "\nDiagnostico: " + diagnostico
				+ "\nReceta: " + receta;
	}
	

}
