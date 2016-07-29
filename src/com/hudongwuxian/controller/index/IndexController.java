package com.hudongwuxian.controller.index;

import com.hudongwuxian.Interceptor.PjaxIntercepter;
import com.hudongwuxian.common.BaseController;
import com.hudongwuxian.utils.PjaxUtil;
import com.jfinal.aop.Before;
import com.jfinal.aop.Clear;

@Before(PjaxIntercepter.class)
public class IndexController extends BaseController{
	@Clear
	public void index(){
		String url = getAttr("url");
		System.out.println(url);
		//首页自判定是否为pjax请求
		if(PjaxUtil.isPjaxRequest(getRequest())){
			indexPage();
		}else{
			System.out.println("url = "+url);
			if(url == null||url.equals("/index")||url.equals("/index/index")||url.equals("")){
				System.out.println("ture");
				setAttr("url","/index/indexPage");
			}
			else{
				System.out.println("false");
				setAttr("url",url);
			}
				
			render("header.ftl");
		}
	}
	
	public void indexPage(){
		render("index.ftl");
	}
}
