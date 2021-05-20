package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Student;

public class StudentTests {

	@Test
	public void testConstructorCuParametri() {
		String nume = "Gigel";
		Student student = new Student(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testConstructorFaraParametri() {
		Student student = new Student();
		assertEquals("Student", student.getNume());
	}
	
	@Test
	public void testAreRestanta() {
		Student student = new Student();
		student.adaugaNota(3);
		student.adaugaNota(9);
		assertTrue("Studentul cu restanta este marcat fara restanta", student.areRestante());
	}
	
	@Test
	public void testNuAreRestanta() {
		Student student = new Student();
		student.adaugaNota(10);
		student.adaugaNota(9);
		assertFalse("Studentul fara restanta este marcat cu restanta", student.areRestante());
	}
	
	@Test
	public void testAdaugaNota() {
		Student student = new Student();
		student.adaugaNota(9);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testNotaAdaugataCorecta() {
		int nota = 6;
		Student student = new Student();
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testCalculeazaMedie() {
		Student student = new Student();
		student.adaugaNota(5);
		student.adaugaNota(7);
		assertEquals(6, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieFaraNote() {
		Student student = new Student();
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testCalculeazaMedieONota() {
		int nota = 8;
		Student student = new Student();
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testNotaAdaugataValida() {
		Student student = new Student();
		int nota = 15;
		try {
			student.adaugaNota(nota);
			fail("Nu trebuia sa ajunga aici");
		} catch (IllegalArgumentException err) {}
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testNotaValidaJUNIT4() {
		Student student = new Student();
		int nota = 14;
		student.adaugaNota(nota);
	}
}
