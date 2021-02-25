package pachet;

import clase.Giraffe;
import clase.Zoo;

public class Main {

	public static void main(String[] args) {
		
		Zoo zoo = new Zoo();
		Giraffe girafa1 = new Giraffe("Arnold");
		Giraffe girafa2 = new Giraffe("Sasha", 350);
		
		zoo.addAnimal(girafa1);
		zoo.addAnimal(girafa2);
		zoo.feedAllAnimals();
	}
}
