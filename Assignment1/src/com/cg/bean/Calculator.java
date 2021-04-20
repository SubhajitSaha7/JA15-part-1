package com.cg.bean;
import com.cg.util.*;

public class Calculator {
	
	public double amt;
	public int years;
	public float rate;
	
	public Calculator()
	{
		
	}
	
	public double calcSimple() {
		return amt * years * rate / HUNDRED;
	}
	
	public double calcComp() {
		return amt * Math.pow((ONE + rate / HUNDRED), years) - amt;
	}
	

}
