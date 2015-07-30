package cn.pdsu.bs.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;


import cn.pdsu.bs.dao.IApplyRepareDao;
import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.User;

public  class ApplyRepareDaoImpl extends HibernateDaoSupport implements IApplyRepareDao  {

	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IApplyRepareDao#saveAR(cn.pdsu.bs.domain.ApplyRepare)
	 */
	public boolean saveAR(ApplyRepare applyR){
		   try {
			  
			   getHibernateTemplate().save(applyR);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }

/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyRepareDao#getTotalrecord()
 */
public int getTotalrecord() {
 		
	int count = 0;
	String hql = "from ApplyRepare where applyRepareState=0";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}

	public int getTotalrecordread(User u) {
	
	int count = 0;
	String hql = "from ApplyRepare where userByApplyRepareName="+u.getUserid()+"and applyRepareState=1";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	
	public int getTotalrecord2read(User u) {
		
	int count = 0;
	String hql = "from ApplyRepare where userByApplyRepareName="+u.getUserid()+"and applyRepareState=1 and applyReadState='未读'";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}

/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyRepareDao#getPageData(int, int)
 */
public List<Object> getPageData(final int startindex,final int pagesize) {
		
	final String hql = "from ApplyRepare where applyRepareState=0";
	
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
 * @see cn.pdsu.bs.daoImpl.IApplyRepareDao#findAR(java.lang.String)
 */
public List<Object> getPageDataread(final int startindex,final int pagesize,final User u) {
	
	final String hql = "from ApplyRepare where userByApplyRepareName="+u.getUserid()+"and applyRepareState=1 order by applyRepareId desc";
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
public ApplyRepare findAR(String id){
	String hql = "from ApplyRepare where applyRepareId='"+id+"'"; 
	ApplyRepare applyR = (ApplyRepare) this.getHibernateTemplate().find(hql).get(0);
	return applyR ;
}
/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyRepareDao#updataAO(cn.pdsu.bs.domain.ApplyRepare)
 */
public boolean updataAR(ApplyRepare applyR){
	
try {
	   
	this.getHibernateTemplate().update(applyR);
	   return true;
	  }
catch (Exception e) {
	   e.printStackTrace();
	  }
	  return false;
	 }

}
