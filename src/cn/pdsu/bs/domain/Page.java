package cn.pdsu.bs.domain;

import java.util.List;

//封装页面数据
public class Page {
	
	private List list;
	private int totalpage;  //记住总页数
	
	private int totalrecord;//总记录数
	private int pagesize = 5;
	
	
	private int pagenum;   //代表用户想看的页
	private int startindex;  //代表用户想看的页的数据从数据库哪个地方开始取
	
	
	private int startPage;  //记住jsp页面显示的起始页码
	private int endPage;  //记往jsp页面显示的结束页码
	
	private String url;   //记住用于处理分页的servlet
	private String categoryID;
	
	public Page(int totalrecord,int pagenum){
		this.totalrecord = totalrecord;
		
		if(this.totalrecord%this.pagesize==0){
			this.totalpage = this.totalrecord/this.pagesize;
		}else{
			this.totalpage = this.totalrecord/this.pagesize + 1;
		}
		
		this.pagenum = pagenum;  //1
		if(pagenum==0){
			pagenum++;
			//System.out.println("执行了page的构造方法这时pagenum的职位"+pagenum);
			this.startindex = (this.pagenum-1)*this.pagesize;
		}else{
		this.startindex = (this.pagenum-1)*this.pagesize;
		}
		
		//根据用户想看的页pagenum，算出jsp页面的起始和结束页码
		if(this.totalpage<=10){
			this.startPage = 1;
			this.endPage = this.totalpage;
		}else{
			//20   18
			this.startPage = this.pagenum -4;
			this.endPage = this.pagenum + 5;
			
			if(this.startPage<1){
				this.startPage = 1;
				this.endPage = 10;
			}
			
			if(this.endPage > this.totalpage){
				this.endPage = this.totalpage;
				this.startPage = this.totalpage-9;
			}
			
			
		}
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}




	public int getStartPage() {
		return startPage;
	}



	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}



	public int getEndPage() {
		return endPage;
	}



	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}



	public List getList() {
		return list;
	}



	public void setList(List list) {
		this.list = list;
	}



	public int getTotalpage() {
		return totalpage;
	}



	public void setTotalpage(int totalpage) {
		this.totalpage = totalpage;
	}



	public int getTotalrecord() {
		return totalrecord;
	}



	public void setTotalrecord(int totalrecord) {
		this.totalrecord = totalrecord;
	}



	public int getPagesize() {
		return pagesize;
	}



	public void setPagesize(int pagesize) {
		this.pagesize = pagesize;
	}



	public int getPagenum() {
		return pagenum;
	}



	public void setPagenum(int pagenum) {
		this.pagenum = pagenum;
		if(pagenum==0){
			System.out.println("1111");
			pagenum+=1;
		}
	}



	public int getStartindex() {
		return startindex;
	}



	public void setStartindex(int startindex) {
		this.startindex = startindex;
	}

	public String getCategoryID() {
		return categoryID;
	}

	public void setCategoryID(String plateID) {
		this.categoryID = plateID;
	}
	
	
	
	
	
}
