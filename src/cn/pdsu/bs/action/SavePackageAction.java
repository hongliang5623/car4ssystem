package cn.pdsu.bs.action;

import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.service.IPackageService;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class SavePackageAction extends ActionSupport implements ModelDriven<Carpackage> {
	
	private static final long serialVersionUID = 1L;
	/**
	 * 
	 */
	private IPackageService packservice;

	public void setPackservice(IPackageService packservice) {
		this.packservice = packservice;
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("action��Ĭ�Ϸ���");
		boolean f=packservice.savePackage(carp);
		if(f){
			System.out.println("�ײ����óɹ�");
			return SUCCESS;
		}else
			System.out.println("�ײ�����ʧ��");
			return ERROR;
	}
	private Carpackage carp=new Carpackage();
	
	public Carpackage getModel() {
		// TODO Auto-generated method stub
		System.out.println("����action");
	//	System.out.println(carp.getPackageName());
		return carp;
	}

}
