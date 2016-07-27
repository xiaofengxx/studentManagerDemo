package com.hudongwuxian.Interceptor;

import com.jfinal.aop.Interceptor;
import com.jfinal.aop.Invocation;
import com.jfinal.core.Controller;

/**
 * Created by HaSiKa on 2016/7/27.
 */
public class LoginInterceptor implements Interceptor {
    @Override
    public void intercept(Invocation invocation) {
        Controller controller = invocation.getController();
        if(controller.getSessionAttr("user") != null){
            invocation.invoke();
        }else {
            System.out.println("未登录");
             //需要在login页面进行处理
            controller.setAttr("msg","请登录!");
            controller.redirect("/user");
        }
    }
}
