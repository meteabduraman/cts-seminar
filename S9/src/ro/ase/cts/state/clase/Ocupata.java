package ro.ase.cts.state.clase;

public class Ocupata implements Stare {

	@Override
	public void schimbaStarea(Masa masa) {

		if (!(masa.getStare() instanceof Ocupata)) {
			System.out.println("Masa " + masa.getNumar() + " a fost ocupata");
			masa.setStare(this);
		} else {
			System.out.println("Masa " + masa.getNumar() + " nu poate fi ocupata");
		}

	}

}
