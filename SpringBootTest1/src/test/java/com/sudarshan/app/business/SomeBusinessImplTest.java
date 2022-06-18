package com.sudarshan.app.business;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class SomeBusinessImplTest {

	@Test
	void calculateSum_basic() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new Integer[] { 1, 2, 3 });
		int expectedResult = 6;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSum_empty() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new Integer[] {});
		int expectedResult = 0;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	void calculateSum_oneValue() {
		SomeBusinessImpl business = new SomeBusinessImpl();
		int actualResult = business.calculateSum(new Integer[] { 5 });
		int expectedResult = 5;
		assertEquals(expectedResult, actualResult);
	}

}
