package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplyTest {
	
	private Multiply multiply;
	

	@Test
	public void test() {
		multiply = new Multiply();
		int expectedValue = 4;
		int actualValue = multiply.multiply(2,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
