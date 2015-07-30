package cn.pdsu.bs.serviceImpl;

import java.util.List;

import cn.pdsu.bs.dao.IApplyRepareDao;
import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyRepareService;


public class ApplyRepareServiceImpl implements IApplyRepareService {
	private IApplyRepareDao dao;

	public void setDao(IApplyRepareDao dao) {
		this.dao = dao;
	}

	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyRepareService#saveAppR(cn.pdsu.bs.domain.ApplyRepare)
	 */
	public boolean saveAppR(ApplyRepare applyr){
		
		return dao.saveAR(applyr);
	}
	
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyRepareService#getPageData(java.lang.String, java.lang.String)
	 */
	public Page getPageData(String pagenum,String url){
		int totalrecord=dao.getTotalrecord();
		if(pagenum==null||Integer.parseInt(pagenum)==0){
			Page page = new Page(totalrecord,1);	
			
			List list = dao.getPageData(page.getStartindex(), page.getPagesize());
			page.setList(list);
			page.setUrl(url);
			return page;
		}else{
			Page page = new Page(totalrecord,Integer.parseInt(pagenum)); 
			List list = dao.getPageData(page.getStartindex(), page.getPagesize());
			page.setList(list);
			page.setUrl(url);
			return page;
			
		}
	}
	public Page getPageDataread(String pagenum,String url,User u){
		int totalrecord=dao.getTotalrecordread(u);
		if(pagenum==null||Integer.parseInt(pagenum)==0){
			Page page = new Page(totalrecord,1);	
			
			List list = dao.getPageDataread(page.getStartindex(), page.getPagesize(),u);
			page.setList(list);
			page.setUrl(url);
			return page;
		}else{
			Page page = new Page(totalrecord,Integer.parseInt(pagenum)); 
			List list = dao.getPageDataread(page.getStartindex(), page.getPagesize(),u);
			page.setList(list);
			page.setUrl(url);
			return page;
			
		}
	}
	public ApplyRepare findApplyRepareById(String id){
		return dao.findAR(id);
	
		
	}
	
	
	public boolean UpdataApplyRepare(ApplyRepare applyr){
		return dao.updataAR(applyr);
	}
	
	public int get2read(User u){
		return dao.getTotalrecord2read(u);
	}

}
