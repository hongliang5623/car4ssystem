package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.ApplyRepare;
import cn.pdsu.bs.domain.User;

public interface IApplyRepareDao {

	public abstract boolean saveAR(ApplyRepare applyR);

	public abstract int getTotalrecord();
	
	public abstract int getTotalrecordread(User u);
	
	public abstract int getTotalrecord2read(User u);

	public abstract List<Object> getPageData(final int startindex,
			final int pagesize);
	
	public abstract List<Object> getPageDataread(final int startindex,
			final int pagesize,final User u);

	public abstract ApplyRepare findAR(String id);

	public abstract boolean updataAR(ApplyRepare applyR);

}