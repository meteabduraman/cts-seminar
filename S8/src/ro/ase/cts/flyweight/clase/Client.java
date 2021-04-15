package ro.ase.cts.flyweight.clase;

public class Client implements FlyweightAbstract {

	private String nume;
	private String nrTelefon;
	private String mail;

	public Client(String nume, String nrTelefon, String mail) {
		super();
		this.nume = nume;
		this.nrTelefon = nrTelefon;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Client [nume=" + nume + ", nrTelefon=" + nrTelefon + ", mail=" + mail + "]";
	}

	@Override
	public void afiseazaInformatii(Rezervare rezervare) {
		System.out.println(this.toString() + "\n  " + rezervare.toString());
	}

}
