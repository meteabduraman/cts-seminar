package ro.ase.cts.simplefactory.clase;

public class JucatorFactory {
	public static Jucator createJucator(TipJucator tip, String nume) throws Exception {
		switch (tip) {
		case PORTAR:
			return new Portar(nume);
		case ATACANT:
			return new Atacant(nume);
		case FUNDAS:
			return new Fundas(nume);
		default:
			throw new Exception("Tipul nu exista");
		}
	}
}
