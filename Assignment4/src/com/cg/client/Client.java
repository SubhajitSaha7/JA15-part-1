package com.cg.client;

import java.util.Set;

import p1.IVolume;
import p1.VolumeContainer;

public class Client {
	public static void main(String[] args) {
		String opt = null;
		String menu = null;
		do	{
			System.out.println("Select the menu");
			Set<String> set = VolumeContainer.getMenus();
			for(String str: set)
			{
				System.out.println(str);
			}
			menu = IVolume.scan.next();
			IVolume obj = VolumeContainer.getObject(menu);
			obj.readData();
			System.out.println(obj.calcVolume());
			System.out.println("Press Y to continue");
			opt = IVolume.scan.next();
		}while(opt.equals("y"));
	}

}
