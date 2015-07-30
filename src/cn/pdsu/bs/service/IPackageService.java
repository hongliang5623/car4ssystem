package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.Carpackage;
import cn.pdsu.bs.domain.Page;

public interface IPackageService {

	public abstract boolean savePackage(Carpackage carp);

	public abstract Carpackage getPackageByName(Carpackage carp);

	public abstract Page getPageData(String pagenum, String url);

}