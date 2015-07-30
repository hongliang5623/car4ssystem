package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyOutService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class TestApplyOutAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyOutService service;
	private IUserService serviceu;

	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}
	public void setService(IApplyOutService service) {
		this.service = service;
	}
	
	public String execute() throws Exception {
		System.out.println("进入测试action默认方法");
		/*HttpServletRequest request=ServletActionContext.getRequest();
		String pagenum = request.getParameter("pagenum");
		String url=request.getRequestURI();	
		System.out.println(pagenum+"路径"+url);
	
		Page page = service.getPageData(pagenum,url);
		request.setAttribute("page", page);*/
		User user=new User(); 
		String s="1230";
		user.setUsername(s);
		User u=serviceu.findByUserName(user);
		ApplyOut applyo=service.findAppOutByUserId(u);
		System.out.println("获取到了对象"+applyo);
		System.out.println(applyo.getApplyOutDestination());
		int n=service.get2read(u);
		System.out.println(n);
		return SUCCESS;
	}
}
