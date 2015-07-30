package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.Page;
import cn.pdsu.bs.domain.Repare;


public interface IRepareService {

	public abstract boolean saveRepare(Repare repare);
	public abstract Repare findRepareById(Repare repare);
	public abstract Page getPageData(String pagenum,String url);
}