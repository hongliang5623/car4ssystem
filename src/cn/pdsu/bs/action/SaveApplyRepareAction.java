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

public class SaveApplyRepareAction extends ActionSupport implements ModelDriven<ApplyRepare> {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyRepareService service; 
	private IUserService serviceu;
	private IPackageService servicep;
	
	public void setServicep(IPackageService servicep) {
		this.servicep = servicep;
	}

	public void setService(IApplyRepareService service) {
		this.service = service;
	}

	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}

	

	@Override
	public String execute() throws Exception {
		System.out.println("�ύ��������action��Ĭ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		User user=new User(); 
		user.setUsername(request.getParameter("Name"));
		User u=serviceu.findByUserName(user);
		
		Carpackage carp=new Carpackage();
		carp.setPackageName(request.getParameter("packagename"));
		Carpackage carpack=servicep.getPackageByName(carp);
		
		applyr.setUserByApplyRepareName(u);
		applyr.setCarpackage(carpack);
		applyr.setApplyRepareState(0);
		applyr.setApplyReadState("δ��");
		boolean f=service.saveAppR(applyr);
		if(f){
			System.out.println("�ύά������ɹ���");
		
			request.setAttribute("tianjiaMessage", "<font color='red'>�ύά������ɹ�����ȴ�����</font>");
			return SUCCESS;
		}else
			System.out.println("�ύά������ʧ��");
			return ERROR;
	}
	
	private ApplyRepare applyr=new ApplyRepare();
	
	public ApplyRepare getModel() {
		System.out.println("��ȡά��ʵ��");
		return applyr;
	}

}
