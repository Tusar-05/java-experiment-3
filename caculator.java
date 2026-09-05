import java.util.*;
public class caculator{
	static public int powInt(int num1,int num2){
		return (int)Math.pow(num1,num2);
	}
	static public double powerDouble(double num1,int num2){
		double a = (double)Math.pow(num1,num2);
		return a; 
	}
	public static void main(String args[]){
		caculator ob = new caculator();
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x and Y to x^y ");
		x= sc.nextInt();
		y= sc.nextInt();
		System.out.println("power of x^y is" + powInt(x,y));

		System.out.println("enter x and Y to x^y ");
		double x1= sc.nextDouble();
		int y1= sc.nextInt();
		System.out.println("power of x^y is" + powerDouble(x1,y1));
	
	}
}