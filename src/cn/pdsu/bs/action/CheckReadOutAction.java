package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.service.IApplyOutService;

import com.opensymphony.xwork2.ActionSupport;


public class CheckReadOutAction extends ActionSupport {
	private IApplyOutService service;
	public void setService(IApplyOutService service) {
		this.service = service;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String execute() throws Exception {
		System.out.println("进入查看出差请求的action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		String applyoutid = request.getParameter("id");
		ApplyOut applyout=service.findAppOutById(applyoutid);		
		request.setAttribute("applyout", applyout);
		 applyout.setApplyReadState("已读");
		 service.UpdataApplyOut(applyout);
			return SUCCESS;
	}
	

}
