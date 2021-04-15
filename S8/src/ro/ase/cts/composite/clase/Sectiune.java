package ro.ase.cts.composite.clase;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu {

	private String numeSectiune;
	private List<ComponentaMeniu> lista;

	public Sectiune(String numeSectiune) {
		super();
		this.numeSectiune = numeSectiune;
		this.lista = new ArrayList<ComponentaMeniu>();
	}

	@Override
	public void adaugaNod(ComponentaMeniu componentaMeniu) {
		lista.add(componentaMeniu);

	}

	@Override
	public void stergeNod(ComponentaMeniu componentaMeniu) {
		lista.remove(componentaMeniu);

	}

	@Override
	public void afiseazaInformatii() {
		System.out.println("Sectiunea " + numeSectiune);
		for (ComponentaMeniu s : lista) {
			s.afiseazaInformatii();
		}

	}

	@Override
	public ComponentaMeniu getComponenta(int index) {
		if (index >= 0 && index <= lista.size()) {
			return lista.get(index);
		} else {
			throw new IllegalArgumentException("Indexul nu exista");
		}
	}

}
