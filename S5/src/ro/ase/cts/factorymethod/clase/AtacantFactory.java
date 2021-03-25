package ro.ase.cts.factorymethod.clase;

public class AtacantFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		return new Atacant(nume);
	}

}
