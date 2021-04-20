package s_and_c_interest;

import java.util.Scanner;
import com.cg.util.CgUtil;

public class Interest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount: ");
		double amount=sc.nextDouble();
		System.out.println("Enter the number of years: ");
		int years=sc.nextInt();
		System.out.println("Enter the rate of interest: ");
		float rate=sc.nextFloat();
		
		double si=calcSI(amount, years, rate);
		double ci=calcCI(amount, years, rate);
		
		System.out.println("Simple Interest= "+CgUtil.round2Dec(si));
		System.out.println("Compond Interest= "+CgUtil.round2Dec(ci));
		sc.close();
		
	}

	public static double calcSI(double amt, int y, float r)
	{
		return amt*y*r/CgUtil.HUNDRED;
	}
	
	public static double calcCI(double amt, int y, float r)
	{
		return amt * Math.pow((CgUtil.ONE+r/CgUtil.HUNDRED), y)-amt;
	}
	
}
