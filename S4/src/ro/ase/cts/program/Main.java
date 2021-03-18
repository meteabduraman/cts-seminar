package ro.ase.cts.program;

import ro.ase.cts.clase.Amenda;
import ro.ase.cts.clase.ManagerSpital;
import ro.ase.cts.clase.ManagerSpitalLazy;

public class Main {

	public static void main(String[] args) {
		
		ManagerSpital m1 = ManagerSpital.getInstance();
		ManagerSpital m2 = ManagerSpital.getInstance();
		
		ManagerSpitalLazy m3 = ManagerSpitalLazy.getInstance("Alexa", 46, 2350);
		ManagerSpitalLazy m4 = ManagerSpitalLazy.getInstance("Bianca", 50, 4532);
		
		m3.setVarsta(20);
		m3.setNume("Ionel");
		
		System.out.println("Eager initialization >> \n");
		System.out.println(m1.toString());
		System.out.println(m2.toString());
		System.out.println("\nLazy initialization >> \n");
		System.out.println(m3.toString());
		System.out.println(m4.toString());
		
		System.out.println("\n---------------------------\n");
		
		Amenda a1 = Amenda.getInstance("SECTOR 1", "Gigel Gigelovici", 500);
		Amenda a2 = Amenda.getInstance("CONSTANTA", "Ionel Ionelovici", 300);
		
		a1.setSuma(3500);
		a1.setSectiePolitie("SECTOR 6");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
	}

}
