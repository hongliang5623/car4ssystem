package cn.pdsu.bs.test;

import javax.sql.DataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.pdsu.bs.action.TestApplyOutAction;
import cn.pdsu.bs.daoImpl.ApplyOutDaoImpl;
import cn.pdsu.bs.daoImpl.ApplyRepareDaoImpl;
import cn.pdsu.bs.daoImpl.UserDaoImpl;
import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.ApplyRepare;

public class TestConnect {
	//PageDaoImpl	pagedao= new PageDaoImpl();
	UserDaoImpl userdao=new UserDaoImpl();
	@Test
	public void test() throws Exception{
		ApplicationContext ctx = 
					new ClassPathXmlApplicationContext("jdbc-bean.xml");
			DataSource ds=ctx.getBean("dataSource",DataSource.class);
			
			System.out.println(ds.getConnection());
			/*SessionFactory sf=ctx.getBean("sf",SessionFactory.class);
			System.out.println(sf.getCurrentSession());*/
		}
	@Test
	public void testpage() throws Exception{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("base-bean.xml");
	//	PageDaoImpl	pagedao=ctx.getBean("pagedao",PageDaoImpl.class);
	//	int n=pagedao.getTotalrecord(); 
	//	System.out.println(n);
	}
	
	@Test
	public void testccc() throws Exception{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("base-bean.xml","jdbc-bean.xml");
		ApplyRepareDaoImpl dao=ctx.getBean("applyreparedao",ApplyRepareDaoImpl.class);
		String s="1";
		ApplyRepare applyrepare=dao.findAR(s);
		System.out.println(applyrepare.getApplyRepareTime());
	}
	
	@Test
	public void testdd() throws Exception{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("base-bean.xml","jdbc-bean.xml");
		ApplyOutDaoImpl applyoutdao=ctx.getBean("applyoutdao",ApplyOutDaoImpl.class);
		System.out.println(applyoutdao.getTotalrecord());
		System.out.println(applyoutdao.getPageData(0, 5));
	}
	@Test
	public void testapp() throws Exception{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("base-bean.xml","jdbc-bean.xml");
		TestApplyOutAction testaction=ctx.getBean("testaction",TestApplyOutAction.class);
		System.out.println(testaction.execute());
	}
	public void testget() throws Exception{
		ApplicationContext ctx = 
			new ClassPathXmlApplicationContext("base-bean.xml","jdbc-bean.xml");
		TestApplyOutAction testaction=ctx.getBean("testaction",TestApplyOutAction.class);
		System.out.println(testaction.execute());
	}
	}