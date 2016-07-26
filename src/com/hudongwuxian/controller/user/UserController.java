package com.hudongwuxian.controller.user;

import com.hudongwuxian.common.BaseController;

public class UserController extends BaseController{
	public void index(){
		render("login.ftl");
	}
	public void login(){
		String account = getPara("account");
		String password = getPara("password");
		String state = ERROR;
		User user = User.dao.findFirst("select * from user where account = ? and password = ?"
				,account,password);
		if(user != null){
			state=SUCCESE;
		}
		setAttr("state", state);
		renderJson();
	}
	public void addUser(){
		render("addUser.ftl");
	}
}
