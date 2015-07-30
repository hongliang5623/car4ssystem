package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.service.IApplyToolsService;
import com.opensymphony.xwork2.ActionSupport;


public class CheckReadToolsAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IApplyToolsService service;
	public void setService(IApplyToolsService service) {
		this.service = service;
	}
	

	@Override
	public String execute() throws Exception {
		System.out.println("进入查看零件请求的action的默认方法");
		HttpServletRequest request=ServletActionContext.getRequest();
		String applytoolsid = request.getParameter("id");
		ApplyTools applytools=service.findApplyToolsById(applytoolsid);
		request.setAttribute("applyt", applytools);
		applytools.setApplyReadState("已读");
		 service.UpdataApplyTools(applytools);
			return SUCCESS;
	}
	

}
