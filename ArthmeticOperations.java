package javaEU5_Day4_ArithmeticOperations;

public class ArthmeticOperations {

	public static void main(String[] args) {

//adddition operators

		System.out.println(57 + 4);
		int chair = 23;
		int chairs = chair + 4;
		System.out.println(chair + 9);
		int table = 30;
		int total = table + chairs;
		System.out.println(total);

		// subtraction
		double balance = 200.50;
		double transaction = 56.60;
		System.out.println(balance - transaction);
		balance = balance - transaction;
		System.out.println(balance);

		// create 2 variable linesofCode and assign 50 and print "Lines of code 50"
		// delete 2 lines
		// decrease the value of lineofCode by 2 and print "lines of Code 48"

		int linesofCode = 50;
		System.out.println("Lines of code " + linesofCode);
		linesofCode = linesofCode - 2;
		System.out.println("lines of Code "+linesofCode);
	}

}
