package cn.pdsu.bs.serviceImpl;

import java.util.List;
import cn.pdsu.bs.dao.IApplyOutDao;
import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;
import cn.pdsu.bs.service.IApplyOutService;

public class ApplyOutServiceImpl implements IApplyOutService {
	private IApplyOutDao dao;
	
	public void setDao(IApplyOutDao dao) {
		this.dao = dao;
	}

	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyOutService#saveAppO(cn.pdsu.bs.domain.ApplyOut)
	 */
	public boolean saveAppO(ApplyOut applyo){
		
		return dao.saveAO(applyo);
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyOutService#getPageData(java.lang.String, java.lang.String)
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
	public ApplyOut findAppOutById(String id){
		return dao.findAO(id);
	
		
	}
	public ApplyOut findAppOutByUserId(User u){
		return dao.findAOByU(u);
	
		
	}
	
	public boolean UpdataApplyOut(ApplyOut applyo){
		return dao.updataAO(applyo);
	}
	
	public int get2read(User u){
		return dao.getTotalrecord2read(u);
	}

}
