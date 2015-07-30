package cn.pdsu.bs.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pdsu.bs.dao.IApplyToolsDao;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.User;

public  class ApplyToolsDaoImpl extends HibernateDaoSupport implements IApplyToolsDao   {

	
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IApplyToolsDao#saveAT(cn.pdsu.bs.domain.ApplyTools)
	 */
	public boolean saveAT(ApplyTools applyT){
		   try {
			  
			   getHibernateTemplate().save(applyT);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }


/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyToolsDao#getTotalrecord()
 */
public int getTotalrecord() {
 		
	int count = 0;
	String hql = "from ApplyTools where applyToolsState=0";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	public int getTotalrecordread(User u) {
	
	int count = 0;
	String hql = "from ApplyTools where userByApplyToolsName="+u.getUserid()+"and applyToolsState=1";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	public int getTotalrecord2read(User u) {
		
	int count = 0;
	String hql = "from ApplyTools where userByApplyToolsName="+u.getUserid()+"and applyToolsState=1 and applyReadState='未读'";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
	
public int getTotalrecordpass() {
		
	int count = 0;
	String hql = "from ApplyTools where applyToolsState>0";
	count = this.getHibernateTemplate().find(hql).size();
	return count;
		}
/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyToolsDao#getPageData(int, int)
 */
public List<Object> getPageData(final int startindex,final int pagesize) {
		
	final String hql = "from ApplyTools where applyToolsState=0";
	
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
	
	final String hql = "from ApplyTools where userByApplyToolsName="+u.getUserid()+"and applyToolsState=1 order by applyToolsId desc";
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
	
	final String hql = "from ApplyTools where applyToolsState>0";
	
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
 * @see cn.pdsu.bs.daoImpl.IApplyToolsDao#findAT(java.lang.String)
 */
public ApplyTools findAT(String id){
	String hql = "from ApplyTools where applyToolsId='"+id+"'"; 
	ApplyTools applyT = (ApplyTools) this.getHibernateTemplate().find(hql).get(0);
	return applyT;
}

/* (non-Javadoc)
 * @see cn.pdsu.bs.daoImpl.IApplyToolsDao#updataAT(cn.pdsu.bs.domain.ApplyTools)
 */
public boolean updataAT(ApplyTools applyT){
	
try {
	   
	this.getHibernateTemplate().update(applyT);
	   return true;
	  }
catch (Exception e) {
	   e.printStackTrace();
	  }
	  return false;
	 }

}
