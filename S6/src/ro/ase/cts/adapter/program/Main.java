package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterBilet;
import ro.ase.cts.adapter.clase.Bilet;
import ro.ase.cts.adapter.clase.BiletOnline;

public class Main {
	
	public static void rezervaSiVindeBilet(BiletOnline biletOnline) {
		biletOnline.rezervaBilet();
		biletOnline.vindeBilet();
	}

	public static void main(String[] args) {
		
		Bilet bilet = new Bilet(30);
		BiletOnline biletOnline = new AdapterBilet(40);
		
		rezervaSiVindeBilet(biletOnline);
	}

}
