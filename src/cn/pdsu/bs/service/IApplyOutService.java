package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;

public interface IApplyOutService {

	public abstract boolean saveAppO(ApplyOut applyo);

	public abstract Page getPageData(String pagenum, String url);
	
	public abstract Page getPageDatapass(String pagenum, String url);
	
	public abstract Page getPageDataread(String pagenum, String url,User u);
	
	public abstract  ApplyOut findAppOutById(String id);
	
	public abstract ApplyOut findAppOutByUserId(User u);
	
	public abstract boolean UpdataApplyOut(ApplyOut applyo);
	
	public abstract int get2read(User u);

}