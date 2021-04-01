package ro.ase.cts.builder.clase;

public class BuilderRezervareV2 implements Builder {
	private int codRezervare;
	private boolean areMancareInclusa;
	private boolean areBauturaInclusa;
	private boolean areScaunErgonomic;
	private boolean areMuzicaPersonalizata;
	private String genMuzical;

	public BuilderRezervareV2() {
		super();
		this.codRezervare = 0;
		this.areBauturaInclusa = false;
		this.areMancareInclusa = false;
		this.areScaunErgonomic = false;
		this.areMuzicaPersonalizata = false;
		this.genMuzical = "POP";
	}

	public BuilderRezervareV2 setCodRezervare(int codRezervare) {
		this.codRezervare = codRezervare;
		return this;
	}

	public BuilderRezervareV2 setAreMancareInclusa(boolean areMancareInclusa) {
		this.areMancareInclusa = areMancareInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreBauturaInclusa(boolean areBauturaInclusa) {
		this.areBauturaInclusa = areBauturaInclusa;
		return this;
	}

	public BuilderRezervareV2 setAreScaunErgonomic(boolean areScaunErgonomic) {
		this.areScaunErgonomic = areScaunErgonomic;
		return this;
	}

	public BuilderRezervareV2 setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
		this.areMuzicaPersonalizata = areMuzicaPersonalizata;
		return this;
	}

	public BuilderRezervareV2 setGenMuzical(String genMuzical) {
		this.genMuzical = genMuzical;
		return this;
	}

	@Override
	public Rezervare build() {
		return new Rezervare(this.codRezervare, this.areMancareInclusa, this.areBauturaInclusa, this.areScaunErgonomic,
				this.areMuzicaPersonalizata, this.genMuzical);
	}

}
