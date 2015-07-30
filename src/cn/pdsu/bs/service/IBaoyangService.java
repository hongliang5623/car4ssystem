package cn.pdsu.bs.service;

import cn.pdsu.bs.domain.Baoyang;
import cn.pdsu.bs.domain.Page;

public interface IBaoyangService {

	public abstract boolean saveBaoyang(Baoyang baoyang);

	public abstract Baoyang findBaoyangById(Baoyang baoyang);
	
	public abstract Page getPageData(String pagenum,String url);
}