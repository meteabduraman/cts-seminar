package ro.ase.cts.memento.clase;

import java.util.ArrayList;
import java.util.List;

public class ManagerMeciuriJucate {
	
	private List<Memento> backupuri;
	
	public ManagerMeciuriJucate() {
		super();
		this.backupuri = new ArrayList<>();
	}

	public void adaugaMemento(Memento memento) {
		backupuri.add(memento);
	}
	
	public Memento getMemento(int pozitie) {
		if (pozitie < backupuri.size())
			return backupuri.get(pozitie);
		else throw new IndexOutOfBoundsException();
	}

}
