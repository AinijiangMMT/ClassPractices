package day_6;

public class operationPrecedence {

	public static void main(String[] args) {
 int applesCount=10;
 int orangesCount=20;
 int pearsCount=30;
 boolean comp=applesCount<orangesCount||orangesCount>=pearsCount;
 System.out.println(comp);
 
 String outsideweather;
 int degree;
 outsideweather="shiny";
 degree=70;
 boolean  comp2=(!(outsideweather=="rainy" || degree ==70));
 System.out.println(comp2);
 
 int b=2;
 boolean res=++b==2||--b==2&&--b==2;
 System.out.println(res);
System.out.println("بۇ سوئالنىڭ جاۋابى:"+res);
 
boolean x=true, z=true;
int y=20;
x=(y!=10)||(z=false);// that = sign not equal sign, is assigment sign 

System.out.println(x);
x=(y!=10)&&(z=false);
System.out.println(x);
System.out.println("======================================");
double d1=20;
double d2=80;
double sum1=(d1+d2)*25;
double r=sum1%40;
boolean total4=r<=20;
System.out.println(total4);

 
	}

}
