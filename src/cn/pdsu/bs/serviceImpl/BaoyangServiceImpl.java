package cn.pdsu.bs.serviceImpl;

import java.util.List;

import cn.pdsu.bs.dao.IBaoyangDao;
import cn.pdsu.bs.domain.Baoyang;

import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.service.IBaoyangService;

public class BaoyangServiceImpl implements IBaoyangService {
	private IBaoyangDao dao; 
	public void setDao(IBaoyangDao dao) {
		this.dao = dao;
	}
	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IBaoyangService#saveBaoyang(cn.pdsu.bs.domain.Baoyang)
	 */
	public boolean saveBaoyang(Baoyang baoyang){
		
		return dao.saveBY(baoyang);
	}
	
	public Baoyang findBaoyangById(Baoyang baoyang){
		
		return 	dao.findById(baoyang);
		
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
