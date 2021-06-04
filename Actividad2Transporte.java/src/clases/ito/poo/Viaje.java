package clases.ito.poo;

import java.time.LocalDate;

public class Viaje {

	private String destino = "";
	private String direccion = "";
	private LocalDate fechaViaje = null;
	private LocalDate fechaRegreso = null;
	private String descripcionCarga = "";
	private float monto = 0F;

	public Viaje() {
		super();
	}

	public Viaje(String destino, String direccion, LocalDate fechaViaje, LocalDate fechaRegreso,
			String descripcionCarga, float monto) {
		super();
		this.destino = destino;
		this.direccion = direccion;
		this.fechaViaje = fechaViaje;
		this.fechaRegreso = fechaRegreso;
		this.descripcionCarga = descripcionCarga;
		this.monto = monto;
	}

	//========================================
	public String getDestino() {
		return this.destino;
	}

	//========================================
	public void setDestino(String newDestino) {
		this.destino = newDestino;
	}

	//========================================
	public String getDireccion() {
		return this.direccion;
	}

	//========================================
	public void setDireccion(String newDireccion) {
		this.direccion = newDireccion;
	}

	//========================================
	public LocalDate getFechaViaje() {
		return this.fechaViaje;
	}

	//========================================
	public void setFechaViaje(LocalDate newFechaViaje) {
		this.fechaViaje = newFechaViaje;
	}

	//========================================
	public LocalDate getFechaRegreso() {
		return this.fechaRegreso;
	}

	//========================================
	public void setFechaRegreso(LocalDate newFechaRegreso) {
		this.fechaRegreso = newFechaRegreso;
	}

	//========================================
	public String getDescripcionCarga() {
		return this.descripcionCarga;
	}

	//========================================
	public void setDescripcionCarga(String newDescripcionCarga) {
		this.descripcionCarga = newDescripcionCarga;
	}

	//========================================
	public float getMonto() {
		return this.monto;
	}

	//========================================
	public void setMonto(float newMonto) {
		this.monto = newMonto;
	}

	@Override
	public String toString() {
		return " \nDestino: " + destino + "\nDireccion: " + direccion + "\nFecha inicio de Viaje: " + fechaViaje
				+ ", Fecha regreo de Viaje: " + fechaRegreso + "\nCarga: " + descripcionCarga + "\nMonto: " 
				+ monto + " ";
	}

}
