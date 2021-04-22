package ro.ase.cts.state.clase;

public class Masa {

	private int numar;
	private Stare stare;

	public Masa(int numar) {
		super();
		this.numar = numar;
		this.stare = new Libera();
	}

	public int getNumar() {
		return numar;
	}

	public void setNumar(int numar) {
		this.numar = numar;
	}

	public Stare getStare() {
		return stare;
	}

	void setStare(Stare stare) {
		this.stare = stare;
	}
	
	public void rezerva() {
		Rezervata rezervata = new Rezervata();
		rezervata.schimbaStarea(this);
	}
	
	public void ocupa() {
		Ocupata ocupata = new Ocupata();
		ocupata.schimbaStarea(this);
	}
	
	public void elibereaza() {
		Libera libera = new Libera();
		libera.schimbaStarea(this);
	}

}
