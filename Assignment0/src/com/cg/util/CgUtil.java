package com.cg.util;

public class CgUtil {
	public static final int TWO = 2;
	public static final double HUNDRED = 100.0;
	public static final double ONE = 1.0;
	
	public static double round2Dec(double radius)
	{
		double res = Math.round(radius * HUNDRED)/HUNDRED;
		return res;
		
	}
	
	

}