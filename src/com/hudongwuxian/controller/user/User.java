package com.hudongwuxian.controller.user;

import com.jfinal.aop.Clear;
import com.jfinal.plugin.activerecord.Model;

public class User extends Model<User>{
	public static User dao = new User();
	public static User Login(String account,String password){
		return dao.findFirst("select * from user where account = ? and password = ?",account,password);
	}

	public static User addUser(String account,String password,int permission){
		return null;
	}
}
