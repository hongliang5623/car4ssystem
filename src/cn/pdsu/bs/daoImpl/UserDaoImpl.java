package cn.pdsu.bs.daoImpl;


import java.util.List;

import org.junit.Test;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.pdsu.bs.dao.IUserDao;
import cn.pdsu.bs.domain.User;

public class UserDaoImpl extends HibernateDaoSupport implements IUserDao {
	
	
	public void testConnect(){
		System.out.println(this.getHibernateTemplate());
	}
	
	public boolean checkU(User u){
		//System.out.println(u.getUsername()+"  "+u.getPassword());
		String hql="from User where username='"+u.getUsername()+"'and password='"+u.getPassword()+"'";
		List<User> list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return true;
		}
		return false;
		
	}
	
	public User findU(User u){
		String hql = "from User where username='"+u.getUsername()+"'"; 
		
		User user = (User)this.getHibernateTemplate().find(hql).get(0);
		//System.out.println(user+".........."+this.getHibernateTemplate());
		return user;
	}
	@Test
	public void test(){
		testConnect();
	}
}
