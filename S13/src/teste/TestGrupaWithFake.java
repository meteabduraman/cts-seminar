package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.IStudent;
import clase.Student;
import dubluri.StudentFake;

public class TestGrupaWithFake {

	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1007);
		
		for (int i = 0; i < 8; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(false);
			grupa.adaugaStudent(student);
		}

		for (int i = 0; i < 2; i++) {
			StudentFake student = new StudentFake();
			student.setValoareAreRestante(true);
			grupa.adaugaStudent(student);
		}

		assertEquals(0.8, grupa.getPromovabilitate(), 0.01);
	}

}
