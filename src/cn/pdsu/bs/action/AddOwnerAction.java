package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.service.IOwnerService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class AddOwnerAction extends ActionSupport implements ModelDriven<Carowner> {
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
		HttpServletRequest request=ServletActionContext.getRequest();
		System.out.println("action的默认方法");
		boolean f=service.saveOwner(caro);
		if(f){
			System.out.println("添加车主成功！");
			request.setAttribute("tianjiaMessage", "<font color='red'>添加车主成功！</font>");
			return SUCCESS;
		}else
			System.out.println("添加车主失败");
			return ERROR;
	}
	private Carowner caro=new Carowner();
	
	public Carowner getModel() {
		return  caro;
	}

}
