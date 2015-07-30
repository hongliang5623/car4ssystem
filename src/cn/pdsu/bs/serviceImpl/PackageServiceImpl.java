package cn.pdsu.bs.serviceImpl;

import java.util.List;

import cn.pdsu.bs.dao.IPackageDao;
import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IPackageService;

public class PackageServiceImpl implements IPackageService {
	private IPackageDao dao;
	public void setDao(IPackageDao dao) {
		this.dao = dao;
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IPacksgeService#savePackage(cn.pdsu.bs.domain.Carpackage)
	 */
	public boolean savePackage(Carpackage carp){
	
		return dao.saveP(carp);
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IPacksgeService#getAllP()
	 */
	
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
	public Carpackage getPackageByName(Carpackage carp) {
		return dao.findP(carp);
		
	}
}
