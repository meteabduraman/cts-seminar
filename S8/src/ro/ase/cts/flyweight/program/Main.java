package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.Client;
import ro.ase.cts.flyweight.clase.FabricaFlyweight;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new Rezervare(3, 4, 1);
		Rezervare rezervare2 = new Rezervare(2, 5, 2);
		Rezervare rezervare3 = new Rezervare(6, 2, 3);
		
		FabricaFlyweight fabrica = new FabricaFlyweight();
		
		Client client1 = (Client) fabrica.getClient("0780000000");
		Client client2 = (Client) fabrica.getClient("0781111111");
		
		client1.afiseazaInformatii(rezervare1);
		client2.afiseazaInformatii(rezervare2);
		
		fabrica.getClient("0780000000").afiseazaInformatii(rezervare3);
		
		
	}

}
