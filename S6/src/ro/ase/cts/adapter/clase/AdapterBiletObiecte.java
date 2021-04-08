package ro.ase.cts.adapter.clase;

public class AdapterBiletObiecte implements BiletOnline {
	Bilet bilet;
	
	
	public AdapterBiletObiecte(Bilet bilet) {
		super();
		this.bilet = bilet;
	}

	@Override
	public void rezervaBilet() {
		bilet.rezerva();
	}
	@Override
	public void vindeBilet() {
		bilet.vinde();
	}

}