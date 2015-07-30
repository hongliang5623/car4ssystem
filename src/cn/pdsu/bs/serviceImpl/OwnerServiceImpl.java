package cn.pdsu.bs.serviceImpl;

import java.util.List;

import cn.pdsu.bs.dao.IOwnerDao;
import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IOwnerService;

public class OwnerServiceImpl implements IOwnerService {
	private IOwnerDao dao;
	public void setDao(IOwnerDao dao) {
		this.dao = dao;
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IOwnerService#checkUser(cn.pdsu.bs.domain.Carowner)
	 */
	public boolean checkUser(Carowner owner){
		
		return dao.checkO(owner);
		
	}
	
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IOwnerService#findByUserName(cn.pdsu.bs.domain.Carowner)
	 */
	public Carowner findByUserName(Carowner owner){
		
		return 	dao.findOW(owner);
		
	}
	public boolean saveOwner(Carowner owner){
		
		return dao.saveO(owner);
	}
	
	public Carowner findByUserId(Carowner owner){
		
		return 	dao.findById(owner);
		
	}
	public boolean deleteOwner(Carowner owner){
		
		return dao.deleteO(owner);
	}
	
	public Page getPageData(String pagenum,String url){
		int totalrecord=dao.getTotalrecord();
		if(pagenum==null){
			Page page = new Page(totalrecord,1);	
			
			List list = dao.getPageData(page.getStartindex(), page.getPagesize());
			page.setList(list);
			page.setUrl(url);
			return page;
		}else if(Integer.parseInt(pagenum)==0){
			//pagenum=pagenum+1;
			Page page = new Page(totalrecord,Integer.parseInt(pagenum)+1); 
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

}
