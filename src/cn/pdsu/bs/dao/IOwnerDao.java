package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.Carowner;

public interface IOwnerDao {

	public abstract boolean checkO(Carowner owner);

	public abstract Carowner findO(Carowner owner);
	
	public abstract Carowner findOW(Carowner owner);
	
	public abstract Carowner findById(Carowner owner);
	
	public abstract boolean saveO(Carowner owner);
	
	public abstract boolean deleteO(Carowner owner);
	
	public abstract int getTotalrecord();

	public abstract List getPageData(int startindex, int pagesize);

}