package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kataStringCalculator.StringCalculator;

class TestStringCalculator {

	@Test
	void testStringNull(){
		assertEquals(StringCalculator.add(""), 0);
	}

	@Test
	void testOneNumber() {
		assertEquals(StringCalculator.add("1"), 1);
	}
	
	@Test
	void testTwoNumber(){
		assertEquals(StringCalculator.add("1,2"), 3);
	}

	@Test
	void testMultiNumber() throws Exception {
		assertEquals(StringCalculator.add("1,2,3,4,5"), 15);
	}
	
	@Test
	void testDoubleDelimit() throws Exception {
		assertEquals(StringCalculator.add("1\n2,3"), 6);
	}
	
	@Test
	void testDynamicDelimit() throws Exception {
		assertEquals(StringCalculator.add("//;\n1;2"), 3);
	}
	
	@Test
	void testBigNumber() throws Exception {
		assertEquals(StringCalculator.add("1000,2"), 2);
	}
}
