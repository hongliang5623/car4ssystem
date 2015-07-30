package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IApplyOutService;
import com.opensymphony.xwork2.ActionSupport;

public class ShowApplyOutAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyOutService service;
	public void setService(IApplyOutService service) {
		this.service = service;
	}
	
	public String execute() throws Exception {
		System.out.println("进入获取所有外出申请action默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		String pagenum = request.getParameter("pagenum");
		String url=request.getRequestURI();	
		System.out.println(pagenum+"路径"+url);
	
		Page page = service.getPageData(pagenum,url);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}
