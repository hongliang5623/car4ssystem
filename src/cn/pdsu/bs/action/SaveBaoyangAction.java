package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.Baoyang;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IBaoyangService;
import cn.pdsu.bs.service.IOwnerService;
import cn.pdsu.bs.service.IUserService;
import cn.pdsu.bs.utils.DataHandle;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class SaveBaoyangAction extends ActionSupport implements ModelDriven<Baoyang> {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IUserService serviceu;
	private IOwnerService serviceo;
	private IBaoyangService service;
	
	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}

	public void setServiceo(IOwnerService serviceo) {
		this.serviceo = serviceo;
	}

	public void setService(IBaoyangService service) {
		this.service = service;
	}

	@Override
	public String execute() throws Exception {
		System.out.println("�ύ������action��Ĭ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		Carowner caro=new Carowner();
		
		caro.setOwerName(request.getParameter("name1"));
		try{
			Carowner c=serviceo.findByUserName(caro);
			DataHandle datahandle=new DataHandle();
			User user=new User(); 
			
			user.setUsername(request.getParameter("name2"));
			User u=serviceu.findByUserName(user);
			
			
			String tools[]=request.getParameterValues("baoyangItem");
			System.out.println(request.getParameterValues("baoyangItem"));
			
			baoyang.setBaoyangItem(datahandle.arry2Str(tools));
			System.out.println(datahandle.arry2Str(tools));
			baoyang.setCarowner(c);
			baoyang.setUser(u);
			boolean f=service.saveBaoyang(baoyang);
			if(f){
				System.out.println("�ύ�������ɹ���");
			
				request.setAttribute("tianjiaMessage", "<font color='red'>�������ύ�ɹ���</font>");
				return SUCCESS;
			}else
				System.out.println("�ύ������ʧ��");
				return ERROR;
			}
		
		catch(Exception e){
			String s=request.getParameter("name1");
			request.setAttribute("tianjiaMessage", "<font color='red'>����"+s+"�����ڣ�������ڲ���</font>");
			}
		return SUCCESS;
		}
		
		
	
	private Baoyang baoyang=new Baoyang();
	
	public Baoyang getModel() {
		System.out.println("��ȡ������ʵ��");
		return baoyang;
	}

}
