package app.ito.poo;

import clase.ito.poo.Cancion;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Cancion c1 = new Cancion("Bohemian Rhapsody", 5, 55, LocalDate.of(1975, 10, 31), LocalDate.of(1976, 1, 4));
		System.out.println(c1);
		System.out.println(c1.addInterprete("Queen"));
		System.out.println(c1.addInterprete("Brian May"));
		System.out.println(c1.addInterprete("Roger Taylor"));
		System.out.println(c1);
	}

	public static void main(String[] args) {
		run();
	}

}
