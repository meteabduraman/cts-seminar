package ro.ase.cts.chain.clase;

public class ContEconomii extends Cont {

	public ContEconomii(String detinator, float sold) {
		super(detinator, sold);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void plateste(float suma) {
		
		if (super.getSold() >= suma) {
			super.setSold(super.getSold() - suma);
			System.out.println("CONT ECONOMII: Suma de " + suma + " lei a fost platita");
		} else {
			super.getSuccesor().plateste(suma);
		}
		
	}

}
