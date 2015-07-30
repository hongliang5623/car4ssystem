package cn.pdsu.bs.service;

import cn.pdsu.bs.dao.IApplyToolsDao;
import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;

public interface IApplyToolsService {

	public abstract void setDao(IApplyToolsDao dao);

	public abstract boolean saveAppT(ApplyTools applyT);

	public abstract Page getPageData(String pagenum, String url);
	
	public abstract Page getPageDataread(String pagenum, String url,User u);
	
	public abstract Page getPageDatapass(String pagenum, String url);

	public abstract ApplyTools findApplyToolsById(String id);

	public abstract boolean UpdataApplyTools(ApplyTools applyT);
	
	public abstract int get2read(User u);

}