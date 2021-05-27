package teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupaCuFixture {
	
	private Grupa grupa;

	@Before
	public void setUp() throws Exception {
		grupa = new Grupa(1076);
		for (int i=0; i<35; i++) {
			Student student = new Student();
			student.adaugaNota(3);
			student.adaugaNota(8);
			student.adaugaNota(6);
			student.adaugaNota(8);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
	}

	@Test(timeout=500)
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}

}
