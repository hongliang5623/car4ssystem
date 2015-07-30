package cn.pdsu.bs.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pdsu.bs.dao.IBaoyangDao;
import cn.pdsu.bs.domain.Baoyang;
import cn.pdsu.bs.utils.IPageDao;

public class BaoyangDaoImpl extends HibernateDaoSupport implements IBaoyangDao {
	private IPageDao pagedao;
	public void setPagedao(IPageDao pagedao) {
		this.pagedao = pagedao;
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IBaoyangDao#saveBY(cn.pdsu.bs.domain.Baoyang)
	 */
	
	public boolean saveBY(Baoyang baoyang){
		   try {
			  
			   getHibernateTemplate().save(baoyang);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
	public Baoyang findById(Baoyang baoyang){
		String hql = "from Baoyang where baoyangId='"+baoyang.getBaoyangId()+"'"; 
		Baoyang b = (Baoyang) this.getHibernateTemplate().find(hql).get(0);
		return b;
	}
	public int getTotalrecord() {
 		
	 	return	pagedao.getTotalrecord("Baoyang");
	 	
		}
	public List<Object> getPageData(int startindex,int pagesize) {
		
		return	pagedao.getPageData(startindex,pagesize,"Baoyang");
	}
}
