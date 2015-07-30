package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyOutService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SaveApplyOutAction extends ActionSupport implements ModelDriven<ApplyOut> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private IApplyOutService service;
	private IUserService serviceu;

	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}

	public void setService(IApplyOutService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("提交出差请求action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		User user=new User(); 
		user.setUsername(request.getParameter("Name"));
		User u=serviceu.findByUserName(user);
		applyo.setUserByApplyOutNameid(u);
		applyo.setApplyOutState(0);
		applyo.setApplyReadState("未读");
		boolean f=service.saveAppO(applyo);
		if(f){
			System.out.println("提交出差请求成功！");
			return SUCCESS;
		}else
			System.out.println("提交出差请求失败");
			return ERROR;
	}
	
	private ApplyOut applyo=new ApplyOut();
	
	public ApplyOut getModel() {
		System.out.println("hdjfhfklh");
		return applyo;
	}

}
