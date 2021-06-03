package teste;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import categorii.TesteNormale;
import categorii.TesteUrgente;
import clase.Grupa;
import clase.Student;

public class TestGrupa {
	
	// Constructor
	// Right-BICEP

	@Test
	@Category(TesteUrgente.class)
	public void testConstructorRight() {
		Grupa grupa = new Grupa(1076);
		assertEquals(1076, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorLowerBoundary() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testConstructorUpperBoundary() {
		Grupa grupa = new Grupa(1100);	
		assertEquals(1100, grupa.getNrGrupa());
	}
	
	@Test(expected=IllegalArgumentException.class)
	public void testConstructorLowerError() {
		Grupa grupa = new Grupa(900);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category(TesteNormale.class)
	public void testConstructorUpperError() {
		Grupa grupa = new Grupa(1200);
	}
	
	@Test(timeout=500)
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1076);
	}
	
	// CORRECT
	
	@Test
	public void testConstructorExistance() {
		Grupa grupa = new Grupa(1078);
		assertNotNull(grupa.getStudenti());
	}
	
	// getPromovabilitate()
	// Right-BICEP
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteUrgente.class})
	public void testGetPromovabilitateRight() {
		Grupa grupa = new Grupa(1076);
		for (int i=0; i<6; i++) {
			Student student = new Student();
			student.adaugaNota(6);
			student.adaugaNota(2);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		for (int i=0; i<4; i++) {
			Student student = new Student();
			student.adaugaNota(9);
			student.adaugaNota(10);
			student.adaugaNota(7);
			grupa.adaugaStudent(student);
		}
		assertEquals(0.4, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category({TesteGetPromovabilitate.class, TesteNormale.class})
	public void testGetPromovabilitateLowerBoundary() {
		Grupa grupa = new Grupa(1076);
		for (int i=0; i<6; i++) {
			Student student = new Student();
			student.adaugaNota(5);
			student.adaugaNota(5);
			student.adaugaNota(3);
			grupa.adaugaStudent(student);
		}
		assertEquals(0, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupa = new Grupa(1076);
		for (int i=0; i<6; i++) {
			Student student = new Student();
			student.adaugaNota(9);
			student.adaugaNota(9);
			student.adaugaNota(10);
			grupa.adaugaStudent(student);
		}
		assertEquals(1, grupa.getPromovabilitate(), 0.01);
	}
	
	@Test(expected=IllegalArgumentException.class)
	@Category(TesteGetPromovabilitate.class)
	public void testGetPromovabilitateError() {
		Grupa grupa = new Grupa(1075);
		grupa.getPromovabilitate();
	}
	

}
