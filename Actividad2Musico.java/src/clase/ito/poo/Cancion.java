package clase.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

public class Cancion {

	private String titulo = "";
	private int duracionM = 0;
	private int duracionS = 0;
	private HashSet<String> solicitudesInterpretes = new HashSet<String>();
	private LocalDate fechaRegistro = null;
	private LocalDate fechaEstreno = null;

	public Cancion() {
		super();
	}

	public Cancion(String titulo, int duracionM, int duracionS, LocalDate fechaRegistro, LocalDate fechaEstreno) {
		super();
		this.titulo = titulo;
		this.duracionM = duracionM;
		this.duracionS = duracionS;
		this.fechaRegistro = fechaRegistro;
		this.fechaEstreno = fechaEstreno;
	}

	//======================================
	public boolean addInterprete(String nombre) {
		boolean addInterprete = false;
		addInterprete = this.solicitudesInterpretes.add(nombre);
		return addInterprete;
	}

	//======================================
	public String getTitulo() {
		return this.titulo;
	}

	//======================================
	public void setTitulo(String newTitulo) {
		this.titulo = newTitulo;
	}

	//======================================
	public int getDuracionM() {
		return this.duracionM;
	}

	//======================================
	public void setDuracionM(int newDuracionM) {
		this.duracionM = newDuracionM;
	}

	//======================================
	public int getDuracionS() {
		return this.duracionS;
	}

	//======================================
	public void setDuracionS(int newDuracionS) {
		this.duracionS = newDuracionS;
	}

	//======================================
	public HashSet<String> getSolicitudesInterpretes() {
		return this.solicitudesInterpretes;
	}

	//======================================
	public LocalDate getFechaRegistro() {
		return this.fechaRegistro;
	}

	//======================================
	public void setFechaRegistro(LocalDate newFechaRegistro) {
		this.fechaRegistro = newFechaRegistro;
	}

	//======================================
	public LocalDate getFechaEstreno() {
		return this.fechaEstreno;
	}

	//======================================
	public void setFechaEstreno(LocalDate newFechaEstreno) {
		this.fechaEstreno = newFechaEstreno;
	}

	@Override
	public String toString() {
		return "CANCION: " + titulo + "\nDuracion: " + duracionM + ":" + duracionS
				+ "\nSolicitudes de Interpretes: " + solicitudesInterpretes + "\nFecha de Registro: " + fechaRegistro
				+ "\nFecha de Estreno: " + fechaEstreno ;
	}
	

}
