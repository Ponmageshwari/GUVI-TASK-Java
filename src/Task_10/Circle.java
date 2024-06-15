package Task_10;

import java.util.Scanner;

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ENter the radius:");
		
		int radius = sc.nextInt();
		double circumference;
		
		//Circumference calculation
		circumference = Math.PI*2*radius;
		
		System.out.println("Circumference of circle is:" + circumference);
		

	}

}
