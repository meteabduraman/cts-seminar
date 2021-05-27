package teste;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TestGrupa {
	
	// Constructor
	// Right-BICEP

	@Test
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
}
