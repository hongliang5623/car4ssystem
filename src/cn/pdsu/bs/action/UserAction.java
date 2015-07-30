package cn.pdsu.bs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.apache.struts2.ServletActionContext;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IOwnerService;
import cn.pdsu.bs.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport  {
	private static final long serialVersionUID = 1L;
	private IUserService serviceu;
	private IOwnerService serviceo;
	public void setServiceu(IUserService serviceu) {
		this.serviceu = serviceu;
	}
	public void setServiceo(IOwnerService serviceo) {
		this.serviceo = serviceo;
	}
	HttpServletRequest request = ServletActionContext.getRequest();
	HttpSession session = request.getSession();
	String name=request.getParameter("username");
	String password=request.getParameter("password");
	String flag=name.substring(3);
	@Override
	public String execute() throws Exception {
		System.out.println("权限"+flag);
		return deciderole();
	
	}
	private String deciderole() {
		//System.out.println(flag.equals("0"));
		if(flag.equals("0")){
			User user=new User();
			user.setUsername(name);
			user.setPassword(password);
			System.out.println("查找员工对象是否存在");
			boolean f=serviceu.checkUser(user);
				if(f){
					System.out.println("返回员工对象");
					User u=serviceu.findByUserName(user);
					session.setAttribute("value", 0);
					session.setAttribute("user", u);
						return SUCCESS;
				}else
					return ERROR;
		}else{
			Carowner owner=new Carowner();
			owner.setOwerName(name);
			owner.setOwerPwd(password);
		//	System.out.println("123");
			System.out.println("查找车主对象");
			boolean f=serviceo.checkUser(owner);
		if(f){
			System.out.println("返回车主对象");
			Carowner o=serviceo.findByUserName(owner);
			session.setAttribute("value", 1);
			session.setAttribute("user",o);
			return SUCCESS;
		}else
			return ERROR;
		
	}
	}

}

