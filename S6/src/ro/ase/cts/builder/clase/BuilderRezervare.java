package ro.ase.cts.builder.clase;

public class BuilderRezervare implements Builder {
	private Rezervare rezervare;
	
	public BuilderRezervare() {
		this.rezervare = new Rezervare(0, false, false, false, false, "POP");
	}
	
	public BuilderRezervare setCodRezervare(int codRezervare) {
		rezervare.setCodRezervare(codRezervare);
		return this;
	}

	public BuilderRezervare setAreMancareInclusa(boolean areMancareInclusa) {
		rezervare.setAreMancareInclusa(areMancareInclusa);
		return this;
	}

	public BuilderRezervare setAreBauturaInclusa(boolean areBauturaInclusa) {
		rezervare.setAreBauturaInclusa(areBauturaInclusa);
		return this;
	}

	public BuilderRezervare setAreScaunErgonomic(boolean areScaunErgonomic) {
		rezervare.setAreScaunErgonomic(areScaunErgonomic);
		return this;
	}

	public BuilderRezervare setAreMuzicaPersonalizata(boolean areMuzicaPersonalizata) {
		rezervare.setAreMuzicaPersonalizata(areMuzicaPersonalizata);
		return this;
	}

	public BuilderRezervare setGenMuzical(String genMuzical) {
		rezervare.setGenMuzical(genMuzical);
		return this;
	}

	@Override
	public Rezervare build() {
		return this.rezervare;
	}
}
