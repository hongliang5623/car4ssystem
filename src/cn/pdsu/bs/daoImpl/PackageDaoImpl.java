package cn.pdsu.bs.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.pdsu.bs.dao.IPackageDao;
import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.utils.IPageDao;

public class PackageDaoImpl extends HibernateDaoSupport implements IPackageDao{
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IPackageDao#saveP(cn.pdsu.bs.domain.Carpackage)
	 */
	private IPageDao pagedao;
	public void setPagedao(IPageDao pagedao) {
		this.pagedao = pagedao;
	}
	
	public boolean saveP(Carpackage carp){
		   try {
			   getHibernateTemplate().save(carp);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
 	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IPackageDao#findAll()
	 */
 	public Carpackage findP(Carpackage carp){
		String hql = "from Carpackage where packageName='"+carp.getPackageName()+"'";
		return (Carpackage) this.getHibernateTemplate().find(hql).get(0);
		
	}   

 	public int getTotalrecord() {
 		
 	return	pagedao.getTotalrecord("Carpackage");
 	
	}
	
	public List<Object> getPageData(int startindex,int pagesize) {
		return	pagedao.getPageData(startindex,pagesize,"Carpackage");
	}


	

}