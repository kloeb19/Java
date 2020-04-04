package week01;
import java.util.Scanner;

public class Calculate{
	
public static void main(String[] args){
	
     Scanner in = new Scanner(System.in); //create scanner
     
     double a; //local variables
     double b;
     double c;
     double d;
     
System.out.println("Please enter a complex number: "); //prompt user for first number
     a = in.nextDouble();
     b = in.nextDouble();
     
Complex Com1= new Complex(a,b); //create first variable from input

System.out.println("Please enter the second complex number: "); //prompt user for second number

		c = in.nextDouble();
		d = in.nextDouble();

Complex Com2= new Complex(c,d); //create second variable from input

//print results
System.out.println
(Com1 + " + " + Com2 + " = " + (Com1.add(Com2)));
System.out.println
(Com1 + " - " + Com2 + " = " + (Com1.subtract(Com2)));
System.out.println
(Com1 + " * " + Com2 + " = " + (Com1.multiply(Com2)));
System.out.println
(Com1 + " / " + Com2 + " = " + (Com1.divide(Com2)));
System.out.println
("|"+Com1+"| = " + (Com1.abs()));

      }
}
