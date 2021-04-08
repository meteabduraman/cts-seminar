package ro.ase.cts.decorator.clase;

public class DecoratorMesajLMA extends DecoratorAbstract {

	public DecoratorMesajLMA(IBilet biletAbstract) {
		super(biletAbstract);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void rezervaBilet() {
		super.rezervaBilet();
		System.out.println("La multi ani!");
	}
	
}
