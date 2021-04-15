package ro.ase.cts.proxy.clase;

public class Proxy implements IOperatorRezervare {

	private OperatorRezervare operator;
	private int limitaPersoane;

	public Proxy(OperatorRezervare operator, int limitaPersoane) {
		super();
		this.operator = operator;
		this.limitaPersoane = limitaPersoane;
	}

	@Override
	public void rezerva(int nrPersoane) {
		if (nrPersoane > this.limitaPersoane) {
			operator.rezerva(nrPersoane);
		} else {
			System.out.println("Rezervarea nu poate fi realizata pentru mai putin de 4 persoane");
		}

	}

}
