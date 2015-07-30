package cn.pdsu.bs.serviceImpl;

import java.util.List;
import cn.pdsu.bs.dao.IApplyToolsDao;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyToolsService;


public class ApplyToolsServiceImpl implements IApplyToolsService{
	private IApplyToolsDao dao;
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyToolsService#setDao(cn.pdsu.bs.dao.IApplyToolsDao)
	 */
	public void setDao(IApplyToolsDao dao) {
		this.dao = dao;
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyToolsService#saveAppT(cn.pdsu.bs.domain.ApplyTools)
	 */
	public boolean saveAppT(ApplyTools applyT){
		
		return dao.saveAT(applyT);
	}
		
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyToolsService#getPageData(java.lang.String, java.lang.String)
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
	public Page getPageDatapass(String pagenum,String url){
		int totalrecord=dao.getTotalrecordpass();
		if(pagenum==null||Integer.parseInt(pagenum)==0){
			Page page = new Page(totalrecord,1);	
			
			List list = dao.getPageDatapass(page.getStartindex(), page.getPagesize());
			page.setList(list);
			page.setUrl(url);
			return page;
		}else{
			Page page = new Page(totalrecord,Integer.parseInt(pagenum)); 
			List list = dao.getPageDatapass(page.getStartindex(), page.getPagesize());
			page.setList(list);
			page.setUrl(url);
			return page;
			
		}
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyToolsService#findApplyToolsById(java.lang.String)
	 */
	public ApplyTools findApplyToolsById(String id){
		return dao.findAT(id);	
	}
	
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyToolsService#UpdataApplyTools(cn.pdsu.bs.domain.ApplyTools)
	 */
	public boolean UpdataApplyTools(ApplyTools applyT){
		return dao.updataAT(applyT);
	}
	
	public int get2read(User u){
		return dao.getTotalrecord2read(u);
	}
}
