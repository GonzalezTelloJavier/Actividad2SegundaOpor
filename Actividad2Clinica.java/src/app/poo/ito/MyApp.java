package app.poo.ito;
import java.time.LocalDate;

import clases.ito.poo.Expedientes;
import clases.ito.poo.Sintomas;

public class MyApp {
	
	static void run() {
		Sintomas s1 = new Sintomas(37F, 165F, 58F);
		s1.addSintomas("Febricula");
		s1.addSintomas("Irritacion en anginas");
		s1.addSintomas("vomito");
		Expedientes e1 = new Expedientes("Francisco Javier", "GOTF020819HVZNLRA8", LocalDate.of(2002, 8, 19), s1);
		System.out.println(e1);
		e1.addConsulta(LocalDate.of(2019, 8, 7));
		e1.addConsulta(LocalDate.of(2021, 5, 4));
		e1.addDiagnostico("Resfriado con infeccion estomacal");
		e1.addReceta("Paracetamol");
		System.out.println();
		System.out.println(e1);
	}

	public static void main(String[] args) {
		run();
	}

}
