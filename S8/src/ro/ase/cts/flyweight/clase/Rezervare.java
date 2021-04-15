package ro.ase.cts.flyweight.clase;

public class Rezervare {
	
	private int nrMasa;
	private int nrPersoane;
	private int nrRezervare;
	
	public Rezervare(int nrMasa, int nrPersoane, int nrRezervare) {
		super();
		this.nrMasa = nrMasa;
		this.nrPersoane = nrPersoane;
		this.nrRezervare = nrRezervare;
	}

	@Override
	public String toString() {
		return "Rezervare [nrMasa=" + nrMasa + ", nrPersoane=" + nrPersoane + ", nrRezervare=" + nrRezervare + "]";
	}
	
}
