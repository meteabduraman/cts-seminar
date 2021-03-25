package ro.ase.cts.prototype.program;

import ro.ase.cts.prototype.clase.Client;

public class Main {

	public static void main(String[] args) {
		Client client = new Client("Gigel", 30, "Turca", 100);
		Client client2 = (Client) client.cloneaza();
		
		System.out.println(client);
		System.out.println(client2);

	}

}
