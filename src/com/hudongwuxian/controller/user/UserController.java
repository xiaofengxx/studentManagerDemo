package com.hudongwuxian.controller.user;

import com.hudongwuxian.Interceptor.PjaxIntercepter;
import com.hudongwuxian.common.BaseController;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;

@Before(PjaxIntercepter.class)
public class UserController extends BaseController{

	@Clear
	public void index(){
		render("login.ftl");
	}
	@Clear
	public void login(){
		String account = getPara("account");
		String password = getPara("password");
		String state = ERROR;
		User user = User.Login(account,password);
		if(user != null){
			state=SUCCESE;
			setSessionAttr("user",user);
		}
		setAttr("state", state);
		renderJson();
	}
	public void logout(){
		removeSessionAttr("user");
		render("login.ftl");
	}
	public void addUser(){
		render("addUser.ftl");
	}
	public void addUserGroup(){
		render("addUserGroup.ftl");
	}
	
	public void addUserSubmit(){
		String account = getPara("account","1");
		String password = getPara("password");

		String state = ERROR;

		setAttr("state",state);
		renderJson();
	}
}
