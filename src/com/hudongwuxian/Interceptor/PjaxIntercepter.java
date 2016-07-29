package com.hudongwuxian.Interceptor;

import com.hudongwuxian.utils.PjaxUtil;
import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

public class PjaxIntercepter implements Interceptor{

	@Override
	public void intercept(Invocation inv) {
		//获取Controller对象
		System.out.println("拦截器开始");
		Controller con = inv.getController();
		//获取路径
		String url = inv.getActionKey();
		System.out.println("拦截器中 pjax="+con.getRequest().getHeader("X-PJAX"));
		if(!PjaxUtil.isPjaxRequest(con.getRequest())){
			con.setAttr("url", url);
			con.forwardAction("/index");
		}else{
			inv.invoke();
		}
		
	}

}
