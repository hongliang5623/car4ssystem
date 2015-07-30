package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyRepareService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowReadRepareAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService serviceu;
	private IApplyRepareService service; 
	
	public void setService(IApplyRepareService service) {
		this.service = service;
	}
	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}
	
	public String execute() throws Exception {
		System.out.println("进入获取员工。。。已审批申请action默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		HttpSession session = request.getSession();
		String pagenum = request.getParameter("pagenum");
		User u1=(User) session.getAttribute("user");
		User u=serviceu.findByUserName(u1);
		String url=request.getRequestURI();	
		System.out.println(pagenum+"路径"+url);
	
		Page page = service.getPageDataread(pagenum,url,u);
		if(page.getList().isEmpty()){
			request.setAttribute("message", "<font color='red'>亲 ，你暂时没有维修安排，也没有维修记录。</font>");
			return ERROR;
		}else{
			int num=service.get2read(u);
			request.setAttribute("message", "<font color='red'>亲 ，你有"+num+"条未读审批等待查看。</font>");
			request.setAttribute("page", page);
			return SUCCESS;
		}
		
	}
}
