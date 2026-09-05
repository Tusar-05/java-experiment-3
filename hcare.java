import java.util.Scanner;
public class hcare{
	String name;
	double height;
	double weight;
	patient(String n, double h, double w){
		name = n;
		height = h;
		weight = w;
			
	}
	public void show(){
	System.out.println("Patient name " + name);
	System.out.println("Patient height "+ height);
	System.out.println("Patient weight "+ weight);
	}
	public double computeBMI(){
		return weight/ (height* height); 
	}



	public static void main(String args[]){
		patient ob = new patient("smit",5.6,60);
		ob.show();
		System.out.println("BMI = "+ ob.computeBMI());
	
	}

}