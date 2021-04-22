package ro.ase.cts.strategy.clase;

public class Cash implements ModalitatePlata {

	@Override
	public void achita(float suma) {

		System.out.println("S-a realizat plata CASH pentru suma " + suma + " lei");
	}

}
