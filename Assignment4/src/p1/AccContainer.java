package p1;

import java.util.HashMap;
import java.util.Map;

public class AccContainer {
	private static Map<String, Account> map= new HashMap();
	static	{
		map.put("account", new Account());
		
	}
	public static Atm getAtm()	{
		Atm atm = map.get("account");
		return atm;
	}
	public static Admin getAdmin()	{
		Admin admin =map.get("account");
		return admin;
	}
	public static Cdm getCDM()	{
		Cdm cdm = map.get("account");
		return cdm;
	}

}
