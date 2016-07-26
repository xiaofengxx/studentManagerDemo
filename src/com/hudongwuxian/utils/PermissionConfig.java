package com.hudongwuxian.utils;

import com.jfinal.kit.Prop;

public class PermissionConfig {
	private int level;
	private String name;
	private boolean checkSelf,checkAll,update,rooter;
	public PermissionConfig(){
		
	}
	public PermissionConfig(Prop prop){
		setName(prop.get("name"));
		setLevel(prop.getInt("level"));
		setCheckSelf(prop.getBoolean("checkSelf"));
		setCheckAll(prop.getBoolean("checkAll"));
		setRooter(prop.getBoolean("rooter"));
	}
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isCheckSelf() {
		return checkSelf;
	}
	public void setCheckSelf(boolean checkSelf) {
		this.checkSelf = checkSelf;
	}
	public boolean isCheckAll() {
		return checkAll;
	}
	public void setCheckAll(boolean checkAll) {
		this.checkAll = checkAll;
	}
	public boolean isUpdate() {
		return update;
	}
	public void setUpdate(boolean update) {
		this.update = update;
	}
	public boolean isRooter() {
		return rooter;
	}
	public void setRooter(boolean rooter) {
		this.rooter = rooter;
	}
	
}
