package pachet;

import clase.Giraffe;
import clase.Zebra;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Giraffe girafa1 = new Giraffe("Arnold");
		Giraffe girafa2 = new Giraffe("Sasha", 350);
		
		zoo.addAnimal(girafa1);
		zoo.addAnimal(girafa2);
//		zoo.feedAllAnimals();
		
		Zebra zebra1 = new Zebra("Quincy");
		Zebra zebra2 = new Zebra("Instagram", false);
		
		zoo.addAnimal(zebra1);
		zoo.addAnimal(zebra2);
		zoo.feedAllAnimals();
	}
}
