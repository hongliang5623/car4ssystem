package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.service.IOwnerService;
import com.opensymphony.xwork2.ActionSupport;


public class FindOwnerAction extends ActionSupport {
	
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
		System.out.println("������������鿴������action��Ĭ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		String owerName=request.getParameter("caroname");
		Carowner caro=new Carowner();
		caro.setOwerTruename(owerName);
		try{
		Carowner owner=service.findByUserName(caro);
		request.setAttribute("caro", owner);
			return SUCCESS;
			}
		catch(Exception e){
			System.out.println(e.getMessage());
			request.setAttribute("message", "<font color='red'>�Բ���û�д��ˣ������²���</font>");
			return ERROR;
		}
	}
	

}
