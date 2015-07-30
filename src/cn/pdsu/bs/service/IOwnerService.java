package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.Carowner;
import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.domain.Page;

public interface IOwnerService {

	public abstract boolean checkUser(Carowner owner);

	public abstract Carowner findByUserName(Carowner owner);
	
	public abstract Carowner findByUserId(Carowner owner);
	
	public abstract boolean saveOwner(Carowner owner);
	
	public abstract boolean deleteOwner(Carowner owner);
	
	public abstract Page getPageData(String pagenum, String url);

}