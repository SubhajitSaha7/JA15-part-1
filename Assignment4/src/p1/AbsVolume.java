package p1;

public abstract class AbsVolume implements IVolume{
	private double radius;
	
	public double getRadius()
	{
		return radius;
	}
	public void readData()	{
		System.out.println("Enter the radius");
		radius = scan.nextDouble();
	}
}
