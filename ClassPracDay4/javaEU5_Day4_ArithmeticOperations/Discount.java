package javaEU5_Day4_ArithmeticOperations;

public class Discount {

	public static void main(String[] args) {
/*this program calulates the sale price of an item that regulary priced at 
	$59 , with a 20% discount on it*/
		int regularPrice=59;
		double discount;
		double salesPrice;
		discount=regularPrice*0.2;
		
		salesPrice=regularPrice-discount;
		System.out.println("regular price is:    $" +regularPrice);
		System.out.println("discount amount is:  $"+discount);
		System.out.println("sale price is:       $"+salesPrice);
		
		
	}

}
