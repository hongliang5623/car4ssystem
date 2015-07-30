package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.User;

public interface IApplyRepareService {

	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyOutService#saveAppO(cn.pdsu.bs.domain.ApplyOut)
	 */
	public abstract boolean saveAppR(ApplyRepare applyr);

	/* (non-Javadoc)
	 * @see cn.pdsu.bs.serviceImpl.IApplyOutService#getPageData(java.lang.String, java.lang.String)
	 */
	public abstract Page getPageData(String pagenum, String url);
	
	public abstract Page getPageDataread(String pagenum, String url,User u);

	public abstract ApplyRepare findApplyRepareById(String id);

	public abstract boolean UpdataApplyRepare(ApplyRepare applyr);
	
	public abstract int get2read(User u);

}