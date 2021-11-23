package testing;

public class Calculate {
    public int[] numArr;
    public double avg;
    //to keep track of the numbers below and above avg
    public int belowCounter;
    public int aboveCounter;
    public double arrSum;
    //constructor
    public Calculate(int[] arr)
    {
        numArr = arr;
        avg = 0.0;
        belowCounter = 0;
        aboveCounter = 0;
        arrSum = 0;

    }

    //method for calculating the average
    public double Calculate_avg()
    {
        for (int i = 0; i < 10; i++)
        {
            arrSum += numArr[i];
        }

        //calculating the average 
        avg = arrSum / 10;
        //returning the average
        return avg;
    }
    //method for checking the numbers below the average
    public int BelowAverage(int[] numArr, double avg)
    {
        for (var i = 0; i < 10; i++ )
        {
            //if the number is less than the average
            //increment the belowCounter
            if (numArr[i] < avg)
            {
                belowCounter++;
            }
        }
        return belowCounter;
    }
    //method for checking the numbers above the average
    public int AboveAverage(int[] numArr, double avg)
    {
        for (var i = 0; i < 10 ; i++)
        {
            //if the number is more than the average
            //increment the belowCounter
            if (numArr[i] > avg)
            {
                aboveCounter++;
            }
        }
        return aboveCounter;
    }
	
}
