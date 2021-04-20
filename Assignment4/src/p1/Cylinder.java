package p1;

public class Cylinder extends AbsVolume implements IVolume	{
	private double height;
	@Override
	public double calcVolume()	{
		return Math.PI * getRadius() * getRadius() * height;
	}
	@Override
	public void readData()	{
		super.readData();
		System.out.println("Enter the height");
		height = scan.nextDouble();
	}
}
