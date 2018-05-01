package junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import kataStringCalculator.StringCalculator;

class TestStringCalculator {

	@Test
	void testStringNull(){
		assertEquals(StringCalculator.add(""), 0);
	}

}
