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
		System.out.println("action的默认方法");
		boolean f=packservice.savePackage(carp);
		if(f){
			System.out.println("套餐设置成功");
			return SUCCESS;
		}else
			System.out.println("套餐设置失败");
			return ERROR;
	}
	private Carpackage carp=new Carpackage();
	
	public Carpackage getModel() {
		// TODO Auto-generated method stub
		System.out.println("进入action");
	//	System.out.println(carp.getPackageName());
		return carp;
	}

}
