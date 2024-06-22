package Task_10;

import java.util.Scanner;

public class Circle {
	
	int radius;
	
	public Circle(int a) {
	
		a = radius;
		
	}
	public int Circum( ) {
		
		int circumference ;
		
		circumference =(int) Math.PI*2*radius;

		return circumference;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the radius:");
		
		int radius = sc.nextInt();
		
		Circle obj = new Circle(radius);
	
		obj.Circum();
		System.out.println(obj.Circum());
		
		
	}

}
