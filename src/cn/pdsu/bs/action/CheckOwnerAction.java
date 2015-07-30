package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.service.IOwnerService;

import com.opensymphony.xwork2.ActionSupport;


public class CheckOwnerAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IOwnerService service;
	
	public void setService(IOwnerService service) {
		this.service = service;
	}
	

	@Override
	public String execute() throws Exception {
		System.out.println("进入查看车主的action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		int id=Integer.parseInt(request.getParameter("id"));
		Carowner caro=new Carowner();
		caro.setOwnerId(id);
		Carowner owner=service.findByUserId(caro);
		request.setAttribute("caro", owner);
			return SUCCESS;
	}
	

}
