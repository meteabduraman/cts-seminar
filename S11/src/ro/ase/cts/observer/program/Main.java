package ro.ase.cts.observer.program;

import ro.ase.cts.observer.clase.Client;
import ro.ase.cts.observer.clase.ManagerSala;
import ro.ase.cts.observer.clase.Subiect;

public class Main {

	public static void main(String[] args) {
		
		ManagerSala manager = new ManagerSala();
		Client client1 = new Client("Judy");
		Client client2 = new Client("Bob");
		Client client3 = new Client("Arwa");
		
		manager.adaugaObserver(client1);
		manager.adaugaObserver(client2);
		manager.adaugaObserver(client3);
		
		manager.anuntaMeciFotbal();
		
		manager.stergeObserver(client2);
		
		manager.anuntaMeciHandbal();

	}

}
