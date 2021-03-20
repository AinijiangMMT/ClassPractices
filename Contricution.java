package javaEU5_Day4_ArithmeticOperations;

public class Contricution {

	public static void main(String[] args) {
		/*
		 * This program calculates the amount of pay that will be contributed to a
		 * retirement plan if 5%,8% or 10% of monthly pay is withheld
		 */
		// variables to hold the montly pay and theamount of contricution
		double monthlyPay = 6000;
		double contribution;
		// calculate and sdisplay 5% contribution
		contribution = monthlyPay * 0.05;
		System.out.println("5%  monthly contribution is : $" + contribution);

		// calculation and display 8%contribution
		contribution = monthlyPay * 0.08;
		System.out.println("8%  monthly contribution is : $" + contribution);

		// calculation of 10% monthly contribution

		contribution = monthlyPay * 0.1;
		System.out.println("10% monthly "
				+ "contribution is : $" + contribution);
		
		

	}

}
