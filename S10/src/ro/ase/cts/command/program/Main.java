package ro.ase.cts.command.program;

import ro.ase.cts.command.clase.ComandaConstituire;
import ro.ase.cts.command.clase.ComandaDepunere;
import ro.ase.cts.command.clase.ComandaRetragere;
import ro.ase.cts.command.clase.ContBancar;
import ro.ase.cts.command.clase.ManagerComenzi;

public class Main {

	public static void main(String[] args) {
		
		ContBancar cont = new ContBancar("Gigel");
		ManagerComenzi manager = new ManagerComenzi();
		
		manager.invoca(new ComandaConstituire(cont, 300));
		manager.invoca(new ComandaDepunere(cont, 50));
		
		manager.executa();
		
		manager.invoca(new ComandaRetragere(cont, 100));
		
		manager.executa();
		manager.executa();
	}

}
