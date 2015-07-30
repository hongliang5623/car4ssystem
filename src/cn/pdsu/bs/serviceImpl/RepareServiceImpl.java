package cn.pdsu.bs.serviceImpl;

import java.util.List;

import cn.pdsu.bs.dao.IWeiXiuDao;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.Repare;
import cn.pdsu.bs.service.IRepareService;
import cn.pdsu.bs.utils.IPageDao;

public class RepareServiceImpl implements IRepareService {
	
 private IWeiXiuDao dao;
	
	public void setDao(IWeiXiuDao dao) {
	this.dao = dao;
}

	public boolean saveRepare(Repare repare){
	
		return dao.saveW(repare);
	}
	public Repare findRepareById(Repare repare){
		
		return 	dao.findById(repare);	
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