package ro.ase.cts.chain.program;

import ro.ase.cts.chain.clase.Cont;
import ro.ase.cts.chain.clase.ContCredit;
import ro.ase.cts.chain.clase.ContCurent;
import ro.ase.cts.chain.clase.ContEconomii;
import ro.ase.cts.chain.clase.ContIndisponibil;

public class Main {

	public static void main(String[] args) {
		Cont contCurent = new ContCurent("Ion", 200);
		Cont contEconomii = new ContEconomii("Ion", 500);
		Cont contCredit = new ContCredit("Ion", 700);
		Cont contIndisponibil = new ContIndisponibil("Ion");
		
		contCurent.setSuccesor(contEconomii);
		contEconomii.setSuccesor(contCredit);
		contCredit.setSuccesor(contIndisponibil);
		
		contCurent.plateste(100);
		contCurent.plateste(300);
		contCurent.plateste(600);
		contCurent.plateste(800);
	}
}
