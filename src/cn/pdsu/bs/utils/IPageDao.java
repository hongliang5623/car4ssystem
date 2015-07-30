package cn.pdsu.bs.utils;

import java.util.List;

import cn.pdsu.bs.domain.Carpackage;

public interface IPageDao {

	public abstract int getTotalrecord(String entity);

	@SuppressWarnings("unchecked")
	public abstract List<Object> getPageData(final int startindex,
			final int pagesize,String entity);

}