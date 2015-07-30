package cn.pdsu.bs.action;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.pdsu.bs.domain.Repare;
import cn.pdsu.bs.service.IRepareService;
import cn.pdsu.bs.utils.DataHandle;

import com.opensymphony.xwork2.ActionSupport;
public class SaveWeiXiuAction extends ActionSupport {	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IRepareService service;
	public void setService(IRepareService service) {
		this.service = service;
	}
	@Override
	public String execute() throws Exception {
	Repare repare=new Repare();
	DataHandle datahandle=new DataHandle();
	HttpServletRequest request = ServletActionContext.getRequest();
	repare.setRepareName(request.getParameter("repareName"));
	repare.setCarName(request.getParameter("carName"));
	repare.setRepareResons(request.getParameter("repareResons"));
	repare.setRepareTime(request.getParameter("repareTime"));
	repare.setReparePlan(request.getParameter("reparePlan"));
	
	String tools[]=request.getParameterValues("mingzi");
	String totals[]=request.getParameterValues("shuliang");
	System.out.println(request.getParameterValues("mingzi"));
	repare.setRepareTools(datahandle.arryToStr(tools,totals));
	System.out.println(datahandle.arryToStr(tools,totals));
	repare.setRepareResult(request.getParameter("repareResult"));
	repare.setRepareSum(request.getParameter("repareSum"));
	repare.setZhuguanname(request.getParameter("zhuguanname"));
	boolean f=service.saveRepare(repare);
	if(f){
		System.out.println("维修单保存成功");
		request.setAttribute("tianjiaMessage", "<font color='red'>维修单保存成功！</font>");
			return SUCCESS;
			}else{
				System.out.println("维修单保存失败，请重新填写");
				return ERROR;
			}
	}
}
