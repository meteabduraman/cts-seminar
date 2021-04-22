package ro.ase.cts.state.program;

import ro.ase.cts.state.clase.Masa;

public class Main {

	public static void main(String[] args) {
		
		Masa masa = new Masa(20);
		
		masa.rezerva();
		masa.ocupa();
		masa.rezerva();
		masa.elibereaza();

	}

}
