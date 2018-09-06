package com.teamsankya.calculater;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {
	
	@Test
	public void addIntTest() {
		
		int sum = Addition.add(45, 4);
		Assert.assertEquals(49, sum);
		
	}

}
