package com.qa.calculator;

import org.junit.Assert;
import org.junit.Test;

public class DivideTest {
	
	private Divide divide;
	

	@Test
	public void test() {
		divide = new Divide();
		int expectedValue = 2;
		int actualValue = divide.divide(4,2);
		Assert.assertEquals(expectedValue, actualValue);
	}
	@Test
	public void zeroTest() {
		divide = new Divide();
		String expectedValue = "Error";
		int actualValue;{
			try {
				actualValue = Divide.divide(4,0);
				Assert.assertEquals(expectedValue, actualValue);
			}catch (ArithmeticException e) {
				System.out.println("Error");
			}
		}
		
	}

}
