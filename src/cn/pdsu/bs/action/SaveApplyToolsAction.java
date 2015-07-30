package cn.pdsu.bs.action;


import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyRepareService;
import cn.pdsu.bs.service.IApplyToolsService;
import cn.pdsu.bs.service.IUserService;
import cn.pdsu.bs.utils.DataHandle;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
public class SaveApplyToolsAction extends ActionSupport implements ModelDriven<ApplyTools> {
	
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
		System.out.println("�ύʹ���������action��Ĭ�Ϸ���");
		HttpServletRequest request=ServletActionContext.getRequest();
		
		DataHandle datahandle=new DataHandle();
		User user=new User(); 
		
		
		user.setUsername(request.getParameter("Name"));
		User u=serviceu.findByUserName(user);
		
		ApplyRepare applyr=servicer.findApplyRepareById(request.getParameter("wxdId"));
		
		String tools[]=request.getParameterValues("mingzi");
		String totals[]=request.getParameterValues("shuliang");
		
		System.out.println(request.getParameterValues("mingzi"));
		
		applyt.setApplyTools(datahandle.arryToStr(tools,totals));
		
		System.out.println(datahandle.arryToStr(tools,totals));
		
		applyt.setUserByApplyToolsName(u);
		applyt.setApplyRepare(applyr);
		applyt.setApplyToolsState(0);
		applyt.setApplyReadState("δ��");
		
		boolean f=service.saveAppT(applyt);
		if(f){
			System.out.println("�ύά������ɹ���");
		
			request.setAttribute("tianjiaMessage", "<font color='red'>���ʹ�������ύ�ɹ�����ȴ�����</font>");
			return SUCCESS;
		}else
			System.out.println("�ύά������ʧ��");
			return ERROR;
	}
	
	private ApplyTools applyt=new ApplyTools();
	
	public ApplyTools getModel() {
		System.out.println("��ȡ�������ʵ��");
		return applyt;
	}

}
