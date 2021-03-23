package javaEU5_Day4_ArithmeticOperations;

public class Wages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double regularWage;
		double basePay = 25;
		double regularHours = 40;
		double overtimesWages;
		double overTimepay = 37.5;
		double overTimesHours = 10;
		double totalWage;
		totalWage = regularHours * basePay + overTimesHours * overTimepay;
System.out.println(totalWage);
	}

}
