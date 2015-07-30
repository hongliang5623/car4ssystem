package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;


import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyRepareService;
import cn.pdsu.bs.service.IPackageService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShenpiApplyRepareAction extends ActionSupport implements ModelDriven<ApplyRepare> {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService serviceu;
	private IApplyRepareService service; 
	private IPackageService servicep;
	
	public void setServicep(IPackageService servicep) {
		this.servicep = servicep;
	}
	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}
	
	public void setService(IApplyRepareService service) {
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
		applyr.setUserByApplyRepareName(u1);
		
		User user2=new User(); 
		user2.setUsername(request.getParameter("name2"));
		//System.out.println(request.getParameter("name2"));
		User u2=serviceu.findByUserName(user2);
		applyr.setUserByShenpiName(u2);
		
		Carpackage carp=new Carpackage();
		carp.setPackageName(request.getParameter("packagename"));
		Carpackage carpack=servicep.getPackageByName(carp);
		applyr.setCarpackage(carpack);
		
		applyr.setApplyRepareState(1);
		
		boolean f=service.UpdataApplyRepare(applyr);
		if(f){
			System.out.println("审批出差请求成功！");
			return SUCCESS;
		}else
			System.out.println("审批出差请求失败");
			return ERROR;
	}
	
	private ApplyRepare applyr=new ApplyRepare();
	
	public ApplyRepare getModel() {
		System.out.println("获得审批后的维修申请对象");
		return applyr;
	}

}
