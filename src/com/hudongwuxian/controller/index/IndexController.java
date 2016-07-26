package com.hudongwuxian.controller.index;

import com.hudongwuxian.common.BaseController;

public class IndexController extends BaseController{
	public void index(){
		render("header.ftl");
	}
	public void indexPage(){
		render("index.ftl");
	}
}
