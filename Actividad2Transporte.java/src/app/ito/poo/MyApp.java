package app.ito.poo;

import clases.ito.poo.Transporte;
import clases.ito.poo.Viaje;
import java.time.LocalDate;

public class MyApp {
	
	static void run() {
		Transporte t1 = new Transporte("volteo", "7m3", 20, LocalDate.of(2016, 11, 14));
		System.out.println(t1);
		System.out.println();
		Viaje v1 = new Viaje("Ciudad Mendoza","Av. IgnacioZaragoza#44, La tregua, 95000 Boca del Río, Ver.",
				LocalDate.of(2021, 1, 4), LocalDate.of(2021, 1, 10), "Juguetes", 20000);
		Viaje v2 = new Viaje("Boca del rio","AUTOPISTA Ciudad Mendoza-Boca del Río KM 6 S/N ESQ AV 21, La tregua, 95000 Boca del Río, Ver.",
				LocalDate.of(2021, 4, 24), LocalDate.of(2021, 4, 26), "cemento", 27600);
		t1.addViaje(v1);
		t1.addViaje(v2);
		System.out.println(t1);
		t1.elimViaje(v1);
		System.out.println();
		System.out.println(t1);
		} 

	public static void main(String[] args) {
		run();
	}

}
