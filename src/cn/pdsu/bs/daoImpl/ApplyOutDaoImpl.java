package cn.pdsu.bs.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pdsu.bs.dao.IApplyOutDao;
import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.User;

public  class ApplyOutDaoImpl extends HibernateDaoSupport implements IApplyOutDao {

	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IApplyOutDaO#saveAO(cn.pdsu.bs.domain.ApplyOut)
	 */
	public boolean saveAO(ApplyOut applyo){
		   try {
			   /*System.out.println(applyo.getApplyOutDestination());
			   System.out.println(applyo.getApplyOutNeedtimes());
			   applyo.setApplyOutNeedtools("1");
			   System.out.println(applyo.getApplyOutNeedtools());
			 
			   System.out.println(applyo.getApplyOutReasons());
			   applyo.setApplyOutState("1");
			   System.out.println(applyo.getApplyOutState());
			   
			   System.out.println(applyo.getApplyOutTime());
			   applyo.setShenpiOutAdvice("1");
			   System.out.println(applyo.getShenpiOutAdvice());
			   
			   applyo.setApplyOutId(10);
			   System.out.println(applyo.getApplyOutId());
			
			   System.out.println(applyo.getUserByApplyOutName());
			   applyo.setUserByShenpiOutName(applyo.getUserByApplyOutName());
			   System.out.println(applyo.getUserByShenpiOutName());
			 */
			   getHibernateTemplate().save(applyo);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyOutDaO#getTotalrecord()
 */
public int getTotalrecord() {
 		
	int count = 0;
	String hql = "from ApplyOut where applyOutState=0";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}

	public int getTotalrecordread(User u) {
		
	int count = 0;
	String hql = "from ApplyOut where userByApplyOutNameid="+u.getUserid()+"and applyOutState=1";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	public int getTotalrecord2read(User u) {
		
	int count = 0;
	String hql = "from ApplyOut where userByApplyOutNameid="+u.getUserid()+"and applyOutState=1 and applyReadState='未读'";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	
	public int getTotalrecordpass() {
		
	int count = 0;
	String hql = "from ApplyOut where applyOutState>0";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}

/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyOutDaO#getPageData(int, int)
 */
public List<Object> getPageData(final int startindex,final int pagesize) {
		
	final String hql = "from ApplyOut where applyOutState=0";
		// 调用模板的execute方法，参数是实现了HibernateCallback接口的匿名类，
		List list=this.getHibernateTemplate().executeFind(new HibernateCallback() {   
			public Object doInHibernate(Session session)    
			throws HibernateException, SQLException {   
				Query query = session.createQuery(hql);   
				query.setFirstResult(startindex);    
				query.setMaxResults(pagesize);    
				List list = query.list(); 
				return list;}  });
			return list;

	}
public List<Object> getPageDataread(final int startindex,final int pagesize,final User u) {
	
	final String hql = "from ApplyOut where userByApplyOutNameid="+u.getUserid()+"and applyOutState=1 order by applyOutId desc";
		// 调用模板的execute方法，参数是实现了HibernateCallback接口的匿名类，
		List list=this.getHibernateTemplate().executeFind(new HibernateCallback() {   
			public Object doInHibernate(Session session)    
			throws HibernateException, SQLException {   
				Query query = session.createQuery(hql);   
				query.setFirstResult(startindex);    
				query.setMaxResults(pagesize);    
				List list = query.list(); 
				return list;}  });
			return list;

	}
public List<Object> getPageDatapass(final int startindex,final int pagesize) {
	
	final String hql = "from ApplyOut where applyOutState>0";
		// 调用模板的execute方法，参数是实现了HibernateCallback接口的匿名类，
		List list=this.getHibernateTemplate().executeFind(new HibernateCallback() {   
			public Object doInHibernate(Session session)    
			throws HibernateException, SQLException {   
				Query query = session.createQuery(hql);   
				query.setFirstResult(startindex);    
				query.setMaxResults(pagesize);    
				List list = query.list(); 
				return list;}  });
			return list;

	}
/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyOutDaO#findO(cn.pdsu.bs.domain.ApplyOut)
 */
public ApplyOut findAO(String id){
	String hql = "from ApplyOut where applyOutId="+id; 
	ApplyOut applyout = (ApplyOut) this.getHibernateTemplate().find(hql).get(0);
	return applyout;
}
public ApplyOut findAOByU(User u){
	String hql = "from ApplyOut where userByApplyOutNameid="+u.getUserid()+"and applyOutState=1"; 
	ApplyOut applyout = (ApplyOut) this.getHibernateTemplate().find(hql).get(0);
	return applyout;
}
public boolean updataAO(ApplyOut applyo){
	
try {
	   
	this.getHibernateTemplate().update(applyo);
	   return true;
	  }
catch (Exception e) {
	   e.printStackTrace();
	  }
	  return false;
	 }

}
