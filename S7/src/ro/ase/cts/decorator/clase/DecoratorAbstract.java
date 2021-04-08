package ro.ase.cts.decorator.clase;

public abstract class DecoratorAbstract implements IBilet{
	private IBilet biletAbstract;

	public DecoratorAbstract(IBilet biletAbstract) {
		super();
		this.biletAbstract = biletAbstract;
	}

	@Override
	public void rezervaBilet() {
		biletAbstract.rezervaBilet();
	}

	public IBilet getBiletAbstract() {
		return biletAbstract;
	}
	
	
}
