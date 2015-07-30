package cn.pdsu.bs.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import cn.pdsu.bs.dao.IWeiXiuDao;
import cn.pdsu.bs.domain.Repare;
import cn.pdsu.bs.utils.IPageDao;


public class WeiXiuDaoImpl extends HibernateDaoSupport implements IWeiXiuDao{
	private IPageDao pagedao;
	public void setPagedao(IPageDao pagedao) {
		this.pagedao = pagedao;
	}
	public boolean saveW(Repare repare) {
		// TODO Auto-generated method stub
		try {
			   getHibernateTemplate().save(repare);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
	public Repare findById(Repare repare){
		String hql = "from Repare where weixdId='"+repare.getWeixdId()+"'"; 
		Repare r = (Repare) this.getHibernateTemplate().find(hql).get(0);
		return r;
	}
	public int getTotalrecord() {
 		
	 	return	pagedao.getTotalrecord("Repare");
	 	
		}
	public List<Object> getPageData(int startindex,int pagesize) {
		
		return	pagedao.getPageData(startindex,pagesize,"Repare");
	}
	
	}
