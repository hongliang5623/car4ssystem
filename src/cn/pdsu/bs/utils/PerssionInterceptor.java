package cn.pdsu.bs.utils;


import java.util.Map;

import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.serviceImpl.UserServiceImpl;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/**
 * 自定义拦截器,实现只有经理才能进行审批处理
 *   * struts2中的拦截器是单实例运行
 */  

@SuppressWarnings("serial")
public class PerssionInterceptor implements Interceptor {
	
	public PerssionInterceptor(){
		System.out.println("PerssionInterceptor拦截器的构造方法");
	}
	/**
	 * 在拦截器的生命周期中调用一次
	 */
	public void init() {
       System.out.println("init拦截器的初始化方");
	}
	/**
	 * 在拦截器的生命周期中调用n次
	 *   * invocation参数运行时有struts2注入
	 */
	public String intercept(ActionInvocation invocation) throws Exception {
		System.out.println("执行真正意义拦截的方");
		System.out.println("invocation.getAction()  "+invocation.getAction());
		System.out.println("invocation.getProxy().getActionName()  "+invocation.getProxy().getActionName());
		System.out.println("invocation.getProxy().getMethod()  "+invocation.getProxy().getMethod());
		System.out.println("invocation.getProxy().getNamespace()  "+invocation.getProxy().getNamespace());
		//获取session
		System.out.println("拦截器执行");
		Map sessionMap=invocation.getInvocationContext().getSession();
		//获取登录用户的信息
		User u1=(User) sessionMap.get("user");
//		UserServiceImpl serviceu=new UserServiceImpl();
//		User u=serviceu.findByUserName(u1);
		int r=u1.getRight1();
		if(r==1){  //没有登录
			return "error";
		}
		//调用action中的方法---这里是UserAction的save方法
		String result=invocation.invoke();
		return result;
	}
	/**
	 * 在拦截器的生命周期中调用一次
	 */
	public void destroy() {
		 System.out.println("destroy拦截器的销毁方法");
	}
}
