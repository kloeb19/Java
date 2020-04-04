package week01;
import java.util.*;

	class Complex implements Cloneable{
			private double a; //private variables 
			private double x;
			
//public constructors 
	public Complex(){
			a = 0.0; //Initialize ?
			x = 0.0; 
			}

   public Complex(double a){
           this.a = a;
            x = 0.0;}
   
   public Complex(double a, double x){
           this.a = a;
           this.x = x;}
   
//Get methods
   public double getRealPart(){
          return a;}

   public double getImaginaryPart(){
          return x;} // end get methods
   
  //create operators
   public Complex add(Complex other){
      return new Complex(a+other.a , x+ other.x);} //addition
  
   public Complex subtract(Complex other){
	  return new Complex(a-other.a , x- other.x);} //subtraction
  
   public Complex multiply(Complex other){ //multiply 

     double new_a = a*other.a - x*other.x ;
     
     double new_x = (x*other.a+a*other.x);
     
          return new Complex(new_a, new_x);}

   
   public Complex divide(Complex other){ //divide

	   double den = other.a*other.a + other.x*other.x;

	   double new_a = (a*other.a + x*other.x)/den ;

	   double new_x = (x*other.a-a*other.x)/den;

	   		return new Complex(new_a, new_x);} //end operators 
                                      
   
public double abs(){
	
	return Math.abs(Math.sqrt((a*a +x*x)));} //find square root of a and b.

@Override
public String toString(){ //override to string 
	if(x==0)
		return ""+a;
			return "("+a + " + "+ x + "i" +")";}

 }

