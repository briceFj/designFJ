package jenkins.app;

import org.junit.Test;
import junit.framework.TestCase;

public class MethodesTest extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	@Test
	public void testAddition() {
		double attendu = 25;
		Methodes methode = new Methodes();
		double val = methode.addition(10, 15);
		assertEquals(attendu, val);
	}

	@Test
	public void testSoustraction() {
		double attendu = -5;
		Methodes methode = new Methodes();
		double val = methode.soustraction(10, 15);
		assertEquals(attendu, val);
	}

	@Test
	public void testMultiplication() {
		double attendu = 150;
		Methodes methode = new Methodes();
		double val = methode.multiplication(10, 15);
		assertEquals(attendu, val);
	}

	@Test
	public void testDivision() {
		double attendu = 10;
		Methodes methode = new Methodes();
		double val = methode.division(100, 10);
		assertEquals(attendu, val);
	}

}
