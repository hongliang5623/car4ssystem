package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.service.IApplyRepareService;

import com.opensymphony.xwork2.ActionSupport;


public class CheckReadRepareAction extends ActionSupport {
	private IApplyRepareService service; 
	
	public void setService(IApplyRepareService service) {
		this.service = service;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("进入查看维修请求的action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		String applyRId = request.getParameter("id");
		ApplyRepare applyreare=service.findApplyRepareById(applyRId);		
		request.setAttribute("applyr", applyreare);
		applyreare.setApplyReadState("已读");
	    service.UpdataApplyRepare(applyreare);
			return SUCCESS;
	}
	

}
