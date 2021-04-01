package ro.ase.cts.builder.clase;

public class Rezervare {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaPersonalizata;
	private String genMuzical;

	public Rezervare(int codRezervare, boolean areMancareInclusa, boolean areBauturaInclusa, boolean areScaunErgonomic,
			boolean areMuzicaPersonalizata, String genMuzical) {
		super();
		this.codRezervare = codRezervare;
		this.areMancareInclusa = areMancareInclusa;
		this.areBauturaInclusa = areBauturaInclusa;
		this.areScaunErgonomic = areScaunErgonomic;
		this.areMuzicaPersonalizata = areMuzicaPersonalizata;
		this.genMuzical = genMuzical;
	}

	public void setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
	}

	public void setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
	}

	public void setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
	}

	public void setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
	}

	public void setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
		this.areMuzicaPersonalizata = areMuzicaPersonalizata;
	}

	public void setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
	}

	@Override
	public String toString() {
		return "Rezervare [codRezervare=" + codRezervare + ", areMancareInclusa=" + areMancareInclusa
				+ ", areBauturaInclusa=" + areBauturaInclusa + ", areScaunErgonomic=" + areScaunErgonomic
				+ ", areMuzicaPersonalizata=" + areMuzicaPersonalizata + ", genMuzical=" + genMuzical + "]";
	}

}
