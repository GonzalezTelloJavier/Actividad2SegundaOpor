package clases.ito.poo;

import java.time.LocalDate;

public class Composici�n {
	
	private String titulo = "";
	private int minutos = 0;
	private int segundos =0;
	private String solicitantes ="";
	private String generoMusical ="";
	private LocalDate fechaRegistro = null;
	private LocalDate fechaEstreno = null;
	
	
	
	public Composici�n(String titulo, String solicitantes, String generoMusical,
			LocalDate fechaEstreno, LocalDate fechaRegistro, int minutos, int segundos) {
		super();
	
		this.titulo = titulo;
		this.minutos = minutos;
		this.segundos = segundos;
		this.solicitantes = solicitantes;
		this.generoMusical = generoMusical;
		this.fechaEstreno = fechaEstreno;
		this.fechaRegistro = fechaRegistro;
	}
	
	public boolean AgregarInterpret(String a) {
		boolean agregar=false;
		if(a!=null&&!a.equalsIgnoreCase("")) {
			this.solicitantes=a;
			agregar=true;
			
		}else
			agregar=false;
		return agregar;
	}
	
	public boolean EliminarInterpret(String a) {
		boolean elimina=false;
		if(a.equalsIgnoreCase("si")) {
			this.solicitantes="";
			elimina=true;
		}else
			elimina=false;
		return elimina;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}

	public String getSolicitantes() {
		return solicitantes;
	}

	public void setSolicitantes(String solicitantes) {
		this.solicitantes = solicitantes;
	}

	public String getGeneroMusical() {
		return generoMusical;
	}

	public void setGeneroMusical(String generoMusical) {
		this.generoMusical = generoMusical;
	}

	public LocalDate getFechaEstreno() {
		return fechaEstreno;
	}

	public void setFechaEstreno(LocalDate fechaEstreno) {
		this.fechaEstreno = fechaEstreno;
	}

	public LocalDate getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(LocalDate fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	@Override
	public String toString() {
		return "Composici�n [titulo=" + titulo + ", minutos=" + minutos + ", segundos=" + segundos + ", solicitantes="
				+ solicitantes + ", generoMusical=" + generoMusical + ", fechaRegistro=" + fechaRegistro
				+ ", fechaEstreno=" + fechaEstreno + "]";
	}
	
	public int compareTo(Composici�n o) {
		int compare=0;
		if (!this.titulo.equalsIgnoreCase(o.getTitulo()))
			compare=-1;
		else if(this.titulo.equalsIgnoreCase(o.getTitulo()))
			compare=1;
		return compare;
		
	}

}


