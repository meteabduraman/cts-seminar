package ro.ase.cts.decorator.clase;

public class DecoratorCuMesajSustinere extends DecoratorAbstract {

	public DecoratorCuMesajSustinere(IBilet biletAbstract) {
		super(biletAbstract);
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("Mult succes, " +
		((Bilet)super.getBiletAbstract()).getNumeGazda());
	}

}
