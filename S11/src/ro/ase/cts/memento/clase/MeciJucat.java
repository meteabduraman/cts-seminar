package ro.ase.cts.memento.clase;

public class MeciJucat {
	
	private String numeGazde;
	private String numeOaspeti;
	private int nrSpectatori;
	private int nrBileteVandute;
	private int nrSticleApaVandute;
	private int nrJandarmi;
	
	public MeciJucat(String numeGazde, String numeOaspeti, int nrSpectatori, int nrBileteVandute,
			int nrSticleApaVandute, int nrJandarmi) {
		super();
		this.numeGazde = numeGazde;
		this.numeOaspeti = numeOaspeti;
		this.nrSpectatori = nrSpectatori;
		this.nrBileteVandute = nrBileteVandute;
		this.nrSticleApaVandute = nrSticleApaVandute;
		this.nrJandarmi = nrJandarmi;
	}
	
	public Memento salvareInformatii() {
		return new Memento(this.nrSpectatori, this.numeGazde, this.numeOaspeti);
	}
	
	public void revenire(Memento memento) {
		this.nrSpectatori = memento.getNrSpectatori();
		this.numeGazde = memento.getNumeGazda();
		this.numeOaspeti = memento.getNumeOaspeti();
	}

	public void setNumeGazde(String numeGazde) {
		this.numeGazde = numeGazde;
	}

	public void setNumeOaspeti(String numeOaspeti) {
		this.numeOaspeti = numeOaspeti;
	}

	public void setNrSpectatori(int nrSpectatori) {
		this.nrSpectatori = nrSpectatori;
	}

	public void setNrBileteVandute(int nrBileteVandute) {
		this.nrBileteVandute = nrBileteVandute;
	}

	public void setNrSticleApaVandute(int nrSticleApaVandute) {
		this.nrSticleApaVandute = nrSticleApaVandute;
	}

	public void setNrJandarmi(int nrJandarmi) {
		this.nrJandarmi = nrJandarmi;
	}

	@Override
	public String toString() {
		return "MeciJucat [numeGazde=" + numeGazde + ", numeOaspeti=" + numeOaspeti + ", nrSpectatori=" + nrSpectatori
				+ ", nrBileteVandute=" + nrBileteVandute + ", nrSticleApaVandute=" + nrSticleApaVandute
				+ ", nrJandarmi=" + nrJandarmi + "]";
	}
	
	
}
