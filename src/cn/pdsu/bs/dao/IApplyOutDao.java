package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.ApplyOut;
import cn.pdsu.bs.domain.User;

public interface IApplyOutDao {

	public abstract boolean saveAO(ApplyOut applyo);

	public abstract int getTotalrecord();
	
	public abstract int getTotalrecordread(User u);
	
	public abstract int getTotalrecord2read(User u);
	
	public abstract int getTotalrecordpass();

	public abstract List<Object> getPageData(int startindex, int pagesize);
	
	public abstract List<Object> getPageDatapass(int startindex, int pagesize);
	
	public abstract List<Object> getPageDataread(final int startindex,final int pagesize,final User u);

	public abstract ApplyOut findAO(String id);
	
	public abstract ApplyOut findAOByU(User u);
	
	public abstract boolean updataAO(ApplyOut applyo);

}