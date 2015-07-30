package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IApplyToolsService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowToolsPassAction extends ActionSupport {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyToolsService service;
	public void setService(IApplyToolsService service) {
		this.service = service;
	}



	public String execute() throws Exception {
		System.out.println("�����ȡ�����������actionĬ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		String pagenum = request.getParameter("pagenum");
		String url=request.getRequestURI();	
		System.out.println(pagenum+"·��"+url);
	
		Page page = service.getPageDatapass(pagenum,url);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}
