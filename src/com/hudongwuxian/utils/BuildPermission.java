package com.hudongwuxian.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jfinal.kit.Prop;
import com.jfinal.kit.PropKit;

public class BuildPermission {
	private static BuildPermission bpm;
	private static String path = "permissions";
	private List<PermissionConfig> permissions;
	public static BuildPermission getBuilder(){
		if(bpm == null)
			bpm = new BuildPermission();
		return bpm;
	}
	public static void setPath(String path){
		if(path.startsWith("/"))
			path = path.substring(1);
		if(path.endsWith("/"))
			path = path.substring(0, path.length()-1);
		path = "WebRoot/WEB-INF/Properties/"+path;
		BuildPermission.path = path;
	}
	//可在DefultValue中取得常量
	public void buildPermission(){
		String fileName = path+"/Permission1.properties";
		if(permissions == null)
			permissions = new ArrayList<PermissionConfig>();
		File pro = new File(fileName);
		int i = 1;
		while(pro.exists()){
			Prop prop = PropKit.use(pro);
			PermissionConfig pconfig = new PermissionConfig(prop);
			permissions.add(pconfig);
			fileName = path+"/Permission"+(++i)+".properties";
			pro = new File(fileName);
		}
		System.out.println("size="+permissions.size());
	}
	public List<PermissionConfig> getPermissions() {
		return permissions;
	}
	public void setPermissions(List<PermissionConfig> permissions) {
		this.permissions = permissions;
	}
}
