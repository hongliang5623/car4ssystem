package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.service.IApplyRepareService;

import com.opensymphony.xwork2.ActionSupport;


public class CheckApplyRepareAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyRepareService service; 
	public void setService(IApplyRepareService service) {
		this.service = service;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("����鿴ά�������action��Ĭ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		String applyRepareId= request.getParameter("id");
		ApplyRepare applyr=service.findApplyRepareById(applyRepareId);
		request.setAttribute("applyr", applyr);
			return SUCCESS;
	}
	

}
