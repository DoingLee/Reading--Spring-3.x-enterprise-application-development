package com.zq.foo.entity;

public class Pagination {
	private Integer page;
	private Integer pageCount;
	private Integer totalCount;
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getPageCount() {
		return pageCount;
	}
	public void setPageCount(Integer pageCount) {
		this.pageCount = pageCount;
	}
	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Pagination(Integer page, Integer pageCount, Integer totalCount) {
		this.page = page;
		this.pageCount = pageCount;
		this.totalCount = totalCount;
	}
	public Pagination() {
	}	
}
