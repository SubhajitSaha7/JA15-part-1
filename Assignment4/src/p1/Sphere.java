package p1;

public class Sphere extends AbsVolume implements IVolume	{
	@Override
	public double calcVolume()	{
		return 4*Math.PI *getRadius() * getRadius();
	}
	
}
