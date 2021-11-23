package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculateUnitTest {

	@Test
	public void AverageTest() {
		//Arrange
		int[] numArrTest = { 50, 10, 20, 33, 4, 60, 88, 7, 9, 1 };
		double expectedAvg = 28.2;
		double actualAvg;
		Calculate calcu = new Calculate(numArrTest);
		
		//Act 
		actualAvg = calcu.Calculate_avg();
		
		//Assert
		assertTrue("Average calculate incorrectly", expectedAvg == actualAvg);
	}
	
	

}
