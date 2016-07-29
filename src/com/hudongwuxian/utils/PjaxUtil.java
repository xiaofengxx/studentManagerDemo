package com.hudongwuxian.utils;

import javax.servlet.http.HttpServletRequest;

public class PjaxUtil {
	public static boolean isPjaxRequest(HttpServletRequest req){
		//获取header中 key为x-pjax的参数，判断是否为Pjax请求
		String header = req.getHeader("X-PJAX");
		System.out.println("PjaxUtil : header="+header);
		Boolean pjax = Boolean.parseBoolean(header);
		if(pjax==null || !pjax)
			return false;
		return true;
		
	}
	public static void setHeader(String key,String val){
		
	}
}
