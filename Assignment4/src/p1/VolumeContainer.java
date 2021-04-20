package p1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class VolumeContainer {
	public static Map<String, IVolume> vmap = new HashMap<>();
	static	{
		vmap.put("cone", new Cone());
		vmap.put("cyl", new Cylinder());
		vmap.put("sphere", new Sphere());
	}
	public static IVolume getShape(String stype)
	{
		IVolume volume = vmap.get(stype);
		return volume;
	}
	public static Set<String> getMenus()	{
		return vmap.keySet();
	}
	public static IVolume getObject(String menu) {
		// TODO Auto-generated method stub
		return null;
	}

}
