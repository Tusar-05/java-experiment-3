import java.util.Scanner;
public class Box{
	public double volume(double width,double height,double depth){
		return width* height * depth;
	}
	public static void main(String args[]){
		Box ob = new Box();
		double width,height,depth;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the width of the box");
		width = sc.nextDouble() ;
		System.out.println("Enter the height of the box");
		height = sc.nextDouble();
		System.out.println("Enter the depth of the box");
		depth = sc.nextDouble();
		System.out.println();
		
		double volume = ob.volume(width,height,depth);
		System.out.println("volume of the box is " + volume );
		 
}
}