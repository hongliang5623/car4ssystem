package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IRepareService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowRepareAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IRepareService service;
	
	
	public void setService(IRepareService service) {
		this.service = service;
	}

	public String execute() throws Exception {
		System.out.println("�����ȡ����ά�޵�actionĬ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		String pagenum = request.getParameter("pagenum");
		String url=request.getRequestURI();	
		System.out.println(pagenum+"·��"+url);
	
		Page page = service.getPageData(pagenum,url);
		request.setAttribute("page", page);
		return SUCCESS;
	}
}