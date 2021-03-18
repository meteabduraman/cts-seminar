package ro.ase.cts.clase;

public class Amenda {
	private String sectiePolitie;
	private String destinatar;
	private int suma;

	private static Amenda instance = null;

	public static synchronized Amenda getInstance(String sectiePolitie, String destinatar, int suma) {
		if (instance == null) {
			instance = new Amenda(sectiePolitie, destinatar, suma);
		}
		return instance;
	}

	private Amenda(String sectiePolitie, String destinatar, int suma) {
		super();
		this.sectiePolitie = sectiePolitie;
		this.destinatar = destinatar;
		this.suma = suma;
	}

	public void setSectiePolitie(String sectiePolitie) {
		this.sectiePolitie = sectiePolitie;
	}

	public void setDestinatar(String destinatar) {
		this.destinatar = destinatar;
	}

	public void setSuma(int suma) {
		this.suma = suma;
	}

	@Override
	public String toString() {
		return "Amenda [sectiePolitie=" + sectiePolitie + ", destinatar=" + destinatar + ", suma=" + suma + "]";
	}

}
