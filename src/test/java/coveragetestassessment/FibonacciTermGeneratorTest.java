package coveragetestassessment;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.experimental.categories.Category;

import coverageAssessment.FibonacciTermGenerator;

import org.junit.BeforeClass;

public class FibonacciTermGeneratorTest {
	
	private static FibonacciTermGenerator ftGen;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		int n = 5;
		ftGen = new FibonacciTermGenerator();
		
	}

	@Test
	@Category(coveragetestassessment.TestGroupA.class)
	public void test1() {
		System.out.println("Doing test 1");
		assertEquals(ftGen.fibonacciLoop(1),1);
	}
	
	@Test
	@Ignore
	@Category(coveragetestassessment.TestGroupA.class)
	public void test2() {
		System.out.println("Doing test 2");
		assertEquals(ftGen.fibonacciLoop(2),1);
	}
	
	@Test
	@Category(coveragetestassessment.TestGroupA.class)
	public void test3() {
		System.out.println("Doing test 3");
		assertEquals(ftGen.fibonacciLoop(3),2);
	}
	
	@Test
	@Category(coveragetestassessment.TestGroupB.class)
	public void test4() {
		System.out.println("Doing test 4");
		assertEquals(ftGen.fibonacciLoop(5),5);
	}
	
	@Test
	@Category(coveragetestassessment.TestGroupBSpecialised.class)
	public void test5() {
		System.out.println("Doing test 5");
		assertEquals(ftGen.fibonacciLoop(6),8);
	}
	
	@Test
	public void test6() {
		
		assertEquals(ftGen.fibonacciLoop(7),13);
	}
	
	@Test
	public void test7() {
		
		assertEquals(ftGen.fibonacciLoop(8),21);
	}
	
	@Test
	public void test11() {
		
		ftGen.fibonacciRecusion(1);
	}
	
	@Test
	public void test12() {
		
		ftGen.fibonacciRecusion(2);
	}
	
	@Test
	public void test13() {
		
		ftGen.fibonacciRecusion(3);
	}
	
	@Test
	public void test14() {
		
		ftGen.fibonacciRecusion(5);
	}
	
	@Test
	public void test21() {
		
		ftGen.getNthFibonacciNumber(1);
	}
	
	@Test
	public void test22() {
		
		ftGen.getNthFibonacciNumber(2);
	}
	
	@Test
	public void test23() {
		
		ftGen.getNthFibonacciNumber(3);
	}
	
	@Test
	public void test24() {
		
		ftGen.getNthFibonacciNumber(5);
	}
	
	/*
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
	
	*/
}
