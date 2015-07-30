package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyRepareService;
import cn.pdsu.bs.service.IApplyToolsService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class ShenpiApplyToolsAction extends ActionSupport implements ModelDriven<ApplyTools> {
	
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private IUserService serviceu;
	private IApplyToolsService service;
	private IApplyRepareService servicer;

	public void setServicer(IApplyRepareService servicer) {
		this.servicer = servicer;
	}
	public void setService(IApplyToolsService service) {
		this.service = service;
	}
	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}
	@Override
	public String execute() throws Exception {
		System.out.println("提交出差审批action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		
		ApplyRepare applyr=servicer.findApplyRepareById(request.getParameter("applyRId"));
		User user1=new User(); 
		user1.setUsername(request.getParameter("name1"));
		System.out.println(request.getParameter("name1"));
		User u1=serviceu.findByUserName(user1);
		
		User user2=new User(); 
		user2.setUsername(request.getParameter("name2"));
		System.out.println(request.getParameter("name2"));
		User u2=serviceu.findByUserName(user2);
		
		applyt.setUserByApplyToolsName(u1);
		applyt.setUserByShenpiName(u2);
		
		applyt.setApplyRepare(applyr);
		
		applyt.setApplyToolsState(1);
		
		boolean f=service.UpdataApplyTools(applyt);
		if(f){
			System.out.println("零件申请审批成功！");
			return SUCCESS;
		}else
			System.out.println("零件申请审批失败");
			return ERROR;
	}
	
	private ApplyTools applyt=new ApplyTools();
	
	public ApplyTools getModel() {
		System.out.println("获取审批后的零件申请实体");
		return applyt;
	}

}
