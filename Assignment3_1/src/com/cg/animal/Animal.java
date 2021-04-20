package com.cg.animal;

public class Animal {
	public abstract void makeNoise();

}



public class Dog extends Animal	{
	//Override
	public void makeNoise()	{
		System.out.println("Dog --> Bark");
	}
}

public class Lion extends Animal	{
	private void makeNoise()	{
		System.out.println("Lion --> Roar");
	}
		
}