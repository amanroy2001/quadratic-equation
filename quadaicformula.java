package cwa;
import java.util.Scanner;
public class quadaicformula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc= new Scanner(System.in);
System.out.println("please enter the value of a , b, c value of quadetic equation");
double a=sc.nextDouble();
double b=sc.nextDouble();
double c=sc.nextDouble();
double d= Math.pow(b, 2)- (4*a*c);
if(d>0)
{
	double r1= ((-b+Math.pow(d, 0.5))/2*a);
	double r2= ((-b-Math.pow(d, 0.5))/2*a);
	System.out.println("solution--> r1 -- "+r1+ "  r2 -- "+r2);
	}
else if(d==0)
{
	double q = ((-b+Math.pow(d, 0.5))/2*a);

System.out.println("required solution is - "+q);
}
else
	System.out.println("have no solution");
	
}
}