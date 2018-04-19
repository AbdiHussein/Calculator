package com.qa.calculator;


import org.junit.Assert;
import org.junit.Test;

public class SubtractTest {
	
	private Subber subber;
	
	@Test
	public void test() {
		subber = new Subber();
		int expectedValue = 4;
		int actualValue = subber.sub(6,2);
		Assert.assertEquals(expectedValue, actualValue);
	}

}
