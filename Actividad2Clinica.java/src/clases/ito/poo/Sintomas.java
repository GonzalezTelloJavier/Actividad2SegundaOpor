package clases.ito.poo;

import java.util.HashSet;

public class Sintomas {

	private float temperatura = 0F;
	private float estatura = 0F;
	private float peso = 0F;
	private HashSet<String> sintomas = new HashSet<String>();

	public Sintomas() {
		super();
	}

	public Sintomas(float temperatura, float estatura, float peso) {
		super();
		this.temperatura = temperatura;
		this.estatura = estatura;
		this.peso = peso;
	}

	//============================================
	public boolean addSintomas(String newSintoma) {
		boolean addSintomas = false;
		addSintomas = this.sintomas.add(newSintoma);
		return addSintomas;
	}

	//============================================
	public float getTemperatura() {
		return this.temperatura;
	}

	//============================================
	public void setTemperatura(float newTemperatura) {
		this.temperatura = newTemperatura;
	}

	//============================================
	public float getEstatura() {
		return this.estatura;
	}

	//============================================
	public void setEstatura(float newEstatura) {
		this.estatura = newEstatura;
	}

	//============================================
	public float getPeso() {
		return this.peso;
	}

	//============================================
	public void setPeso(float newPeso) {
		this.peso = newPeso;
	}

	//============================================
	public HashSet<String> getSintomas() {
		return this.sintomas;
	}

	@Override
	public String toString() {
		return "\nTemperatura: " + temperatura + "\nEstatura: " + estatura + "\nPeso: " + peso + "\nSintomas: "
				+ sintomas;
	}

}
