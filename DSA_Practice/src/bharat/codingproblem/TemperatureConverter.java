package bharat.codingproblem;

import java.util.Scanner;

public class TemperatureConverter {

	public static void main(String[] args) {
		System.out.println("Enter Options 1. Fahrenheight to Celsius.");
		System.out.println("Enter Options 2. Celsius To Fahrenheight.");
		Scanner sc=new Scanner(System.in);
		double option = sc.nextDouble();
		System.out.println("Enter Temperature: ");
		double temp = sc.nextDouble();
		if (option == 1) {
			double convertedTempFToC = ConvertFtoC(temp);
			System.out.println("convertedTempFToC: " + convertedTempFToC);
		} else {
			double convertedTempCToF = ConvertCtoF(temp);
			System.out.println("convertedTempCToF: " + convertedTempCToF);
		}
	}

	private static double ConvertCtoF(double c) {
		double f=(9*c)/5 +32;
		return f;
	}

	private static double ConvertFtoC(double f) {
		double c=(f-32)*5/9;
		return c;
	}

}
