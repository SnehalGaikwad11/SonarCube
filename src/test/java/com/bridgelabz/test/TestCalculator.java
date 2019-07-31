package com.bridgelabz.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.bridgelabz.Calculations;

public class TestCalculator {
	
	Calculations cal=new Calculations();

	
	@Test
	public void twoPlusTwoEqualsFour()
	{
		assertEquals(4,cal.add(2, 2));
	}
}
