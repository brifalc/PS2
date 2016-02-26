package base;

import static org.junit.Assert.*;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



public class MyInteger_Test {

	private static MyInteger myInt6;
	private static MyInteger myInt7;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		myInt6 = new MyInteger(6);
		myInt7 = new MyInteger(7);
	}
	


	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}
	


	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		assertTrue(1==1);
	}
	
	@Test
	public void testisEven() {
		
		assertTrue(myInt6.isEven());
		assertFalse(myInt7.isEven());
	}
	
	@Test
	public void testisEvenStaticInt() {
		assertTrue(myInt6.isEven());
		assertFalse(myInt7.isEven());
	}
	
	@Test
	public void testisEvenStaticMyInteger() {
		assertTrue(myInt6.isEven());
		assertFalse(myInt7.isEven());
	}
	
	@Test
	public void testisOdd() {
		assertTrue(myInt7.isOdd());
		assertFalse(myInt6.isOdd());
	}
	
	@Test
	public void testisOddStaticInt() {
		assertTrue(myInt7.isOdd());
		assertFalse(myInt6.isOdd());
	}
	
	@Test
	public void testisOddStaticMyInteger() {
		assertTrue(myInt7.isOdd());
		assertFalse(myInt6.isOdd());
	}
	
	@Test
	public void testisPrime() {
		assertTrue(myInt7.isPrime());
		assertFalse(myInt6.isPrime());
	}
	
	@Test
	public void testisPrimeStaticInt() {
		assertTrue(myInt7.isPrime());
		assertFalse(myInt6.isPrime());
	}

	@Test
	public void testisPrimeStaticMyInteger() {
		assertTrue(myInt7.isPrime());
		assertFalse(myInt6.isPrime());
	}
	
	@Test
	public void testequalsint() {
		
		assertTrue(myInt7.equals(7));
		assertFalse(myInt7.equals(6));
		
	}
	
	@Test
	public void testequalsMyInteger() {
		
		MyInteger myInt7 = new MyInteger(7);
		MyInteger myInt6 = new MyInteger(6);
		
		assertTrue(myInt7.equals(myInt7));
		assertFalse(myInt7.equals(myInt6));
		
		
		
	}
}
