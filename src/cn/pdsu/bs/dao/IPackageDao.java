package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.Carpackage;

public interface IPackageDao {

	public abstract boolean saveP(Carpackage carp);

	public abstract Carpackage findP(Carpackage carp);

	public abstract int getTotalrecord();

	public abstract List getPageData(int startindex, int pagesize);


}