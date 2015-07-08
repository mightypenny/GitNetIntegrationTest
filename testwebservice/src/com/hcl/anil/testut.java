package com.hcl.anil;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class testut {
	
	private testwebserviceimpl ClassUnderTest;
	
	private int _expectedResult;
	private int _firstValue;
	private int _secondValue;
	
	@Parameters
	public static Collection<Object[]> TestData() {
		Object[][] data = new Object[][] { {6, 2, 4}, {7, 4, 3}, {8, 2, 6} };
	
		return Arrays.asList(data);
	}
	
	public testut(int expectedResult, int firstValue, int secondValue) {
		_expectedResult = expectedResult;
		_firstValue = firstValue;
		_secondValue = secondValue;
	}
	
	@Before
	public void Setup() {
		ClassUnderTest = new testwebserviceimpl();
	}
		
	@Test
	public void test() {		
		Assert.assertEquals(_expectedResult, ClassUnderTest.add(_firstValue, _secondValue));
	}
}
