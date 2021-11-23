package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AboveAverage {

	@Test
	public void AboveAverageTesting() {
		//Arrange
		int[] numArrTest = { 50, 10, 20, 33, 4, 60, 88, 7, 9, 1 };
		double avg = 28.2;
		int expectedAmount = 4;
		int actualAmount; 
		Calculate calcu = new Calculate(numArrTest);
		
		//Act 
		actualAmount = calcu.AboveAverage(numArrTest, avg);
		
		//Assert
		assertTrue("Amount calculate incorrectly", expectedAmount == actualAmount);
	}

}
