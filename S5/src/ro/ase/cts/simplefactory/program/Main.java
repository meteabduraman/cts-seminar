package ro.ase.cts.simplefactory.program;

import ro.ase.cts.simplefactory.clase.Atacant;
import ro.ase.cts.simplefactory.clase.Fundas;
import ro.ase.cts.simplefactory.clase.JucatorFactory;
import ro.ase.cts.simplefactory.clase.TipJucator;

public class Main {

	public static void main(String[] args) {
		
		try {
			Atacant a1 = (Atacant) JucatorFactory.createJucator(TipJucator.ATACANT, "Gigel");
			Fundas f1 = (Fundas) JucatorFactory.createJucator(TipJucator.FUNDAS, "Marin");
			
			System.out.println(a1.toString());
			System.out.println(f1.toString());
		
		} catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
