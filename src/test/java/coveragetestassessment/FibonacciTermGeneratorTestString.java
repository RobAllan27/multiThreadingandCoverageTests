package coveragetestassessment;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import coverageAssessment.FibonacciTermGenerator;

public class FibonacciTermGeneratorTestString {

	private static FibonacciTermGenerator ftGen;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ftGen = new FibonacciTermGenerator();
	}
	
	@Test
	public void test31() {
		
		assertTrue(ftGen.CheckStringType("case 1"));
	}
	
	@Test
	public void test32() {
		assertTrue(ftGen.CheckStringType("case 2"));
	}
	
	@Test
	public void test33() {
		
		assertTrue(ftGen.CheckStringType("case 3"));
	}
	
	@Test
	public void test34() {
		
		assertTrue(ftGen.CheckStringType("case 4"));
	}
	
	@Test
	public void test35() {
		
		assertTrue(ftGen.CheckStringType("case 5"));
	}

}
