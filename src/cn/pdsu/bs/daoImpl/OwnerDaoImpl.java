package cn.pdsu.bs.daoImpl;


import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pdsu.bs.dao.IOwnerDao;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.utils.IPageDao;


public class OwnerDaoImpl extends HibernateDaoSupport implements IOwnerDao{
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IOwnerDao#checkO(cn.pdsu.bs.domain.Carowner)
	 */
	private IPageDao pagedao;
	public void setPagedao(IPageDao pagedao) {
		this.pagedao = pagedao;
	}
	public boolean checkO(Carowner owner){
		System.out.println("登录验证用户是否存在！");
		String hql="from Carowner where owerName='"+owner.getOwerName()+"'and owerPwd ='"+owner.getOwerPwd()+"'";
		List list=this.getHibernateTemplate().find(hql);
		if(list.size()>0){
			return true;
		}
		return false;
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.daoImpl.IOwnerDao#findO(cn.pdsu.bs.domain.Carowner)
	 */
	public Carowner findO(Carowner owner){
		System.out.println("通过姓名获取车主对象");
		String hql = "from Carowner where owerTruename='"+owner.getOwerTruename()+"'"; 
		Carowner o = (Carowner) this.getHibernateTemplate().find(hql).get(0);
		return o;
	}
	public Carowner findOW(Carowner owner){
		System.out.println("通过登陆名获取车主对象");
		String hql = "from Carowner where owerName='"+owner.getOwerName()+"'"; 
		Carowner o = (Carowner) this.getHibernateTemplate().find(hql).get(0);
		return o;
	}
	public boolean saveO(Carowner owner){
		   try {
			   getHibernateTemplate().save(owner);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
	public Carowner findById(Carowner owner){
		String hql = "from Carowner where ownerId='"+owner.getOwnerId()+"'"; 
		Carowner o = (Carowner) this.getHibernateTemplate().find(hql).get(0);
		return o;
	}
	public boolean deleteO(Carowner owner){
		   try {
			   getHibernateTemplate().delete(owner);
			   return true;
			  }
		   catch (Exception e) {
			   e.printStackTrace();
			  }
			  return false;
			 }
	
	public int getTotalrecord() {
 		
	 	return	pagedao.getTotalrecord("Carowner");
	 	
		}
		
		public List<Object> getPageData(int startindex,int pagesize) {
			/*System.out.println("111");
			Carowner caro=(Carowner) pagedao.getPageData(startindex,pagesize,"Carowner").get(0);
			System.out.println("输出一个完整车主信息"+caro.getOwerAddr());
			System.out.println("输出一个完整车主信息"+caro.getCarpackage().getPackageName());
			System.out.println("222");*/
			return	pagedao.getPageData(startindex,pagesize,"Carowner");
		}

}
