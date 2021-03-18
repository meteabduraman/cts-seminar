package ro.ase.cts.clase;

public class ManagerSpital {
	private String nume;
	private int varsta;
	private int marca;
	
	//Eager initialization
	private static ManagerSpital instance = new ManagerSpital("Gigel", 0, 0);
	
	public static ManagerSpital getInstance() {
		return instance;
	}

	private ManagerSpital(String nume, int varsta, int marca) {
		super();
		this.nume = nume;
		this.varsta = varsta;
		this.marca = marca;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}

	public void setMarca(int marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "ManagerSpital [nume=" + nume + ", varsta=" + varsta + ", marca=" + marca + "]";
	}
	
}
