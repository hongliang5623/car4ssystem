package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.service.IOwnerService;

import com.opensymphony.xwork2.ActionSupport;


public class DeleteOwnerAction extends ActionSupport {
	
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
		System.out.println("ɾ���û�action��Ĭ�Ϸ���");
		int id=Integer.parseInt(request.getParameter("id"));
		Carowner caro=new Carowner();
		caro.setOwnerId(id);
		Carowner owner=service.findByUserId(caro);
		boolean f=service.deleteOwner(owner);
		if(f){
			System.out.println("����"+owner.getOwerTruename()+"ɾ���ɹ���");
			return SUCCESS;
		}
			return ERROR;
	}
	

}
