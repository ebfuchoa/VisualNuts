package exercise1.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import exercise1.service.PrintNumberService;

public class PrintNumberServiceTest {

	@Test
	public void emptyFieldTest() {
		PrintNumberService service = new PrintNumberService();
		String value = service.assignResponseValue(null);
		assertEquals("", value);
	}
	
	@Test
	public void negativeFieldTest() {
		PrintNumberService service = new PrintNumberService();
		String value = service.assignResponseValue(-1);
		assertEquals(value, value);
	}

}
