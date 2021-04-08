package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.BazaDeDateHuligani;
import ro.ase.cts.facade.clase.Bilet;
import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.Persoana;
import ro.ase.cts.facade.clase.Politie;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Persoana p1 = new Persoana("Andrei", "2990403132485");
		Bilet b1 = new Bilet("Andrei", 11);
		
		if (p1.getNume().equals(b1.getNume())) {
			if (!Politie.esteUrmarita(p1)) {
				if (!BazaDeDateHuligani.esteInListaDeHuligani(p1)) {
					System.out.println("Poftiti");
				}
			}
		}
		
		System.out.println("----------------------");
		
		Persoana p2 = new Persoana("Ioana", "6000404142577");
		Bilet b2 = new Bilet("Ioana", 45);
		
		if (Facade.sePermiteAccesulPeStadion(p2, b2)) {
			System.out.println("Poftiti");
		} else {
			System.out.println("Ne pare rau, nu aveti voie!");
		}

	}

}
