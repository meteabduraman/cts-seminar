package ro.ase.cts.command.clase;

public class ContBancar {
	private String detinator;
	private float sold;

	public ContBancar(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	public void constituire(float suma) {
		this.sold = suma;
		System.out.println("Contul a fost constituit. Suma initiala " + suma + " lei");
	}
	
	public void retragere(float suma) {
		if (this.sold >= suma) {
			this.sold -= suma;
			System.out.println("A fost retrasa suma de " + suma + " lei. Sold ramas: " + this.sold + " lei");
		} else {
			System.out.println("Nu exista fonduri suficiente. Sold: " + this.sold + " lei");
		}
	}
	
	public void depunere(float suma) {
		this.sold += suma;
		System.out.println("A fost depusa suma de " + suma + " lei. Sold curent: " + this.sold + " lei");
	}
}
