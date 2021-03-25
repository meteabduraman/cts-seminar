package ro.ase.cts.factorymethod.clase;

public class MijlocasFactory implements JucatorFactory{

	@Override
	public Jucator createJucator(String nume) {
		// TODO Auto-generated method stub
		return new Mijlocas(nume);
	}

}
