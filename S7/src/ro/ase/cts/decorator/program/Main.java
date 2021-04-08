package ro.ase.cts.decorator.program;

import ro.ase.cts.decorator.clase.Bilet;
import ro.ase.cts.decorator.clase.DecoratorAbstract;
import ro.ase.cts.decorator.clase.DecoratorCuMesajSustinere;
import ro.ase.cts.decorator.clase.DecoratorMesajLMA;

public class Main {

	public static void main(String[] args) {
		
		Bilet bilet = new Bilet("FCSB", "FCD", "Marius");
		bilet.rezervaBilet();
		
		DecoratorCuMesajSustinere decorator1 = new DecoratorCuMesajSustinere(bilet);
		decorator1.rezervaBilet();
		
		DecoratorMesajLMA decorator2 = new DecoratorMesajLMA(bilet);
		decorator2.rezervaBilet();
		
		DecoratorAbstract decorator3 = new DecoratorMesajLMA(decorator1);
		decorator3.rezervaBilet();
	}

}
