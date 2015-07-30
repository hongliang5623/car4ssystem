package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyOutService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShenpiApplyOutAction extends ActionSupport implements ModelDriven<ApplyOut> {
	
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
		System.out.println("提交出差审批action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		
		User user1=new User(); 
		user1.setUsername(request.getParameter("name1"));
		System.out.println(request.getParameter("name1"));
		User u1=serviceu.findByUserName(user1);
		applyo.setUserByApplyOutNameid(u1);
		
		User user2=new User(); 
		user2.setUsername(request.getParameter("name2"));
		System.out.println(request.getParameter("name2"));
		User u2=serviceu.findByUserName(user2);
		applyo.setUserByShenpiOutNameid(u2);
		
		applyo.setApplyOutState(1);
		
		boolean f=service.UpdataApplyOut(applyo);
		if(f){
			System.out.println("审批出差请求成功！");
			return SUCCESS;
		}else
			System.out.println("审批出差请求失败");
			return ERROR;
	}
	
	private ApplyOut applyo=new ApplyOut();
	
	public ApplyOut getModel() {
		System.out.println("hdjfhfklh");
		return applyo;
	}

}
