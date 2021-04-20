package p1;

public class Cone extends AbsVolume implements IVolume	{
	
	private double height;
	@Override
	public double calcVolume()
	{
		return Math.PI * getRadius() * getRadius() * height / 3.0;
	}
	@Override
	public void readData()
	{
		super.readData();
		System.out.println("Enter the height");
		height = scan.nextDouble();
	}

}
