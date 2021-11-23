package testing;
import java.util.Scanner;

public class W4P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArr = new int[10];
		Scanner scan = new Scanner(System.in);
		Calculate calcul = new Calculate(numArr);
		//ask user to input numbers
        System.out.println("Please enter 10  numbers: ");
        for (int i = 0; i < 10; i++)
        {
            //lets the user input the numbers
        	System.out.println("Element "+ i + ":");
            //converts the user input into type integer and stores 
            //the numbers into an array
            numArr[i] = Integer.parseInt(scan.nextLine());
        }
		calcul.Calculate_avg();
		System.out.println("The average = " + calcul.avg);
		calcul.AboveAverage(numArr, calcul.avg);
		System.out.println("Numbers above the average: " + calcul.aboveCounter);
		calcul.BelowAverage(numArr, calcul.avg);
		System.out.println("Numbers below the average: " + calcul.belowCounter);
        scan.close(); //close scanner
	}
}
