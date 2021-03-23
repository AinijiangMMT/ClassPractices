package day4;

public class ArthmeticsOzzy {

	public static void main(String[] args) {
//Task-14====Write a java program to convert Fahrenheit to Celcius. 

		double fahreinheit, celcius;
		celcius = 99.9;
		fahreinheit = 9 * celcius / 5 + 32;
		System.out.println(celcius + "is equal to  " + fahreinheit + "fahreinheit");
		
//Task-15====write a java program that converts mile to km.( 85.0 mile is equal to 136.79424km)
		double mile  ,km;
		mile =85;
		km=mile*1.609344;
		 System.out.println(mile+"mile is equal to "+km+"km");

//Task-16====write a java program that displays the area and perimeter of a circle that has radius of 5.5 using following formulas.
		 final double PI=3.14;double radius=5.5;double perimeter;
		 perimeter=2*radius*PI; double area=radius *PI;
		 System.out.println("area of the circle is "+area+";"+ "    "+"\nperimeter of the circle is "+perimeter);
		 
//Task-17====write a java program that calculates the averageof 3 numbers;
		 int a,b,s;
		 a=34;b=34;s=3445;
		 int ave=(a+b+s)/3;
		 System.out.println(ave);

		 
		 
	}

}
