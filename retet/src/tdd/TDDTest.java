package tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.MethodOrderer;

/**
 * @author korayincki
 *
 */
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(CalcParameterResolver.class)
class TDDTest {

	Calculator calc;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		this.calc = new Calculator();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	
	/*
	 * @Test
	 * 
	 * @Order(1) void B(){ System.out.println("BBB");
	 * 
	 * fail("Ilk elin gunahi olmaz"); }
	 */
	
	/*
	 * @Test
	 * 
	 * @Order(2) void A(){ System.out.println("AAA"); }
	 */
	
	/*
	 * @ParameterizedTest
	 * 
	 * @ValueSource(strings={"fail me", "fail you"}) void testParams(String arg) {
	 * fail(arg); }
	 */

	/*
	 * @ParameterizedTest
	 * 
	 * @MethodSource("stringProvider") void testMethod(String arg) { fail(arg); }
	 */
	
	/*
	 * static Stream<String> stringProvider(){ return
	 * Stream.of("fail it together","you and me"); }
	 */
	
	@Test
	void testAdd() {
		
		long result = 3 + 4;
		assertEquals(result, calc.add(3,4));			
	}
	
	@Test
	void testAddMultiple() {		
		long result = 3 + 4 + 5;
		assertEquals(result, calc.add(3,4,5));
	}
	
	@Test
	void testAddMany() {		
		long result = 3 + 4 + 5 + 6;
		assertEquals(result, calc.add(3,4,5,6));
	}
	
	@Test
	void testResolver(Calculator calcin) {
		long result = 3 + 4 + 5 + 6;
		assertEquals(result, calcin.add(3,4,5,6));
	}
	

}
