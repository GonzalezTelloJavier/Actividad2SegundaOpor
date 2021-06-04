package clases.ito.poo;

import java.time.LocalDate;
import java.util.HashSet;

public class Transporte {

	private String marca = "";
	private String modelo = "";
	private float capacidadMaxima = 0F;
	private LocalDate fechaAdquisicion = null;
	private HashSet<Viaje> viajesRealizados = new HashSet<Viaje>();

	public Transporte() {
		super();
	}

	public Transporte(String marca, String modelo, float capacidadMaxima, LocalDate fechaAdquisicion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.capacidadMaxima = capacidadMaxima;
		this.fechaAdquisicion = fechaAdquisicion;
	}

	//========================================
	public boolean addViaje(Viaje newViaje) {
		boolean addViaje = false;
		addViaje = this.viajesRealizados.add(newViaje);
		return addViaje;
	}

	public boolean elimViaje(Viaje viaje) {
		boolean elimViaje = false;
		elimViaje = this.viajesRealizados.remove(viaje);
		return elimViaje;
	}

	//========================================
	public String getMarca() {
		return this.marca;
	}

	//========================================
	public void setMarca(String newMarca) {
		this.marca = newMarca;
	}

	//========================================
	public String getModelo() {
		return this.modelo;
	}

	//========================================
	public void setModelo(String newModelo) {
		this.modelo = newModelo;
	}

	//========================================
	public float getCapacidadMaxima() {
		return this.capacidadMaxima;
	}

	//========================================
	public void setCapacidadMaxima(float newCapacidadMaxima) {
		this.capacidadMaxima = newCapacidadMaxima;
	}

	//========================================
	public LocalDate getFechaAdquisicion() {
		return this.fechaAdquisicion;
	}

	//========================================
	public void setFechaAdquisicion(LocalDate newFechaAdquisicion) {
		this.fechaAdquisicion = newFechaAdquisicion;
	}

	//========================================
	public HashSet<Viaje> getViajesRealizados() {
		return this.viajesRealizados;
	}

	@Override
	public String toString() {
		return "Transporte " + marca + " modelo " + modelo + " \nCapacidad Maxima: " + capacidadMaxima + " TON"
				+ "\nFecha Adquisicion: " + fechaAdquisicion + "\nViajes Realizados: " + viajesRealizados;
	}
	
}
