package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.Repare;

public interface IWeiXiuDao {

	public abstract boolean saveW(Repare repare);

	public abstract  Repare findById(Repare repare);
	
	public abstract int getTotalrecord();
	
	public abstract List<Object> getPageData(int startindex,int pagesize);

}