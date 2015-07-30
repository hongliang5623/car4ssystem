package cn.pdsu.bs.dao;

import java.util.List;

import cn.pdsu.bs.domain.ApplyTools;
import cn.pdsu.bs.domain.User;

public interface IApplyToolsDao {

	public abstract boolean saveAT(ApplyTools applyT);

	public abstract int getTotalrecord();
	
	public abstract int getTotalrecordread(User u);
	
	public abstract int getTotalrecord2read(User u);
	
	public abstract int getTotalrecordpass();

	public abstract List<Object> getPageData(final int startindex,
			final int pagesize);
	
	public abstract List<Object> getPageDataread(final int startindex,final int pagesize,final User u);
	
	public abstract List<Object> getPageDatapass(final int startindex,
			final int pagesize);

	public abstract ApplyTools findAT(String id);

	public abstract boolean updataAT(ApplyTools applyT);

}