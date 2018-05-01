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
}
