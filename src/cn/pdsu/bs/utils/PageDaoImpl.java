package cn.pdsu.bs.utils;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.pdsu.bs.domain.Carpackage;

public class PageDaoImpl extends HibernateDaoSupport implements IPageDao {
	

	public void testConnect(){
		System.out.println(this.getHibernateTemplate());
	}

	/* (non-Javadoc)
	 * @see cn.pdsu.bs.utils.IPageDao#getTotalrecord()
	 */
	public int getTotalrecord(String entity) {
		int count = 0;
		String hql = "from "+entity;
		count = this.getHibernateTemplate().find(hql).size();
		return count;
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.utils.IPageDao#getPageData(int, int)
	 */
	@SuppressWarnings("unchecked")
	public List<Object> getPageData(final int startindex, final int pagesize, String entity) {
		final String hql = "from "+entity;
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

		/*(new HibernateCallback() {
			// 重写其doInHibernate方法返回一个object对象，
			public Object doInHibernate(Session session)
					throws HibernateException, SQLException {
				// 创建query对象
				Query query = session.createQuery(hql);
				// 返回其执行了分布方法的list
				return query.setFirstResult(startindex).setMaxResults(pagesize)
						.list();
			}

		});*/
	}
}
