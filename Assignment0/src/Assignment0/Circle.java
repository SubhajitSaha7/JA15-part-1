package Assignment0;

import java.util.Scanner;

import com.cg.util.CgUtil;

public class Circle {

	public static void main(String[] args) {
		
		System.out.println("Main Starts");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=scan.nextDouble();
		double area=calcArea(radius);
		double pm=calcPerimeter(radius);
		System.out.println("Area =+"+area);
		System.out.println("Perimeter ="+ pm);
		scan.close();
		
	}
	public static double calcArea(double radius)
	{
		return Math.PI * radius * radius;
	}
	/*public static double calcPerimeter(double radius)//Task1
	{
		return Math.PI* radius * radius;
	}
	*/
	public static double calcPerimeter(double radius)//Task2
	{
		double pm = CgUtil.TWO * Math.PI* radius;
		return pm;
	}
}
