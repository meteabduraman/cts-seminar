package ro.ase.cts.memento.program;

import ro.ase.cts.memento.clase.ManagerMeciuriJucate;
import ro.ase.cts.memento.clase.MeciJucat;

public class Main {

	public static void main(String[] args) {
		MeciJucat meci1 = new MeciJucat("Steaua", "Dinamo", 500, 500, 100, 10);
		
		ManagerMeciuriJucate manager = new ManagerMeciuriJucate();
		
		manager.adaugaMemento(meci1.salvareInformatii());
		
		meci1.setNrSpectatori(300);
		meci1.setNumeGazde("Chiajna");
		meci1.setNumeOaspeti("Chindia");
		
		manager.adaugaMemento(meci1.salvareInformatii());
		
		System.out.println(meci1.toString());
		
		meci1.revenire(manager.getMemento(0));
		
		System.out.println(meci1.toString());

	}

}
