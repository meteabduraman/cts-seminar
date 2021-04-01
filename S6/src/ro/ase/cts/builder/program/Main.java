package ro.ase.cts.builder.program;

import ro.ase.cts.builder.clase.BuilderRezervare;
import ro.ase.cts.builder.clase.BuilderRezervareV2;
import ro.ase.cts.builder.clase.Rezervare;

public class Main {

	public static void main(String[] args) {
		
		Rezervare rezervare1 = new BuilderRezervare().build();
		Rezervare rezervare2 = new BuilderRezervare()
				.setCodRezervare(100)
				.setAreBauturaInclusa(true)
				.setAreMancareInclusa(true)
				.setAreMuzicaPersonalizata(false)
				.setAreScaunErgonomic(true)
				.setGenMuzical("ROCK")
				.build();
		
		System.out.println(rezervare1.toString());
		System.out.println(rezervare2.toString());
		
		BuilderRezervareV2 builder2 = new BuilderRezervareV2();
		Rezervare rezervare3 = builder2.build();
		Rezervare rezervare4 = builder2
				.setCodRezervare(100)
				.setAreBauturaInclusa(true)
				.setAreMancareInclusa(true)
				.setAreMuzicaPersonalizata(false)
				.setAreScaunErgonomic(true)
				.setGenMuzical("ROCK")
				.build();
		
		System.out.println(rezervare3.toString());
		System.out.println(rezervare4.toString());

	}

}
