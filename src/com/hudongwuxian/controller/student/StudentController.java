package com.hudongwuxian.controller.student;

import com.hudongwuxian.Interceptor.PjaxIntercepter;
import com.hudongwuxian.common.BaseController;
import com.jfinal.aop.Before;

@Before(PjaxIntercepter.class)
public class StudentController extends BaseController{
	public void rencent(){
		render("");
	}
	//报名学生
	public void enrollStudent(){
		render("enrollStudent.ftl");
	}
	public void attendanceManage(){
		render("attendanceManage.ftl");
	}
}
