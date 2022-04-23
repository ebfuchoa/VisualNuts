package exercise1.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import exercise1.util.Util;

public class UtilTest {

	@Test
	public void isDiv3Test1() {
		boolean output = Util.isDiv3(3);
		assertTrue(output);

	}
	@Test
	public void isDiv3Test2() {
		boolean output = Util.isDiv3(9);
		assertTrue(output);
	}
	
	@Test
	public void isDiv3Test3() {
		boolean output = Util.isDiv3(15);
		assertTrue(output);
	}
	
	@Test
	public void isDiv3Test4() {
		boolean output = Util.isDiv3(25);
		assertFalse(output);
	}
	
	@Test
	public void isDiv5Test1() {
		boolean output = Util.isDiv5(5);
		assertTrue(output);
	}
	
	@Test
	public void isDiv5Test2() {
		boolean output = Util.isDiv5(10);
		assertTrue(output);
	}
	
	@Test
	public void isDiv5Test3() {
		boolean output = Util.isDiv5(15);
		assertTrue(output);
	}
	
	@Test
	public void isDiv5Test4() {
		boolean output = Util.isDiv5(22);
		assertFalse(output);
	}
	
	@Test
	public void isDiv3And5Test1() {
		boolean output = Util.isDiv3(3) && Util.isDiv5(5);
		assertTrue(output);

	}
	
	@Test
	public void isDiv3And5Test2() {
		boolean output = Util.isDiv3(9) && Util.isDiv5(15);
		assertTrue(output);
	}
	
	@Test
	public void isDiv3And5Test3() {
		boolean output = Util.isDiv3(18) && Util.isDiv5(25);
		assertTrue(output);
	}
	
	@Test
	public void isDiv3And5Test4() {
		boolean output = Util.isDiv3(22) && Util.isDiv5(30);
		assertFalse(output);
	}
}
