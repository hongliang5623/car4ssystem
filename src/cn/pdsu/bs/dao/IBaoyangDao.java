package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.Baoyang;

public interface IBaoyangDao {

	public abstract boolean saveBY(Baoyang baoyang);
	public abstract Baoyang findById(Baoyang baoyang);
	public abstract int getTotalrecord();
	public abstract List<Object> getPageData(int startindex,int pagesize);
}