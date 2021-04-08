package ro.ase.cts.facade.clase;

public class Bilet {
	private String nume;
	private int loc;
	public Bilet(String nume, int loc) {
		super();
		this.nume = nume;
		this.loc = loc;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public int getLoc() {
		return loc;
	}
	public void setLoc(int loc) {
		this.loc = loc;
	}
	
	
}
